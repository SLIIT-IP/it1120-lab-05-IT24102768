import java.util.Scanner;
public class IT24102768Lab5Q3
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		int S_day, E_day, No_days;
		double AMT0, AMT1, AMT2;
		final double AMOUNT = 48000;
		final double DIS01 = 0.1;
		final double DIS02 = 0.2;

		System.out.print("Enter start date (1-31): ");
		S_day=input.nextInt();

		System.out.print("Enter end date(1-31): ");
		E_day=input.nextInt();

		if(S_day>=0 && S_day<=31 && E_day>=0 && E_day<=31)
		{

			if(S_day<E_day)
			{
				
				System.out.print("\nRoom Charge Per Day: Rs. "+AMOUNT+"/=");
				No_days = E_day - S_day;
				System.out.print("\nNumber of Days Reserved: "+ No_days);
				AMT0=AMOUNT*No_days;	
					
					if(No_days<3)
					{
						System.out.print("\nTotal Amount to be Paid: "+AMT0);
					}
					else if(No_days<=4)
					{
						AMT1=AMT0-(AMT0*DIS01);
						System.out.print("\nTotal Amount to be Paid: "+AMT1);
					}
					else
					{
						AMT2=AMT0-(AMT0*DIS02);
						System.out.print("\nTotal Amount to be Paid: "+AMT2);
					}

			}
			else
			{
				System.out.print("Error: Start Date must be less than End Date");
			
			}
		
		}
		else
		{
			System.out.print("Error: Days must be berween 1 and 31");
			
		}
	}

}