import java.util.*;

public class Q7785 {
	public static final int size = 4;
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<size; i++) {
			System.out.print("");
			String name = scan.next();
			String log = scan.next();
			
			if(log.equals("leave")) 
				set.remove(name);
			
			if(log.equals("enter"))
				set.add(name);
		}
		
		List<String> list = new ArrayList<>();
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			list.add(it.next());

		Collections.sort(list, Collections.reverseOrder());
		
		for(String s : list)
			System.out.println(s);
		
		
		
		
		set.clear(); scan.close();
		
	}
}