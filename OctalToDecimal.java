
public class OctalToDecimal 
{
	static long OtoD(long num)
	{
		long rem,i=0,sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=(long)(sum+rem*Math.pow(8, i));
			num=num/10;
			i++;
		}
		return sum;
	}
	public static void  main(String []args)
	{
		System.out.println(OtoD(23453));
	}
}

