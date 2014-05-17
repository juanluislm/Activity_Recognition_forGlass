package com.example.myrunsdatacollectorlite;

import java.io.File;









import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;




public class ActivityCollector extends Activity {
	
	private enum State {IDLE, COLLECTING, TRAINING, CLASSIFYING};
	private final String[] mLabels = {"still", "walking", "running", "yaw", "roll", "pitch", "running"};
	
	private RadioGroup radioGroup;
	private final RadioButton[] radioBtns = new RadioButton[7];
	//private  RadioButton ElRadioButton;
	private Intent mServiceIntent;
	private File mFeatureFile;
	
	private State mState;
	//private Button btnCollect, btnCollectStop, btnDelete;
	//private Button btnDelete;
	 private static final String TAG = "ActivityCollector";
	 Button btnCollect, btnCollectStop, btnDelete;
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         radioGroup = (RadioGroup) findViewById(R.id.RadioGroupLabels);
         radioBtns[0] = (RadioButton) findViewById(R.id.radioStill);
         radioBtns[1] = (RadioButton) findViewById(R.id.radioWalking);
         radioBtns[2] = (RadioButton) findViewById(R.id.radioRunning);
         radioBtns[3] = (RadioButton) findViewById(R.id.radioYaw);
         radioBtns[4] = (RadioButton) findViewById(R.id.radioRoll);
         radioBtns[5] = (RadioButton) findViewById(R.id.radioPitch);
         radioBtns[6] = (RadioButton) findViewById(R.id.radioRubbing);

         
         mState = State.IDLE;
       
         new File(Environment.getExternalStorageDirectory(),"/MirrorMe/sprites/face/default/feature1" + ".arff");
         
         mServiceIntent = new Intent(ActivityCollector.this, ServiceSensors.class);
         
         btnCollect = (Button) findViewById(R.id.btnCollect);
         btnCollectStop = (Button) findViewById(R.id.btnCollectStop);
        
        // btnCollect.setOnClickListener((OnClickListener) ActivityCollector.this);
         //btnCollectStop.setOnClickListener((OnClickListener) ActivityCollector.this);
       //}

    
      /* public void onClick(View src) {
         switch (src.getId()) {
         case R.id.btnCollect:
           Log.d(TAG, "onClick: starting srvice");
           startService(new Intent(this, ServiceSensors.class));
           break;
         case R.id.btnCollectStop:
           Log.d(TAG, "onClick: stopping srvice");
           stopService(new Intent(this, ServiceSensors.class));
           break;
         }
       }*/
     
       
    
     
   	btnCollect.setOnClickListener(new OnClickListener() {
     

    		public void onClick(View v) {
     
    	  
    		int activityId = radioGroup.indexOfChild(findViewById(radioGroup.getCheckedRadioButtonId()));
    		String label = mLabels[activityId];
 
    			Bundle extras = new Bundle();
    			extras.putString("label", label);
    			extras.putString("type", "collecting");
    			mServiceIntent.putExtras(extras);
    			
    			startService(mServiceIntent);   
    			
    		}     
    });
    	
    	//---------------Stop button
    btnCollectStop.setOnClickListener(new OnClickListener() {
    	     
        	
    		public void onClick(View v) {
     
                    stopService(mServiceIntent);
                   ((NotificationManager) getSystemService(NOTIFICATION_SERVICE)).cancel(1);
    

    
    
   
   
    	}
     
      }); 
        //------------      	
    	
        
       }
   
     

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
