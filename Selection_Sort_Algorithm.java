import java.util.Scanner;

public class Selection_Sort_Algorithm {

    int[] selection_sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Selection_Sort_Algorithm ss = new Selection_Sort_Algorithm();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values : ");
            arr[i] = sc.nextInt();
        }

        int[] res = ss.selection_sort(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
