package Input;

import java.util.ArrayList;
import java.util.LinkedList;

public class Create {
	public static void main(String[] args) 
	{
		LinkedList<Integer> al = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) 
		{
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;
			}
			al.add(fact);
		}
		int sum = 0;

		for (Integer i : al) 
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
