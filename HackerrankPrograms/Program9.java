import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		System.out.println("Enter the size of ArrayList");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements of ArrayList");
		List<Integer> scores = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			scores.add(s.nextInt());
		breakingRecords(scores);
	}

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> count = new ArrayList<Integer>();
		int mincount = 0, maxcount = 0;
		int min = scores.get(0);
		int max = scores.get(0);
		for (int i = 1; i < scores.size(); i++) {
			if (min > scores.get(i)) {
				min = scores.get(i);
				mincount++;
			} else if (max < scores.get(i)) {
				max = scores.get(i);
				maxcount++;
			}
		}
		count.add(mincount);
		count.add(maxcount);
		System.out.print(count);
		return count;
	}
}