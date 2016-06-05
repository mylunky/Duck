package com.patter.duckModel;

public class MallardDuck extends Duck {
	//Constructor
	public MallardDuck() {
	  quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
	}
}
