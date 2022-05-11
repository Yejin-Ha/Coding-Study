import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static int solution(int n) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < n+1; i++) {
            q.add(i);
        }
        while(q.size()!=1) {
            q.poll();
            q.add(q.poll());
        }
        return q.poll();
    }


    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}

