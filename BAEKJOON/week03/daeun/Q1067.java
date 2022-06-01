
import java.util.ArrayList;
import java.util.Scanner;

public class Q1067 {
	public static void solution() {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> Score = new ArrayList<>();
		int xnum = 0;
		int ynum = 0;
		for (int j = 0; j < number; j++) {
			xnum = scan.nextInt();
			x.add(j, xnum);

		}
		for (int j = 0; j < number; j++) {
			ynum = scan.nextInt();
			y.add(j, ynum);
		}

		for (int k = 0; k < number; k++) {
			for (int i = 0; i < number; i++) {
				if (i == number - 1) {
					x.add(0, x.get(i));
					x.remove(i + 1);
				}
			}

			for (int i = 0; i < number; i++) {
				if (i == number - 1) {
					y.add(0, y.get(i));
					y.remove(i + 1);
				}
			}

			int S = 0;
			for (int i = 0; i < number; i++) {
				S += x.get(i) * y.get(i);
			}
			Score.add(S);

		}
		System.out.println("Score: " + Score);
	}
}
