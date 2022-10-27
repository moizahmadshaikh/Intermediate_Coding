
class ArmstrongInGivenRange 
{
	
	
	static int order(int num)
	{
		int length=0;
		while(num!=0)
		{
			num=num/10;
			length=length+1;
		}
		return length;
	}
	
	static boolean isArmstrong(int num)
	{
		int rem,sum=0,temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, order(temp)));
			num=num/10;
		}
		return sum==temp;
	}
	
	public static void main(String []args)
	{
		//Scanner scanner=new Scanner(System.in);
		for(int i=1;i<2000;i++)
		{
			if(isArmstrong(i))
				System.out.println(i);
		}
		
	}
}