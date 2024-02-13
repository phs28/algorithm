package level01.main16;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		//피보나치 수열
		//공식: An = An-1 + An-2
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		for(int j=1; j<=10; j++) {
			System.out.print(arr[j]+" ");
		}
		
		scan.close();
	}
}
