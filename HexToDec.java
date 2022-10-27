
public class HexToDec 
{
	static int HtoD(String num)
	{
		int power=0,sum=0;
		for(int i=num.length()-1;i>=0;i--)
		{
			if(num.charAt(i)>='0'&&num.charAt(i)<='9')
			{
				int digit=num.charAt(i)-48;
				sum=(int) (sum+digit*Math.pow(16, power));
				power++;
			}
			else if(num.charAt(i)>='A'&&num.charAt(i)<='F')
			{
				int digit=num.charAt(i)-65+10 ;
				sum=(int)(sum+digit*Math.pow(16,power));
				power++;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println(HtoD("123A"));
	}
}
