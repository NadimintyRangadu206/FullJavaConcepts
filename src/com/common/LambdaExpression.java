package com.common;

@FunctionalInterface
interface Addition {

	public abstract  void add();

}

/**
 * 
 * @author nadim
 * 
 *         Lambda expression helps us to write our code in functional style . It
 *         provides clear and concise way to implementing the single abstract
 *         method in interface. Lambda expression is implementing the functional
 *         interface. which is having only one abstract method. at the same time
 *         number of default and static methods.
 * 
 */
public class LambdaExpression {

	public static void main(String[] args) {

		Addition le = () -> System.out.println("Implementing Lamba Expresion");
		le.add();
	}

}
