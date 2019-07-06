package lec02a;
/**
 * 
 *     #
 *    ##
 *   ###
 *  ####
 *
 */
public class PrintStar03 {
	public static void main(String[] args) {
		for(int r=0;r<4;r++){
			//print 4-r spaces
			for(int s=1;s<=4-r;s++)
				System.out.print(" ");
			//print r stars 
			for(int s=0;s<=r;s++)
				System.out.print("#");
			//print newline
			System.out.println();
			
		}
	}
}
