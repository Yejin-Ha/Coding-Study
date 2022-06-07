import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2851 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 10;
		int score = 0;
		int total = 0;
		int min = 0;
		int jul = 0;
		int index = 0;
		int answer = 0;
		List<Integer> scores = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			score = scan.nextInt();
			total += score;
			scores.add(total);
		}
		for (int j = 0; j < scores.size(); j++) {
			min = scores.get(j) - 100; // 최소값
			jul = (min < 0) ? -min : min; // 최소값의 절대값
			list.add(jul);
		}
		for(int k = 0; k < list.size(); k++) {
			if(list.get(k) == Collections.min(list)) {
				index = k;
			}
		}
		
		answer = scores.get(index);
		System.out.println(answer);
	}
}
