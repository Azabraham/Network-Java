package network;

public class Switch extends Device {
	
	String MAC = null;
	Port FastEthernet[] = null;
	
	public Switch(String MAC) {
		this.MAC = MAC;
		this.FastEthernet = new Port[8];

		for (int i = 0; i < this.FastEthernet.length; i++) {
			// all ports are created
			this.FastEthernet[i] = new Port();
			// and are linked to the switch
			this.FastEthernet[i].belongsTo = this;
		}
		
	}

	@Override
	public void receive(String message) {
		// this method is to test if switch is receiving a message.
		System.out.println("New message for Switch: " + message);
	}
	
	public String toString() {
		// Method used to test.
		return "a switch";
	}
	
}
