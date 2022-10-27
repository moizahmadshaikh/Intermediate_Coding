
public class CoutingDistinctInArray 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,1,3,4,444,4,43,44,45};
		int count_distinct=0;
		int visited[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						visited[j]=1;
					}
				}
				count_distinct++;
			}
		}
		System.out.println(count_distinct);
	}
}
