public class Program16 {

	public static void main(String[] args) {
		countingValleys(10, "UDUUUDUDDD");
	}

	public static int countingValleys(int steps, String path) {
		int valley = 0, sealevel = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U')
				sealevel++;
			if (path.charAt(i) == 'D')
				sealevel--;
			if (path.charAt(i) == 'U' && sealevel == 0)
				valley++;
		}
		System.out.println(valley);
		return valley;
	}
}