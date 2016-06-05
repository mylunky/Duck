package com.patter.duckModel;

public class RedheadDuck extends Duck {
	//Constructor
	public RedheadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithRocket();
	}
}
