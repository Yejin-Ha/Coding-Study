import java.util.Scanner;
// 단어공부 - 알파벳 대소문자로 된 단어가 주어지면,
// 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
// 많이 사용된 알파벳이 여러 개 존재하면 '?' 출력
public class Q1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int[] arr = new int[26]; // 영문자 대소문자 구분 없이
		String s = in.next(); // 알파벳 문자열 입력
		for (int i = 0; i < s.length(); i++){
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // A-Z까지 범위
			arr[s.charAt(i) - 'A']++;	// 
			}
    
			else {	// 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
		int max = -1; // 최댓값 구하기. 구글링 참고했는데 -1 이해 부족.
		char ch = '?'; // 문자 여러개 존재하면 ? 출력 변수
		for (int i = 0; i < 26; i++) { //배열 확인하기
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 65는 10진수 A(아스키코드?)
			}
			else if (arr[i] == max) { //최대 개수 문자가 2개 
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}