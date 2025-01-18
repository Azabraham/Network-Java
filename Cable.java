package network;

public class Cable {
	
	Port endpoints[] = new Port[2];
	
	public Cable() {
		this.endpoints[0] = this.endpoints[1] = null;
	}
	
	public void signal(int sender, String signal) {
		// String signal will become frame in the future.
		
		// this is the receiver
		this.endpoints[1 - sender].receive(signal);
	}
	
	public void connect(Port one, Port two) {
		// one endpoint will have a value of 0
		this.endpoints[0] = one;
		one.value = 0;
		// and the other a value of 1
		this.endpoints[1] = two;
		two.value = 1;
		// both ports will be connected to this cable.
		one.connectedTo = this;
		two.connectedTo = this;
	}
	
	public String toString() {
		// method to test
		return "a cable";
	}
}