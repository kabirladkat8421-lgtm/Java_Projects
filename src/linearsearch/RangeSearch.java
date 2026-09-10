package linearsearch;

public class RangeSearch {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50,60};
		int target = 40;
		System.out.println(searchinrange(arr,target,1,4));
	}
	public static int searchinrange(int[]arr,int target,int start,int end)
	{
		for(int index =start;index<=end;index++)
		{
			int element = arr[index];
			if(element==target)
			{
				return index;
			}
			
		}
		return -1;
	}
	
}
