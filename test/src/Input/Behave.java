package Input;

public class Behave 
{	
	public static void main(String[] args) 
	{
	StringBuffer str = new StringBuffer(1800);
	{
		str.append(0);
		System.out.println(str);
		str.insert(100, 25);
		System.out.println(str);
	}
	
}
}

