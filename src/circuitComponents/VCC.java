package circuitComponents;

public class VCC extends Component{
	//Parameters
	private double voltage;
	
	//Constructors
	public VCC() {
		this(0);
	}
	public VCC(double voltage) {
		super("Power", "VCC", 1, 1);
		this.voltage = voltage;
	}
	public VCC(int x, int y, double voltage) {
		super("Power", "VCC", 1, 1, x, y);
		this.voltage = voltage;
	}
	
	//Setters and mutators
	public double getVoltage() {
		return this.voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
}
