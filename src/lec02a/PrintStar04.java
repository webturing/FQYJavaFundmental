package lec02a;

/**
 * # ### ##### #######
 */
/*public class PrintStar04 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			// print n-i spaces
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			// print 2i-1 stars
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("#");

			// print newline
			System.out.println();

		}
	}
}*/

/*
public class PrintStar04 {
public static void main(String[] args) {
	int n = 4;
	for (int i = n; i >= 1; i--) {
		// print n-i spaces
		for (int j = 1; j <= n - i; j++)
			System.out.print(" ");
		// print 2i-1 stars
		for (int j = 1; j <= 2 * i - 1; j++)
			System.out.print("#");

		// print newline
		System.out.println();

	}
}
}*/

public class PrintStar04 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            // print n-i spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // print 2i-1 stars
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("#");

            // print newline
            System.out.println();

        }
    }
}
