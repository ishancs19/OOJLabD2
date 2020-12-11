import java.util.*;
import java.lang.*;

class AgeException extends Exception {
	int x;
	AgeException(int x){
		this.x = x;		
	}
	public String toString(){
		return "INVALID INPUT: " + x;
	}
}

class Father {
	int Fage;
	Scanner in = new Scanner(System.in);
	Father() throws AgeException {
		System.out.print("Enter Father's age: ");
		Fage = in.nextInt();
		if(Fage < 0) 
			throw new AgeException(Fage);
	}
}

class Son extends Father {
	int Sage;
	Son() throws AgeException {
		super();
		System.out.print("Enter Son's age: ");
		Sage = in.nextInt();
		if(Sage < 0) {
			throw new AgeException(Sage);
		}
		if(Sage > super.Fage || Sage == super.Fage) {
			throw new AgeException(Sage);	
		}
	}
}

class Lab8 {
	public static void main(String[] args) {
		try{
			Son s = new Son();	
		} catch(AgeException e){
			System.out.println(e);
		}		
	}
}
