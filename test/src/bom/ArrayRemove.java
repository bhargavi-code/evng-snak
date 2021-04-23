package bom;

import java.util.ArrayList;
public class ArrayRemove 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(1);
		l.add(2);
		Integer obj = l.remove(1);
		Integer obj1 = l.remove(4);
		System.out.println(obj+obj1+"is removed from arraylist");
		
		System.out.println("Arraylist contains.....");
		
		for(int index =0;index<l.size();index++)
		{
		   System.out.println(l.get(index));
		}
		
		
		
		
		
		
			}
}
