import java.util.Queue;
import java.util.LinkedList;

public class Q2164 {
	public static final int size = 3;
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=0; i<size; i++)
			que.add(i+1);
		
		while(que.size()>1) {
			que.poll();
			Integer temp = que.poll();
			que.add(temp);
		}
		
		System.out.println(que.peek());
		que.clear(); 
	}

}
