import java.util.HashSet;
import java.util.LinkedHashSet;

public class Program17 {

	public static void main(String[] args) {
		pangrams("We promptly judged antique ivory buckles for the prize");
	}

	public static String pangrams(String s) {
		String pangram = s.toLowerCase();
		HashSet<Character> st = new LinkedHashSet<Character>();
		for (int i = 0; i < pangram.length(); i++) {
			if (pangram.charAt(i) >= 'a' && pangram.charAt(i) <= 'z')
				st.add(pangram.charAt(i));
		}
		if (st.size() == 26) {
			System.out.println("Pangram");
			return "pangram";
		}
		System.out.println("not pangram");
		return "not pangram";
	}
}