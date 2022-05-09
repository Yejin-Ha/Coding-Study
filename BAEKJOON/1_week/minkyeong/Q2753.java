// 윤년 - 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
// 윤년이면 1, 아니면 0
public class Coding_Study_2753 {

	public static int solution(int n) {
		if(n % 4 == 0 && n % 100 !=0 || n % 400 ==0) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하시오.(윤년이면1, 아니면 0)");
		int year = scan.nextInt();
		
		System.out.println(solution(year) + "입니다.");
	
	}

}