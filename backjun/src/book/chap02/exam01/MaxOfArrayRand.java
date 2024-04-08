package book.chap02.exam01;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	private static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("height[" +i+ "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " +maxOf(height)+ "입니다.");
	}
	
}
