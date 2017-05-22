package duck.duck;

import duck.Impl.FlyNoWay;
import duck.Impl.MuteQuack;

public class Rduck extends Duck {
	public Rduck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Œ“ «Rduck");
	}
}
