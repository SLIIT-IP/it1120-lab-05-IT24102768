import java.util.Scanner;
public class IT24102768Lab5Q3
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		int S_day, E_day, No_days;
		double AMT;
		final double AMOUNT = 48000;
		final double DIS01 = 0.1;
		final double DIS02 = 0.2;

		System.out.print("Enter start date: ");
		S_day=input.nextInt();

		System.out.print("Enter end date: ");
		E_day=input.nextInt();

		if(S_day>E_day)
		{
			if(S_day>=0 && S_day<=31 && E_day>=0 && E_day<=31)
			{
				No_days = E_day - S_day;
				System.out.print("Number of Days Reserved: "+ No_days);
					
					if()
			}
			else
			{
				System.out.print("Error: Days must be berween 1 and 31");
			}
		}
		else
		{
			System.out.print("Error: Start Date must be less than End Date");
			
		}
	}

}