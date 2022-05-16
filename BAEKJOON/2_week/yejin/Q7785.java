/*

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Q7785 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> work = new ArrayList<>();

        int inputSize = sc.nextInt();
        for (int i = 0; i < inputSize; i++) {
            String person = sc.next();
            String state = sc.next();
            if (state.equals("enter")) {
                work.add(person);
            } else {
                work.remove(person);
            }
        }
        sc.close();

        for (int i = 0; i < work.size(); i++) {
            System.out.println(work.get(i));
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
