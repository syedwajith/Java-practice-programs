import java.util.Scanner;

public class Each_Queen_could_not_attack_each_other {
    public static void main(String[] args) {
        int n, even, odd;
        even = 2;
        odd = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n+1; j++) {
                if (1 < even && even <= n) {
                    if (j == even) {
                        System.out.print("Q ");
                    }
                    else {
                        System.out.print("_ ");
                    }
                }
                else {
                    if (j == odd) {
                        System.out.print("Q ");
                    }
                    else {
                        System.out.print("_ ");
                    }
                }
            }
            if (i < n/2) {
                even += 2;
            }
            else {
                odd += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
