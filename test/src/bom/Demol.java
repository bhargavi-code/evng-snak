package bom;

import java.util.HashMap;

public class Demol 
{
		public static void main(String[] args) 
		{
			HashMap<Integer, String> hmp = new HashMap<Integer, String>();
			hmp.put(1, "Bhargavi");
			hmp.put(2, "Kusuma");
			hmp.put(3, "Raji");
			
			boolean b = hmp.containsKey(3);
			System.out.println("3 exists in hashmap ?:"+b);
		
		}
}
