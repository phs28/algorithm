package level01.main13;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		//한 개의 문자열 s와 문자 t가 주어지면 s의 각 문자와 t가 떨어진 최소거리 출력
		//문자열과 문자는 순서대로 모두 소문자로만 주어지고, 길이는 100을 넘지 않음
		//입력: teachermode e
		//출력: 1 0 1 2 1 0 1 2 2 1 0
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char t = scan.next().charAt(0); //문자로 변환
		
		int[] arr = new int[s.length()];
		
		int p = 1000;
		for(int i=0; i<arr.length; i++) {
			if(s.charAt(i) == t) {
				p = 0;
				arr[i] = p;
			} else {
				p++;
				arr[i] = p;
			}
		}
		
		p = 1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
				arr[i] = p;
			} else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
		
		for(int i : arr) {
			System.out.print(i);
		}
		
		scan.close();
	}
}
