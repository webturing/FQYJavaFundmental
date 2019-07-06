package lec02b;

public class IntLength {
	public static void main(String[] args) {
		int n = 123456;
		int m = 0;
		while (n >= 1) {
			n = n / 10;
			m++;
		}
		System.out.println(m);
	}
}
