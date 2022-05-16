import java.util.LinkedList;
import java.util.Queue;

public class Q2164{
    public static int solution(int n){
        //큐 선언
        Queue<Integer> que = new LinkedList<>();
            
            //값 넣기
            for(int i = 1; i <= n; i++ ){
                que.add(i);
            }
            //
            while(que.size() != 1){
                que.poll(); // 1을 추출
                que.add(que.poll());
                //if(que.size() == 1 ){
                // break;
            }
            return que.poll();
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
        
    }// 이전 코드에 while(true), if문을 사용할 경우에는
     // 아무것도 없는 상태에서 추출하고 add를 하려고 해서 1이 될 때까지 while문이 계속 실행됨.
     // 조건이 안맞아서 컴파일 에러
     // 조건 que.size()!=1 로 while문 활용하기
}   
