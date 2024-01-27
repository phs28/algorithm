package level04.main01;

import java.util.Scanner;

public class Main01 {
	//아스키 코드에 대한 이해
	//문자와 숫자가 섞여있는 문자열 중 숫자만 추출하여 주어진 순서대로 자연수를 출력
	//“tge0a1h205er”가 주어지면 숫자만 추출된이것의 자연수는 1205
	//입력 g0en2T0s8eSoft
	//출력 208
	
	// 아스키 0 -> 48, 9 -> 57
	public int solution(String str) {
        int answer=0;
        for(char x : str.toCharArray()) {
            if (x >= 48 && x <= 57)  {
            	answer = answer*10+(x-48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
