import java.util.*;
import java.lang.*;

class NewThread implements Runnable {
	Thread t;
	String s;
	int x;
	NewThread(String threadName, int x) {
		s = threadName;
		this.x = x;
		t = new Thread(this, s);
		System.out.println("Thread created");
		t.start();
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
				Thread.sleep(x);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted.");
		}
	}
}

class Lab9 {
	public static void main(String[] args) {
		new NewThread("BMS College of Engineering", 10000);
		new NewThread("CSE", 2000);
	}
}
