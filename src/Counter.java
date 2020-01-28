
public class Counter implements Runnable{
	private int counter;

	@Override
	public void run() {
		while (true) {
			counter++;
			
		}
		
	}

	public int getCounter() {
		return counter;
	}

}
