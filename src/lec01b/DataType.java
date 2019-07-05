package lec01b;

public class DataType {
    //二进制补码计算规则:正数就是原码（采用短除法，不停的计算对进制r=2的余数和商），否则就是反码+1 极大的提高了减法的计算速度

    public static void main(String[] args) {
        System.out.println(String.format("%32s", Integer.toBinaryString(6)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(-6)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(~-6)).replaceAll(" ", "0"));
        System.out.println(Integer.MAX_VALUE);
    }

}
