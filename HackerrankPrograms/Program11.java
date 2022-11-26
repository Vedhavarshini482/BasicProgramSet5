import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Arraylist Strings");
		List<String> strings = new ArrayList<String>();
		for (int i = 0; i < 3; i++)
			strings.add(s.next());
		System.out.println("Enter the Arraylist queries");
		List<String> queries = new ArrayList<String>();
		for (int i = 0; i < 3; i++)
			queries.add(s.next());
		matchingStrings(strings, queries);
	}

	public static List<Integer> matchingStrings(List<String> strings,
			List<String> queries) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < queries.size(); i++) {
			int count = 0;
			for (int j = 0; j < strings.size(); j++) {
				if (queries.get(i).equals(strings.get(j)))
					count++;
			}
			arr.add(count);
		}
		System.out.println(arr);
		return arr;
	}
}