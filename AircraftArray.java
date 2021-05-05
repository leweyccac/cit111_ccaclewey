/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 * My Array Collection. Chunk 4 Ex 1.
 * @author lewey
 */
public class AircraftArray {
    // member var array
    public static String [] acMod = new String[4];
    public static String [] userArray = new String[4];
    // member var loop switches
    public static boolean loopSwitch1 = true;
    public static boolean loopSwitch2 = true;    
    public static boolean loopSwitch3 = true;    
    // member var Scanner
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){        
        // assign array variables
        acMod [0] = "A-10";
        acMod [1] = "EC-130H";
        acMod [2] = "C-130J";
        acMod [3] = "HH-60";        
        System.out.println("");
        myArray();
        System.out.println("");
        do{
            System.out.println("Which Aircraft would you like to learn about?");
            System.out.println("For A-10, press 1.");
            System.out.println("For EC-130H, press 2.");
            System.out.println("For C-130J, press 3.");
            System.out.println("For HH-60, press 4.");
            
            do{
                int response = scan.nextInt();            
                switch(response){
                    case 1:
                        case1();
                    break;
                
                    case 2:
                        case2();
                    break;
                
                    case 3:
                        case3();
                    break;
                
                    case 4:
                        case4();
                    break;
                
                    default:
                        System.out.println("That was not a correct response. "
                                + "Please press 1-4 and enter.");
                        
                } // close switch block
            }while(loopSwitch2 == true); // close do/while block
            System.out.println("");
            userArray();
            System.out.println("");
            
            System.out.println("Would you like to try again? Press 1 and enter for yes.");
            int response = scan.nextInt();
            if(response == 1){
                System.out.println("Alright, lets go again!");
            } else{
                System.out.println("Thanks for playing with arrays!");
                loopSwitch1 = false;
            } // close if/else block
        
        } while(loopSwitch1 == true); // close do/while block 
        
    } // close main method
    
    /**
     * This method contains display info for my array
     */
    public static void myArray(){
        for(int aC = 0; aC < 4; aC = aC + 1){
            System.out.println("Aircraft at index " + aC + ": " + acMod[aC]);
        } // close for block
    } // close myArray method
    
    /**
     * This method contains display info for user array
     */
    public static void userArray(){
            System.out.println("Time to make your own array!");
            System.out.println("You have four interests to place in your array.");
        do{
            System.out.println("Please enter your first interest and press enter.");
            String response1 = scan.nextLine();            
            userArray [0] = response1;
            System.out.println("Please enter your second interest and press enter.");
            String response2 = scan.nextLine();
            userArray [1] = response2;
            System.out.println("Please enter your third interest and press enter.");
            String response3 = scan.nextLine();
            userArray [2] = response3;
            System.out.println("Please enter your fourth interest and press enter.");
            String response4 = scan.nextLine();
            userArray [3] = response4;
        
            for(int uI = 0; uI < 4; uI = uI + 1){
                System.out.println("Info at index " + uI + ": " + userArray[uI]);
            } // close for block
        
            System.out.println("Does everything look right or would you like to try again? Press 1 for yes.");
            int response = scan.nextInt();
            if(response == 1){
                System.out.println("Alright, lets go again!");
            } else{
                System.out.println("Great array that you've made!");
                loopSwitch3 = false;            
            } // close if/else block
            
        }while (loopSwitch3 == true); // close do/while block
        
    } // close userArray method
    
    /**
     * Method for storing case 1 info.
     */
    public static void case1(){
        System.out.println("You've chosen the " + acMod[0] + ".");
        System.out.println("The A-10 aircraft is the aircraft built around a cannon,");
        System.out.println("this cannon is called the GAU-8 Avenger and can fire 70 rounds per second!");
        System.out.println("These rounds are 30mm and come in a variety of uses.");
        System.out.println("A very popular round is the depleted Uranium round.");
        System.out.println("It slices through tanks like a hot knife in butter!");
        System.out.println("The aicraft has special percautions to prevent the cannon");
        System.out.println("from stalling the engines. Slats installed on each wing right in");
        System.out.println("front of the engine will hydraulically raise to cause more lift,");
        System.out.println("preventing the aircraft from plummeting downward from the force.");
        loopSwitch2 = false;
    } // close case1 method
    
    /**
     * Method for storing case 2 info.
     */
    public static void case2(){
        System.out.println("You've chosen the " + acMod[1] + ".");
        System.out.println("The EC-130H is the ultimate reconnaissance aircaft!");
        System.out.println("Its purpose is to jam all enemy communications within 100 miles");
        System.out.println("of the aircraft. But wait, how do they control the jamming to not");
        System.out.println("effect oursevles? Well, you have 8+ personnel on board acting like a ");
        System.out.println("calling operator. All communications lead to the aircraft where they can");
        System.out.println("make sure all allies and troops can still communicate.");        
        loopSwitch2 = false;
    } // close case2 method
    
    /**
     * Method for storing case 3 info.
     */
    public static void case3(){
        System.out.println("You've chosen the " + acMod[2] + ".");
        System.out.println("The C-130J is a troop/cargo carrying aircraft that has some ");
        System.out.println("interesting features on some. One feature is the air to air refuel.");
        System.out.println("It can only refuel probe type aricraft, like helicopters and a few other");
        System.out.println("specialized aicraft. A drogue is released with a special parachute");
        System.out.println("on it to allow the drogue to extend outward to refuel the trailing");
        System.out.println("aircraft. In case of emergency, it will automatically disconnect");
        System.out.println("if there is too much force on the nozzle or if too much fuel pressure");
        System.out.println("is in the hose.");
        loopSwitch2 = false;
    } // close case3 method
    
    /**
     * Method for storing case 4 info.
     */
    public static void case4(){
        System.out.println("You've chosen the " + acMod[3] + ".");
        System.out.println("The HH-60 is a troop carrying helicopter. The intersting features");
        System.out.println("of this aircraft is that it will prevent explosions if it is ");
        System.out.println("crash landing. The mortality rate of an aircraft pilot surviving in");
        System.out.println("combat is 50-60%! Very scary stuff. The aircraft has special valves");
        System.out.println("installed on every fuel line, and oil lines. These valves will");
        System.out.println("break if too much force is exerted on them and the way they break");
        System.out.println("is to release a shut off valve inside of them preventing fuel/oil");
        System.out.println("to escape their containers. Essentailly sealing everything explosive");
        System.out.println("off and isolating to its container to prevent sparks from ingiting them.");
        loopSwitch2 = false;
    } // close case4 method
    
} // close AircraftArray class
