import java.util.*;

public class IIndsmallest 
{
	public static void main(String args[])
	{
		Integer arr[]= {3,4,6,2,1,5,8,9};
		List<Integer> array=Arrays.asList(arr);
		Collections.sort(array);
		System.out.println(array.get(0));
	}
}
