
public class LCM
{
	static int GCD(int m, int n)
	{
		while(m!=n)
		{
			if(m>n) m=m-n;
			else n=n-m;
		}
		return m;
	}
	static int LCM (int m,int n)
	{
		int x= GCD(m,n);
		return (m*n)/x;
	}
	public static void main(String args[])
	{
		System.out.println(LCM(12,80));
	}
}
