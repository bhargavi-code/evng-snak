package Javatest;

public class Gum2 
{
	public static void main(String[] args) 
	{
		String s = "Hi All Good Morning";
		String[]m=s.split(" ");
		for(int i=0;i<m.length;i++)
		{
			String f = m[i].substring(0, 1).toLowerCase()+m[i].substring(1).toUpperCase();
			System.out.println(f);

		}
	}
}
