package level01.main18;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //19
		
		int[] arr = new int[10];
		int i = 0;
		
		//2진수 나타낼 시 2로 나눠서 다음 배열에 추가하려면 []+1 마지막에서는 하나가 더 늘어 남으로 -1를 해줘야한다.
		while(num > 0) {
			arr[i] = num % 2;
			num /= 2;
			i++;
		}
		
		i--;
		
		//반대로 출력 루프
		for(; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}
