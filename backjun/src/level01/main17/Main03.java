package level01.main17;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		// 최빈수 구하기
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); // 10
		int[] array = new int[num];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt(); // 1 2 2 3 1 4 2 2 4 3
		}
		
		// index -> 출현한 수
		// index 값 -> index(출현한 수)가 몇번나왔는지 저장하는 용도
		int[] mode = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			mode[array[i]]++;
		}
		
		//mode[1] = 2
		//mode[2] = 4
		//mode[3] = 2
		//mode[4] = 2
		
		int modeNum = 0;
		int modeCnt = 0;
		for(int i=0; i<array.length; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 : " + modeNum + " cnt : " + modeCnt);
		
		scan.close();
	}
}
