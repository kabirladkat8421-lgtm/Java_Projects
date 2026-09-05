package binarysearch;

import org.w3c.dom.ls.LSOutput;

public class BinaryExample {
    static void main(String[] args) {
int[]arr={10,20,30,40,55,63,75,81,91,103};
int target=555;//it's shadowing the binarySearch target
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
            return mid;
        }}
        return-1;
    }
}
