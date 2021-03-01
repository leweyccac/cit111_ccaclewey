/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * // Module Mini-project for sharing. Chunk 1 Mod 4 Mini project
 * @author lewey
 */
public class DoIHaveEnoughGas {
    public static void main(String [] args){
        // assign doubles
        final double M_P_G = 28;        
        final double GALLONS_REMAINING = 3;        
        final double MILE_CAP = 84;  
        double milesToStation;
        double walkDistance;        
        // create Scanner
        Scanner userInterface = new Scanner(System.in);        
        // print greeting
        System.out.println("*** Will I Make It?***");       
        // print how many gallons are left in the tank       
        System.out.println("Gallons remaining in your tank: " 
                + GALLONS_REMAINING + " gallons");
        // print to inform user of how many miles are left in the tank
        System.out.println("You have " 
                + GALLONS_REMAINING * M_P_G + " miles left in your tank");
        // ask user how many miles are left to the next station
        System.out.println("How many miles to the next service station?");
        // user can now answer, allow him or her to
        milesToStation = userInterface.nextInt();
        // compare miles left to the mile cap
        if(milesToStation <= MILE_CAP){
            System.out.println("Close, but you will make it!"); 
        // else to inform user that he or she will have to walk    
        }else {
            walkDistance = milesToStation - MILE_CAP;
            System.out.println("I since great exercise in your future.");
            System.out.println("The walk after you run out of gas is " 
                    + walkDistance + " miles.");       
        } // close if/else blocks       
    } // close main method    
} // close class DoIHaveEnoughGas
