
public class MinArray 
{
	public static void main(String args[])
	{
		int arr[]= {2,3,5,1,2,4,7,-7};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}
}
