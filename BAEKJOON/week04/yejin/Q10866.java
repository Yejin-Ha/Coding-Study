import java.util.*;

import javax.lang.model.element.Element;

public class Q10866 {
    public static void main(Stringp[] args){
        Deque<String> deque = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < length; i++){
            String[] menu = scan.nextLine().split(" ");
            
        }
    }
}

/*
 * # 덱 Deque 이란?
 * 덱(Deque)은 어떤 쪽으로 입력하고 어떤 쪽으로 출력하느냐에 따라서 스택(Stack)으로 사용할 수도 있고, 큐(Queue)로도 사용할
 * 수 있다.
 * 특히 한쪽으로만 입력 가능하도록 설정한 덱을 스크롤(scroll)이라고 하며, 한쪽으로만 출력 가능하도록 설정한 덱을 셸프(shelf)라고
 * 한다.
 * 자바에서의 덱은 인터페이스로 구현되었다.
 * 
 * Switch 문 사용하여 풀면 된다.
 */