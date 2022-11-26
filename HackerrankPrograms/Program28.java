public class Program28 {

	public static void main(String[] args) {
		Program28 program = new Program28();
		program.kangaroo(0, 3, 4, 2);
	}

	public String kangaroo(int x1, int v1, int x2, int v2) {
		int a = Math.abs(v1 - v2);
		if (a == 0 && x1 != x2) {
			System.out.println("NO");
			return "NO";
		}
		int velocity = Math.abs(x1 - x2) / a;
		System.out.println(velocity);
		int distance1 = velocity * v1 + x1;
		int distance2 = velocity * v2 + x2;
		if (distance1 == distance2) {
			System.out.println("YES");
			return "YES";
		}
		System.out.println("NO");
		return "NO";
	}
}