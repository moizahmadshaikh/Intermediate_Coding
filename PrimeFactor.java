
public class PrimeFactor
{
	static void PF(int num)
	{
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			while(num%i==0)
			{
				System.out.println(i+" ");
				num=num/i;
			}
		}
		if(num>2)
			System.out.print(num+" ");
	}
	
	public static void main(String []args)
	{
		PF(17);
	}
}
