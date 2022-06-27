// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
// 제출 결과 출력초과..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[n2+1];
		
		arr[0] = arr[1] = true;
		
		for(int i = n1; i <= n2; i++) {
            //짝수일 경우 
			if(i % 2 == 0) {
				arr[i] = true;
			}
			if(arr[i]) { //false(소수)면 break; true(소수X)면 continue;
				continue;
			}
			
			for(int j = i*2; j <= n2; j+=i) {
				arr[j] = true;
			}
		}
		for(int i = n1; i < n2+1; i++) {
			if(!arr[i])
			System.out.println(i);
		}
		bf.close();
	}
}




