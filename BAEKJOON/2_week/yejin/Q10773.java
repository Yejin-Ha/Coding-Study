/*
# 조건
1. 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
2. 이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
3. 정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.

# 입력 예제         # 출력 예제
4                   0
3
0
4
0

*/

import java.util.Scanner;
import java.util.Stack;

public class Q10773 {
    public static int solution(){
        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++){
            int tmp = sc.nextInt();
            if (tmp == 0)
                st.pop();
            else
                st.push(tmp);
        }
        sc.close();

        int sum = 0;
        for (int i : st){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
