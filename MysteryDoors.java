/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Simulate game show door revealing. Chunk 2, mod 1, miniproj
 * @author Lewey
 */
public class MysteryDoors {
    public static void main(String [] booyah){
        // assign boolean for looping
        boolean loop = true;
        // greet user and initiate comparisons
        do{       
            System.out.println(" ---------     ---------     ---------     ---------");
            System.out.println("|   **    |   |   * *   |   |  *****  |   |  *   *  |");
            System.out.println("|    *    |   |  *   *  |   |      *  |   |  *   *  |");
            System.out.println("|    *    |   |      *  |   |  *****  |   |  *****  |");
            System.out.println("|    *    |   |     *   |   |      *  |   |      *  |");
            System.out.println("|  *****  |   |  ****** |   |  *****  |   |      *  |");
            System.out.println(" ---------     ---------     ---------     ---------");
            // slow program for readability
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
            (Level.SEVERE, null, ex);
            } // close try/catch
            System.out.println("You've already won a prize of $20,000, "
                    + "but you have a chance to win even more!");
            // slow program for readability
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
            (Level.SEVERE, null, ex);
            } // close try/catch
            System.out.println("Before you is 4 doors. Each door conains a "
                    + "prize, but, only one door has the grand prize.");
            // slow program for readability
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
            (Level.SEVERE, null, ex);
            } // close try/catch
            System.out.println("You can keep the money that you've already won "
                    + "behind door 4, or you can risk it all for a "
                    + "magnificent prize.");
            // slow program for readability
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
            (Level.SEVERE, null, ex);
            } // close try/catch
            System.out.println("The choice is yours! "
                    + "Please enter a number between 1-4.");
            // create a scanner for user input
            Scanner doorScan = new Scanner(System.in);
            int doorChosen = doorScan.nextInt();
            // compare users input
            switch(doorChosen){
                case 1:
                    loop = !loop; 
                    door1();
                    break;
                case 2:
                    loop = !loop;
                    door2();
                    break;
                case 3:
                    loop = !loop;
                    door3();
                    break;
                case 4:
                    loop = !loop;
                    door4();
                    break;
                default:
                    System.out.println("That door wasn't on the choice list. "
                            + "I'll repeat the instructions.");
                    // slow program for readability
                    try {
                            Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                            Logger.getLogger(MysteryDoors.class.getName()).log
                    (Level.SEVERE, null, ex);
                    } // close try/catch
            } // close switch
        }while(loop == true); // close do/while
        // display end message
        System.out.println("Thanks for playing!");        
    } // close main method
    
    /**
     * Contains data for the chosen door 1.
     */    
    public static void door1(){
        System.out.println("Drum roll please! What's behind door number 1?");
        // slow program for suspense
        try {
                Thread.sleep(3000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch
            System.out.print("Ouch. Sorry, your prize is a bucket of spiders.");
            System.out.println("You lost the money, but you may want to look"
                    + " into a spider selling business.");
        // slow program to allow user to read the line above
        try {
                Thread.sleep(5000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch            
    } // close door1 method
    
    /**
     * Contains data for the chosen door 2.
     */    
    public static void door2(){
        System.out.println("Drum roll please! What's behind door number 2?");
        // slow program for suspense
        try {
                Thread.sleep(5000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch
            System.out.println("Oh no. Your prize is a trip to the Taliban "
                    + "infested Afghanistan mountains.");
            System.out.println("You may want to invest in a private "
                    + "security escort.");
        // slow program to allow user to read the line above
        try {
                Thread.sleep(5000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try catch       
    } // close door2 method
    
    /**
     * Contains data for the chosen door 3.
     */    
    public static void door3(){
        System.out.println("Drum roll please! What's behind door number 3?");
        // slow program for suspense
        try {
                Thread.sleep(5000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch
        System.out.println("You just won the grand prize of 1 million dollars "
                + "and a brand new Lamborghini!");
        System.out.println("You better look into investing that money!");
        // slow program to allow user to read the line above
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch       
    } // close door3 method
    
    /**
     * Contains data for money chosen door.
     */
    public static void door4(){
        System.out.println("Better safe than sorry huh?");
        // slow program for readability
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch
        System.out.println("Congratulations on the $20,000! Don't blow it all "
                + "in one place!");
        // slow program to allow user to read the line above
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
                Logger.getLogger(MysteryDoors.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch    
    } // close door4 method
} // close class MysteryDoors
