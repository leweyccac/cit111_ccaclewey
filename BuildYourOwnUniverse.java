/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Simulate the building of a Universe. Chunk 2 Fundamentals Project.
 * @author Lewey
 */
public class BuildYourOwnUniverse {
    // assign class member variables
    public static final double RADIUS_S = 39.5;
    
    public static final double RADIUS_G = 5.5336E9;
    
    public static final double HEIGHT_G = 6.3241E7;
    
    public static final double RADIUS_U = 5.8824E15;
    
    public static final double PI = 3.1416;
    
    public static final double E_CONSTANT = 4/3; 
    
    public static double planetCount = 0;
    
    public static double galaxyCount = 0;
    
    public static double collisions = 1E-8;
    
    public static double blackHole = 1E-8;
    
    public static double supernova = 1E-8;
    
    public static Scanner scan = new Scanner(System.in);
    
    public static boolean loopSwitch1 = true;
    
    public static boolean loopSwitch2 = true;
    
    public static boolean loopSwitch3 = true;
    
    public static void main(String [] args){
        // set greeting outside the loop to prevent repeat instructions
        greeting();
        
        // assign do for looping
        do{
            // pull switchStatement into main
            switchStatement();
            
            System.out.println("");
            
            // prompt user if they'd like to try again
            System.out.println("Would you like to Build another? Press 1 for"
                    + " yes, any other number for no.");
            
            // allow user's input
            int response = scan.nextInt();
            
            // compare user's response
            if(response == 1){
                System.out.println("");
                
                System.out.println("Let's create another!");
                
                // slow text speed for user
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                    (Level.SEVERE, null, ex);
                } // close try/catch block
                
                // reset variables
                planetCount = 0;
                galaxyCount = 0;
                blackHole = 1E-8;
                collisions = 1E-8;
                supernova = 1E-8;              
                
            }else{
                System.out.println("");
                
                System.out.println("Great job creating the universe!");
                
                // slow text speed for user
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                    (Level.SEVERE, null, ex);
                } // close try/catch block
                
                System.out.println("Be glad that you didn't create a real one"
                        + " because the death count from the anomalies would"
                        + " make you cry.");               
                
                // slow text speed for user
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                    (Level.SEVERE, null, ex);
                } // close try/catch block
                
