import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		Program27 program = new Program27();
		List<Integer> arr = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList");
		int n = s.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++)
			arr.add(s.nextInt());
		System.out.println("Enter how many rotate the arraylist");
		int d = s.nextInt();
		program.rotateLeft(d, arr);
	}

	public List<Integer> rotateLeft(int d, List<Integer> arr) {
		for (int i = 0; i < d; i++) {
			int temp = arr.get(0);
			arr.remove(arr.get(0));
			arr.add(temp);
		}
		System.out.println(arr);
		return arr;
	}
}
