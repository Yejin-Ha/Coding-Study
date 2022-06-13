import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> ls = new ArrayList<>();
		for(int i=0; i<5; i++) {
			ls.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 0;
		for(Integer i : ls) {
			if(i<40)
				result += 40;
			else
				result += i;
		}
		System.out.println(result/5);
	}
}
