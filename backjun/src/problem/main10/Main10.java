package problem.main10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//2739번 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=9; i++) {
			if(n >= 1 && n <= 9) {
				System.out.println(n +" * "+ i +" = "+ (n*i));
			}
		}
		
		br.close();
	}
}
