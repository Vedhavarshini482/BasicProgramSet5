import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int n = s.nextInt();
		System.out.println("Enter the arraylist elements");
		List<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			ar.add(s.nextInt());
		sockMerchant(n, ar);
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		int count = 0;
		Collections.sort(ar);
		for (int i = 0; i < ar.size() - 1; i++) {
			if (ar.get(i) == ar.get(i + 1)) {
				count++;
				i++;
			}
		}
		System.out.println(count);
		return count;
	}
}