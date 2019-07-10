package lec02a;

public class BreakDemo2 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            x++;
            System.out.println(x);
            if (x == 5) break;
        }
    }
}
