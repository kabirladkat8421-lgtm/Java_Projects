package binarysearch;

public class FindCharNext {
    static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        int target = 'b';
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(char[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return arr[start%arr.length];
    }
}