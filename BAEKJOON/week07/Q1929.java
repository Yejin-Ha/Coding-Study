//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Q1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[end + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * 2; j <= end; j += i) {
                prime[j] = true;
            }
        }
        for (int i = start; i < end + 1; i++) {
            if (!prime[i])
                System.out.println(i);
        }
				br.close();
    }
}