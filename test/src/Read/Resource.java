package Read;

public class Resource 
{
	public static void main(String[] args) 
	{
		String str = "Firstname.Secondname@gmail.com";
		char[]c=str.toCharArray();
		String f ="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='.')
			{
				f=str.replace(".", " ");
			}
			if(c[i]=='@')
			{
				StringBuffer sbf = new StringBuffer(f);
				sbf.delete(18, 27);
				System.out.println(sbf);
			}
		}
		
	}
}
