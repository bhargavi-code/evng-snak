package test456;

import java.util.ArrayList;
import java.util.TreeSet;

public class scanner 
{
	public static void main(String[] args) 
	{		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
			l.add(2);
			l.add(3);
			l.add(4);
			l.add(7);
			l.add(2);
			l.add(1);
			System.out.println("Remove Duplicates:"+l);
			TreeSet<Integer> t = new TreeSet<Integer>(l);
			System.out.println(t);
		
		}
	}

