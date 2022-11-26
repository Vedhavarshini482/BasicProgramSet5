import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Program24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int n = s.nextInt();
		System.out.println("Enter the elements of arraylist");
		List<Integer> sticks = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			sticks.add(s.nextInt());
		maximumPerimeterTriangle(sticks);
	}

	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
		Collections.sort(sticks);
		Collections.reverse(sticks);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < sticks.size() - 2; i++) {
			if (sticks.get(i) < sticks.get(i + 1) + sticks.get(i + 2)) {
				list.add(sticks.get(i + 2));
				list.add(sticks.get(i + 1));
				list.add(sticks.get(i));
				System.out.println(list);
				return list;
			}
		}
		list.add(-1);
		System.out.println(list);
		return list;
	}
}
