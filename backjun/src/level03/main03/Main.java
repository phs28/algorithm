package level03.main03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
		//단, 첫 번째 숫자는 무조건 출력
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] add;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += scan.nextInt();
		}
		
		add = new int[arr.length];
		for(int j=0; j<arr.length; j++) {
			if((arr[j]-1) < arr[j] && arr[j] != 0) {
				add[j] += arr[j];
				System.out.print(add[j]+" ");
			}
		}
		
		scan.close();
	}
}
