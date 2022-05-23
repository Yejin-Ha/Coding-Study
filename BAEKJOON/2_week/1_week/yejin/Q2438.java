// ######## 결과 - 성공

public class Q2438 {
	public static void solution(int n) {
		for (int i = 0; i < n;i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		solution(5);
	}
}