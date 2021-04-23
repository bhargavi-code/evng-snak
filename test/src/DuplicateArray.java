
public class DuplicateArray 
{
	public static void main(String[] args)
	{
		int[]arr = {10,20,40,40,20,20,10,50};
		for(int i=0; i<arr.length; i++)
		{
			int num1 = arr[i];
			int count = 0;
			
			for(int j=0; j<arr.length; j++)
			{
				int num2 = arr[j];
				if(num1==num2 && i>j)
				{
				   break;
				}
				if(num1==num2)
				{
					count++;
				}
			}
			if(count>1)
	
			{
				System.out.println(num1+"present"+count+"times");
			}
		}
	}
	
}
