package network;

public class Interface extends Port {
	
	String MAC = null;
	public String IP = null;
	String MASK = null;
	
	public Interface(String MAC, String IP, String MASK) {
		this.MAC = MAC;
		this.IP = IP;
		this.MASK = MASK;
	}
	public static Interface configure(int num) {
		String MAC = ClassTools.input(num, "Enter MAC for interface %d");
		String IP = ClassTools.input(num, "Enter IP for interface %d");
		String MASK = ClassTools.input(num, "Enter subnet mask for interface %d");
		return new Interface(MAC, IP, MASK);
	}
	public void receive() {
		
	}
	public String toString() {
		return String.format("MAC: %s. IP: %s. MASK: %s", this.MAC, this.IP, this.MASK);
	}
}
