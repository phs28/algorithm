package book.chap01.exam01;

import java.util.Scanner;

public class Median {
	
//	static int med3(int a, int b, int c) {
//		if(a >= b) {
//			if(b >= c) {
//				return b;
//			} else if(a <= c) {
//				return a;
//			} else {
//				return c;
//			}
//		} else if(a > c) {
//			return a;
//		} else if(b > c) {
//			return c;
//		} else {
//			return b;
//		}
//	}
	
	static int med3(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값: ");
		int a = scan.nextInt();
		System.out.println("b의 값: ");
		int b = scan.nextInt();
		System.out.println("c의 값: ");
		int c = scan.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		
		scan.close();
	}
}
