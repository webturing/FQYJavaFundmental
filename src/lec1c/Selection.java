package lec1c;

import java.util.Scanner;

public class Selection {
	// if
	// if else
	// if else if---
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		int sign = 0;
		if (x > 0) {
			sign = 1;
		} 
		if (x < 0) {
			sign = -1;
		} 
		if(x==0){
			sign = 0;
		}

		System.out.println(sign);
	}
}
