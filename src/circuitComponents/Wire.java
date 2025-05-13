package circuitComponents;

import java.util.ArrayList;

public class Wire {
	private ArrayList<Component> connections;
	private ArrayList<WireSegment> segments;
	
	public Wire() {
		this.connections = new ArrayList<Component>();
		this.segments = new ArrayList<WireSegment>();
	}
	

}
