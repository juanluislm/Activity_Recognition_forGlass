package com.example.myrunsdatacollectorlite;

//package weka.classifiers;

/*import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.CapabilitiesHandler;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;*/




class Classifier1 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = Classifier1.N1a779c10(i);
    return p;
  }
  static double N1a779c10(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 6.313117) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 6.313117) {
    p = Classifier1.N2a95bb1(i);
    } 
    return p;
  }
  static double N2a95bb1(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 328.310808) {
    p = Classifier1.N1cc3faa2(i);
    } else if (((Double) i[0]).doubleValue() > 328.310808) {
      p = 2;
    } 
    return p;
  }
  static double N1cc3faa2(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= 1.694994) {
    p = Classifier1.N67ea363(i);
    } else if (((Double) i[17]).doubleValue() > 1.694994) {
    p = Classifier1.N7fd76e10(i);
    } 
    return p;
  }
  static double N67ea363(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 4.16974) {
    p = Classifier1.N41bf094(i);
    } else if (((Double) i[14]).doubleValue() > 4.16974) {
      p = 1;
    } 
    return p;
  }
  static double N41bf094(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 11.427422) {
    p = Classifier1.N64ed215(i);
    } else if (((Double) i[2]).doubleValue() > 11.427422) {
      p = 2;
    } 
    return p;
  }
  static double N64ed215(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.681036) {
    p = Classifier1.Nc43fe6(i);
    } else if (((Double) i[16]).doubleValue() > 0.681036) {
    p = Classifier1.N14401c07(i);
    } 
    return p;
  }
  static double Nc43fe6(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.110654) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.110654) {
      p = 0;
    } 
    return p;
  }
  static double N14401c07(Object []i) {
    double p = Double.NaN;
    if (i[32] == null) {
      p = 1;
    } else if (((Double) i[32]).doubleValue() <= 0.137459) {
      p = 1;
    } else if (((Double) i[32]).doubleValue() > 0.137459) {
    p = Classifier1.N1cf0ffb8(i);
    } 
    return p;
  }
  static double N1cf0ffb8(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 3.362622) {
    p = Classifier1.N1225aee9(i);
    } else if (((Double) i[8]).doubleValue() > 3.362622) {
      p = 2;
    } 
    return p;
  }
  static double N1225aee9(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 76.23935) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 76.23935) {
      p = 1;
    } 
    return p;
  }
  static double N7fd76e10(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 46.068704) {
    p = Classifier1.N118b49011(i);
    } else if (((Double) i[4]).doubleValue() > 46.068704) {
      p = 2;
    } 
    return p;
  }
  static double N118b49011(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 53.625831) {
    p = Classifier1.Nf662b412(i);
    } else if (((Double) i[1]).doubleValue() > 53.625831) {
      p = 1;
    } 
    return p;
  }
  static double Nf662b412(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 219.717641) {
    p = Classifier1.N1ca4f4f13(i);
    } else if (((Double) i[0]).doubleValue() > 219.717641) {
      p = 2;
    } 
    return p;
  }
  static double N1ca4f4f13(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 4.139647) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 4.139647) {
    p = Classifier1.N11cdde414(i);
    } 
    return p;
  }
  static double N11cdde414(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 2;
    } else if (((Double) i[13]).doubleValue() <= 2.472347) {
    p = Classifier1.N2bc00015(i);
    } else if (((Double) i[13]).doubleValue() > 2.472347) {
      p = 1;
    } 
    return p;
  }
  static double N2bc00015(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 9.283525) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 9.283525) {
      p = 2;
    } 
    return p;
  }
}
