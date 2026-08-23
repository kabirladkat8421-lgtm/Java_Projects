package work;

public class ArrayMax {

	public static void main(String[] args) {
	int []arr = {1,2,33,9,18};
	System.out.println(maxout(arr));

	}
public static int maxout(int []arr)
{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		
	}
	return max;
}
}
