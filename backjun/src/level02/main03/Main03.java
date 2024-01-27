package level02.main03;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		//2884번
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(h >= 0 && h <= 23) {
			if(m >= 0 && m <= 59) {
				if(m < 45) {
					h--;
					m = (m+60)-45;
					
					if(h < 0) {
						h = 23;
					}
					System.out.print(h+" "+m);
				} else {
					System.out.println(h+" "+(m-45)); 
				}
				
			}
		}
	}
}
