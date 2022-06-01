import java.util.*;

public class Q1264 {
    public static void main(Stringp[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            String txt = scan.nextLine();
            if (txt.equals("#")) {
                break;
            }
            int result = 0;
            for (int i = 0; i < txt.length(); i++) {
                if (check(Character.toString(txt.charAt(i))))
                    reuslt++;
            }
            System.out.println(reuslt);
        }
    }

    public static boolean check(String s) {
        s = s.toLowerCase();
        String[] str = { 'a', 'e', 'i', 'o', 'u' };
        for (String a : str) {
            if (s.equals(a)) {
                return true;
            }
        }
        return false;
    }
}
