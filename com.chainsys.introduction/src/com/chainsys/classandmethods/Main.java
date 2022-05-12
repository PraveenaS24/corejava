package com.chainsys.classandmethods;

import java.util.HashMap;

public class Main {
	public static void main(String args[])
	{
    HashMap<String, Integer> capital = new HashMap<String, Integer>();
    capital.put("Tamilnadu",1);
    capital.put("Karnataka",2);
    capital.put("Kerala",3);
    capital.put("Tamilnadu",4);
    for(String i : capital.keySet())
    {
    	System.out.println(i + capital.get(i));   
    }
  }
}
