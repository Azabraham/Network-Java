package network;

public class Segment {
	String sourcePort = null;
	String destinPort = null;
	String data; // this could become a class in the future.
	public Segment(String sP, String dP, String data) {
		this.sourcePort = sP;
		this.destinPort = dP;
		this.data = data;
	}

}
