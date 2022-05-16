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
            while(true){
                que.poll();//1
                que.add(que.poll()); //2번추출
                if(que.size() == 1 ){
                    break;
                }
            }
            return que.poll();
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
        
    }
}   
