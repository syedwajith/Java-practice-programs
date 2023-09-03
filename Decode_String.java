import java.util.Scanner;

public class Decode_String {
    String decode_str(String s) {
        String current_str = "";
        String deco_str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int n = Character.getNumericValue(ch);

                for (int j = 0; j < n; j++) {
                    deco_str += current_str;
                } 
                
                current_str = "";
            }
            else {
                current_str += s.charAt(i);
            }
        }

        return deco_str;
    }
    public static void main(String[] args) {
        String s, res;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        Decode_String obj = new Decode_String();
        res = obj.decode_str(s);
        System.out.print(res);
        sc.close();
    }
}
