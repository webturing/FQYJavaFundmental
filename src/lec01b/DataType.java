package lec01b;

public class DataType {
	//�����Ʋ���  [n]����
	// n>0,ԭ��
	// n<0, ����+1
	
	public static void main(String[] args) {
		System.out.println(String.format("%32s",Integer.toBinaryString(6)));
		System.out.println(String.format("%32s",Integer.toBinaryString(-6)));
		System.out.println(String.format("%32s",Integer.toBinaryString(~-6)));
		System.out.println(Integer.MAX_VALUE);
	}

}
