package binarysearch;
public class Mountain {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    static void main(String[] args) {
        int[]arr={10,20,30,40,50,22,21,20};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
public static int peakIndexInMountainArray(int[] arr) {
    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
        int mid =start+(end-start)/2;
        if(arr[mid]>arr[mid+1])//checking if mid is greater than next number if it's true we know we not gonna find the max number in the in lift side
        {
            end=mid;//so our end become our mid so serach range being reduce possiblity of finding answer increase
        }
        else
        {
            start=mid+1;//the condition is false then max is on the lift but in the after max number start and end both come to some index that's means max number is being found
        }
    }   return start; //Returning start or end give someoutput
}
}










