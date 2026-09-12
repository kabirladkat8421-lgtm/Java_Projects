package binarysearch;

public class InfiniteArrayFindElement {
    public static void main(String[] args) {
    int[]arr={1,22,34,41,55,62,74,82,94};//Array declaration and inilization
    int target=55;
        System.out.println(arr[getRange(arr,target)]);

    }
    static int getRange(int[]arr,int target)
    {
        int start=0;//start point of Array
        int end=1;//end point of Array
        while(target>arr[end])//it's true until target>arr[end] end value will change unitl it's false
        {
            int temp=end+1;//stroing end value in temp
            end=end+(end-start+1)*2; //end value is being double
            start=temp;//privious end is new start point
        }
        return binarySearch(arr,start,end,target);//returning the result of binarySearch
    }
    static int binarySearch(int[]arr,int start,int end,int target)
    {
while(start<=end)
{
    int mid=start+(end-start)/2;
    if(target<arr[mid])
    {
        end=mid-1;
    }
    else if(target>arr[mid])
    {
        start=mid+1;
    }else
    {
        return mid;
    }
}return -1;
    }
}
