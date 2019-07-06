package lec02c;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		System.out.println(Arrays.toString(a));
		a[0]++;
		a[2]=5;
		//Array output1: access array by index
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
		//Array output2: for_each read_only
		for(int e:a){
			System.out.print(e);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(a));//dump array for debug
		int b[]=new int[4];//heap;
		int c[]=new int[]{1,2,3};
		int d[]=c;
		int f[]=c.clone();

	}
}
