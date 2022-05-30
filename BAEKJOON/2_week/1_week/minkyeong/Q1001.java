// 두 정수 A와 B를 입력받은 다음,
// A-B를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q1001 {

	public static int solution(int A, int B) {
		int result = 0; // 결과값 반환
		if (A > 0 && B < 10) {
			return A - B;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개를 입력하시오.");
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		System.out.println(solution(a1, a2) + " 입니다.");

	}
}
