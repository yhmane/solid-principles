package solid.before;

public class Computer {

	private final SMouse mouse = new SMouse();
	
	public void boot() {
		mouse.connect();
		System.out.println("boot");
	}
}
