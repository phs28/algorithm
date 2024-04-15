package book.chap02.exam02;

import java.util.Scanner;

public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n] = 7;
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num+1]; //보초법으로 인한 마지막 요소 추가
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 요소의 값이 없습니다.");
		} else {
			System.out.println(ky+"은 x["+idx+"]에 있습니다.");
		}
		
		scan.close();
	}
}
