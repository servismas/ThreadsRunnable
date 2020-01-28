import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Counter r1 = new Counter();
		Counter r2 = new Counter();
		Counter r3 = new Counter();
		Counter r4 = new Counter();
		Counter r5 = new Counter();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t4.setDaemon(true);
		t5.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join(3000);
			t2.join(3000);
			t3.join(3000);
			t4.join(3000);
			t5.join(3000);
		} catch (Exception e) {
		}
		System.out.println(r1.getCounter());
		System.out.println(r2.getCounter());
		System.out.println(r3.getCounter());
		System.out.println(r4.getCounter());
		System.out.println(r5.getCounter());

	}

}
