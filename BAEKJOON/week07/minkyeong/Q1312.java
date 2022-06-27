import java.util.Scanner;
// 소수
public class Q1312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 분자(피제수)
		int b = sc.nextInt(); // 분모(제수)
		int n = sc.nextInt(); //소숫점 아래 n번째
		int result = a%b; // (나머지)
		
		for (int i = 0; i < n-1; i++) { //N번째 자리 전까지 체크
			result *= 10; // 나머지로 나온 수에 * 10
			result %= b; // 분모 나누기
		}
		result *= 10;
		System.out.println(result/b); // 몫
	}
}
