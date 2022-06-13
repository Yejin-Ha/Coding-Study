/*
 * #### 제출
 * 맞았습니다!!
 */

import java.io.*;

public class Q10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += (score < 40) ? 40 : score;
        }
        System.out.println(sum / 5);
        br.close();
    }
}