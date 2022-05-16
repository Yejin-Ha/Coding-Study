import java.util.LinkedList;
import java.util.Queue;

public class  Q2164{
    public static int solution(int n){
        Queue<Integer> que = new LinkedList<>();
            
            //값 넣기
            for(int i = 1; i <= n; i++ ){
                que.add(i);
            }
            //카드가 1이 될 때까지
            while(que.size() != 1){
                que.poll();//1
                que.add(que.poll()); //2번추출
                
            }
            return que.poll();
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
        
    } // 이전 코드에 while(true), if문을 사용할 경우에는
     // poll되어 있는 상태에서 또 poll을 하려고 하고 add 하려고 하기 때문에
     //조건 while안에 사용하기
     
}   
