package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,2,5,9,5,14,3,6,2,3,5,14,3,1,7}; 
        Map<Integer,Integer> histogram = new HashMap<>(); 
        for (int key : data) {
            histogram.put(key,histogram.containsKey(key)?histogram.get(key)+1:1);
        }
        
        Iterator<Map.Entry<Integer,Integer>> entries= histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key: "+ entry.getKey() + ", value: "+ entry.getValue());
        }

    }
    
}
