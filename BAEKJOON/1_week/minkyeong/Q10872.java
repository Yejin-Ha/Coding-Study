import java.util.Scanner;

public class Q10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num = scan.nextInt();

		int fac = 1; // 곱하는 초기값 설정
		for (int i = 1; i <= num; i++) {
			fac = fac * i; //fac에 누적시키기
		}
		System.out.println(num + "! = " + fac);
	}
}
// public static int solution() {
// 		// 팩토리얼
// 		int fac = 1; // 곱하는 초기값 1
// 		int num = 0;

// 		for (int i = 1; i <= num; i++) {
// 			fac = fac * i;
// 			if (num == 0) { // num이 0이면 1출력
// 				return 1;
// 			}
// 		}
// 		return fac;