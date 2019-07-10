package lec03a;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/7/10.
 */
public class ArrayCopy2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b=new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
    }
}
