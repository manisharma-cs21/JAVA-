 import java.util.*; 
 public class Hashing {
    public static void main(String[] args) {
        
    
    HashMap<String,Integer> map=new HashMap<>();

    //Insertion
    map.put("India",120);
    map.put ("US",30);
    map.put("china",150);
    System.out.println(map);
    map.put("china",180);
    map.put("UK",40);
    System.out.println(map);

     // Search---
    if(map.containsKey("UK"))
    {
        System.out.println("key is present in map");
    }
    else{
        System.out.println("key is not present");
    
    }
    // To find the value of kay
    System.out.println(map.get("china"));
  //  System.out.println(map.get("UK")); 

//Insertion in Hashmap by using iteration
      //for(int val:arr)
     for(Map.Entry<String,Integer> e: map.entrySet())
     {
        System.out.println(e.getKey());    //get key- to find the key 
        System.out.println(e.getValue()); // get value- to find the value of key
     }


    // 2- Through the keyset
     Set<String> keys=map.keySet();
     for(String key:keys)
     {
        System.out.println(key + " "+map.get(key));
     }
     // Remove the key and vlue
     map.remove("UK");
     System.out.println(map);



    }

} 
