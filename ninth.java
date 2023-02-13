import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
public class ninth{
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(45);
        System.out.println(arr.get(2));
        arr.remove(1);
        System.out.println(arr);
        arr.set(0, 67);
        System.out.println(arr);
        Collections.sort(arr);
        for (Integer i: arr){
            System.out.println(i);
        }
        Map <String ,Integer> m = new HashMap<>();
        m.put("Gautam", 20);
        m.put("Adarsh", 22);
        m.put("Santosh", 21);
        
        System.out.println(m.get("Gautam"));
        m.remove("Gautam");
        System.out.println(m);
        for (String s: m.keySet()){
            System.out.println(s+" : "+m.values());
        }
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        System.out.println(hs.contains("hello"));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}