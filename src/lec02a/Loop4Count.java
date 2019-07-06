package lec02a;

public class Loop4Count {
	public static void main(String[] args) {
		int cnt = 0;// count
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
