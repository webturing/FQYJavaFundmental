package lec02b;

public class IntDigitSum {
	public static void main(String[] args) {
		int n = 1381511;
		int m = 0;
		while (n >= 1) {
			if(n%10==1)
				m++;
			n = n / 10;
		}
		System.out.println(m);
	}
}
