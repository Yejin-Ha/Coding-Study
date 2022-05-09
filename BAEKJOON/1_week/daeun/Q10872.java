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