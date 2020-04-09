package solid;

public class Main {
	public static void main() {
		
		// ocp 설계 이전의 컴퓨터
		Computer computer = new Computer();
		computer.boot();
		
		// ocp 설계 이후의 컴퓨터
		OcpComputer ocpCom = new OcpComputer();
		ocpCom.setMouse(new OcpMouse());
		ocpCom.boot();
	}
}
