public class Q2753 {

    public static int solution(int n) {
        if (n % 400 == 0) {
            return 1;
        } else if (n % 4 == 0) {
            if (n % 100 == 0)
            return 0;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(2012));
    }
}

/*
* 400 배수 -> 무조건 윤년
* 4의 배수가 아님 -> 윤년 아님
* 4의 배수 & 100의 배수 아님 -> 윤년
* 4의 배수 & 100의 배수 -> 윤년 아님
*/