                // set loop to false to prevent looping
                loopSwitch2 = false;
                
            }// close if/else block            
            
        }while(loopSwitch2 == true); // close do/while and loop if true
        
    }// close main method
    
    /**
     * store greeting info for main.
     */
    public static void greeting(){        
        // greet user
        System.out.println("Welcome to the Universe generator. "
                    + "Before you begin, lets cover some rules.");
        
        // slow text speed for user
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
            
        System.out.println("The Universe is vast and contains crazy "
                + "anomalies, your Universe is no different.");
        
        // slow text speed for user    
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
            
        System.out.println("I would like to tell you that these anomalies "
                + "don't exist, however, that is just positive thinking.");
        
        // slow text speed for user    
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
        (Level.SEVERE, null, ex);
        } // close try/catch block
            
        System.out.println("If your variables are too big, you increase "
                + "the anomalies and more destruction will occur.");
        
        // slow text speed for user    
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
            
        System.out.println("If your variables are small, your anomaly "
                + "count will decrease, but it will still destroy "
                + "parts of your Universe.");
        
        // slow text speed for user    
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
            
        System.out.println("Are you ready to begin? press one and hit "
                + "enter if you're ready. If not, press any other number.");
            
        // set do for loop
        do{                
            // scan users input
            int response = scan.nextInt();
                
            if(response == 1){
                System.out.println("");
                
                System.out.println("Let's begin!");
                
                // slow text speed for user
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                    (Level.SEVERE, null, ex);
                } // close try/catch block
                
                // set loopSwitch 1 to false to prevent looping
                loopSwitch1 = false;                    
                    
            } else {
                System.out.println("I'll give you 5 more seconds to think "
                        + "about it.");
                    
                // give user a 5 second break
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                    (Level.SEVERE, null, ex);
                } // close try/catch block
                    
                System.out.println("Are you ready now? Press one and "
                        + "enter if you are, any other number for no.");            
                    
            } // close if/else block
                
        } while(loopSwitch1 == true); // close do/while block and loop if true
            
    } // close greeting method
    
    
    /**
     * Add multiple comparisons for main.
     */
    public static void switchStatement(){
        // assign do for looping
        do{
            System.out.println("You have three options.");
            
            // slow text speed for user
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
            
            System.out.println("If you'd like the computer to make a Universe,"
                    + " please press one.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("If you'd like build your own, please press "
                    + "two.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("If you'd like to keep the universe the same, "
                    + "please press three.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            // allow user response
            int response = scan.nextInt();
            
            // compare response with switch
            switch (response){
                
                // Auto Universe
                case 1:
                    // pull case1 method into switch statment
                    case1();
                    // set loop to false to prevent loop in switch statement
                    loopSwitch3 = false;
                break;
                
                // User generated Universe
                case 2:
                    // pull case2 method into switch statment
                    case2();
                    // set loop to false to prevent loop in switch statement
                    loopSwitch3 = false;           
                break;
                
                // Our Universe
                case 3:
                    // pull case3 method into switch statment
                    case3();
                    // set loop to false to prevent loop in switch statement
                    loopSwitch3 = false;            
                break;
                
                // display instructions and loop if answer is out of range 
                default:
                    System.out.println("That wasn't an option. Please enter "
                            + "a number between 1 and 3 and press enter.");                             
                    loopSwitch3 = true;
            } // close switch block  
            
        }while(loopSwitch3 == true); // close do/while and loop if true
        
    }// close switchStatement method
    
    /**
     * A method to store case one's info. 
     */
    public static void case1(){
        System.out.println("");
                    
        System.out.println("You've chosen the randomizer.");
        
        System.out.println("Auto generating Universe.");
        
        // slow text speed for user
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // declare double for random number
        double randConstantKS;
        
        // assign random number to randNum1
        Random randNum1 = new Random();  
                    
        // create BigInteger to expand random number
        BigInteger bigInt1 = new BigInteger (76 , randNum1); 
                    
        // assign randConstantK to BigInteger and make it a double
        randConstantKS = bigInt1.doubleValue();                    
                                        
        // create double and assign returned solarSysIngal
        double returnedSolarSysInGal = solarSysInGal(randConstantKS);
                    
        // create double and assign returned solarSysVol
        double returnedSolarSysVol = solarSysVol(RADIUS_S);
        
        // set planet count equal to randConstantKS and multiply by 9
        planetCount = randConstantKS * 9;                               
                    
        if(returnedSolarSysInGal < 1.0){
            System.out.println("Solar Systems in the Galaxy decreased to "
                    + " " + returnedSolarSysInGal * 100 + "% its original "
                    +"size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("The amount of Solar Systems Didn't "
                    + "even come close! I'm lowering your anomaly "
                    + "probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
                        
            //divide anomaly constants by 100
            collisions = (collisions / 100);
                        
            blackHole = (blackHole / 100);
                        
            supernova = (supernova / 100);
            
        }else if(returnedSolarSysInGal > 1.0 && returnedSolarSysInGal < 2.0){
            System.out.println("Solar Systems in the Galaxy increased to "
                    + " " + returnedSolarSysInGal * 100 + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block             
                        
            System.out.println("Woah! Way too much! I'm increasing"
                    + " your anomaly probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
                        
            // multiply anomaly constants by 100
            collisions = (collisions * 100);
                        
            blackHole = (blackHole * 100);
                        
            supernova = (supernova * 100);    
                        
        }else{
            System.out.println("Solar Systems in the Galaxy increased to "
                    + " " + returnedSolarSysInGal * 100  + "% its original "
                    + "size.");
            
            //slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block           
            
            System.out.println("That's a lot of Solar Systems! They're way "
                    + "too cramped in there! Don't worry! The anomalies will"
                    + " take care of this.");
            
            System.out.println("Increasing anomaly probability by 1000.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
            
            
            // multiply anomaly constants by 1000
            collisions = collisions * 1000;
                        
            blackHole = blackHole * 1000;
                        
            supernova = supernova * 1000;  
        } // close if/else block
                    
        // declare double for random number
        double randConstantKG;
                    
        // create random number
        Random randNum2 = new Random();        
                    
        // create BigInteger to expand random number
        BigInteger bigInt2 = new BigInteger (68 , randNum2); 
                    
        // assign randConstantK to BigInteger and make it a double
        randConstantKG = bigInt2.doubleValue(); 
                    
        // create double and assign returned solarSysIngal
        double returnedGalInUniverse = galInUniverse(randConstantKG);
                    
        // create double and assign returned solarSysVol
        double returnedGalaxyVol = galaxyVol(RADIUS_G , HEIGHT_G); 
        
        // set galaxy count equal to randConstantKG             
        galaxyCount = randConstantKG;
        
        // assign double for planet count being multiplied by galaxy count
        double planetCount1 = planetCount * galaxyCount; 
        
        // compare returnedGalInUniverse ratio            
        if(returnedGalInUniverse < 1.0){   
            System.out.println("Galaxies in the universe decreased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                    + "size."); 
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
                        
            System.out.println("You were low on your "
                    + "Galaxy count! I'm lowering your anomaly"
                    + " probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
                        
            //divide anomaly constants by 100
            collisions = (collisions / 100);
                        
            blackHole = (blackHole / 100);
                        
            supernova = (supernova / 100);
            
        }else if(returnedGalInUniverse > 1.0 && returnedGalInUniverse < 2.0){
            System.out.println("Galaxies in the Universe increased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                            + "size."); 
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block            
                        
            System.out.println("You over shot! More food for the"
                    + " Black Holes! I'm increasing your anomaly "
                    + "probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block      
                        
            // multiply anomaly constants by 100
            collisions = (collisions * 100);
                        
            blackHole = (blackHole * 100);                        
                           
            supernova = (supernova * 100);
                        
        }else{
            System.out.println("Galaxies in the Universe increased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block     
            
            System.out.println("I'm glad you're feeding the Black Holes, they "
                    + "looked hungry! I'm increasing your anomaly "
                    + "probability by 1000.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block      
            
            // multiply anomaly constants by 100
            collisions = (collisions * 1000);
                        
            blackHole = (blackHole * 1000);
                        
            supernova = (supernova * 1000);
            
        } // close if/else block
        
        // print Universe stats to user            
        System.out.println("");
                            
        System.out.println("************Universe Stats***************");
        
        System.out.println("");
        
        // slow text speed for user
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
                    
        System.out.println("Your universe has " + planetCount1 + 
                " planets and " + galaxyCount + " Galaxies.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
                    
        System.out.println("Unfortunatly, the anomalies are going "
                + "have to destroy some.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double and multiply anomalies to galaxyCount
        double galaxyCount2 = galaxyCount * (collisions * blackHole * 
                supernova);
        
        // assign double to calulate the percentage lost for Galaxies 
        double galaxyLostPercentage = (galaxyCount2 / galaxyCount) * 100;
        
        // assign double and multiply planetCount to galaxyCount2 to anomalies 
        double planetCount2 = (planetCount * galaxyCount2);      
        
        System.out.println("You lost " + galaxyLostPercentage + "%"
                + " of your planets and Galaxies,");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block        
        
        System.out.println("which equates to " + planetCount2 + " planets "
                + "lost and " + galaxyCount2 + " Galaxies lost.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // print how many planets and galaxies are left
        System.out.println("You have " + (planetCount1 - 
                planetCount2) + " planets and " + (galaxyCount - 
                        galaxyCount2) + " Galaxies"
                + " left!");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
                    
        System.out.println("I'm glad this is a computer program "
                + "because that was a lot of destruction!");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("On the Universe scale, you can see that the "
                + "variables stayed close to the same, however, you still "
                + "lost a lot of planets and Galaixes.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("Do you feel small yet?");
        
    } // close case1 method
    
    /**
     * A method to store case two's info. 
     */
    public static void case2(){
        System.out.println("");
                    
        System.out.println("You've chosen to make your own! How many Solar "
                + "Systems would you like? (Remember, the galaxy is vast!"
                + " Think big!)");
        // assign double for user input
        double constantKS = scan.nextDouble();
                    
        // create double and assign returned solarSysIngal
        double returnedSolarSysInGal = solarSysInGal(constantKS);
                    
        // create double and assign returned solarSysVol
        double returnedSolarSysVol = solarSysVol(RADIUS_S);          
        
        // set planetCount equal to user input and multiply by 9            
        planetCount = constantKS * 9;                               
         
        // compare returnedSolarSysInGal ratio
        if(returnedSolarSysInGal < 1.0){
            System.out.println("Solar Systems in the Galaxy decreased to "
                    + " " + returnedSolarSysInGal * 100  + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("The amount of Solar Systems Didn't "
                    + "even come close! I'm lowering your anomaly "
                    + "probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            //divide anomaly constants by 100
            collisions = collisions / 100;
                        
            blackHole = blackHole / 100;
                        
            supernova = supernova / 100;
            
        }else if (returnedSolarSysInGal > 1.0 && returnedSolarSysInGal < 2.0){
            System.out.println("Solar Systems in the Galaxy increased to "
                    + " " + returnedSolarSysInGal * 100  + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            System.out.println("Woah! Way too much! I'm increasing"
                    + " your anomaly probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            // multiply anomaly constants by 100
            collisions = collisions * 100;
                        
            blackHole = blackHole * 100;
                        
            supernova = supernova * 100;                        
                        
        }else{            
            System.out.println("Solar Systems in the Galaxy increased to "
                    + " " + returnedSolarSysInGal * 100  + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("That's a little over board don't you think?"
                    + " Oh well, more destruction.");
            
            System.out.println("Increasing anomaly probability by 1000.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            // multiply anomalies by 1000
            collisions = collisions * 1000;
                        
            blackHole = blackHole * 1000;
                        
            supernova = supernova * 1000;
        } // close if/else block
        
         System.out.println("How many Galaxies would you like? (The Universe"
                 + " is also vast! Think big!)"); 
         
        // assign double for user input
        double ConstantKG = scan.nextDouble();
                    
        // create double and assign returned solarSysIngal
        double returnedGalInUniverse = galInUniverse(ConstantKG);
                    
        // create double and assign returned solarSysVol
        double returnedGalaxyVol = galaxyVol(RADIUS_G , HEIGHT_G);
        
        // set galaxyCount equal to user input
        galaxyCount = ConstantKG;
        
        // increase planet count by multiplying galaxyCount to planetCount
        double planetCount1 = galaxyCount * planetCount;
        
        // compare returnedGalInUniverse ratio                    
        if(returnedGalInUniverse < 1){
            // print to user the decreased percentage
            System.out.println("Galaxies in the Universe decreased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            System.out.println("You were way low on your "
                    + "Galaxy count! I'm lowering your anomaly"
                    + " probability by 100.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            //divide anomaly constants by 100
            collisions = collisions / 100;
                        
            blackHole = blackHole / 100;
                        
            supernova = supernova / 100;            
            
        }else if(returnedGalInUniverse > 1.0 && returnedGalInUniverse < 2.0){
            // print to user the increased percentage
            System.out.println("Galaxies in the Universe increased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                    + "size."); 
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            System.out.println("You over shot! More food for the"
                    + " Black Holes! I'm increasing your anomaly "
                    + "probability.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
                        
            // multiply anomaly constants by 100
            collisions = collisions * 100;
                        
            blackHole = blackHole * 100;
                        
            supernova = supernova * 100;
                        
        }else{
            // print to user the increased percentage
            System.out.println("Galaxies in the Universe increased to "
                    + " " + returnedGalInUniverse * 100 + "% its original "
                    + "size.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            System.out.println("I'm glad you're feeding the Black Holes, they "
                    + "looked hungry! I'm increasing your anomaly "
                    + "probability by 1000.");
            
            // slow text speed for user
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
                (Level.SEVERE, null, ex);
            } // close try/catch block
            
            // multiply anomaly constants by 1000
            collisions = (collisions * 1000);
                        
            blackHole = (blackHole * 1000);
                        
            supernova = (supernova * 1000);
            
        } // close if/else block
        
        // print the Universes stats to user                    
        System.out.println("");
                            
        System.out.println("************Universe Stats***************");
        
        System.out.println("");
        
        // slow text speed for user
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // display planet count and Galaxy count to user            
        System.out.println("Your universe has " + planetCount1 + 
                " planets and " + galaxyCount + " Galaxies.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
                    
        System.out.println("Unfortunatly, the anomalies are going "
                + "have to destroy some.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block        
        
        // assign double and multiply galaxy count to the anomaly constants 
        double galaxyCount2 = galaxyCount * (collisions * blackHole * 
                supernova);
        
        // assign double to calulate the percentage lost for Galaxies
        double galaxyLostPercentage = (galaxyCount2 / galaxyCount) * 100;
        
        // assign double and multiply planetCount to galaxyCount2 to anomalies            
        double planetCount2 = (planetCount * galaxyCount2);    
        
        System.out.println("You lost " + galaxyLostPercentage + "%"
                + " of your planets and Galaxies,");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("which equates to " + planetCount2 + " planets "
                + "lost and " + galaxyCount2 + " Galaxies lost.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // print how many planets and galaxies are left
        System.out.println("You have " + (planetCount1 - 
                planetCount2) + " planets and " + (galaxyCount - 
                        galaxyCount2) + " Galaxies"
                + " left!");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
                    
        System.out.println("I'm glad this is a computer program "
                + "because that was a lot of destruction!");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
    } // close case2 method
    
    /**
     * A method to store case three's info. 
     */
    public static void case3(){
        System.out.println("");
        
        System.out.println("You've chosen to see the vastness of the Universe"
                + " in which we live in.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("We'll start with the volume.");
        
        // slow text speed for user
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double for returned solarSysVol
        double returnedSolarSysVol = solarSysVol(RADIUS_S);
        
        System.out.println("The volume of the Solar System is " + 
                returnedSolarSysVol + " Astronomical Units cubed.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double for returned galaxyVol
        double returnedGalaxyVol = galaxyVol(RADIUS_G , HEIGHT_G);
        
        System.out.println("The volume of the Galaxy is " + returnedGalaxyVol
                + " Astronomical Units cubed.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double for returned universeVol
        double returnedUniverseVol = universeVol(RADIUS_U);        
        
        System.out.println("The volume of the Universe is " + 
                returnedUniverseVol + " Astronomical Units cubed.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("Pretty big huh? To Put this into perspective, an "
                + "Astromical Unit equals 149,597,871 Kilometers.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double for volume division for solar System count
        double solarSysInGal = Math.rint(returnedGalaxyVol / 
                returnedSolarSysVol);
        
        System.out.println("In the volume of the Galaxy, you could fit " + 
                solarSysInGal + " Solar Systems.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        // assign double for volume division for Galaxy count
        double galInUniverse = Math.rint(returnedUniverseVol / 
                returnedGalaxyVol);
        
        System.out.println("In the volume of the Universe, you could fit " + 
                galInUniverse + " Galaxies.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("In total, you could fit " + (solarSysInGal * 
                galInUniverse) * 9 + " planets.");
        
        // slow text speed for user
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuildYourOwnUniverse.class.getName()).log
            (Level.SEVERE, null, ex);
        } // close try/catch block
        
        System.out.println("In my opinion, I don't think we're alone in the "
                + "Universe.");
        
    } // close case3 method
    
    /**
     * Calculate volume of the Solar System in Astronomical Units.
     * @param r
     * @return volume of the Solar System. 
     */
    public static double solarSysVol (double r){               
        // assign a formula to compute the volume of the Solar System      
        double solarSVol = E_CONSTANT * PI * Math.pow(r , 3);
        
        // return equation
        return solarSVol;
    }// close solarSysVol method
    
    /**
     * Calculate volume of the Galaxy in Astronomical Units.
     * @param r
     * @param h
     * @return volume of the Galaxy
     */
    public static double galaxyVol (double r, double h){         
        // assign a formula to compute the volume of the Galaxy      
        double gVol = PI * Math.pow(r , 2) * h;
                
        // return equation
        return gVol;
    }// close solarSysVol method
    
    /**
     * Calculate volume of the Universe in Astronomical Units. 
     * @param r
     * @return volume of the Universe. 
     */
    public static double universeVol (double r){          
        // assign a formula to compute the volume of the Solar System      
        double uVol = E_CONSTANT * PI * Math.pow(r , 3);
        
        // return equation
        return uVol;
    }// close solarSysVol method
    
    /**     
     * Calculate how many Solar Systems can fit in the Galaxy.
     * @param k add a constant required for the equation
     * @return value of Solar System's in the Galaxy
     */
    public static double solarSysInGal(double k){        
        // create double for returned equation for the Solar System
        double returnedVolOfSolarSys = solarSysVol(RADIUS_S);
        
        // create double for returned equation for the Galaxy
        double returnedVolOfGal = galaxyVol(RADIUS_G , HEIGHT_G);
        
        // create double for how many Solar Systems could fit in the Galaxy
        double solarSysInGal = returnedVolOfGal / returnedVolOfSolarSys;
        
        // divide k constant by how many Solar Systems can fit in the Galaxy
        double inputtedSolarSysInGal = k / solarSysInGal;        
        
        // return ratio equation
        return inputtedSolarSysInGal;
        
    } // close solarSysInGal method
    
    /**     
     * Calculate how many Galaxies are in the Universe.
     * @param k add a constant required for the equation
     * @return value of Galaxies in the Universe
     */
    public static double galInUniverse(double k){
        // create double for returned equation for the Galaxy
        double returnedGalaxyVol = galaxyVol(RADIUS_G , HEIGHT_G);
        
        // create double for returned equation for the Universe
        double returnedVolOfUniverse = universeVol(RADIUS_U);
        
        // create double for how many Galaxies could fit in the Universe
        double galInUniverse = returnedVolOfUniverse/ returnedGalaxyVol;
        
        // divide k constant by how many Galaxies can fit in the Universe
        double inputtedGalInUniverse = k / galInUniverse;        
        
        // return ratio equation
        return inputtedGalInUniverse;
        
    } // close solarSysInGal method
    
} // close BuildYourOwnUniverse class

