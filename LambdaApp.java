package com.cg.lamda;

@FunctionalInterface
interface Cuab{
	
	double bookCab(String source, String destination);

}

public class LambdaApp {
	
	static int instanceVar =10;
	static int sVar = 100;

	public static void main(String[] args) {
		
		Cuab cab =(source, destination)->{
			int localVar = 1000;
			System.out.println("UberX Bookedfrom " +source+" to "+destination+" !! Arriving soon!!" );
			System.out.println("local variable is :"+instanceVar);
			System.out.println("instanceVar is:"+instanceVar);
			System.out.println("Static Variable is:"+LambdaApp.sVar);
		return 850.12;
		};
		

	}

}
