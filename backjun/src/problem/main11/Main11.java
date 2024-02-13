package problem.main11;

import java.io.IOException;
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) throws IOException {
		//10950번
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a + b);
		}
		
		scan.close();
	}
}
