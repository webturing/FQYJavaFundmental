package lec01a;

import java.util.Scanner;

public class FirstApplication {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String name = cin.next();
        int year = cin.nextInt();
        System.out.println("Hello " + name + "!");
        System.out.println(String.format("You are %d year(s) old.", 2019 - year));
    }
}
