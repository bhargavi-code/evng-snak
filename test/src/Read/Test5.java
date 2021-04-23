package Read;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test5 
{
	/*public static void main(String[] args) 
	{
		String s = "Amitians";
		String temp ="";
		for(int i=0;i<s.length();i++)
		{
			if(temp.indexOf(s.charAt(i))==-1)
			{
				temp = temp+s.charAt(i);
			}
		}
		System.out.println(temp);*/
	public static void main(String[] args) 
	{
		ArrayList<Integer>	al = new ArrayList<Integer>();
		al.add(100);
		al.add(2000);
		al.add(250);
		al.add(3000);
		Collections.sort(al);
		System.out.println(al);
	}
}
