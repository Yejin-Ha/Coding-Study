dasdkjfasd
public static int solution() {
		// 팩토리얼
		int fac = 1; // 곱하는 초기값 1
		int num = 0;

		for (int i = 1; i <= num; i++) {
			fac = fac * i;
			if (num == 0) { // num이 0이면 1출력
				return 1;
			}
		}
		return fac;