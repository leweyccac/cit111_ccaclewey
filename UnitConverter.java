/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Unit converter. Chunk 2, mod 2, mini-project
 * @author lewey
 */
public class UnitConverter {
    public static void main(String [] boo){        
        // assign variable for radius of earth measured in km
        final double RADIUS_E = 6367.0;
                
        // assign variable for radius of Jupiter measured in km
        final double RADIUS_J = 71492.0;
        
        // assign variable for radius of the Galaxy measured in ly
        final double RADIUS_G = 8.75E4;
                
        // assign variable for height of the Galaxy measured in ly
        final double HEIGHT_G = 1000.0;
                
        // assign variable for radius of the observable Universe measured in ly
        final double RADIUS_U = 4.4E10;             
        
        // assign variable for radius of a penny measured in micrometers
        final double RADIUS_P = 8750.0;
        
        // assign variable for height of a penny measured in micrometers
        final double HEIGHT_P = 2000.0;
        
        // assign variable for radius of a Tardigrade measured in micrometers
        final double RADIUS_T = 0.0000016;
        
        // assign variable for height of a Tardigrade measured in micrometers
        final double HEIGHT_T = 0.00000152; 
        
        // assign boolean for main loop control       
        boolean loop = true;
        
        // assign boolean for response loop control
        boolean loopSwitch1 = true;
        
        // create scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // create a do block for loop return
        do{
            // greet user
            System.out.println("3 choices for conversions.");
            
            // slow text speed for user
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UnitConverter.class.getName()).log
            (Level.SEVERE, null, ex);}
            
            System.out.println("Would you like to try the Earths to "
                    + "Jupiter coversion? If so press 1 and press enter.");
            
