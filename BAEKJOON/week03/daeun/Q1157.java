
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q1157 {

	public static void solution() {
		Scanner scan = new Scanner(System.in);
		String voca ="";
		voca = scan.nextLine().toUpperCase(); //대소문자 구분X
		String[] sal = voca.split(""); //단어 한글자씩 구분하여 배열 생성

        //글자의 사용 횟수를 알기 위해 Map의 key, value 이용
		Map<String, Integer> m = new HashMap<String, Integer>(); //key(String):글자 value(Integer):사용횟수
		for (String str : sal) {
			Integer count = m.get(str); 
			if (count == null) { //사용 횟수가 null일때 
				m.put(str, 1); // 그 글자의 사용 횟수를 1로
			} else { //null이 아닐 때
				m.put(str, count + 1); //기존 값에서 1 증가
			}
		} //value값이 제일 큰 글자 = 제일 많이 쓰인 글자
        
		Integer max = Collections.max(m.values()); //제일 큰 value 값을 max로 선언
		int count = 0; //제일 많이 쓰인 글자가 여러개일 때를 구분하기 위한 용도
		String key = ""; //for문 밖에서 key를 쓰기 위한 용도
		for (String mx : m.keySet()) {
			if (max.equals(m.get(mx))) { //key의 값(=value)이 max와 같을 때
				key = mx; 
				count++; //카운트 증가
			}
		}
		if (count == 1) { //제일 많이 쓰인 글자가 한 개일 때
			System.out.println(key);
		} else { //한 개가 아닐 때
			System.out.println("?");
		}
	}

	public static void main(String[] args) {
		solution();
	}
}
