package com.chainsys.Collecions;
import java.util.*;
public class HashMapArray {
	   public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
	        map.put(11, "Arivu");
	        map.put(21, "Pravi");
	        map.put(31, "Prithvi");
	        map.put(41, "Pranav");
	        map.put(51, "Pradheeksha");

	        List<Integer> keyList = new ArrayList(map.keySet());
	        List<String> valueList = new ArrayList(map.values());

	        System.out.println("Key List: " + keyList);
	        System.out.println("Value List: " + valueList);
     }
}