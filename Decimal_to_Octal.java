import java.util.Scanner;

public class Decimal_to_Octal {
    public static void main(String[] args) {
        int no, rem;
        String Oct_val = "";
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        while (no > 0) {
            rem = no % 8;
            Oct_val = Integer.toString(rem) + Oct_val;
            no = no / 8;
        }
        System.out.println(Oct_val);
        sc.close();
    }
}
