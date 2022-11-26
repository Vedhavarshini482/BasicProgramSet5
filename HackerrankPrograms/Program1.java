import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Program1 program = new Program1();
		program.solution();
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int N = scanner.nextInt();
		if (N % 2 == 1 || (N % 2 == 0 && (N >= 6 && N <= 20)))
			System.out.println("Weird");
		else if (N % 2 == 0 && ((N >= 2 && N <= 5) || (N > 20)))
			System.out.println("Not Weird");
	}
}