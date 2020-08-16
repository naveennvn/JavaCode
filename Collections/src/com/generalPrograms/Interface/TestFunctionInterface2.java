package com.generalPrograms.Interface;
public class TestFunctionInterface2 implements inteface1{
	public static void main(String args[]) {
		inteface1.method2();
		inteface1 in1=()-> {System.out.println("MEthod 0");};		
		in1.method3();
		
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}
