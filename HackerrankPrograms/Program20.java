import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
		int n = scanner.nextInt();
		System.out.println("Enter the ArrayList elements");
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			s.add(scanner.nextInt());
		birthday(s, 4, 2);
	}

	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		for (int i = 0; i <= s.size() - m; i++) {
			int temp = 0;
			for (int j = i; j < i + m; j++)
				temp += s.get(j);
			if (temp == d)
				count++;
		}
		System.out.println(count);
		return count;
	}
}