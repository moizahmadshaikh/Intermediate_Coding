import java.util.*;
public class Reverse
{
	public static void main(String []args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int r,x=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			x=x*10+r;
		}
		System.out.println(x);
	}
}
