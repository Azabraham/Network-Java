package network;

public class Router extends Device {
	public Interface GA[] = new Interface[2];
	public Router() {
		this.GA[0] = Interface.configure(1);
		this.GA[1] = Interface.configure(2);	
	}
	public Router(Interface one, Interface two) {
		this.GA[0] = one;
		this.GA[1] = two;
	}
	public void receivePacket() {
		
	}
	public void receive(String message) {
		
	}
} 