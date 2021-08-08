package hashMap;

import java.util.*;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {

     Map<String,Integer> hm = new HashMap<>();
           hm.put("ankit", 14);
           hm.put("amar", 12);
           hm.put("anas",13);
           
           //hm.putIfAbsent("ankit", 15);
            
           //System.out.println(hm.get("ankit"));
            
          // hm.remove("amar");
           //hm.remove("ankit", 14);
           
           System.out.println(hm);
           System.out.println(hm.keySet());
           System.out.println(hm.entrySet());
	}

}
