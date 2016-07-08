package implementation;

import defaultMethods.InterfaceA;
import defaultMethods.InterfaceB;

public class Test implements InterfaceA, InterfaceB{
	
	@Override
	public void print(){
		System.out.println("Hello from Test class");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.print();
	}
}
