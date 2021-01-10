class Call {
	synchronized void display (String s){
		System.out.print("{"+s);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("}");	
	}
}

class NewThread implements Runnable {
	String s;
	Call c;
	Thread t;
	
	NewThread(Call c, String s) {
		this.c = c;
		this.s = s;
		t = new Thread(this, s);
		t.start();
	}

	public void run(){
		c.display(s);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

class FourThreads{
	public static void main(String args[]){
		Call c = new Call();
		NewThread t1 = new NewThread(c,"USN");
		NewThread t2 = new NewThread(c,"CSE");
		NewThread t3 = new NewThread(c,"BMSCE");
		NewThread t4 = new NewThread(c,"BANGALORE");
	
		try{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			t4.t.join();
		} catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}
