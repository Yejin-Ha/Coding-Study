import java.io.*;
// 더하기 사이클
public class Q1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
    
        int x = N; // x에 N을 저장
        int cnt = 0; // 반복한 횟수

        while (true) {
            int q = x / 10; // x의 십의 자리(몫)
            int r = x % 10; // x의 일의 자리(나머지)
    
            int sum = q + r; //각 자릿수 더함
    
            x = r * 10 + sum % 10; // r과 sum의 가장 오른쪽 값을 더함
            cnt++;
    
            if (x == N) { // x와 N 같아지면 종료
                break;
            }
        }
    
        bw.write(cnt + "\n");
    
        bw.flush();
        bw.close();
        br.close();
    }
    
    }
    
