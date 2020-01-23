

import java.util.*;

public class Port {
	
	private String name;
	private int[] position;  // Port position in the map
	private int cargoInPort; // Total current cargo units in a port
	private int shipsInPort; // No. of ships which already anchored in a port
	private List<Integer> shipsId; // keeps a list of ship IDs which already located in a port
	
	//class constructor
	public Port(int[] position) {
		
		this.position = position;
		this.cargoInPort = 0;
		this.shipsInPort = 0;
		this.shipsId = new ArrayList<Integer>();
	}
	
	public void setPortName(String name) {
		this.name = name;
	}
	
	public String getPortName() {
		return this.name;
	}
	
	public void loadCargo(int cargoWeight) {
		this.cargoInPort -= cargoWeight;	
	}
	
	public void unLoadCargo(int cargoWeight) {
		this.cargoInPort += cargoWeight;
	}
	
	// add a new anchored ship into the ship list at a port
	public void addShipInDock(int shipId) {
		this.shipsInPort++;
		this.shipsId.add(shipId);
	}
	
	// remove a ship from the ship list, when it lefts a port
	public void dumpShipsFromPort(int shipId) {
		this.shipsInPort--;
		int removeValue = this.shipsId.indexOf(shipsId);
		this.shipsId.remove(removeValue);
	}
	
	// Return the no. of ships which anchored in a port
	public int getShipsInPort() {
		return this.shipsInPort;
	}
	
	public int[] getPortPosition() {
		return this.position;
	}
	
	public void setPortPosition(int[] position) {
		int[] copy = position.clone();
		this.position = copy;
	}
}