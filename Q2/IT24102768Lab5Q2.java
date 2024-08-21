import java.util.Scanner;
public class IT24102768Lab5Q2
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int num;
		
		System.out.print("Enter the number of new members indroduced: ");
		num=input.nextInt();

		if(num<0)
		{
			System.out.println("Input must be a number 0 or greater");
		}
		else
		{
			switch(num)
			{
				case 0 : System.out.print("\nNo Prize");
					break;
				case 1 : System.out.print("\nPrize is a : Pen");
					break;
				case 2 : System.out.print("\nPrize is a : Umbrella");
					break;
				case 3 : System.out.print("\nPrize is a : Bag");
					break;
				case 4 : System.out.print("\nPrize is a : Travelling Chair");
					break;
				default : System.out.print("\nPrize is a : Headphone");
			}
		}
	}

}