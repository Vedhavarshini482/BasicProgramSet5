import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		System.out.println("Enter the k value");
		int k = s.nextInt();
		System.out.println("Enter the A ArrayList elements");
		for (int i = 0; i < 2; i++)
			A.add(s.nextInt());
		System.out.println("Enter the B ArrayList elements");
		for (int i = 0; i < 2; i++)
			B.add(s.nextInt());
		twoArrays(k, A, B);
	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		Collections.sort(A);
		Collections.sort(B);
		for (int i = 0, j = B.size() - 1; i < A.size(); i++, j--) {
			if (A.get(i) + B.get(j) < k) {
				System.out.println("NO");
				return "NO";
			}
		}
		System.out.println("YES");
		return "YES";
	}
}