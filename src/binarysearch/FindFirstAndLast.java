package binarysearch;

import java.util.Arrays;

class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 7, 7, 8, 8, 9};//Array declartion and inilization
        Solution sol = new Solution(); //object creation needed because we cannot acesses other class method if it's not static
int target=7;//Target declaration it's shadowing other where target being used
int[]ans=sol.Search(arr,target);//why craeted the ans array we need 2 element for storing two valuse so we declare ans as Array
System.out.println(Arrays.toString(ans));//Displaying the ans Arrays
    }
}
class Solution {
    public int[] Search(int[] arr, int target) {
        int[] ans = {-1, -1};//Returning the value if ans not found
        ans[0] = binarySearch(arr, target, true);
        if (ans[0] != -1) //checking the first element is not -1 if
            {
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }
    public int binarySearch(int[] arr, int target, boolean FindFisrtElement) {
        int ans = -1;
        int start = 0;

        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;//pontential ans found
                if (FindFisrtElement) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
