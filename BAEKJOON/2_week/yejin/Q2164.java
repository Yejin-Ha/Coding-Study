/*
예제 입력 : 6   -> 예제 출력 : 4

stack : LIFO - 후입선출
Queue : FIFO - 선입선출

######## 결과 - 성공
*/

import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static int solution(int n){
        Queue<Integer> que = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++){
            que.add(i);
        }
        while(que.size()!=1){
            que.poll();
            que.add(que.poll());
        }
        return que.poll();
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
