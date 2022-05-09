public static int solution(int n) {
		if(n % 4 == 0)
			if(n % 100 != 0 || n % 400 == 0) {
			return 1;
		}
		return 0;
	}