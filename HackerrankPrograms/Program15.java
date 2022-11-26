import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program15 {

	public static void main(String[] args) {
		System.out.println("Enter the ArrayList elements");
		Scanner s = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++)
			arr.add(s.nextInt());
		countingSort(arr);
	}

	public static List<Integer> countingSort(List<Integer> arr) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			int count = 0;
			for (int j = 0; j < arr.size(); j++) {
				if (i == arr.get(j))
					count++;
			}
			if (count >= 0 && list.size() < 100)
				list.add(count);
			if (i == 100)
				break;
		}
		System.out.println(list);
		return list;
	}
}