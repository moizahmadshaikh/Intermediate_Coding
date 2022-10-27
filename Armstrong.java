import java.util.*;
public class Armstrong 
{
	static int order(int n)
	{
		int len=0;
		while(n!=0)
		{
			len++;
			n=n/10;
			
		}
		return len;
	}
	static boolean armstrong(int len,int n)
	{
		int sum=0,temp,digit;
		temp=n;
		while(temp!=0)
		{
			digit=temp%10;
			sum=(int)(sum+Math.pow(digit, len));
			temp=temp/10;
		}
		return sum==n;
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int length=order(n);
		if(armstrong(length, n))
			System.out.println("Armstrong");
		else 
			System.out.println("Non armstrong");
	}
}
