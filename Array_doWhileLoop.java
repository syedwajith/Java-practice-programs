public class Array_doWhileLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "PineApple"};
        int i = 0;
        do {
            System.out.println(fruits[i]);
            i++;
        } while (i > 1 && i < fruits.length);
    }
}
