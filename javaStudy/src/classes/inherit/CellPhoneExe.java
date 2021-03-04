package classes.inherit;

public class CellPhoneExe {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.color = "white";
		cp.model = "Galaxy";
		cp.powerOn();
		System.out.println("========================================");

		DmbCellPhone dp = new DmbCellPhone("black", "Motolora", 10);
//		dp.color = "black";
//		dp.model = "MotoLora";
		dp.powerOn();
		dp.turnOnDmb();
		dp.turnOffDmb();
		dp.powerOff();
	}
}
