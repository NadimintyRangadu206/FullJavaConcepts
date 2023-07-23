package com.method.reference;



@FunctionalInterface
interface Tayable12 {
	public abstract void say(String msg) ;
	
	int hashCode();
	String toString();
}
public class ConstructorMethodReference  {

	public ConstructorMethodReference(String msg) {
		
		System.out.println(msg);
	}
	public static void main(String[] args) {
	
		Tayable12 s=ConstructorMethodReference::new;
		s.say("kfdjhj");
	}

}
