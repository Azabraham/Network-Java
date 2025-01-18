package network;

public class Frame {
	
	String destinMAC = null;
	String sourceMAC = null;
	Packet payload = null;
	
	public Frame(String dMAC, String sMAC, Packet payload) {
		this.destinMAC = dMAC;
		this.sourceMAC = sMAC;
		this.payload = payload;
	}
	
}
