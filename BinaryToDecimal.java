
public class BinaryToDecimal 
{	
	static long BToDo(long num)
	{
		long i=0,sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=(long) (sum+(rem*Math.pow(2, i)));
			num=num/10;
			i++;
		}
		return sum;
	}
	public static void main(String args[])
	{
		long x=101010101;
		System.out.println(BToDo(x));
	}
}
