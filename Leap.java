import java.util.*;
public class Leap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year :");
		int year=sc.nextInt();
		
		if((year%400==0)||(year%4==0&&year%4!=0))
			System.out.println("It's a leap year");
		else
			System.out.println("It's not a leap year");
	}
}
