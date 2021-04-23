package test456;

public class Ceo {
 
	public void Salary()
	{
		 
		System.out.println("Ceo distributes of salary is : 75000");
	}
}
class Manager extends Ceo
{
	 @Override
	 public void Salary()
	 {
		 
		 System.out.println("Manager distributes of salary is : 50000");
	 }
}
class Hr extends Ceo
{
	@Override
	public void Salary()
	{
		
		System.out.println("Hr distributes of salary is : 30000");
	}
}
class Employee extends Ceo
{
	@Override
	public void Salary()
	{
		
		System.out.println("Employee distributes of salary is : 15000 ");
	}
}
class SalaryFinder{

	public static void main(String[]args)
	{
		Ceo c = new Ceo();
		c.Salary();
		new Manager ().Salary();
		new Hr ().Salary();
		new Employee ().Salary();
	}
}