package test56333;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sample 
{
		public static void main(String[] args) 
		{
			ArrayList<Integer> l = new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>(l);
			l.add(1);
			l.add(0);
			l.add(5);
			l.add(7);
			l.add(2);
			l.add(2);
			l.add(3);
			l.add(1);
			System.out.println("Arraylist duplicates:"+l);
			for(Integer i :l)
			{
				set.add(i);
			}
			System.out.println(set);
			
		}
}
