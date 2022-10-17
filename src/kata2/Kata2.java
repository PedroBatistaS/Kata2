package kata2;

import java.util.*;


public class Kata2 {


    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,4,4,3,-1,-1,12,123,123,5,3,8,9,10};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        
        


    }
    
}
