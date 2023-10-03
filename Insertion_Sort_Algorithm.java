import java.util.Scanner;

public class Insertion_Sort_Algorithm {

    int[] insertion_sort(int[] arr, int n) {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        Insertion_Sort_Algorithm is = new Insertion_Sort_Algorithm();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values : ");
            arr[i] = sc.nextInt();
        }

        int[] res = is.insertion_sort(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
