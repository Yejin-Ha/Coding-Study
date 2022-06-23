import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Q1312
 * 
 * #### 제출
 * 실패
 */

public class Q1312 {
    // bufferedReader 사용

    // public static void main(String[] args) throws Exception {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine());
    // br.close();

    // int[] arr = new int[3];
    // int i = 0;
    // while(st.hasMoreTokens()){
    // arr[i++] = Integer.parseInt(st.nextToken());
    // }
    // double result = (double) arr[0] / arr[1];
    // int multi = 1;
    // for (int j = 0; j < arr[2]; j++){
    // multi *= 10;
    // }
    // System.out.println((int)(result * multi )% 10);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        int n = sc.nextInt();

        String result = Double.toString(a / b);
        System.out.println(result);
        int c = result.charAt(n + 1) - '0';
        System.out.println(c);
        System.out.println(result.charAt(n + 1) - '0');
    }
}