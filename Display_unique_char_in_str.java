import java.util.Scanner;

public class Display_unique_char_in_str {
    public static void main(String[] args) {
        String s,uniq_char = "";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count += 1;
                }
            }
            if (count == 1) {
                uniq_char += s.charAt(i);
            }
        }
        System.out.println(uniq_char);
        sc.close();
    }
}
