import java.util.Scanner;

public class Q2753 {
	public static int solution(int n) {
		if (n % 4 == 0)
			if (n % 100 != 0 || n % 400 == 0) {
				return 1;
			}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		System.out.println("년도 입력: ");
		n = scan.nextInt();
		System.out.println(solution(n));
	}
}