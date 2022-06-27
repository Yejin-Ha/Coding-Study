/*
제출 성공!
 */


import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int front = 0;
		int back = 0;
		int sum = 0;
		int init = 0;
		int newNum = 0;
		int count = 0;
		
		init = num;
		
		while(true) {
			if(num / 10 == 0) {
				newNum = Integer.parseInt(String.format("%02d", num));
			}else {
				newNum = num;
			}
			front = newNum / 10; //2 6
			back = newNum % 10; //6 8
			sum = front + back; //8 14
			if(sum / 10 == 0) {
				newNum = Integer.parseInt(String.format("%02d", sum)); //08
			}else {
				newNum = sum; //14
			}
			num = back * 10 + newNum % 10; //68 84
			count++;
			if(num == init) {
				break;
			}
		}
		System.out.println(count);
	}
}
