package com.patter.duckTestl;

import com.patter.duckModel.Duck;
import com.patter.duckModel.MallardDuck;
import com.patter.duckModel.RedheadDuck;
import com.patter.duckModel.RubberDuck;

public class TestClass {
	
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		System.out.println("��һֻѼ�ӣ�");
		duck1.performFly();
		duck1.performQuack();
		
		Duck duck2 = new RubberDuck();
		System.out.println("�ڶ�ֻѼ�ӣ�");
		duck2.performFly();
		duck2.performQuack();
		
		Duck duck3 = new RedheadDuck();
		System.out.println("����ֻѼ�ӣ�");
		duck3.performFly();
		duck3.performQuack();
		
	}
	
}
