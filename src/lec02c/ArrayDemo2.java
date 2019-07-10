package lec02c;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println(a.length);//10 [0~9]
        System.out.println(Arrays.toString(a));
        a[0] = a[1] = 1;//递推起点
        System.out.println(Arrays.toString(a));
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] * i;//递推
        }
        System.out.println(Arrays.toString(a));
        a = new int[200];//System.gc(); free memory
    }
}
