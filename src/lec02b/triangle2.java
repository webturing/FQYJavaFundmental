package lec02b;

public class triangle2 {
	public static void main(String[] args) {
		int n = 4;
		for (int r = 1; r <= n; r++) {
			for (int i = 0; i < n - r; i++)
				System.out.print(" ");

			for (int i = 1; i <= r; i++)
				System.out.print(i);
			for (int i = r - 1; i >= 1; i--)
				System.out.print(i);
			System.out.println();
		}
		for (int r = n - 1; r >= 1; r--) {
			for (int i = 0; i < n - r; i++)
				System.out.print(" ");

			for (int i = 1; i <= r; i++)
				System.out.print(i);
			for (int i = r - 1; i >= 1; i--)
				System.out.print(i);
			System.out.println();
		}
	}
}
