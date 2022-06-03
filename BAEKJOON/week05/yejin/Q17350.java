/*
 * ### 제출 결과
 * 맞았습니다!!
 */

import java.util.*;

public class Q17350 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] lst = new String[n];
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            lst[i] = scan.nextLine();
        }
        scan.close();

        for (String name : lst) {
            if (name.equals("anj")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("뭐야;");
        } else {
            System.out.println("뭐야?");
        }
    }

}
