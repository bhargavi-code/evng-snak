package bhargavi;

public abstract class Test 
	{
			abstract public void m1();
			public void m2()
			{
				System.out.println("m2 run");
			}
		}
		class Demo extends Test
		{
			@Override
			public void m1()
			{
				System.out.println("m1 run");
			}
			public static void main(String[] args) 
			{
				Demo d = new Demo();
				d.m1();
				d.m2();
			}
		}
	
