//Create a package name (".com.codingdojo") as asked and add zookeeper1 to avoid collision 
package com.codingdojo.zookeeper1;



//because this class is part of Mammal class, so we declare it as extended part of Mammal.java class 
public class Gorilla extends Mammal {
	

	//here we show that throw something will decrease the energy by 5. so we use -=5; of the energy level mentioned in the Mammal class
	public void throwSomething() {
		energyLevel -= 5; 
		System.out.println("\n Gorilla throwed something (-5) of energy level:" + "\n Updated energy level is: " + energyLevel);

	//this is void method no return!
	}

	
	
	
	//add 5 to energy level declared inn the Mammal class +=5;
	public void eatBananas() {
		energyLevel +=5;
		System.out.println("\n Gorilla eat bannas (+5) of energy level:" + "\n Updated energy level is: " + energyLevel);
		
	}
	
	
	
	
	
	//decrease the energy level by 10. use same method I made for throwSomething method 
	public void climb( ) {
		energyLevel -= 10;
		System.out.println("\n Gorilla is climbing (-5) of energy level:" + "\n Updated energy level is: " + energyLevel);
		
		
	}
	
	
	//end
}
