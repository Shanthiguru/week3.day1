package week3.day1.OOPSconcept;

public class Calculator 
{
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of 2 integers:"+c);
	}
	
	public void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("Addition of 3 integers:"+d);
	}
	
	public void mul(int a, int b)
	{
		int c= a*b;
		System.out.println("Multiplication of 2 integers:"+c);
	}
	
	public void mul(int a, double b)
	{
		double c=a*b;
		System.out.println("Multiplication of 1 int and 1 double:"+c);
	}
	
	public void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Subtraction of 2 integers:"+c);
	}
	
	public void sub(double a, double b)
	{
		double c = a - b;
		System.out.println("Subtraction of 2 integers:"+c);
	}
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("Division of 2 integers:"+c);
	}
	
	public void div(int a, double b)
	{
		double c=a/b;
		System.out.println("Division of 1 int and 1 double:"+c);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(20, 30);
		calc.add(20, 30, 40);
		calc.mul(20, 30);
		calc.mul(20, 10.5);
		calc.sub(20.5, 40.8);
		calc.sub(40, 20);
		calc.div(40, 20.5);
		calc.div(90, 30);
	}

}
