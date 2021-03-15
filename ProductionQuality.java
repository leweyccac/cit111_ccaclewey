/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;
import java.util.Scanner;

/**
 * Simulate factory production quality. Chunk 1 Mod 5 Ex 2
 * @author Lewey
 */
public class ProductionQuality {
    public static void main(String [] booyakasha){
        // initiate variables 
        final int MAX_QUALITY = 100;
        
        int qualityThreshold;
                        
        int unitsToMake;       
        
        double unitQuality = 0;
                
        double totalUnitsMade = 0;
        
        double totalFailures = 0;
        
        // create random number generator and name it
        Random randGenerator = new Random ();
        // create scanner for unit creation
        Scanner unitMachine = new Scanner(System.in);
        // print to user to enter a value
        System.out.println("How many units shall we make? "
                + "Please enter a non decimal number value.");
        // allow user to input value
        unitsToMake = unitMachine.nextInt();
        // create scanner for inspector input
        Scanner unitInspectorMachine = new Scanner(System.in);
        // print to user to enter a value
        System.out.println("What percentage would you consider the "
                + "unit to qualify? "                 
                + "Please enter a non decimal number value between 0 and 100.");
        // allow user to input value
        qualityThreshold = unitInspectorMachine.nextInt();        
        // loop comparison
        while(totalUnitsMade < unitsToMake){
            // assign unit quality to randGenerator to proccess random unit quality 
            unitQuality = randGenerator.nextInt(MAX_QUALITY + 1);
            // priny value of unit quality
            System.out.println("Unit Quality: " + unitQuality);
            // increment total units made by one
            totalUnitsMade = totalUnitsMade + 1;
            // compare unit quality
            if(unitQuality <= qualityThreshold){
                // print to user unit quality rating
                System.out.println("Unit Quality low.");
                // increment totalFailures by one
                totalFailures = totalFailures + 1;           
            } else{
                // print to user unit quality pass if quality isn't low
                System.out.println("Unit Quality Successful.");
            }// close if/else
            // print to user the units made along with the amount of failures per loop
            System.out.println("Failures: " + totalFailures + " out of " 
                    + totalUnitsMade + " units proccessed");
        } // close while
        // divide total failures by total units made for ratio
        double productionStats = totalFailures / totalUnitsMade;
        // print summary to user
        System.out.println("Summary:");
        System.out.println("Processed " + totalUnitsMade + " units.");
        System.out.println("Production failure percentage: "
                + productionStats *100 + "%");       
    } // close main method
} // close class ProductionQuality
    

