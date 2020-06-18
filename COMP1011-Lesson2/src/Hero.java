
public class Hero {
	//PRIVATE PROPERTIES +++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	String name;
	
	// GETTERS +++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return strength;
	}
	

	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	//CONSTRUCTOR ++++++++++++++++++++++++++++++++++
	public Hero(String name) {
		this.name = name;
	}
	
	//PUBLIC METHOD ++++++++++++++++++++++++++++++++
	public void showAbilities() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Strength " + this.strength);
		System.out.println("Speed " + this.speed);
		System.out.println("Health " + this.health);
	}
	
	//PRIVATE METHOD +++++++++++++++++++++++++++++++
	private void generateAbilities() {
		this.strength = (int) Math.random()*100+1;
		this.speed = (int) Math.random()*100+1;
		this.health = (int) Math.random()*100+1;
	}
	public void fight() {
		System.out.println(this.name + " is fighting.");
	}
	public void run() {
		System.out.println(this.name +" is Running");
	}



	
}
