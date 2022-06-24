import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("One", 1);
        mp.put("Two",2);
        mp.put("Three", 3);
        mp.putIfAbsent("Four", 4);
        Set<Entry<String,Integer>> entrySet = mp.entrySet();
        for(Entry<String,Integer> entry:entrySet)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        int value = mp.get("One");
        System.out.println(value);

    }
}
