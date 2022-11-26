import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the modulo divisor");
		long m = s.nextLong();
		System.out.println("Enter the subarray list");
		List<Long> a = new ArrayList<Long>();
		for (int i = 0; i < 5; i++)
			a.add(s.nextLong());
		maximumSum(a, m);
	}

	public static long maximumSum(List<Long> a, long m) {
		long max = Long.MIN_VALUE;
		long val = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i; j < a.size(); j++) {
				val += a.get(j);
				max = Math.max(max, val % m);
			}
			val = 0;
		}
		System.out.println(max);
		return max;
	}
}