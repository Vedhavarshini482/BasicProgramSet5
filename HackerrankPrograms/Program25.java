public class Program25 {

	public static void main(String[] args) {
		pageCount(6, 5);
	}

	public static int pageCount(int n, int p) {
		int count = 0, max = 0, min = 0;
		for (int i = 1; i <= n; i += 2) {
			if (i >= p || n == 1)
				break;
			else
				min++;
		}
		for (int i = n; i >= 1; i -= 2) {
			if (i <= p || (i == p + 1 && p % 2 == 0))
				break;
			else
				max++;
		}
		count = Math.min(min, max);
		System.out.println(count);
		return count;
	}
}