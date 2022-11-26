import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		System.out.println("Enter the size of arraylist");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements of arraylist");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(s.nextInt());
		plusMinus(list);
	}

	public static void plusMinus(List<Integer> arr) {
		float n = arr.size();
		float positive = 0, negative = 0, zero = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0)
				positive++;
			else if (arr.get(i) < 0)
				negative++;
			else
				zero++;
		}
		System.out.println(positive / n);
		System.out.println(negative / n);
		System.out.println(zero / n);
	}
}