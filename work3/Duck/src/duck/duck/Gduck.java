package duck.duck;

import duck.Impl.FlyWithRocket;
import duck.Impl.Squeak;

public class Gduck extends Duck {
	public Gduck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithRocket();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Œ“ «Gduck");
	}
}
