/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 * Simulate flying an aircraft. Object Project 
 * @author lewey
 */
public class FlyingAircraft {
    // member val
    public static boolean loopSwitch = true;
    public static void main(String [] args) throws InterruptedException{
        displayAircraftInfo();
        do{
            AircraftOperations.switchStatement1();
            AircraftOperations.switchStatement2();
            AircraftOperations.reset();     
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to fly again? Press 1 for yes, "
                    + "any other number for no.");
            int response = scan.nextInt();
            if(response == 1){
                System.out.println("Alright, here we go again!");
                loopSwitch = true;
            }else{
               System.out.println("Thanks for playing!");
               loopSwitch = false;
            } // close if/else block    
        } while(loopSwitch == true); 
    } // close main method
    /**
     * Store aircraft information
     * @throws InterruptedException 
     */
    public static void displayAircraftInfo()throws InterruptedException{
        System.out.println("Object Information:");
        Thread.sleep(2000);
        System.out.println("Tail Number: 202");
        Thread.sleep(2000);
        System.out.println("Year Manufactured: 1978");
        Thread.sleep(2000);
        System.out.println("Model: A-10");
        Thread.sleep(2000);
        System.out.println("Partner Aircraft:");
        Thread.sleep(2000);
        System.out.println("Refueler Tail Number: 1508");
        Thread.sleep(2000);
        System.out.println("Refueler year Manufactured: 1956");
        Thread.sleep(2000);
        System.out.println("Refueler Model: KC-135");
        Thread.sleep(2000);
        
    }
} // close FlyingAircraft class