            // slow text speed for user
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UnitConverter.class.getName()).log
            (Level.SEVERE, null, ex);}
            
            System.out.println("Would you like to try the Milky Way Galaxy "
                    + "to the observable Universe coversion? If so press 2 "
                    + "and press enter.");
            
            // slow text speed for user
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UnitConverter.class.getName()).log
            (Level.SEVERE, null, ex);}
            
            // prompt user for input
            System.out.println("Would you like to try the penny "
                    + "to Tardigrades conversion? If so Press 3 and press "
                    + "enter.");
            
            // create a do block for loop return
            do{
                // assign an int for user response
                int response = scan.nextInt();
                
                // create a switch block for multiple reponses
                switch (response){
                    // Earths to Jupiter conversion
                    case 1:
                        // greet user
                        System.out.println("You've chosen the Earths to "
                                + "Jupiter conversion.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        // prompt user for input
                        System.out.println("Please enter the amount of Earths "
                                + "you'd like to put inside of Jupiter.");
                        
                        // assign a double for users response 
                        double earthsIn = scan.nextDouble();
                        
                        // print to user their input
                        System.out.println("You have requested " + earthsIn + 
                                " Earths.");
                        
                        // assign a double for the calculated Earth volume
                        double returnedEarthsVol = earthVol(RADIUS_E);
                        
                        // assign a double for the calculated Jupiter volume
                        double returnedJupiterVol = jupiterVol(RADIUS_J);
                        
                        // multiply earths volume by users input
                        returnedEarthsVol = returnedEarthsVol * earthsIn;
                        
                        // calculate the result
                        double conversionEJ = returnedEarthsVol / 
                                returnedJupiterVol;
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("There are " + conversionEJ + " "
                                + "Earths to Jupiters.");
                        // slow text speed for user 
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("To put this into perspective, the "
                                + "unit used to measure this volume was "
                                + "kilometers.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        // inform user of the calculated Jupiter Volume 
                        System.out.println("The volume for Jupiter came out"
                                + " being " + returnedJupiterVol + " "
                                + "kilometers cubed.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("Have you heard of the big red spot"
                                + " on Jupiter? If you haven't, it's a big "
                                + "hurricane on Jupiter.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("When I say big, I actually mean"
                                + " ginormous. It is big enough to hold an "
                                + "Earth and some change.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("Imagine getting stuck in that "
                                + "storm!");   
                        
                        // set loop to false to prevent looping
                        loopSwitch1 = false;
                    break;
                    
                    // Galaxy to Universe conversion
                    case 2:
                        // greet user
                        System.out.println("You've chosen the Milky Way Galaxy"
                                + " to Observable Universe conversion.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        // prompt user for input
                        System.out.println("Please enter the amount of "
                                + "Milky Way Galaxies you'd like to put in the "
                                + "Universe.");
                        
                        // assign a double for users response
                        double galaxysIn = scan.nextDouble();
                        
                        // print to user their input
                        System.out.println("You have requested " + galaxysIn +                        
                                " Galaxys."); 
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        // assign a double to calculate the Galaxy's volume
                        double returnedGalaxyVol = galaxyVol(RADIUS_G ,
                                HEIGHT_G);
                        
                        // assign a double to calculate the universes volume
                        double returnedUniverseVol = universeVol(RADIUS_U);
                        
                        // multiply returnedGalaxyVol by uses response
                        returnedGalaxyVol = returnedGalaxyVol * galaxysIn;
                        
                        // assign a double to calculate the results
                        double conversionGU = returnedGalaxyVol / 
                                returnedUniverseVol;
                        
                        // print to user the conversion result
                        System.out.println("There are " + conversionGU + 
                                " Galaxies to Universes.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("To put it into perspective, the "
                                + "unit of length used for this was "
                                + "light years.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("The actual Universe volume is "
                                + "unknown due to the light not reaching "
                                + "us yet,");
                        
                        // print to user the Universes volume
                        System.out.println("but this approximation came out "
                                + "to being " + returnedUniverseVol + " light "
                                + "years cubed.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("One light year is equivalent to "
                                + "9.5E12 kilometers. Do you feel small yet?");               
                        
                        // set loop to false to prevent loop
                        loopSwitch1 = false;                        
                    break;
                    
                    // pennys to Tardigrades conversion
                    case 3: 
                        System.out.println("You've chosen the pennies to "
                                + "Tardigrades conversion.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("Please enter amount of pennies "
                                + "you'd like to put Tardigrades in.");
                        
                        // assign a double for users response
                        double penniesIn = scan.nextDouble();
                        
                        // print to user what they inputted
                        System.out.println("You have requested " + penniesIn + 
                                " pennies.");     
                        
                        // assign a double to calculate Tardigrade volume
                        double returnedTardigradesVol = tardigradesVol
                                (RADIUS_T , HEIGHT_T); 
                        
                        // assign a double to calculte penny volume
                        double returnedPennyVol = pennyVol(RADIUS_P , HEIGHT_P);
                        
                        // multiply penny volume by users input
                        returnedPennyVol = penniesIn * returnedPennyVol;
                        
                        // assign double to calcutlate the result
                        double conversionTP = returnedPennyVol/
                                returnedTardigradesVol;
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        // print to user the result
                        System.out.println("There are " + conversionTP + " "
                                + "Taridigrade's to requested pennies.");
                        
                        // slow text speed for user
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("Putting this into perspective,"
                                + " the unit of length used for this was "
                                + "micrometers."); 
                        
                        // slow text speed for user 
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UnitConverter.class.getName()).log
                        (Level.SEVERE, null, ex);}
                        
                        System.out.println("The volume measured for the "
                                + "Tardigrade's is " + returnedTardigradesVol 
                                + " micrometers cubed.");
                        
                        System.out.println("One micrometer is equivalent to "
                                + "1E-6 meter. These creatures are tiny and "
                                + "can live in the vacuum of space!"); 
                        
                        // set loop to false to prevent loop
                        loopSwitch1 = false;
                    break;
                    
                    // loop activator
                    default:
                        System.out.println("That wasn't an option. Please "
                                + "enter a number between 1 and 3.");
                        
                        // set loop to true to loop back to choice selector
                        loopSwitch1 = true;
                        
                } // close switch block 
                
            }while(loopSwitch1 == true);
            
            // slow text speed for user 
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UnitConverter.class.getName()).log
            (Level.SEVERE, null, ex);}
            
            // ask user if they'd like to continue
            System.out.println("Would you like to try another conversion? "
                    + "Enter 1 for yes, any other number for no.");
            
            // assign int for response to loop or not
            int loopResponse = scan.nextInt();
            
            // compare answer
            if(loopResponse == 1){
                
                // set loop to true if chosen
                loop = true;
                
            }else{
                // set loop to false if 1 is not chosen 
                loop = !loop;
                
                // send user on their merry way
                System.out.println("Thanks for playing! I hope I put something "
                        + "into perspective.");
                
            } // close if/else block  
            
        } while(loop == true); // close do/while block
        
    }//close main method
    
    /**
     * 
     * @param r      
     * @return compute earth volume 
     */    
    public static double earthVol(double r){
        // assign double for pi
        final double PI = 3.1416;
        
        // assign double for 4/3 
        final double FRACTION = 4/3;
        
        // assign double for equation
        double earthVol = FRACTION * PI * Math.pow(r, 3);
        
        // return the equation
        return earthVol;
        
    } // close earthVol method
    
    /**
     * 
     * @param r      
     * @return compute Jupiter volume 
     */    
    public static double jupiterVol(double r){
        // assign double for pi
        final double PI = 3.1416;
        
        // assign double for 4/3
        final double FRACTION = 4/3;
        
        // assign double for equation
        double jupiterVol = FRACTION * PI * Math.pow(r, 3);
        
        // return equation
        return jupiterVol;
        
    } // close jupiterVol method
    
    /**
     * 
     * @param r
     * @param h      
     * @return compute Galaxy volume 
     */
    public static double galaxyVol(double r, double h){
        // assign double for pi
        final double PI = 3.1416;
        
        // assign double for equation
        double galaxyVol = PI * Math.pow(r , 2) * h;   
        
        // return equation
        return galaxyVol;
        
    } // close galaxyVol
    
    /**
     * 
     * @param r
     * @return compute Universe volume
     */
    public static double universeVol(double r){
        // assign double for pi
        final double PI = 3.1416;
        
        // assign double for 4/3
        final double FRACTION = 4/3;
        
        // assign double for equation
        double universeVol = FRACTION * PI * Math.pow(r , 3);
        
        // return equation
        return universeVol;
        
    } // close universeVol method            
    
    /**
     * @param r
     * @param h
     * @return computed Tardigrades volume 
     */
    public static double tardigradesVol(double r, double h){
        // assign double for pi
        final double PI = 3.1416; 
        
        // assign double for equation
        double tardigradesVol = PI * Math.pow(r , 2) * h;
        
        // return equation
        return tardigradesVol;
        
    } // close tardigradeVol method
    
    /**
     * @param r
     * @param h
     * @return computed penny volume
     */
    public static double pennyVol(double r , double h){
        // assign double for pi
        final double PI = 3.1416;
        
        // assign double for equation
        double pennyVol = PI * Math.pow(r , 2) * h;
        
        // return equation
        return pennyVol;
        
    } // close pennyVol method      
} // close class UnitConverter
