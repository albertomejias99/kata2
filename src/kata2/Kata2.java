package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Pepe","Maria","Pedro","Juan","Pepe","Juan","Juan","Pedro","Pepe","Maria","Pedro","Pepe"}; 
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogram = histo.getHistogram(); 
        
        Iterator<Map.Entry<String,Integer>> entries= histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Key: "+ entry.getKey() + ", value: "+ entry.getValue());
        }

    }
    
}
