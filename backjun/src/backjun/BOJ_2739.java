package backjun;

import java.util.Scanner;

public class BOJ_2739 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
		scan.close();
	}
}
