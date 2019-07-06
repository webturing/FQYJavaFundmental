package lec02b;

public class FindFish {
    public static void main(String[] args) {
        for (int n = 1; true; n++) {
            if (n % 5 != 1) continue;
            int a = n - 1 - (n / 5);
            if (a % 5 != 1) continue;
            int b = a - 1 - (a / 5);
            if (b % 5 != 1) continue;
            int c = b - 1 - (b / 5);
            if (c % 5 != 1) continue;
            int d = c - 1 - (c / 5);
            if (d % 5 != 1) continue;
            System.out.println(n);
            break;
        }
    }
}
