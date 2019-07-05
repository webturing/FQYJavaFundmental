package lec01c;

import java.util.Scanner;

/*Rank A:[90,100];
 *Rank B:[80,89];
 *Rank C:[70,79];
 *Rank D:[60,69];
 *Rank E:[0,59]
 * */
public class ScoreToRank2 {
    // if
    // if else
    // if else if---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char rank = 'E';
        if (score < 60) {
            rank = 'E';
        } else if (score < 70) {
            rank = 'D';
        } else if (score < 80) {
            rank = 'C';
        } else if (score < 90) {
            rank = 'B';
        } else {
            rank = 'A';
        }
        System.out.println(rank);
    }
}
