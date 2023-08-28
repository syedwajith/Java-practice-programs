import java.util.Scanner;

// It works only sorted arrays

public class BinarySearch_Algorithm {
    int binary_search(int[] arr, int target) {
        int low, high;
        low = 0;
        high =  arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;      // Search from mid to right side of array
            }
            else {
                high = mid - 1;     // Search from mid to left side of array
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        target = sc.nextInt();
        BinarySearch_Algorithm obj = new BinarySearch_Algorithm();
        int res = obj.binary_search(arr, target);
        if (res != -1) {
            System.out.println("Target value founded at " + res + " position");
        }
        else {
            System.out.println("Target value is not found");
        }     
        sc.close();
    }
}
