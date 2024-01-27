package level01.main04;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		//10869번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		scan.close();
	}
}
