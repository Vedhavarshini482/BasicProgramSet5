import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		System.out.println("Enter the ArrayList elements");
		Scanner s = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++)
			list.add(s.nextInt());
		gradingStudents(list);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < grades.size(); i++) {
			int num = grades.get(i) % 5;
			if (grades.get(i) >= 35) {
				{
					if (num == 1)
						num = grades.get(i) + 4;
					else if (num == 2)
						num = grades.get(i) + 3;
					else if (num == 3)
						num = grades.get(i) + 2;
					else if (num == 4)
						num = grades.get(i) + 1;
					else
						num = grades.get(i);
				}
				if (num - grades.get(i) < 3)
					list.add(num);
				else
					list.add(grades.get(i));
			} else
				list.add(grades.get(i));
		}
		System.out.println(list);
		return list;
	}
}
