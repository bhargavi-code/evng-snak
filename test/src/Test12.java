import java.awt.List;

import junit.framework.Test;

public class Test12 {
	
	private int x=10;
	private int y=20;
	public int getx()
	{
	return x;
	}
	public int gety()
	{
		return y;
	}
	public int setx(int x)
	{
		return this.x=x;
	}
	public int sety(int y)
	{
		return this.y=y;
	}

}



class Demo
{
	public static void main(String[]args)
	{
		Test t=(Test) new Test12();
		int a=((Test12) t).getx();
		System.out.println(a);
		int b=((Test12) t).gety();
		System.out.println(b);
		((Test12) t).setx(200);
		int a1=((Test12) t).getx();
		System.out.println(a1);
	}

	}

