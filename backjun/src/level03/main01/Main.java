package level03.main01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
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
