package lec01;

/**
 * 
 * @author webturing java Output: 
 * 1. System.out.print(exp) 
 * 2. System.out.println(exp) 
 * 3. System.out.prinf(format,args...);
 * 
 * 
 */
public class OutputDemo {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.print("Hello world\n");
		String name = "FQY";
		System.out.println("hello " + name);
		System.out.printf("hello %s\n",name);//placeholder
		int x=13,y=14;
		System.out.printf("%d+%d=%d\n",x,y,x+y); 
		System.out.printf("%03d\n",12345);
		System.out.printf("%8.3f\n",Math.PI);
		System.out.printf("%.3f\n",Math.PI);
	}
}
