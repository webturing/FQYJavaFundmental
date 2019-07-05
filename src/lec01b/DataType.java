package lec01b;

public class DataType {
	//二进制补码  [n]补：
	// n>0,原码
	// n<0, 反码+1
	
	public static void main(String[] args) {
		System.out.println(String.format("%32s",Integer.toBinaryString(6)));
		System.out.println(String.format("%32s",Integer.toBinaryString(-6)));
		System.out.println(String.format("%32s",Integer.toBinaryString(~-6)));
		System.out.println(Integer.MAX_VALUE);
	}

}
