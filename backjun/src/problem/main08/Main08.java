package problem.main08;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		//14681번
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if((x > -1000)&&(x < 1000)&&x!=0) {
			if((y > -1000)&&(y < 1000)&&y!=0) {
				if(x > 0 && y > 0) {
					System.out.println(1);
				} else if(x < 0 && y > 0) {
					System.out.println(2);
				} else if(x < 0 && y < 0) {
					System.out.println(3);
				} else if(x > 0 && y < 0) {
					System.out.println(4);
				}
			}
		}
		
	}
}
