package simpleproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Calc {

	@Test
	public void add() {
		int a=30, b=10;
		System.out.println("I am in add method");
		Assertions.assertEquals(40, a+b);
	}
	
}
