// A÷B를 했을 때, 소숫점 아래 N번째 수를 출력한다.
// 제출 했지만 틀렸습니다.. 이유는 모르겠음

import java.util.Scanner;
public class Q1312 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt(); //25
		double B = scan.nextInt(); //7
		int N = scan.nextInt(); //5
		double result = A / B; //3.571428
		int gop = (int) Math.pow(10, N); //100000
		double num = result * gop; //2.8
		int dap = (int) (num % 10); //2
		System.out.println(dap);
	}
}
