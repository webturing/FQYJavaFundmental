package lec02c;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Input 10 numbers from keybord 2. Reverse these numbers; 3. Output them
 * 
 * @author Administrator
 * 
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// System.out.println(Arrays.toString(a));
		//
		// for (int i = a.length - 1; i >= 0; i--) {
		// System.out.print(a[i] + " ");
		// }
		// System.out.println();

		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = t;

		}
		System.out.println(Arrays.toString(a));

	}
}
