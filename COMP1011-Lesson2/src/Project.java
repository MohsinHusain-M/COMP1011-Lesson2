

public class Project {
	public static void main (String [] args) {
		//INTANTIATE HERO +++++++++++++++++++
		StrongMan hero = new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//INTANTIATE VILLAIN +++++++++++++++
		Villain villain = new Villain("Sky Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		//INTANTIATE VIGILLANTE +++++++++++++
		Vigilante vigilante = new Vigilante("Ms Savage");
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
	}
}
