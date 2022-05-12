import java.util.Stack;
import java.util.Scanner;

public class Q10773 {
    public static int solution(int n) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int num = 0;
        int sum = 0;
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            num = scan.nextInt();
            if(num == 0 ){
                st.pop();
            } else {
                st.push(num);
            }
        }
        for(int i : st) {
            sum = sum + i;
        }
        return sum;
    }
    
            public static void main(String[] args) {
               System.out.println("합: " + solution(10));
            }
}