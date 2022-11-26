import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		Program26 program = new Program26();
		List<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList");
		int n = s.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++)
			a.add(s.nextInt());
		program.pickingNumbers(a);
	}

	public int pickingNumbers(List<Integer> a) {
		int max = 0;
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			List<Integer> b = new ArrayList<Integer>();
			int temp = a.get(i);
			b.add(temp);
			for (int j = i + 1; j < a.size(); j++) {
				if (Math.abs(temp - a.get(j)) <= 1)
					b.add(a.get(j));
			}
			max = Math.max(max, b.size());
		}
		System.out.println(max);
		return max;
	}
}