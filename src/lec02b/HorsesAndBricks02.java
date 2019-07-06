package lec02b;

public class HorsesAndBricks02 {
	public static void main(String[] args) {
		//st. x+y+z=100 and 3*x+2y+z/2=100
		int n=10000;//O(n^2)
		for(int x=0;x<=n/3;x++)
			for(int y=0;y<=n-x;y++)
				{
					int z=n-x-y;
					if(z%2!=0||z<0)continue;
					if(x+y+z==n&&3*x+2*y+z/2==n)
					System.out.println(x+" "+y+" "+z);
				}
		
		
	}
}
