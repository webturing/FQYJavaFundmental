package lec02a;

public class PrimerChecker {
    public static void main(String[] args) {
        int n = 17;
        boolean find = false;
        for (int p = 2; p <= n - 1; p++) {
            if (n % p == 0) {
                find = true;
                break;
            }
        }
        System.out.println(find);
    }
}
/**
 * for every number p in range [2,n-1] check (n%p==0) or not
 */
