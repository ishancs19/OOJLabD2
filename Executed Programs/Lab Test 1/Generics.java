class Generics<T, U, V> {
	T ob1;
	U ob2;
	V ob3;


	Generics(T x, U y, V z) {
		ob1 = x;
		ob2 = y;
		ob3 = z;
	}

	T getob1() {
		return ob1;
	}

	U getob2() {
		return ob2;
	}

	V getob3() {
		return ob3;
	}

	void display() {
		System.out.println("Ob1: " + getob1());
		System.out.println("Ob2: " + getob2());
		System.out.println("Ob3: " + getob3());
	}

	U join() {
		if (ob1 instanceof Integer && ob2 instanceof Integer && ob3 instanceof Integer) {
			int i1 = (Integer)getob1();
			int i2 = (Integer)getob2();
			int i3 = (Integer)getob3();
			return (U) new Integer(i1 + i2 + i3);
		}
		else if (ob1 instanceof Double && ob2 instanceof Double && ob3 instanceof Double) {
			double d1 = (Double)getob1();
			double d2 = (Double)getob2();
			double d3 = (Double)getob3();
			return (U) new Double(d1 + d2 + d3);
		}
		else if (ob1 instanceof String && ob2 instanceof String && ob3 instanceof String) {
			String s1 = (String)getob1();
			String s2 = (String)getob2();
			String s3 = (String)getob3();
			return (U) new String(s1 + s2 + s3);
		}
		else {
			return (U) new String("ERROR! ob1 and ob2 Type Mismatch...");
		}
	}
}

class Generics {
	public static void main(String[] args) {

		Generics<Integer, Integer, Integer> iObj = new Generics<Integer, Integer, Integer>(5,4,1);
		iObj.display();
		System.out.println("Sum: " + iObj.join());
		System.out.println();

		Generics<Double, Double, Double> dObj = new Generics<Double, Double, Double>(3.05,4.02,1.01);
		dObj.display();
		System.out.println("Sum: " + dObj.join());
		System.out.println();

		Generics<String, String, String> sObj = new Generics<String, String, String>("Hello,", " How are you?", " What is your name?");
		sObj.display();
		System.out.println("Concatanation: " + sObj.join());
		System.out.println();

	}
}
