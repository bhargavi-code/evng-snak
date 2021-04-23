package Javatest;

public class Demod 
{
	public static void main(String[] args) 
	{
	String s = "Hi All Good Morning";
	String[]c=s.split(" ");
	for(int i=0;i<c.length;i++)
	{
		String f = c[i].substring(0, 1).toLowerCase()+c[i].substring(1).toUpperCase();
		System.out.print(f + " ");
	}
	
}
}
