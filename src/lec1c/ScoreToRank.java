package lec1c;

import java.util.Scanner;

/*Rank A:[90,100];
 *Rank B:[80,89];
 *Rank C:[70,79];
 *Rank D:[60,69];
 *Rank E:[0,59]
 * */
public class ScoreToRank {
	// if
	// if else
	// if else if---
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char rank = 'E';

		if (100 >= score && score >= 90) {
			rank = 'A';
		}
		if (89 >= score && score >= 80) {
			rank = 'B';
		}
		if (79 >= score && score >= 70) {
			rank = 'C';
		}
		if (69 >= score && score >= 60) {
			rank = 'D';
		}
		if (59 >= score) {
			rank = 'E';
		}
		System.out.println(rank);
	}
}
