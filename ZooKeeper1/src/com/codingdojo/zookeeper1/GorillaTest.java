//Create a package name (".com.codingdojo") as asked and add zookeeper1 to avoid collision 
package com.codingdojo.zookeeper1;



//Author: Reza Akhlaqi 		6-21-2019



public class GorillaTest {

	public static void main(String[] args) {

		
		//make a new object (test) that calls from Gorilla class and asks for output
		Gorilla test= new Gorilla();
		
		
		test.displayEnergy();
		test.climb();
		test.throwSomething();
		test.climb();
		test.climb();
		test.throwSomething();
		test.eatBananas();
		test.eatBananas();
		test.climb();
		
		
		
		
		
		
		//end
	}

}
