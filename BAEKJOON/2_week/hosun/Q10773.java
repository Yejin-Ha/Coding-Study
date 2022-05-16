import java.util.Scanner;
import java.util.Stack;
public class Q10773 {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("size : ");
		int size = scan.nextInt();
		
		stack.setSize(size);
		
		for(int i=0; i<size; i++) {
			System.out.print("n : ");
			int temp = scan.nextInt();
			
			if(temp==0) 
				stack.pop();
			else 
				stack.add(temp);
			
		}
		Integer result = 0;
		for(Integer i : stack) {
			if(i != null)
				result+=i;
		}
		
		System.out.println(result);
		
		
		stack.clear(); scan.close();
	}
}