package level01.main14;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		//일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 
		//맨 앞에 서 있는 선생님이 볼 수 있는 최대학생 수 출력
		//첫 줄에 정수로 학생의 수가 입력되고, 다음 줄에 학생의 키가 입력
		//입력 8 130 135 148 140 145 150 150 153
		//출력 5
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int smailst = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int student = 0; //맨 처음 학생은 무조건 보임 배열을 첫번째 저장
		for(int i=0; i<arr.length; i++) {
			if(smailst < arr[i]) {
				smailst = arr[i];
				student++;
			}
		}
		System.out.println(student);
		
		scan.close();
	}
}
