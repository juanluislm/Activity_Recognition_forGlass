package com.example.myrunsdatacollectorlite;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.speech.RecognizerIntent;
import android.widget.RemoteViews;
import com.example.myrunsdatacollectorlite.*;
import com.google.android.glass.app.Card;
import com.google.android.glass.timeline.LiveCard;
import com.google.android.glass.timeline.TimelineManager;

public class Launcher2 extends Service{
	private TimelineManager nTimelineManager;
	public LiveCard nLiveCard;
	private String ncardID = "Display";
	
	
	@Override
	public void onCreate() 
	{
		nTimelineManager = TimelineManager.from(this);
		super.onCreate();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		//Check if the live card has already been created
		if (nLiveCard == null)
		{
			//create live card *New in XE12 createLiveCard replaced getLiveCard from XE11*
			nLiveCard = nTimelineManager.createLiveCard(ncardID);
		}
		//Create the remote views from the layout
		RemoteViews remoteViews = new RemoteViews(this.getPackageName(),R.layout.first);
		//Set the text to the results from the voice recognition activity
		//remoteViews.setTextViewText(R.id.text_view,user_id);
		//set the text of the text view to the the text from the speech recognition
		//		remoteViews.setTextViewText(R.id.text_view,intent.getStringExtra("speechText"));
		//set the views of the card
		nLiveCard.setViews(remoteViews);

		//sets the menu of the card 
		Intent menu = new Intent(this, com.example.myrunsdatacollectorlite.ActivityCollector.class);
		nLiveCard.setAction(PendingIntent.getActivity(this, 0, menu, 0));

		//Check if the card is already publish
		if (nLiveCard.isPublished())
		{
			//if it is, unpublish the card
			nLiveCard.unpublish();
		}

		//publish the card to the timeline 
		//Set publish mode to reveal *New in XE12 replaced setNonSilent method from XE11*
		nLiveCard.publish(LiveCard.PublishMode.REVEAL);
		//startActivity(menu);
		return START_STICKY;
	}

	@Override
	public void onDestroy() 
	{
		//remove the card from the timeline
		if (nLiveCard != null && nLiveCard.isPublished()) 
		{
			nLiveCard.unpublish();
			nLiveCard = null;
		}
		super.onDestroy();
	}

	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
