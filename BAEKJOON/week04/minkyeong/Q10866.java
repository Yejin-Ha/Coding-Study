// 덱 이해하기(양방향 양쪽에서 삽입 삭제가 이루어짐)
// push=offer=add, pop=poll=remove, front =peekFirst, back=peekLast
// 첫째 줄에 주어지는 명령의 수, 둘째 줄부터 n개의 줄에는 명령이 하나씩. 한줄에 하나씩
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
 
public class Q10866 {
	public static void main(String[] args) throws IOException {
        // Scanner
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        // StringBuilder는 append()의 인자로 연결하고자 하는
        // 문자열을 넣어서 sb의 객체를 통해 호출
		StringBuilder sb = new StringBuilder();
 
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			switch (s[0]) {
 
				case "push_front": { //맨 앞 데이터 추가 offerFitst
					dq.addFirst(Integer.parseInt(s[1]));
					break;
				}
				
				case "push_back": { //맨 뒤 데이터 추가 offerLast
					dq.addLast(Integer.parseInt(s[1]));
					break;
				}
 
				case "pop_front": { //맨 앞 데이터 삭제 removeFirst
					if (dq.isEmpty()) { //삭제할 요소가 없을 경우?
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.pollFirst()).append('\n');
					}
					break;
				}
 
				case "pop_back": { //맨 뒤 데이터 삭제 removeLast
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.pollLast()).append('\n');
					}
					break;
				}
 
				case "size": {
					sb.append(dq.size()).append('\n');
					break;
				}
 
				case "empty": {
					if (dq.isEmpty()) {
						sb.append(1).append('\n');
					} 
					else {
						sb.append(0).append('\n');
					}
					break;
				}
                //poll메서드에서 삭제과정 없는 것이 peek
				case "front": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else { // peekFirst 가장 앞에 있는 데이터 반환
						sb.append(dq.peekFirst()).append('\n');
					}
					break;
				}
 
				case "back": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else { // peekLast 가장 뒤에 있는 데이터 반환
						sb.append(dq.peekLast()).append('\n');
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
