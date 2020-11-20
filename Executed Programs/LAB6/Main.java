import CIE.*;
import SEE.*;
import java.util.*;
import java.lang.*;
class Main {

	public static void Tot_marks(External obj, double[] arr) {
		for (int i = 0; i < 5 ; i++) {
			arr[i] = (obj.cie_marks[i] + ((obj.see_marks[i])/2));
		}
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		double Total[] = new double[5];
		System.out.println("Enter number of students:- ");
		n = in.nextInt();
		External e[] = new External[n];
		for (int i = 0; i < n ; i++) {
			e[i] = new External();
			Tot_marks(e[i], Total);
			System.out.println("Total marks: ");
			for (int j = 0; j < 5 ; j++) {
				System.out.println(Total[j]);
			}
		}
	}
}
