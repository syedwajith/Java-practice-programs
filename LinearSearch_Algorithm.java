import java.util.Scanner;

// It works both sorted and unsorted arrays

public class LinearSearch_Algorithm {
    int linear_search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        target = sc.nextInt();
        LinearSearch_Algorithm obj = new LinearSearch_Algorithm();
        int res = obj.linear_search(arr, target);
        if (res != -1) {
            System.out.println("Target value founded at " + res + " position.");
        }
        else {
            System.out.println("Target value is not found");
        }
        sc.close();
    }
}