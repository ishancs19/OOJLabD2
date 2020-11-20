package CIE;
import java.lang.*;
import java.util.*;
public class Student {
	Scanner in = new Scanner(System.in);
	int usn;
	String name;
	int sem;

	public Student() {
		System.out.println("Enter name: ");
		name = in.nextLine();
		System.out.println("Enter usn: ");
		usn = in.nextInt();
		System.out.println("Enter sem: ");
		sem = in.nextInt();
	}
}
