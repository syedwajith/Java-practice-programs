import java.util.Scanner;

public class Bubble_Sort_Algorithm {

    int[] bubble_sort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n-i-1); ++j){
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Bubble_Sort_Algorithm bs = new Bubble_Sort_Algorithm();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values : ");
            arr[i] = sc.nextInt();
        }

        int[] res = bs.bubble_sort(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
