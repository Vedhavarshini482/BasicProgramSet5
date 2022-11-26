public class Program8 {

	public static void main(String[] args) {
		timeConversion("01:00:00PM");
	}

	public static String timeConversion(String s) {
		String s1 = "";
		if (s.charAt(8) == 'A') {
			if ((s.charAt(0) == '1' && s.charAt(1) == '2')) {
				s1 += "00" + s.substring(2, s.length() - 2);
			} else {
				s1 = s.substring(0, s.length() - 2);
			}
			System.out.print(s1);
			return s1;
		}
		if (s.charAt(8) == 'P') {
			if (s.charAt(0) == '1' && s.charAt(1) == '2') {
				s1 = s.substring(0, s.length() - 2);
			} else {
				s1 = Integer
						.toString(Integer.parseInt((s.substring(0, 2))) + 12)
						+ s.substring(2, s.length() - 2);
			}
		}
		System.out.print(s1);
		return s1;
	}
}