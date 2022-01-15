package week3.day1.OOPSconcept;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Have to deposit 10000 in Axis Bank");
	}
	
	public static void main(String[] args) 
	{
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		
	}

}
