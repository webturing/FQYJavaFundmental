package lec01c;

public class WhileDemo {
    public static void main(String[] args) {
        int x = 1;// start
        while (x < 10) {
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }

            x++;
        }
    }
}
