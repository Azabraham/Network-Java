package network;

public class Packet {
	
	String sourceIP = null;
	String destinIP = null;
	Segment payload = null;
	
	public Packet(String sIP, String dIP, Segment payload) {
		this.sourceIP = sIP;
		this.destinIP = dIP;
		this.payload = payload;
	}

}
