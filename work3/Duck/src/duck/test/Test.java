package duck.test;

import duck.duck.Duck;
import duck.duck.Mduck;
import duck.duck.Rduck;
import duck.duck.Gduck;

public class Test extends Duck{
	public static void main(String[] args) {
		Duck mduck1 = new Mduck();
		System.out.print("mduck1:");
		mduck1.performFly();
		mduck1.performQuack();
		Duck rduck1 = new Rduck();
		System.out.print("rduck1:");
		rduck1.performFly();
		rduck1.performQuack();
		Duck gduck1 = new Gduck();
		System.out.print("gduck1:");
		gduck1.performFly();
		gduck1.performQuack();
	}
}
