package lec01;

import java.io.IOException;
import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) throws IOException {
//		int x=System.in.read();// first char  return unicode value of char
//		System.out.println(x-'0');
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(a+b);
		
	}
}
