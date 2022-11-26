import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int n = s.nextInt();
		System.out.println("Enter the arraylist elements");
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			arr.add(s.nextInt());
		migratoryBirds(arr);
	}

	public static int migratoryBirds(List<Integer> arr) {
		int max = 0;
		int n = 0;
		for (int i = 0; i < arr.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j)) {
					count++;
					if (max < count) {
						max = count;
						n = arr.get(j);
					}
				}
			}
		}
		System.out.println(n);
		return n;
	}
}