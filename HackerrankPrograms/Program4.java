import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Program4 program = new Program4();
		System.out.println("Enter the magazine and note");
		Scanner s = new Scanner(System.in);
		List<String> magazine = new LinkedList<String>();
		List<String> note = new LinkedList<String>();
		for (int i = 0; i < 6; i++)
			magazine.add(s.next());
		for (int i = 0; i < 5; i++)
			note.add(s.next());
		program.checkMagazine(magazine, note);
	}

	public void checkMagazine(List<String> magazine, List<String> note) {
		for (int i = 0; i < note.size(); i++) {
			if (!magazine.contains(note.get(i))) {
				System.out.println("No");
				System.exit(0);
			} else
				magazine.remove(note.get(i));
		}
		System.out.println("Yes");
	}
}