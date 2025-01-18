package network;

public class Port {
	
	public int value = 0;
	public Cable connectedTo;
	public Device belongsTo;
	
	public Port() {
		this.value = 0;
		this.connectedTo = null;
		this.belongsTo = null;
	}
//	public void send() {
//		String message = ClassTools.input("Enter message: ");
//		this.connectedTo.receive(message);
//	}
	public void message() {
		// we send a message to the cable (a signal)
		String message = ClassTools.input("Enter message: ");
		this.connectedTo.signal(this.value, message);
	}
	
	public void receive(String message) {
		this.belongsTo.receive(message);
	}
	
}