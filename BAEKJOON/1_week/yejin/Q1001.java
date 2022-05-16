// ######## 결과 - 성공

import java.util.Scanner;

public class Q1001{
    public static int solution() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(solution());    
    }
}

