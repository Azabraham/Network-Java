package network;

public class PC extends Device {
	NIC Ethernet = null;
	public PC() {
		this.Ethernet = NIC.configure(1);
		this.Ethernet.belongsTo = this;
	}
	public PC(NIC one) {
		this.Ethernet = one;
	}
	@Override
	public void receive(String message) {
		System.out.println("New Message for PC: " + message);
	}
	public void send() {
		// we call the message method of the NIC card
		this.Ethernet.message();
		// in the future, there might be 2 NIC cards in 1 PC, so
		// it would need to be improved.
	}
	public String toString() {
		// method to test
		return "a PC";
	}
}
