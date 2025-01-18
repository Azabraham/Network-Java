package network;

public class NIC extends Interface {
	
	String Gateway = null;
	
	public NIC(String MAC, String IP, String MASK, String Gateway) {
		super(MAC, IP, MASK);
		this.Gateway = Gateway;
	}
	public static NIC configure(int one) {
		// Method to manually configure NIC cards
		Interface def = Interface.configure(one);
		String Gateway = ClassTools.input(one, "Enter Gateway for Interface %d");
		return new NIC(def.MAC, def.IP, def.MASK, Gateway);
	}
}
