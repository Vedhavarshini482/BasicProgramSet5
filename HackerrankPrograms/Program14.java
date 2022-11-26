import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n[][] = new int[3][3];
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		System.out.println("Enter the digonal matrix");
		for (int i = 0; i < n.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = s.nextInt();
				list.add(n[i][j]);
			}
			arr.add(list);
		}
		diagonalDifference(arr);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int m = 0, n = 0;
		for (int i = 0; i < arr.size(); i++)
			m += arr.get(i).get(i);
		for (int i = arr.size() - 1, j = 0; i >= 0; i--, j++)
			n += arr.get(j).get(i);
		System.out.println(Math.abs(m - n));
		return Math.abs(m - n);
	}
}