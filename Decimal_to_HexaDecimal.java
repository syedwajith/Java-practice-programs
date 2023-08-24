import java.util.Scanner;

public class Decimal_to_HexaDecimal {
    public static void main(String[] args) {
        int no;
        String hex_val = "";
        char rem;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        char val[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (no > 0) {
            rem = val[no % 16];
            hex_val = rem + hex_val;
            no = no / 16;
        }
        System.out.println(hex_val);
        sc.close();
    }
}
