package solid;

public class Computer {

	private final SMouse mouse = new SMouse();
	
	public void boot() {
		// run
		mouse.connect();
	}
}
