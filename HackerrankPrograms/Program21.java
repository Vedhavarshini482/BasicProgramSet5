import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		System.out.println("Enter two Strings combination of 0 and 1");
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		stringsXOR(s1, s2);
	}

	public static String stringsXOR(String s1, String s2) {
		String s = "";
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) == '0' && s2.charAt(i) == '0')
					|| (s1.charAt(i) == '1' && s2.charAt(i) == '1'))
				s += "0";
			else
				s += "1";
		}
		System.out.println(s);
		return s;
	}
}