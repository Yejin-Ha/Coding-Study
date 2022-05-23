/*
메모리 초과 실패
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Collections;

public class Q1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> map = new HashMap<>();

        String str = br.readLine().toUpperCase();
        while (str.length() > 0) {
            char c = str.charAt(0);
            str = str.substring(1);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int maxCnt = Collections.max(map.values());

        // 특정 값의 중복 개수 세기
        if (Collections.frequency(map.values(), maxCnt) > 1) {
            bw.write("?");
        } else {
            bw.write(getKey(map, maxCnt));
        }
        
        bw.flush();
        bw.close();
    }

    public static char getKey(HashMap<Character, Integer> m, Object value) {
        char result = '\u0000';
        for (Character o : m.keySet()) {
            if (m.get(o) == value) {
                result = o;
                break;
            }
        }
        return result;
    }
}