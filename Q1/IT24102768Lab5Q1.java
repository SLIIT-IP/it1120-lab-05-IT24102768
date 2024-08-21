import java.util.Scanner;
public class IT24102768Lab5Q1
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		int no1,no2,no3,MAX,MIN;

		System.out.print("Enter the first integer: ");
		no1=input.nextInt();

		System.out.print("Enter the second integer: ");
		no2=input.nextInt();

		System.out.print("Enter the third integer: ");
		no3=input.nextInt();

		System.out.println("\nUser entered numbers are : "+no1+" "+no2+" "+no3);

		if(no1>no2)
		{
			MAX=no1;
			MIN=no2;
		}
		else
		{
			MAX=no2;
			MIN=no1;
		}

		if(no3>MAX)
		{
			MAX=no3;
		}
		else
		{
			MIN=no3;
		}

		System.out.println("The Smallest number is: "+MIN);
		System.out.println("The Largest number is: "+MAX);


	}
}