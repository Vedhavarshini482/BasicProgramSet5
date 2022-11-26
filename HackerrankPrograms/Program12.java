import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Arraylist elements");
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++)
			a.add(s.nextInt());
		lonelyinteger(a);
	}

	public static int lonelyinteger(List<Integer> a) {
		int unique = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) == a.get(j)) {
					a.set(i, -1);
					a.set(j, -1);
				}
			}
		}
		for (int i : a) {
			if (i != -1)
				unique = i;
		}
		System.out.println(a);
		System.out.println(unique);
		return unique;
	}
}