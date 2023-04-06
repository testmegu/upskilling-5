package com.cg.lamda;

@FunctionalInterface
interface Cab{
	//void bookCab(String source, String destination);// when an interface will have exactly 1 abstract method we can say it as functional interface
// void bookCab();
	double bookCab(String source, String destination);

}



//1st way
/*class UberX implements Cab{
	public void bookCab() {
		System.out.println("UberX Booked .... Arriving soon");
	}
}*/

public class LamdaApp {

	public static void main(String[] args) {
		
		//Cab cab = new UberX(); // polymorphic Statement
		//cab.bookCab();
		
		//2. way -> Anonymous class implementation
		/*Cab cab = new Cab() {
			@Override
			public void bookCab() {
				System.out.println("UberX Booked .... Arriving soon");
			}
		};
		
		cab.bookCab();*/
		
		//3. using lambda expression --> functional interface
		Cab cab =(source, destination)->{
			System.out.println("UberX Bookedfrom " +source+" to "+destination+" !! Arriving soon!!" );
		return 850.12;
		};
		double fare = cab.bookCab("Bengaluru", "pondicherry");
		System.out.println("Fare shall be:"+ fare);
		

	}

}
