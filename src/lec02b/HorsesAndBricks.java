package lec02b;

public class HorsesAndBricks {
    public static void main(String[] args) {
        //st. x+y+z=100 and 3*x+2y+z/2=100
        int n = 10000;//O(n^3)
        for (int x = 0; x <= n; x++)
            for (int y = 0; y <= n; y++)
                for (int z = 0; z <= n; z += 2) {
                    if (x + y + z == n && 3 * x + 2 * y + z / 2 == n)
                        System.out.println(x + " " + y + " " + z);
                }


    }
}
