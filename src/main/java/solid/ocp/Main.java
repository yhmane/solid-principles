package solid.ocp;

import solid.ocp.before.Computer;
import solid.ocp.after.OcpComputer;
import solid.ocp.after.AMouse;

public class Main {
	public static void main(String[] main) {
		
		// ocp 설계 이전
		Computer computer = new Computer();
		computer.boot();
		
		// ocp 설계 이후
		OcpComputer ocpCom = new OcpComputer();
		ocpCom.setOcpMouse(new AMouse());
		ocpCom.boot();
	}
}
