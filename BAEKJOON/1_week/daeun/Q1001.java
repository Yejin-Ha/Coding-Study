public class Q1001 {
    public static int solution(int n1, int n2) {

        int result = 0;
        if (n1 > 0 && n1 < 10) {
            if (n2 > 0 && n2 < 10) {
                result = n1 - n2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4));
    }
}
