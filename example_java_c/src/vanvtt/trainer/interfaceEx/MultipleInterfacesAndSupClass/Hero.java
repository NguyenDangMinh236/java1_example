package vanvtt.trainer.interfaceEx.MultipleInterfacesAndSupClass;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
		System.out.println("Hero can swimming!!");
	}

	public void fly() {
		System.out.println("Hero can Bay!!");
	}

}
