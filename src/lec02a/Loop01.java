package lec02a;

public class Loop01 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);// Traverse
			if (i % 2 == 1)
				System.out.println(i);// Filter
		
		}

	}
}
