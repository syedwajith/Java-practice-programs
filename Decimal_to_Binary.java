import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        int no, rem;
        String bin_val = "";
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        while (no > 0) {
            rem = no % 2;
            bin_val = Integer.toString(rem) + bin_val;
            no = no / 2;
        }
        System.out.println(bin_val);
        sc.close();
    }
}
