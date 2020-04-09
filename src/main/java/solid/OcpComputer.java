package solid;

public class OcpComputer {
	
	private Mouse mouse;
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public void boot() {
		mouse.connect();
	}
}
