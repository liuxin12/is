package duck.duck;

import duck.Impl.FlyWithWings;
import duck.Impl.Quack;

public class Mduck extends Duck {
	public Mduck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Œ“ «mduck");
	}
}
