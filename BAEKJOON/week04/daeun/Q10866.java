package week4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//문자열과 정수 두개를 받고 동작하는 기능과 문자열만 받고 동작하는 기능이 있어야 함
public class Q10866 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			String command = scan.next();
			String num = scan.next();
			solution(command, num);
			soluion2(command);
		}
	}

	public static void solution(String command, String num) {
		Scanner scan = new Scanner(System.in);
		Deque<String> deque = new ArrayDeque<>();
		if (command.equals("push_front")) {
			deque.addFirst(num);
		} else if (command.equals("push_back")) {
			deque.addLast(num);
		}
	}

	public static int soluion2(String command2) {
		Scanner scan = new Scanner(System.in);
		Deque<String> deque = new ArrayDeque<>();
		int result = 0;
		if (command2.equals("front")) {
			if (!(deque.isEmpty())) {
				result = Integer.parseInt(deque.getFirst());
			} else {
				result = -1;
			}
		} else if (command2.equals("back")) {
			if (!(deque.isEmpty())) {
				result = Integer.parseInt(deque.getLast());
			} else {
				result = -1;
			}
		} else if (command2.equals("size")) {
			result = deque.size();
		} else if(command2.equals("empty")) {
			if(deque.isEmpty()) {
				return 1;
			}else {
				return 0;
			}
		} else if(command2.equals("pop_front")) {
			deque.remove(deque.peek());
		} else if(command2.equals("pop_back"))

		return result;
	}
}
