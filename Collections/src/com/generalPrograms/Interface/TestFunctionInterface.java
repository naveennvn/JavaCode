package com.generalPrograms.Interface;

interface inteface1 {
	public void method1();

	static void method2() {
		System.out.println("method2");
	}
	default void method3() {
		System.out.println("method3");
	}
}

public class TestFunctionInterface {
	public static void main(String args[]) {
		inteface1 obj1=new inteface1() {
			public void method1() {System.out.println("text2 from class");}};
			
		inteface1 obj=()->{System.out.println("text from class");};
		obj.method1();
		//interface1.method2();
	}
}
