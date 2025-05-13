package circuitComponents;

public class Resistor extends Component {
	//Parameters
	private int resistance; //in ohms
	
	//Constructors
	public Resistor() {
		this(0);
	}
	public Resistor(int resistance) {
		super("Resistor", "R", 2, 1);
		this.resistance = resistance;
	}
	public Resistor(int x, int y, int resistance) {
		super("Resistor", "R", 2, 1, x, y);
		this.resistance = resistance;
	}
	
	//Setters and mutators
	public int getResistance() {
		return this.resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	
	
}
