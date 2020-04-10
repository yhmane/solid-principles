package solid.ocp.after;

public class OcpComputer {
	
	private OcpMouse ocpMouse;
	
	public void setOcpMouse(OcpMouse ocpMouse) {
		this.ocpMouse = ocpMouse;
	}
	
	public void boot() {
		ocpMouse.connect();
		System.out.println("boot");
	}
}
