
/*
이동

######## 결과 - 시간초과 실패
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        Queue<Integer> que1 = new LinkedList<Integer>();
        Queue<Integer> que2 = new LinkedList<Integer>();
        int maxNum = -1;

        for (int i = 0; i < size; i++) {
            que1.offer(sc.nextInt());        }

        for (int i = 0; i < size; i++) {
            que2.offer(sc.nextInt());
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                que2.offer(que2.poll());
                int get = multi(que1, que2);
                if (get > maxNum)
                    maxNum = get;
            }
            que1.offer(que1.poll());
        }

        sc.close();
        System.out.println(maxNum);
    }

    public static int multi(Queue<Integer> a, Queue<Integer> b){
        Iterator<Integer> iterA = a.iterator();
        Iterator<Integer> iterB = b.iterator();
        int result = 0;

        while(iterA.hasNext()){
            result += iterA.next() * iterB.next();
        }
        return result;
    }
}
