import java.util.*;
public class Pallindrome 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int r,x=0,store=n;
		while(n!=0)
		{	
			r=n%10;
			n=n/10;
			x=x*10+r;
		}
		System.out.println(x);
		if(x==store)
			System.out.println("Pallindrome");
		else 
			System.out.println("Not a pallindrome");
	}
}
