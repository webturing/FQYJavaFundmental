package lec02b;

public class Permutation {
	public static void main(String[] args) {
		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 3; y++) {	
				if (x == y)
						continue;
				for (int z = 1; z <= 3; z++) {				
					if (y == z)
						continue;
					if (x == z)
						continue;
					System.out.println(x + " " + y + " " + z);
				}
			}
		}
	}
}
