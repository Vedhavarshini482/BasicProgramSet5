import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of arraylist");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			list.add(s.nextInt());
		miniMaxSum(list);

	}

	public static void miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		long min = (long) arr.get(0) + (long) arr.get(1) + (long) arr.get(2)
				+ (long) arr.get(3);
		long max = (long) arr.get(1) + (long) arr.get(2) + (long) arr.get(3)
				+ (long) arr.get(4);
		System.out.println(min + " " + max);
	}
}
