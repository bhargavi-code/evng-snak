package test456;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
class Test {
	
	public static void main(String[] args) 
	{
		//int[]arr= {1,2,3,4,7,2,3,2};
		
		ArrayList<Integer>l= new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
	    l.add(1);
	    l.add(2);
	    l.add(3);
	    l.add(4);
	    l.add(7);
	    l.add(2);
	    l.add(3);
	    l.add(2);   
	    System.out.println("Arraylist number:"+l);
	    for(Integer i :l)
	    {
	    	set.add(i);
	    }
	    System.out.println(set);
	}
		}


