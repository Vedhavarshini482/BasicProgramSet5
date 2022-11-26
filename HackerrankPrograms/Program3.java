import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String and Integer value");
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.print(s1);
			for (int j = s1.length(); j < 15; j++)
				System.out.print(" ");
			String s = Integer.toString(x);
			if (s.length() < 3) {
				while (s.length() != 3) {
					s = "0" + s;
				}
				System.out.println(s);
			} else
				System.out.println(s);
		}
		System.out.println("================================");
	}
}