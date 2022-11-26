public class Program18 {

	public static void main(String[] args) {
		marsExploration("SOSSPSSQSSOR");
	}

	public static int marsExploration(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i = i + 3) {
			String s1 = "";
			s1 += "" + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2);
			if (s1.charAt(0) != 'S')
				count++;
			if (s1.charAt(1) != 'O')
				count++;
			if (s1.charAt(2) != 'S')
				count++;
		}
		System.out.println(count);
		return count;
	}
}