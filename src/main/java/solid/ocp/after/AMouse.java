package solid.ocp.after;

public class AMouse implements OcpMouse {
	@Override
	public void connect() {
		System.out.println("AMouse 연결");
	}
}
