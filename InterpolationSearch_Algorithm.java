import java.util.Scanner;

// It works only sorted arrays

public class InterpolationSearch_Algorithm {
    int interpolation_search(int[] arr, int target) {
        int low, high;
        low = 0;
        high = arr.length -1;

        while (low <= high && arr[low] <= target && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);      // This algorithm finds exact position of the target value

            if (arr[pos] == target) {
                return pos;
            }
            else if (arr[pos] < target) {
                low = pos + 1;
            }
            else {
                high = pos - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        target = sc.nextInt();
        InterpolationSearch_Algorithm obj = new InterpolationSearch_Algorithm();
        int res = obj.interpolation_search(arr, target);
        if (res != -1) {
            System.out.println("Target value founded at " + res + " position");
        }
        else {
            System.out.println("Target value is not found");
        }
        sc.close();
    }
}
