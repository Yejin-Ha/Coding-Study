package Solution;

import java.util.ArrayList;
import java.util.Scanner;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
public class Q1157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] arr = new int[26]; 
		String s = in.next();
 
		for (int i = 0; i < s.length(); i++){
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { 
				arr[s.charAt(i) - 'A']++;
			} 
			else {
				arr[s.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char ch='.';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); 
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);

	}

}