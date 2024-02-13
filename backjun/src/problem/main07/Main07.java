package problem.main07;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		//2753번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if((a%4==0)&&(a%100!=0||a%4==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
