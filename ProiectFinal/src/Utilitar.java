import AutoVehiculPackage.*;

import java.util.ArrayList;

public class Utilitar {
      public static double mediePreturi(ArrayList<AutoVehicul> arr){
          int i=0;
          double sum=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
               sum += arr.get(i).getPret();
          }
          return sum/arr.size();
      }

}
