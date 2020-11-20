package CIE;
import CIE.*;
import java.lang.*;
import java.util.*;
public class Internals extends Student{
	Scanner in = new Scanner(System.in);
	public double cie_marks[] = new double[5];
	public Internals() {
		super();
		System.out.println("Enter CIE marks of 5 subjects:- ");
		for (int i = 0; i < 5 ; i++ ) {
			do {
				System.out.println("Marks in subject " + (i+1) + ": ");
				cie_marks[i] = in.nextDouble();
				if (cie_marks[i] > 50) {
					System.out.println("ERROR! MARKS CANNOT BE OVER 50! PLEASE INPUT AGAIN!");
				}
			}while(cie_marks[i] > 50);
		}
	}
}
