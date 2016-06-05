package com.patter.duckTestl;

import com.patter.duckModel.Duck;
import com.patter.duckModel.MallardDuck;
import com.patter.duckModel.RedheadDuck;
import com.patter.duckModel.RubberDuck;

public class TestClass {
	
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		System.out.println("第一只鸭子：");
		duck1.performFly();
		duck1.performQuack();
		
		Duck duck2 = new RubberDuck();
		System.out.println("第二只鸭子：");
		duck2.performFly();
		duck2.performQuack();
		
		Duck duck3 = new RedheadDuck();
		System.out.println("第三只鸭子：");
		duck3.performFly();
		duck3.performQuack();
		
	}
	
}
