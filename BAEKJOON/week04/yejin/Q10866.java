/*
 * #### 제출
 * 맞았습니다.
 */

import java.io.*;
import java.util.*;

public class Q10866 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        Deque<String> que = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    que.addFirst(st.nextToken());
                    break;
                case "push_back":
                    que.addLast(st.nextToken());
                    break;
                case "pop_front":
                    System.out.println((que.isEmpty()) ? -1 : que.pollFirst());
                    break;
                case "pop_back":
                    System.out.println((que.isEmpty()) ? -1 : que.pollLast());
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    System.out.println((que.isEmpty()) ? 1 : 0);
                    break;
                case "front":
                    System.out.println((que.isEmpty()) ? -1 : que.getFirst());
                    break;
                case "back":
                    System.out.println((que.isEmpty()) ? -1 : que.getLast());
                    break;
            }
        }
    }
}
