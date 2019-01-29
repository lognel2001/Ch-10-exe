package places;

import logan3.ch10.classexamples.Knight;

public class Camelot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knight myKnight = new Knight();   // create a new Knight

        // OK!  name is a public property     
        String yourName = myKnight.myName;   

        // ERROR!  Can't access private property
        myKnight.horseNickname = "Pudgy"; 

        // ERROR! Can't access protected property
        int skill = myKnight.skillLevel;  

        //  OK!  wakeUp() is a public method.
        myKnight.wakeUp();  

         // ERROR!   Can't access protected method
        myKnight.donArmor(); 

        // ERROR! Can't access private method 
        if (myKnight.isHungry()) 
        {
        }
	}

}
