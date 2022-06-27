import java.util.Scanner;

/*
 * 3, 5kg 봉지를 갖고 있음
 * 
 * #### 제출
 * 성공
 */
public class Q2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        scan.close();

        while (true) {
            if (n % 5 == 0) {
                result += n / 5;
                System.out.println(result);
                break;
            } else {
                n -= 3;
                result++;
            }

            if(n < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
