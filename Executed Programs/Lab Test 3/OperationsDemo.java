import Operations.*;
import java.util.*;
import java.lang.*;

public class OperationsDemo {
	public static void main(String[] args) {
		double c, d;
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		c = s.nextDouble();
		d = s.nextDouble();
		do {
			System.out.println("- - - - M E N U - - - -");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("Enter your option: ");
			x = s.nextInt();
			switch (x) {
				case 1:	Addition a = new Addition(c, d);
				break;
				case 2: Subtraction sub = new Subtraction(c, d);
				break;
				case 3: Multiplication m = new Multiplication(c, d);
				break;
				case 4: Division div = new Division(c, d);
				break;
				case 5: System.exit(0);
				break;
				default: System.out.println("ERROR!!! INVALID OPTION ENTERED!!");
			}
		} while (x >= 1 && x <= 5);
	}
}
