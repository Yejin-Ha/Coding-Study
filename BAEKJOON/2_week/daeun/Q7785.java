
import java.util.ArrayList;
import java.util.Scanner;

public class Q7785 {
    public static void solution() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int n = scan.nextInt();
        String name = "";
        String log = "";
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            name = scan.next();
            log = scan.next();
        
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