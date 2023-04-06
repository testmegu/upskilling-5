package com.cg.lamda;

interface Calculator{
	void add(int num1, int num2);
}
class Calc{
	public static void addSomething(int num1, int num2) {
		System.out.println(num1+"and" +num2+ "addition is:" +(num1+num2) );
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1+"and" +num2+ "addition is:" +(num1+num2) );
		
	}
}

// Functional interface
interface Messanger{
	Message getMessage(String msg);
	
}
class Message{
	Message(String msg){
		System.out.println(">> Message is: " +msg);
	}
}

public class MethodReferenceApp {

	public static void main(String[] args) {
		
		/*Calc.addSomething(10, 20);
		//1. Reference to a static Method
		Calculator cRef = Calc::addSomething;// Method Reference
		cRef.add(11, 20);*/
		
		
		//2.Reference to a non static method or instance Method
		// Object construction Statement for calc
		/*Calc calc = new Calc();
		Calculator cRef = calc::letsAdd;
		cRef.add(12, 30);
		*/
		//3. Reference to a Constructor
		Messanger mRef = Message::new;
		mRef.getMessage("Search the book");
		
		

	}

}
