public class Q10872 {
    // solution 1) 반복문 사용
    public static int solution1(int n) {
        if (n == 0)
            return 1;

        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    // solution 2) 재귀함수
    public static int solution2(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * solution2(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1(10));
        System.out.println(solution1(10));
    }
}
