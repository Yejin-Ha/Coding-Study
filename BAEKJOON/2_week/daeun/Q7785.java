
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.collections.transformation.SortedList;

public class Q7785 {
    public static void solution() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int n = scan.nextInt();
        String name = "";
        String log = "";
        System.out.println(n);
        loop: for(int i = 0; i < n; i++) {
            name = scan.next();
            log = scan.next();
            if(name.length() > 5) {
                System.out.println("이름 길이 오류");
                i = 0;
                continue loop;
            }
        
            if(log.equals("enter")) {
                al.add(name);
            }else {
                al.remove(name);
            }
         }
         for(String tmp2 : al) {
             System.out.println(tmp2);
         }
    }

    public static void main(String[] args) {
        solution();
    }
}
//사전 순의 역순으로 출력 포기..