import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Study_Map {

    public static void main(String[] args) {
        //Map creation.
        Map<String,Integer> map=new HashMap<>();

        //Add values to map.
        map.put("Guruprasad", 100);
        map.put("Guru", 200);
        map.put("Shahu", 100);
        map.put("Raam", 200);
        map.put("Sham", 300);

        //Updating value of Key Using put()
        map.put("Guruprasad", 500);

        //Size of map.
        System.out.println(map.size());

        //contains key and value methods.
        System.out.println(map.containsKey("Gurup"));
        System.out.println(map.containsValue(100));

        //Get value of key
        System.out.println(map.get("Guruprasad"));

        //Remove the key maping
        System.out.println(map.remove("Guru"));

        //keySet()
        System.out.println(map.keySet());

        //values()
        System.out.println(map.values());

       
        System.out.println(map);

        //iteration.
        for(Entry<String, Integer> map1: map.entrySet()){
            System.out.printf("%s --> %S\n",map1.getKey(),map1.getValue());
        }

        
        
        
    }
    
}
