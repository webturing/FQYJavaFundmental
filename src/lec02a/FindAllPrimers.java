package lec02a;

public class FindAllPrimers {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (n == 1)
                continue;
            boolean find = false;
            for (int p = 2; p <= n - 1; p++) {
                if (n % p == 0) {
                    find = true;
                    break;
                }
            }
            if (find == false) {
                System.out.print(n + " ");
            }
        }
    }
}
/**
 * for every number p in range [2,n-1] check (n%p==0) or not
 */
