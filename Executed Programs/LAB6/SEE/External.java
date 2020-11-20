package SEE;
import CIE.*;
import java.util.*;
import java.lang.*;
public class External extends Internals{
	Scanner in = new Scanner(System.in);
	public double see_marks[] = new double[5];
	public External() {
		super();
		System.out.println("Enter SEE marks of 5 subjects:- ");
		for (int i = 0; i < 5 ; i++) {
			do {
				System.out.println("Marks in subject " + (i+1) + ": ");
				see_marks[i] = in.nextDouble();
				if (see_marks[i] > 100){
					System.out.println("ERROR! MARKS CANNOT BE OVER 100! PLEASE INPUT AGAIN!");
				}
			}while(see_marks[i] > 100);
		}
	}
}
