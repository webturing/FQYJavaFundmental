package lec01b;

public class IntegerRadix {
    public static void main(String[] args) {
        int x = 0xfff;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toString(x, 17));
    }
}
