import java.util.*;
public class Q2851 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
			al.add(scan.nextInt());
		
		int sum=0;
		for(int i=0; i<al.size(); i++) {
			int tmp = sum;
			sum+=al.get(i);
			if(Math.abs(100-tmp) == Math.abs(100-sum)) {
				System.out.println(sum);
				break;
			}
			if(sum>=100) {
				System.out.println(tmp);
				break;
			}
		}
	}
}
