
public class Speedster extends Hero {
	//CONSTRUCTOR ++++++++++++++++++++++++++++++++++++
	public Speedster(String name) {
		super(name);
		this.boostSpeed();
		
	}

	//PRIVATE METHODS ++++++++++++++++++++++++++++++++
	private void boostSpeed() {
		this.speed +=50;
		if(this.speed >100) {
			this.speed =100;
		}
	}
}
