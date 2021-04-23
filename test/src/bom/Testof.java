package bom;

public class Testof 
{
	public static void main(String[] args) 
	{
		String s = "Hi12Hello44Bye13Good";
		int sum =0;
		String num = "0";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			String s1 = ch+"";
		try 
		{
			int x = Integer.parseInt(s1);
			num = num + x;
			
		} catch (Exception e) 
		{
			int y = Integer.parseInt(num);
			sum = sum + y;
		}
		System.out.println(sum);
	}
   }
}

