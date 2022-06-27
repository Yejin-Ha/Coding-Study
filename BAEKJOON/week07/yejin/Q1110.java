import java.util.Scanner;

/**
 * Q1110
 * 
 * #### 제출
 * 틀렸습니다.
 * 
 * -> 파이썬으로 하면 성공인데 어이없음
 */

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int tmpN = n;

        int cnt = 0;
        while (true) {
            int a = tmpN / 10;
            int b = tmpN % 10;
            int tmp = b * 10 + ((a+b)%10);
            cnt++;
            System.out.println(tmp + " " +cnt);
            if (tmp == n)
                break;
            tmpN = tmp;
        }
        System.out.println(cnt);
    }
}