package level01.main06;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		//9498번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a >= 90) {
			System.out.println("A");
		} else if((90 > a)||(a >= 80)) {
			System.out.println("B");
		} else if((80 > a)||(a >= 70)) {
			System.out.println("C");
		} else if((70 > a)||(a >= 60)) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
