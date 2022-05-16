import java.util.Scanner;
import java.util.Stack;

public class   Q10773{
    //스택사용
    //public static int solution(){
     public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
	Scanner scan = new Scanner(System.in);	
    int k = scan.nextInt(); //입력개수
		
    for(int i = 0; i <= k; i++) {
        int num = scan.nextInt(); // 정수 입력할 것
        // stack.push(i);
    
	if(num == 0) {	//정수가 0이면 스택에서 맨 위 숫자 제거
		stack.pop();
	}
	else {	// 아니면 정수 추가 
		stack.push(num);
	}
}
 
int sum = 0;
for(int s : stack) {	// 스택에 담기 정수 합
	sum += s;
}
    //public static void main(String[] args){
        System.out.println(sum);
    }
}