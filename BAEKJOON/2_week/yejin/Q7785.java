/*
시간 초과로 실패 -> 이유 찾기
*/

import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> work = new ArrayList<>();

        int inputSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < inputSize; i++) {
            String[] str = bf.readLine().split(" ");
            String name = str[0];
            String state = str[1];

            if (state.equals("enter")) {
                work.add(name);
            } else if (state.equals("leave")) {
                if (work.contains(name))
                    work.remove(name);
            }
        }

        work.sort(Collections.reverseOrder());
        for (int i = 0; i < work.size(); i++) {
            bw.write(work.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
