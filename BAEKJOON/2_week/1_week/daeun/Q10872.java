import java.util.Scanner;
public class Q10872 {
static int solution(int n) {
		int f = 1;
		if (n >= 0 && n <= 12) {
			for (int i = n; i > 0; i--) {
				f = f * i;
			}
			return f;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		System.out.println("수 입력: ");
		n = scan.nextInt();
		System.out.println(solution(n));
	}

}