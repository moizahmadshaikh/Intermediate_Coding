import java.util.*;
public class SumOfDigit
{
	public static void main(String []args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int r,sum=0;
		
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(sum);
	}
}
