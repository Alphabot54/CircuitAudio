package circuitComponents;

public class Ground extends Component{
	private Wire connection;
	
	//Constructors
	public Ground() {
		super("Ground", "GND", 1, 1);
	}
	public Ground(int x, int y) {
		super("Ground", "GND", 1, 1, x, y);
	}
	
}
