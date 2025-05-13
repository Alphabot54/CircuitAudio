package circuitComponents;

public class Capacitor extends Component{
	//Parameters
		private int capacitance; //in F (farads)
		
		//Constructors
		public Capacitor() {
			this(0);
		}
		public Capacitor(int capacitance) {
			super("Capacitor", "C", 2, 2);
			this.capacitance = capacitance;
		}
		public Capacitor(int x, int y, int capacitance) {
			super("Capacitor", "C", 2, 2, x, y);
			this.capacitance = capacitance;
		}
		
		//Setters and mutators
		public int getCapacitance() {
			return this.capacitance;
		}
		public void setCapacitance(int capacitance) {
			this.capacitance = capacitance;
		}
	
	
}
