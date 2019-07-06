package lec02a;

/**
 * #
 * ##
 * ###
 * ####
 */
public class PrintStar02 {
    public static void main(String[] args) {
        for (int r = 0; r < 4; r++) {
            //print r stars
            for (int c = 0; c <= r; c++) {
                System.out.print('#');
            }
            //print newline
            System.out.println();

        }
    }
}
