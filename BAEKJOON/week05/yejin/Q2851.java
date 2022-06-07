/*
 * Q. 슈퍼마리오
 * 버섯은 10개만 입력된다.
 * 차례대로 입력되는 숫자를 더해가며 100에 가장 가까운 숫자에서 멈추고 출력하면 된다.
 * 만약 97, 103처럼 100에 가까운 숫자가 2개라면 큰 수를 출력한다.
 * 
 * ### 실행 결과
 * 성공
 * ### 제출 
 * 틀림(왜.....왜애애애ㅐ앵)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2851 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int tmp = 0;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            if (result<100) {
                n = Integer.parseInt(str);
                if (n + result > 100) {
                    tmp = result + n;
                } else {
                    result += n;
                }
            }
        }

        br.close();
        if (Math.abs(100-result) == Math.abs(tmp - 100)){
            result = tmp;
        }

        System.out.println(result);
    }
}
