package lec1c;

public class ForDemo {
	public static void main(String[] args) {
		//1+2+3+...+100=s
		//1+3+5+....99=s
		int s=0;
		for(int x=1;x<=100;x++){
			if (x%2==1) {
				s=s+x;	
			}
			
		}
		System.out.println(s);
	}
}
