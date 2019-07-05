package lec01c;

public class ForDemo2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            if (x % 10 == 7 || x / 10 == 7 || x % 7 == 0) {
                System.out.print(x + " ");
            }

        }

    }
}
