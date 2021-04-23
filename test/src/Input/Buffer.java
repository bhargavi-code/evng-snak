package Input;

public class Buffer 
{
	public static void main(String[] args) 
	{
		String str = "Hi Good Morning";
		//String[] sp = str.split(" ");
		StringBuffer sbf = new StringBuffer(str);
		for(int i = 0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
			 sbf.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				sbf.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
			System.out.println(sbf+ " ");

		}
	}
}
