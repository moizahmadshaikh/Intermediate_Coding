
public class IIndsmallest2
{
	public static void main(String args[])
	{
		int arr[]= {0};
		int min=arr[0];
		
		if(arr.length<2) System.out.println("array only has 1 element");
		else 
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<min)
					min=arr[i];
			}
			
			int sec_min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<sec_min && arr[i]!=min)
					sec_min=arr[i];
			}
			System.out.println(min);
			System.out.println(sec_min);	
		}
	

	}
}
