import java.util.Random;
import java.util.Scanner;

public class Game {
	public void play() {
		   
	      // get input from user
	      Scanner scnr = new Scanner(System.in);
	      System.out.print("How much do you want to bet? ");                                                 
	      int enteredBet = scnr.nextInt(); 
	      System.out.print("What number do you choose ? ");
	      int enteredNum = scnr.nextInt(); 
	   
	      // generate the die roll 
	      Random randGen = new Random();
	      int dieNum  =  randGen.nextInt(6) + 1;
	      System.out.println("The die is a " + dieNum);
	   
	      // write the rest of your code below
	        if(enteredNum == dieNum) {
	        	int Winner = enteredBet*10;
	        	System.out.println("Congratulations you win" + Winner + "dollars");}
	        		else {
	        		System.out.println("Sorry you lose");}
	        }
	
	}


