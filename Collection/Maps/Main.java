package Collection.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a1" , "Tushar");
        map.put("a2" , "Rutuja");
        map.put("a3" , "Tejas");
        map.put("a4" , "Snehal");
        map.put("a5" , "Tushar");
        map.put("a6" , "Rutuja");
        map.put("a7" , "Tejas");
        map.put("a8" , "Snehal");

//        for(String key:map.keySet()){
//            System.out.println("key: "+key +" Value: "+map.get(key));
//        }
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println("key: "+entry.getKey() +" Value: "+entry.getValue());
//        }

          Iterator<Map.Entry<String,String>> entryInterator = map.entrySet().iterator();
          while(entryInterator.hasNext()){
              Map.Entry<String,String > temp = entryInterator.next();
              System.out.println("key: "+ temp.getKey() +" Value: "+temp.getValue());
          }

//        System.out.println(map);
    }
}
