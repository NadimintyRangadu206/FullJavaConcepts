package com.method.reference;

@FunctionalInterface
interface Sayable {
	
	public abstract void say();
	
}
public class InstanceMethodReference {

	public void something() {
		System.out.println("Something went Wrong");
	}
	public static void main(String[] args) {
	
		
		InstanceMethodReference imr= new InstanceMethodReference();
		
		Sayable s= imr::something;
		s.say();
				
		

	}

}
