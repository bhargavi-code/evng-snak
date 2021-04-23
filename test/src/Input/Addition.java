package Input;

public class Addition 
{
	public static void main(String[] args) 
	{   
		long phonenumber = 9701868209l;
		long temp = phonenumber;
		long sum =0;
		while (temp!=0)
		{
			long rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
		}
		System.out.println(sum);
	}	
}




	