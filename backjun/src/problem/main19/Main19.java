package problem.main19;

public class Main19 {
	public static void main(String[] args) {
		
		String word = "hellowWorlD";
		
		//단어로 구분해서 배열을 만들 때 쓰는 문법
		char[] arr = new char[word.length()];
		arr = word.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			//소문자로 인식을 하면 대문자로 바꿈
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + 'A' - 'a'); //아스키에선 대문자보다 소문자가 수가 더 큼 대문자와 소문자를 뺴면 대문자가 됨 아스키 특성
			//대문자로 인식하면 소문자로 바꿈
			} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		System.out.println(arr);
	}
}
