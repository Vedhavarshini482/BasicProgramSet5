import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		System.out.println("Enter the size of arraylist");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the arraylist elements");
		List<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			ar.add(s.nextInt());
		System.out.println("Enter the divisible number");
		int k = s.nextInt();
		divisibleSumPairs(n, k, ar);
	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		for (int i = 0; i < ar.size() - 1; i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				int num = ar.get(i) + ar.get(j);
				if (num % k == 0)
					count++;
			}
		}
		System.out.println(count);
		return count;
	}
}