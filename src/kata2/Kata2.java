package kata2;

import java.util.*;


public class Kata2 {


    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,4,4,3,-1,-1,12,123,123,5,3,8,9,10};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }          
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        
        


    }
    
}
