package circuitComponents;

public abstract class Component {
	//Parameters
	private String name;
	private String abreviatedName;
	private int width;
	private int height;
		//x and y are measured from the top left.
	private int x; //x-coordinate
	private int y; //y-coordinate
	
	//abstract methods
	abstract void connectToWire(Wire wire);
	
	//Constructors
	public Component(String name, String abreviatedName, int width, int height) {
		this.name = name;
		this.abreviatedName = abreviatedName;
		this.width = width;
		this.height = height;
		this.x = -1;
		this.y = -1;
	}
	public Component(String name, String abreviatedName, int width, int height, int x, int y) {
		this.name = name;
		this.abreviatedName = abreviatedName;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	//Setters and Mutator methods
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbreviatedName() {
		return this.abreviatedName;
	}
	public void setabreviatedName(String abreviatedName) {
		this.abreviatedName = abreviatedName;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Rotate components
	public void rotate() {
		int tmp = this.height;
		this.height = this.width;
		this.width = tmp;
	}
	
	
}
