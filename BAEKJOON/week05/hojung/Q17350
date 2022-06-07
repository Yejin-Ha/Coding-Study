/*
 * 1루수가 누구인지 밝혀내는 과정에서, 2루수가 거짓말을 하고 있다는 사실이 드러났다!

이에 극대노한 선수들은 2루수를 찾아내어 혼내주려고 한다. 그런데 이번에는 2루수의 이름을 모른다! 하지만 감독님은 무엇인가 알고 계신 듯하다.

"1루수가 누구야 2루수 이름이 뭐야 3루수는 몰라"

야구팀의 선수 리스트를 보고, 뭐가 있는지 찾아보자.

2루수 이름이 뭐야
 */


import java.io.*;
import java.util.*;

public class Q17350 {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean chk = false;
        for(int i = 0;i < N; i++){
            String line = br.readLine();
            if(line.equals("anj")) chk = true;
        }
        if(chk) bw.write("뭐야;\n");
        else bw.write("뭐야?\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

