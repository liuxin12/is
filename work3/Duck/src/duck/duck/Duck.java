package duck.duck;

import duck.Interface.IFlyBehavior;
import duck.Interface.IQuackBehavior;

public class Duck {
	IQuackBehavior quackBehavior;
	IFlyBehavior flyBehavior;

	public void display(){
		System.out.println("displaying");
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void setQuackBehavior(IQuackBehavior behavior){
		this.quackBehavior = behavior;
	}
	
	public void setFlyBehavior(IFlyBehavior behavior){
		this.flyBehavior = behavior;
	}
}
