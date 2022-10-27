import java.util.*;
public class PrimeInRange 
{
	static boolean isPrime(int x)
	{
		if(x<0 || x==0 || x==1)
			return false;
		for(int i=2;i<(x/2);i++)
			if(x%i==0) return false;
		return true;
	}
	public static void main(String []args)
	{
		Scanner scanner=new Scanner(System.in);
		int a,b;
		System.out.println("Enter staring number :");
		a=scanner.nextInt();
		System.out.println("Ente last number :");
		b=scanner.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(isPrime(i))
				System.out.print(i+ " ");
		}
	}
}
