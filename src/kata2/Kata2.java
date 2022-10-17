package kata2;

import java.util.*;


public class Kata2 {


    public static void main(String[] args) {
        
        Integer[] data = {1,2,3,4,4,4,3,-1,-1,12,123,123,5,3,8,9,10};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        
        


    }
    
}
