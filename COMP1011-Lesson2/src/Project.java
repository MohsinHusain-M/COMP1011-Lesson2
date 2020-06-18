

public class Project {
	public static void main (String [] args) {
		//INTANTIATE HERO +++++++++++++++++++
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//INTANTIATE VILLAIN +++++++++++++++
		Villain villain = new Villain("Sky Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
	}
}
