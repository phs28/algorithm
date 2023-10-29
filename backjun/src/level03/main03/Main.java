package level03.main03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
		//단, 첫 번째 숫자는 무조건 출력
		//입력: 6  7 3 9 5 6 12
		//출력: 7 9 6 12
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		List<Integer> answer;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += scan.nextInt();
		}
		
		answer = new ArrayList<>();
		answer.add(arr[0]); //배열을 컬렉션에다가 저장해서 출력
	    for (int i=1; i < arr.length; i++) {
	        if (arr[i-1] < arr[i]) {
	            answer.add(arr[i]);
	            System.out.print(answer+" ");
	        }
	    }
		
		scan.close();
	}
}
