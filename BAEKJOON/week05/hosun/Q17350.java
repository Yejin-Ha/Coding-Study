import java.util.*;
public class Q17350 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		List<String> ls = new ArrayList<>();
		for(int i=0; i<num; i++) {
			ls.add(scan.nextLine());
		}
		boolean flag = false;
		for(int i=0; i<ls.size(); i++) {
			if(ls.get(i).equals("anj")) {
				flag = true; break;
			}
		}
		if(flag)
			System.out.println("뭐야;");
		else
			System.out.println("뭐야?");
	}
}