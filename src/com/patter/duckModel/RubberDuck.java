package com.patter.duckModel;

public class RubberDuck extends Duck {
	// constructor
	public RubberDuck() {
	  quackBehavior = new Squack();
      flyBehavior = new FlyNoWay();
	}
}
