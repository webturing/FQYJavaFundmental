package lec01;

public class MathDemo {
	public static void main(String[] args) {
		int a = 3, b = 4;
		double x = Math.sqrt(a * a + Math.pow(b, 2));
		System.out.println(String.format("%.2f", x));//same as printf
		System.out.println(Math.PI);
		System.out.println(Math.sin(30.0/180*Math.PI));
		System.out.println(Math.log10(123));//log(10,123)=2.x
		System.out.println(Math.log(Math.E));//ln(E)=1
	}
}
