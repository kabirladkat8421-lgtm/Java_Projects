package dsalearning;

import java.util.Arrays;

public class Search2dArray {

	public static void main(String[] args) {
		int[][]arr= {
				{15,50,30},
				{20,35,10},
				{11,22,64}
		};
		int target=64;
		int[]ans=search(arr,target);
		System.out.println(Arrays.toString(ans));

	}
public static int[] search(int[][]arr,int target)
{
	 for(int row = 0;row<arr.length;row++)
	 {
		 for(int col=0;col<arr[row].length;col++)
		 {
			 if(arr[row][col]==target) {
				 return new int[] {row,col};
			 }
		 }
	 }
	 return new int[]{-1,-1};
}
}
