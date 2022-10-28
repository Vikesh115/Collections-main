// key,value; 
// ex:-fuel,price; rollno,name; country,population;
//key is always same-unique but value can be same or different
//Unordered map
import java.util.*;

public class HashMaps {
    public static void main(String args[])
    {
      HashMap<String,Integer> map = new HashMap<>();

      //insertion
      // Two cases if exist-> Update value if doesn't exist->new pair is inserted
      map.put("India",120);
      map.put("usa",70);
      map.put("china",130);

      System.out.println(map);

      map.put("china",180);
      System.out.println(map);

      //search - lookUp opeation
      if(map.containsKey("china")){
        System.out.println("key is present in the map");
      } else {
           System.out.println("Key is not present");
      }
      
      System.out.println(map.get("china")); // key exist then print value
      System.out.println(map.get("indonesia")); // key doesn't exist then print null

      //iterator
      for(Map.Entry<String,Integer> e : map.entrySet()){
          System.out.println(e.getKey());
          System.out.println( e.getValue());
      }

      Set<String> keys = map.keySet();
      for(String key : keys){
        System.out.println(key+ " " + map.get(key));
      }

      // remove
      map.remove("china");
      System.out.println(map);
    }
}
