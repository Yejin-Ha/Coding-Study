/*
 * 피제수(분자) A와 제수(분모) B가 있다. 
 * 두 수를 나누었을 때, 소숫점 아래 N번째 자리수를 구하려고 한다. 
 * 예를 들어, A=3, B=4, N=1이라면, A÷B=0.75 이므로 출력 값은 7이 된다.
 */

import java.util.Scanner;

public class Q1312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a%b;
			
		for (int i = 0; i < c-1; i++) {
			result *= 10;
			result %= b;
		}
		result *= 10;
		System.out.println(result/b);
		}
	}
