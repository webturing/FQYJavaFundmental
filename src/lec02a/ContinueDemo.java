package lec02a;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            if (x % 7 == 0) continue;
            if (x % 10 == 7) continue;
            if (x / 10 == 7) continue;
            System.out.print(x + " ");

        }
    }
}
