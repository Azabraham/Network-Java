package network;

abstract class Device {
	public abstract void receive(String message);
	// class used to link Switches, Routers, and PCs together.
}