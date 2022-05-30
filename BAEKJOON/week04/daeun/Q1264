package week4;

import java.util.Scanner;

public class Q1264 {
	public static void main(String[] args) {
		System.out.println(solution());
	}

	public static int solution() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int count = 0;
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				count++;
			}
		}
		return count;
	}
}
