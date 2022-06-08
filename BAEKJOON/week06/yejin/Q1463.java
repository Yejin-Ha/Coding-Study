import java.util.*;

public class Q1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int cnt = 0;
        scan.close();

        while (x > 1) {
            if (x % 3 == 0) {
                x /= 3;
            } else if (x % 2 == 0) {
                x /= 2;
            } else {
                x -= 1;
            }
            System.out.println("sdf"+x);
            System.out.println("asdgfhg"+cnt);
            cnt++;
        }
        System.out.println(cnt);
    }
}
