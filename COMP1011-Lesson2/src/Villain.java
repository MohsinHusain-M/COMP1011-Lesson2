
public class Villain extends Hero {
	public Villain(String name){
		super(name);
	}
	//PUBLIC METHODS ++++++++++++++++++++++++++
	public void steals() {
		System.out.println(this.name + " is stealin.");
	}
	
	public void kills() {
		System.out.println(this.name +" is goin' around killin.");
	}
}
