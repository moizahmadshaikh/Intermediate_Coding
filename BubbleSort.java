import java.util.Iterator;

public class BubbleSort
{
	static void BS(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean swapped=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)break;
		}
	}
	static void display(int arr[])
	{
		for(int x : arr)
			System.out.print(x+" ");
	}
	public static void main(String args[])
	{
		int arr[]= {2,3,5,1,7,9,8};
		System.out.println("before sort :");
		display(arr);
		BS(arr);
		System.out.println("\nAfter sort :");
		display(arr);
	}
}
