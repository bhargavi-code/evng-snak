package Javatest;

import java.util.TreeSet;

public class DemoTree 
{
	public static void main(String[] args) {
		
	
	TreeSet ts = new TreeSet();
		ts.add(new StudentData("bhavi","I standard", 102));
		ts.add(new StudentData("gani","nursery standard", 790));
		ts.add(new StudentData("yasodha","nursery standard", 654));
		ts.add(new StudentData("Deepthi","lkg standard", 165));
		ts.add(new StudentData("Ramya","ukg standard", 203));
		
		System.out.println(ts);
}
}
