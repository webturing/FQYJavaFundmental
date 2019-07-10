package lec02a;

public class Loop4Find {
	public static void main(String[] args) {
        boolean find = false;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0) {
                find = true;
                break;
            }
		}
		System.out.println(find);
	}
}
