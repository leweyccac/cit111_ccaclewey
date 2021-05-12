/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 * Simulate aircraft functions for flight. Object Project
 * @author lewey
 */
public class AircraftOperations {
    // member vars that must be activated prior to APU start
    public static boolean extBattSwitchOn = false;
    public static boolean intBattSwitchOn = false;
    public static boolean inverterSwitchOn = false;
    // member vars that must be activated prior to engine start
    public static boolean aPUGenOn = false;
    public static boolean mainPumpSwitchOn = false;
    public static boolean wingPumpSwitchOn = false;
    public static boolean enginesOn = false;    
    // member vars that must be activated for proper operation    
    public static boolean landingGearUp = false;        
    public static boolean wOWSwitch = true;        
    public static int fuelCount = 11000;    
    // comm for takeoff member vals
    public static boolean takeoffGranted = false;
    public static boolean loopSwitchCommT1 = true;
    public static boolean loopSwitchCommT2 = true;
    public static Scanner scanCommT1 = new Scanner(System.in);
    public static Scanner scanCommT2 = new Scanner(System.in);    
    // comm for landing member vals
    public static boolean landGranted = false;
    public static boolean loopSwitchCommL1 = true;
    public static boolean loopSwitchCommL2 = true;
    public static Scanner scanCommL1 = new Scanner(System.in);
    public static Scanner scanCommL2 = new Scanner(System.in);
    // comm for aerial refuel
    public static boolean loopSwitchCommAR1 = true;
    public static boolean loopSwitchCommAR2= true;
    public static Scanner scanCommAR1 = new Scanner(System.in);
    public static Scanner scanCommAR2 = new Scanner(System.in);    
    // APU on member vals
    public static Scanner scanAPUOn1 = new Scanner(System.in);
    public static boolean loopSwitchAPUOn = true;
    public static Scanner scanAPUOn2 = new Scanner(System.in);    
    // Ext battery on member vals
    public static Scanner scanExtBattOn1 = new Scanner(System.in);
    public static boolean loopSwitchExtBattOn = true;    
    // Int battery on member vals
    public static Scanner scanIntBattOn1 = new Scanner(System.in);
    public static boolean loopSwitchIntBattOn = true;    
    // Inverter on member vals
    public static Scanner scanInverterOn1 = new Scanner(System.in);
    public static boolean loopSwitchInverterOn = true;    
    // Main pumps on member vals
    public static Scanner scanMainsOn = new Scanner(System.in);
    public static boolean loopSwitchMainsOn = false;    
    // Wing pumps on member vals
    public static Scanner scanWingsOn = new Scanner(System.in);
    public static boolean loopSwitchWingsOn = true;    
    // engines on member vals
    public static Scanner scanEngOn = new Scanner(System.in);
    public static boolean loopSwitchEngOn = true;    
    // landing gear member vals
    public static Scanner scanLG = new Scanner(System.in);
    public static boolean loopSwitchLG = true;
    // reset member vals
    public static Scanner scanReset = new Scanner(System.in);
    public static boolean loopSwitchR = true;
    // Switch statement 1 member vals
    public static Scanner scanSwitchStatement1 = new Scanner(System.in);
    public static boolean loopSwitchStatement1 = true;
    // Switch statement 2 member vals
    public static Scanner scanSwitchStatement2 = new Scanner(System.in);
    public static boolean loopSwitchStatement2 = true;
    // Switch statement 2 member vals
    public static Scanner scanSwitchStatement3 = new Scanner(System.in);
    public static boolean loopSwitchStatement3 = true;
    // aircraft info array member vals
    public static String [] aircraftInfo = new String [12];
    public static Scanner scanArray1 = new Scanner(System.in);
    public static boolean loopSwitchArray1 = true;
    
            
    /**
     * Store info for a switch statement
     * @throws InterruptedException
     */
    public static void switchStatement1() throws InterruptedException{
        System.out.println("Welcome to the flight simulator.");
        Thread.sleep(1000);
        System.out.println("You must start the system properly or you're not "
                + "going anywhere.");
        Thread.sleep(2000);
        System.out.println("You have a flight manual as a resource and I "
                + "recommend you use it ");
        System.out.println("every chance you get.");
        Thread.sleep(2000);
        System.out.println("So, what do you want to activate?");               
        System.out.println("");
        do{ 
            System.out.println("For the flight manual, press 1.");            
            System.out.println("For turning on the external battery switch, "
                    + "press 2.");            
            System.out.println("For turning on the internal battery switch, "
                    + "press 3.");            
            System.out.println("For turning on the inverter switch, press 4.");            
            System.out.println("For turning on the main fuel boost pumps. "
                    + "press 5.");            
            System.out.println("For turning on the wing fuel boost pumps, "
                    + "press 6. ");            
            System.out.println("For turning on the auxilary power unit, "
                    + "press 7.");            
            System.out.println("For turning on the engines, press 8.");            
            System.out.println("To communicate to tower for takeoff, press 9.");            
            
            int response = scanSwitchStatement1.nextInt();
            switch(response){
                // call flight manual array for start up and take off
                case 1:
                    flightManualArray();
                    loopSwitchStatement1 = true;
                break;
                // external battery switch case
                case 2:
                    if(extBattSwitchOn == true){
                        System.out.println("External battery switch is already "
                                + "on.");
                    }else{
                    extBattSwitchOn();
                    } // close if/else block
                    loopSwitchStatement1 = true;
                break;
                // internal battery switch case
                case 3:
                    if(intBattSwitchOn == true){
                        System.out.println("Internal battery switch is already "
                                + "on.");                        
                    }else{
                    intBattSwitchOn();
                    } // close if/else block
                    loopSwitchStatement1 = true;
                break;
                // inverter switch case
                case 4:
                    if(inverterSwitchOn == true){
                        System.out.println("Inverter switch is already on."); 
                    }else{
                    inverterSwitchOn();
                    loopSwitchStatement1 = true;
                    } // close if/else block
                break;
                // main fuel boost pumps case
                case 5:
                    if(mainPumpSwitchOn == true){
                        System.out.println("Main fuel pump switch is already "
                                + "on."); 
                    }else{
                    mainFuelPumpSwitchOn();
                    loopSwitchStatement1 = true;
                    } // close if/else block
                break;
                // wing fuel boost pumps case
                case 6:
                    if(wingPumpSwitchOn == true){
                        System.out.println("Wing fuel pump switch is already "
                                + "on."); 
                    }else{
                    wingFuelPumpSwitchOn();
                    loopSwitchStatement1 = true;
                    } // close if/else block
                break;    
                // APU case
                case 7:
                    if(aPUGenOn == true){
                        System.out.println("Auxilary power is already on."); 
                    }else{
                    aPUSwitchOn();
                    loopSwitchStatement1 = true;
                    } // close if/else block
                break;     
                // engines case
                case 8:
                    if(enginesOn == true){
                        System.out.println("Engines are already on."); 
                    }else{
                    enginesOn();
                    loopSwitchStatement1 = true;
                    } // close if/else block
                break;     
                // comm to tower for takeoff case
                case 9:
                    if(takeoffGranted == true){
                        System.out.println("You already have permission for "
                                + "takeoff."); 
                        loopSwitchStatement1 = true;
                    }else if(enginesOn == true){
                        commTakeoff();
                        loopSwitchStatement1 = false;
                    } // close if/else block
                break;
                default:
                    System.out.println("That wasn't an option. Please try "
                            + "again.");
                    loopSwitchStatement1 =true;
            } // close switch
            
            displaySwitchStatusStartUp();
            fuelCounter();
        }while(loopSwitchStatement1 == true); 
    
    } // close switchStatement method
    
    /**
     * Store info for switch statement 2
     * @throws InterruptedException
     */
    public static void switchStatement2() throws InterruptedException{
        System.out.println("");        
        System.out.println("Now it's time to take off.");
        Thread.sleep(1000);
        System.out.println("Remember, you have a flight manual as a resource "
                + "and I recommend you use it.");        
        Thread.sleep(2000);
        System.out.println("So, what do you want to do?");               
        System.out.println("");
        do{ 
            System.out.println("For the flight manual, press 1.");            
            System.out.println("To takeoff, press 2.");            
            System.out.println("For landing gear landing gear, press 3.");            
            System.out.println("To communicate to aerial refueler, press 4.");            
            System.out.println("To communicate to tower to land, press 5.");                     
            System.out.println("To continue flying, press 6.");                     
            
            int response = scanSwitchStatement2.nextInt();
            switch(response){
                // call flight manual array for start up and take off
                case 1:
                    flightManualArray();
                    loopSwitchStatement2 = true;
                break;
                // takeoff case
                case 2:
                    System.out.println("Hold on!");
                    System.out.println("*FOOOOOOSHSH*");
                    Thread.sleep(2000);
                    wOWSwitch = false;
                    System.out.println("You're now in the air! How's the "
                            + "view?");
                    loopSwitchStatement2 = true;
                break;
                // landing gear switch case
                case 3:
                    if(wOWSwitch == true){
                        System.out.println("You're still on the ground.");
                        System.out.println("Please try again.");
                    }else{
                    landingGear();
                    } // close if/else block
                    loopSwitchStatement2 = true;
                break;
                // comm aerial refueler case
                case 4:
                    if(wOWSwitch == true){
                        System.out.println("You haven't taken off yet.");
                        System.out.println("Please try again.");                        
                    }else{
                    commAR();
                    } // close if/else block
                    loopSwitchStatement2 = true;                    
                break;
                // comm to tower for landing case
                case 5:
                    if(wOWSwitch == true){
                        System.out.println("You haven't taken off yet.");
                        System.out.println("Please try again.");
                        loopSwitchStatement2 = true;
                    }else if(landingGearUp == true){
                        System.out.println("Your landing gear is up. Please "
                                + "actuate your landing gear.");
                    }else{    
                        commLanding();
                    } // close if/else block                    
                    loopSwitchStatement2 = false;                    
                break;                        
                // continue flying case
                case 6:
                    if(wOWSwitch == true){
                        System.out.println("You haven't taken off yet.");
                        System.out.println("Please try again.");                        
                    }else{
                    fuelCount = fuelCount - 1000;
                    Thread.sleep(2000);
                    System.out.println("How was your hour of flying? Keep an "
                            + "eye on your fuel!");
                    } // close if/else block                    
                    loopSwitchStatement2 = true;                    
                break;                        
                default:
                    System.out.println("That wasn't an option. Please try"
                            + " again.");
                    loopSwitchStatement2 = true;
            } // close switch
            
            displayAircraftStatus();
            fuelCounter();
        }while(loopSwitchStatement2 == true); 
    
    } // close switchStatement2 method
    
    
    
    /**
     * Store info for a switch statement
     * @throws InterruptedException
     */
    public static void flightManualArray()throws InterruptedException{
        do{
            aircraftInfo [1] = "External Battery.";
            aircraftInfo [2] = "Internal Battery.";
            aircraftInfo [3] = "Inverter.";
            aircraftInfo [4] = "Auxiliary Power Unit.";
            aircraftInfo [5] = "Main Fuel Pumps.";
            aircraftInfo [6] = "Wing Fuel Pumps";
            aircraftInfo [7] = "Engines.";
            aircraftInfo [8] = "Landing Gear.";
            aircraftInfo [9] = "Communications.";                 
            aircraftInfo [10] = "Fuel Consumption.";
        
            for(int aC = 1; aC < 11; aC = aC + 1){
                System.out.println("Information at index " + aC + ": " + 
                        aircraftInfo[aC]);
                Thread.sleep(2000);
            } // close for block
            System.out.println("Which Operation would you you like to see?");
            System.out.println("Press the number associated with the index and"
                    + " press enter.");        
            int response = scanArray1.nextInt();
            switch(response){
                // External battery info
                case 1:
                    System.out.println("External battery info: ");
                    Thread.sleep(1000);
                    System.out.println("External battery must be the first "
                            + "switch activated. ");
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                break;
                // internal battery info
                case 2:
                    System.out.println("Internal battery info: ");
                    Thread.sleep(1000);
                    System.out.println("In order to activate internal battery"
                            + " power, the external battery ");
                    System.out.println("switch must be on.");
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                    
                break;
                // inverter info
                case 3:
                    System.out.println("Inverter info: ");
                    System.out.println("In order to activate the inverter, the"
                            + " internal battery switch must be on.");                    
                    loopSwitchArray1 = false;
                    
                break;
                // auxiliary power info
                case 4:
                    System.out.println("Auxiliary power info: ");
                    Thread.sleep(1000);                    
                    System.out.println("In order to the auxiliary power unit,"
                            + " the inverter switch must be on. Also ");                    
                    System.out.println("once auxiliary power is on, it will "
                            + "consume fuel."); 
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                    
                break;
                // main fuel pump info
                case 5:
                    System.out.println("Main fuel pump info: ");
                    Thread.sleep(1000);
                    System.out.println("In order to activate the main fuel "
                            + "boost pump, the auxiliary power unit ");
                    System.out.println("must be on. Caution: If switch is "
                            + "activated prior to the auxiliary power unit ");
                    System.out.println("it places an electrical load on the "
                            + "system. The system will still function; ");
                    System.out.println("however, it will cause a strain on "
                            + "the generator.");
                    Thread.sleep(4000);
                    loopSwitchArray1 = false;
                    
                break;
                // wing fuel pump info
                case 6:
                    System.out.println("wing fuel pump info: ");
                    Thread.sleep(1000);
                    System.out.println("In order to activate the wing fuel "
                            + "boost pump, the auxiliary power unit ");
                    System.out.println("must be on. Caution: If switch is "
                            + "activated prior to the auxiliary power unit ");
                    System.out.println("it places an electrical load on the "
                            + "system. The system will still function; ");
                    System.out.println("however, it will cause a strain on "
                            + "the generator.");
                    Thread.sleep(4000);
                    loopSwitchArray1 = false;
                    
                break;    
                // engine info
                case 7:
                    System.out.println("Engine info: ");
                    Thread.sleep(1000);
                    System.out.println("In order to turn on engines, the "
                            + "auxiliary power unit must be on. ");
                    System.out.println("Once engines are on, they will consume"
                            + " fuel.");
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                    
                break;    
                // landing gear info
                case 8:     
                    System.out.println("Landing gear info: ");
                    Thread.sleep(1000);
                    System.out.println("It is recommended to retract the "
                            + "landing gear after take off. ");
                    Thread.sleep(1000);
                    System.out.println("You don't have to though; however, "
                            + "it will consume more fuel due to ");
                    System.out.println("improper aerodynamics. Landing gear "
                            + "must be down prior to landing.");
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                    
                break;    
                // communications info
                case 9:
                    System.out.println("Communications info: ");
                    Thread.sleep(1000);
                    System.out.println("Communications must be transmitted "
                            + "properly. If not, the tower/refueler ");
                    System.out.println("will not transmit back. For takeoff, "
                            + "the first phrase is: ");                    
                    System.out.println("'Tower, aircraft 202.' The second "
                            + "phrase is: 'Requesting permission for ");
                    System.out.println("takeoff on runway 2, over.'");
                    Thread.sleep(2000);
                    System.out.println("For landing, the first phrase is: "
                            + "'Tower, aircraft 202.' The second phrase ");
                    System.out.println("is: 'Requesting permission to land "
                            + "on runway 2, over.'");
                    Thread.sleep(2000);
                    System.out.println("For aerial refuel, the first phrase "
                            + "is: 'Aircraft 1508, aircraft 202.'");
                    System.out.println("The second phrase is: 'Aircraft 202 "
                            + "requesting fuel.'");
                    System.out.println("You must write is word for word with "
                            + "the puncuation.");
                    Thread.sleep(2000);
                    loopSwitchArray1 = false;
                    
                break;            
                // Fuel consumption info case 
                case 10:
                    System.out.println("Fuel consumption  info: ");
                    Thread.sleep(1000);
                    System.out.println("The planes max fuel load is 11,000lbs. "
                            + "Auxiliary power will consume 50lbs ");
                    System.out.println("of fuel each cycle. The engines will "
                            + "consume 500lbs of fuel each cycle. With landing "
                            + "gear down, ");
                    System.out.println("an additional 50lbs will be consumed "
                            + "each cycle. Don't forget, you have the option ");
                    System.out.println("to aerial refuel. Check communications "
                            + "for more info.");
                    Thread.sleep(5000);
                    loopSwitchArray1 = false;
                    
                break;
                // loop point
                default:
                    System.out.println("");
                    loopSwitchArray1 = true;
            } // close switch
            
        } while(loopSwitchArray1 == true);     
    } // close flightManualArray method   
    
    /**
     * Simulate turning the external battery switch on when called
     * @throws InterruptedException
     */
    public static void extBattSwitchOn()throws InterruptedException{
        System.out.println("Please press 1 to turn the external battery switch "
                + "on.");
        do{
            int response1 = scanExtBattOn1.nextInt();
            if(response1 == 1 && extBattSwitchOn == false){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                extBattSwitchOn = true;
                System.out.println("External battery switch set to on.");
                System.out.println("");
                loopSwitchExtBattOn = false;    
                
            } else{
                System.out.println("You elbowed the monitor! Don't do that!");
                System.out.println("Press 1 to turn the exernal battery switch "
                        + "on.");
            } // close if/else block              
        } while(loopSwitchExtBattOn == true);        
    
    } // close extBattSwitch method
    
    /**
     * Simulate turning the internal battery switch on when called
     * @throws InterruptedException
     */
    public static void intBattSwitchOn()throws InterruptedException{
        System.out.println("Please press 1 to turn the internal battery switch "
                + "on.");
        do{
            int response1 = scanIntBattOn1.nextInt();
            if(response1 == 1 && extBattSwitchOn == true){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                intBattSwitchOn = true;
                System.out.println("Internal battery switch set to on.");
                System.out.println("");
                loopSwitchIntBattOn = false;
                
            }else if(response1 == 1 && extBattSwitchOn == false){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);                
                System.out.println("Hmm, nothing happened.");
                System.out.println("Please consult the flight manual before you"
                        + " try again.");
                loopSwitchIntBattOn = false;    
                
            } else{
                System.out.println("You kicked the glass. Please be careful "
                        + "with the multi-million dollar aircraft!");
                System.out.println("Press 1 to turn the internal battery switch"
                        + " on.");
            } // close if/else block              
        } while(loopSwitchIntBattOn == true);
    
    } // close intBattSwitch method
    
    /**
     * Simulate turning the inverter switch on when called
     * @throws InterruptedException
     */
    public static void inverterSwitchOn()throws InterruptedException{
        System.out.println("Please press 1 to turn the inverter switch on.");
        do{
            int response1 = scanInverterOn1.nextInt();
            if(response1 == 1 && intBattSwitchOn == true){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                inverterSwitchOn = true;
                System.out.println("Inverter switch set to on.");
                System.out.println("");
                loopSwitchInverterOn = false;
                
            } else if(response1 == 1 && intBattSwitchOn == false){
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                System.out.println("Hmm, nothing happened.");
                System.out.println("Please consult the flight manual before you"
                        + " try again.");
                loopSwitchInverterOn = false;         
            
            } else{
                System.out.println("You elbowed the monitor! Don't do that!");
                System.out.println("Press 1 to turn the exernal battery switch"
                        + " on.");
            } // close if/else block              
        } while(loopSwitchInverterOn == true);
    
    } // close inverter Switch method
    
    /**
     * Simulate turning the auxiliary power switch on when called
     * @throws InterruptedException
     */
    public static void aPUSwitchOn()throws InterruptedException{        
        System.out.println("Please press 1 to start the auxilary power unit.");        
        do{
            int response2 = scanAPUOn2.nextInt();
            if(response2 == 1 && inverterSwitchOn == true){
                System.out.println("*Rattle Rattle**VOOOOSSHHH*");
                Thread.sleep(2000);
                System.out.println("The condition is a nonloaded condition.");
                Thread.sleep(1000);
                System.out.println("That's a lot better on the system, well"
                        + " done!");
                Thread.sleep(1000);
                aPUGenOn = true;
                System.out.println("APU is on. Systems nominal.");
                loopSwitchAPUOn = false;
                
            }else if(response2 == 1 && inverterSwitchOn 
                    == true && mainPumpSwitchOn == true){
                System.out.println("*Rattle Rattle**VOOOOSSHHH*");
                Thread.sleep(2000);
                System.out.println("The condition is a loaded condition.");
                Thread.sleep(1000);
                System.out.println("That's terrible for the system! It'll "
                        + "still start, ");
                System.out.println("but next time consult the flight manaul"
                        + " to prevent ");
                System.out.println("the system from having an electrical "
                        + "load.");
                Thread.sleep(2000);
                aPUGenOn = true;
                System.out.println("APU is on.");
                loopSwitchAPUOn = false;
                
            }else if(response2 == 1 && inverterSwitchOn 
                    == true && wingPumpSwitchOn == 
                    true){
                System.out.println("*Rattle Rattle**VOOOOSSHHH*");
                Thread.sleep(2000);
                System.out.println("The condition is a loaded condition.");
                Thread.sleep(1000);
                System.out.println("That's terrible for the system! It'll "
                        + "still start, ");
                System.out.println("but next time consult the flight manaul"
                        + " to prevent ");
                System.out.println("the system from having an electrical "
                        + "load.");
                Thread.sleep(2000);
                aPUGenOn = true;
                System.out.println("APU is on.");
                loopSwitchAPUOn = false;
                
            }else if(response2 == 1 && inverterSwitchOn 
                    == true && wingPumpSwitchOn == 
                    true && mainPumpSwitchOn == true){
                System.out.println("*Rattle Rattle**VOOOOSSHHH*");
                Thread.sleep(2000);
                System.out.println("The condition is a loaded condition.");
                Thread.sleep(1000);
                System.out.println("That's terrible for the system! It'll still"
                        + " start, ");
                System.out.println("but next time consult the flight manaul "
                        + "to prevent ");
                System.out.println("the system from having an electrical "
                        + "load.");
                Thread.sleep(2000);
                aPUGenOn = true;
                System.out.println("APU is on.");
                loopSwitchAPUOn = false;
                
            } else if(response2 == 1 && inverterSwitchOn == false){
                System.out.println("*Sound of a switch flipping*");
                Thread.sleep(1000);
                System.out.println("Hmm, somethings not right. You better "
                        + "consult the flight manual");
                System.out.println("Before you try again.");
                loopSwitchAPUOn = false;
                
            } else{
                System.out.println("You punched the fuel gauge... Are you "
                        + "okay?");
                System.out.println("Please press 1 to turn APU on.");
                loopSwitchAPUOn = true;
            } // close if/else block 
        }while(loopSwitchAPUOn == true); // close do/while block
        
    } // close aPUSwitch method    
    
    /**
     * Simulate turning the main fuel pump switch on when called
     * @throws InterruptedException
     */
    public static void mainFuelPumpSwitchOn()throws InterruptedException{
        System.out.println("Please press 1 to turn the main pump switch on.");
        do{
            int response1 = scanMainsOn.nextInt();
            if(response1 == 1){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                mainPumpSwitchOn = true;
                System.out.println("Main pump switch set to on.");
                System.out.println("");
                loopSwitchMainsOn = false;           
            } else{
                System.out.println("You hit the communication panel... Don't "
                        + "do that!");
                System.out.println("Press 1 to turn the main pump switch on.");
            } // close if/else block              
        } while(loopSwitchMainsOn == true);
    
    } // close mainFuelPumpSwitchOn method    
    
    
    /**
     * Simulate turning the wing fuel pump switch on when called
     * @throws InterruptedException
     */
    public static void wingFuelPumpSwitchOn()throws InterruptedException{
        System.out.println("Please press 1 to turn the wing pump switch on.");
        do{
            int response1 = scanWingsOn.nextInt();
            if(response1 == 1){
                System.out.println("");
                System.out.println("*Switch flip*");
                Thread.sleep(1000);
                wingPumpSwitchOn = true;
                System.out.println("Wing pump switch set to on.");
                System.out.println("");
                loopSwitchWingsOn = false;            
            } else{
                System.out.println("You elbowed the monitor! Don't do that!");
                System.out.println("Press 1 to turn the wing pump switch on.");
            } // close if/else block              
        } while(loopSwitchWingsOn == true);    
    } // close wingFuelPumpsSwitchOn method
    
    /**
     * Simulate turning the engines on when called
     * @throws InterruptedException
     */
    public static void enginesOn()throws InterruptedException{
        System.out.println("Please press 1 to start the engines.");        
        do{ 
            int response = scanEngOn.nextInt();
            if(response == 1 && aPUGenOn == true){
                System.out.println("*Rattle Rattle**VOOOOSSHHH*");
                Thread.sleep(2000);
                enginesOn = true;
                System.out.println("Engines are on.");
                loopSwitchEngOn = false;        
                
            } else if(response == 1 && aPUGenOn == false){
                System.out.println("*Sound of a switch flipping*");
                Thread.sleep(1000);
                System.out.println("Hmm, somethings not right. You better "
                        + "consult the flight manual");
                System.out.println("Before you try again.");
                loopSwitchEngOn = false;  
                
            } else{
                System.out.println("You punched the fuel gauge... Are you "
                        + "okay?");
                System.out.println("Please press 1 to turn APU on.");
                loopSwitchEngOn = true;
            } // close if/else block 
        }while(loopSwitchEngOn == true); // close do/while block
        
    
    } // close enginesOn method    
    
    /**
     * Simulate actuating landing gear when called
     * @throws InterruptedException
     */
    public static void landingGear()throws InterruptedException{
        do{   
            System.out.println("Press one to actuate the landing gear.");
            int response = scanLG.nextInt();
            if(response == 1){
                System.out.println("PRRRRSHHHHHH");
                Thread.sleep(2000);
                landingGearUp = !landingGearUp;
                System.out.println("Landing gear actuated.");
                loopSwitchLG = false;
            } else{
                System.out.println("That wasn't a choice. Try again.");
                loopSwitchLG = true;
            } // close if/else block
            
        }while(loopSwitchLG == true);    
    } // close landingGear method
    
    /**
     * Simulate fuel used
     * @throws InterruptedException
     */
    public static void fuelCounter()throws InterruptedException{        
        if(aPUGenOn == true){
            fuelCount = fuelCount - 50;
        } // close if block
        if(enginesOn == true){
            fuelCount = fuelCount - 500;
        } // close if block        
        if(landingGearUp == false && wOWSwitch == false){
            fuelCount = fuelCount - 50;
        } // close if block
        System.out.println("Fuel load: " + fuelCount);
        if(fuelCount <= 2000 && wOWSwitch == false){
            System.out.println("Your fuel is low. I recommend aerial refuel.");
            Thread.sleep(3000);
        } // close if block
        if(fuelCount <= 0 && wOWSwitch == false){
            System.out.println("You're out of fuel. Crash immenent.");
            Thread.sleep(3000);
            System.out.println("*BOOOOOM*");
            Thread.sleep(3000);
            System.out.println("Reverting to a full tank of gas. Don't mess it"
                    + " up again!");
            fuelCount = 11000;
        } // close if block
    
    } // close fuelCounter method    
    
    
    /**
     * reset aircraft's status
     * @throws InterruptedException
     */
    public static void reset()throws InterruptedException{        
        do{            
            System.out.println("Press 1 to power down the aircraft.");
            int response = scanReset.nextInt();
            if(response == 1){
                extBattSwitchOn = false;
                intBattSwitchOn = false;
                inverterSwitchOn = false;
                mainPumpSwitchOn = false;
                wingPumpSwitchOn = false;
                aPUGenOn = false;
                enginesOn = false;
                fuelCount = 11000;
                System.out.println("*VROOOOOSH*");
                Thread.sleep(2000);
                System.out.println("Aircraft is off.");
                loopSwitchR = false;
            }else{
                System.out.println("You kicked the side panel. Please stop "
                        + "goofing off.");
                loopSwitchR = true;
            } // close if/else block
        }while(loopSwitchR == true);     
    } // close reset method
    
    /**
     * Display aircraft status Positions
     */
    public static void displayAircraftStatus(){
        System.out.println("");        
        System.out.println("Landing gear up: " + landingGearUp);
        System.out.println("Permission to land: " + landGranted);
        System.out.println("");    
    } // close displaySwitchStatusStartUp method
    
    /**
     * Display Switch Positions
     */
    public static void displaySwitchStatusStartUp(){
        System.out.println("");
        System.out.println("External battery switch on: " + extBattSwitchOn);
        System.out.println("Internal battery switch on: " + intBattSwitchOn);
        System.out.println("Inverter switch on: " + inverterSwitchOn);
        System.out.println("Auxiliary power on: " + aPUGenOn);
        System.out.println("Main fuel pumps on: " + mainPumpSwitchOn);
        System.out.println("Wing fuel pumps on: " + wingPumpSwitchOn);
        System.out.println("Engines on: " + enginesOn);
        System.out.println("permission for takeoff granted: " + takeoffGranted);        
        System.out.println("");   
    } // close displaySwitchStatusStartUp method   
    
    /**
     * Simulate communications for takeoff
     * @throws InterruptedException
     */
    public static void commTakeoff() throws InterruptedException{
        do{
            System.out.println("Please enter first phrase for proper "
                    + "communication to tower.");
            String response3 = scanCommT1.nextLine();
            if(response3.equals("Tower, aircraft 202.")){
                Thread.sleep(1000);
                System.out.println("Go for Tower.");
                loopSwitchCommT1 = false;
            }else{
                System.out.println("*Static*"); 
                Thread.sleep(1000);
                System.out.println("You did not enter the correct phrase.");
                System.out.println("Please consult the flight manual and try "
                        + "again.");
                flightManualArray();                        
            } // close if/else block
        }while(loopSwitchCommT1 == true); // close do/while block
        
        do{
            System.out.println("Please enter second phrase for proper "
                    + "communication to tower.");
            String response4 = scanCommT2.nextLine();
            if(response4.equals("Requesting permission for takeoff on runway 2,"
                    + " over.")){
                System.out.println("Aircraft 202 requesting permission for"
                        + " takeoff on runway 2.");
                Thread.sleep(1000);
                System.out.println("Aircraft 202, proceed to takeoff, over.");
                takeoffGranted = true;
                loopSwitchCommT2 = false;
            }else{
                System.out.println("*Static*");
                Thread.sleep(1000);
                System.out.println("You did not enter the correct phrase.");
                System.out.println("Please consult the flight manual and try "
                        + "again.");
                flightManualArray();               
            } // close if/else block    
        }while(loopSwitchCommT2 == true); // close do/while block 
    } // close commTakeoff method
    
    /**
     * Simulate communications for landing     * 
     * @throws InterruptedException
     */
    public static void commLanding() throws InterruptedException{
        do{       
            System.out.println("Please enter first phrase for proper "
                    + "communication to tower.");
            String response1 = scanCommL1.nextLine();
            if(response1.equals("Tower, aircraft 202.")){
                Thread.sleep(1000);                    
                System.out.println("Go for Tower.");
                loopSwitchCommL1 = false;
                    
            }else{
                System.out.println("*Static*");
                Thread.sleep(1000);
                System.out.println("You did not enter the correct phrase.");
                System.out.println("Please consult the flight manual and "
                        + "try again.");
                flightManualArray();                       
            } // close if/else block                
        }while(loopSwitchCommL1 == true); // close do/while block
            
        do{
            System.out.println("Please enter second phrase for proper "
                    + "communication to tower.");
            String response2 = scanCommL2.nextLine();
            if(response2.equals("Requesting permission to land on runway 2,"
                    + " over.")){
                System.out.println("Aircraft 202 requesting permission to"
                        + " land on runway 2.");
                Thread.sleep(1000);
                System.out.println("Aircraft 202, proceed to land, over.");
                landGranted = true;
                System.out.println("*SKKKKKKKKKKKKRRRRRRRRR*");
                Thread.sleep(2000);
                wOWSwitch = true;
                System.out.println("You are now on the ground!");
                loopSwitchCommL2 = false;
                    
            }else{
                System.out.println("*Static*");
                Thread.sleep(1000);
                System.out.println("You did not enter the correct phrase.");
                System.out.println("Please consult the flight manual and"
                        + " try again.");
                flightManualArray();                     
            } // close if/else block    
        }while(loopSwitchCommL2 == true); // close do/while block
        
    
    } // close commLanding method   
    
    /**
     * Simulate communications for in-flight refuel
     * @throws InterruptedException
     */
    public static void commAR()throws InterruptedException{ 
            
            do{       
                System.out.println("Please enter first phrase for proper "
                        + "communication to the refueler.");
                String responseAR1 = scanCommAR1.nextLine();
                if(responseAR1.equals("Aircraft 1508, aircraft 202.")){
                    Thread.sleep(1000);
                    System.out.println("Go for aircraft 1508.");
                    loopSwitchCommAR1 = false;
                    
                }else{
                    System.out.println("*Static*");
                    Thread.sleep(1000);
                    System.out.println("You did not enter the correct phrase.");
                    System.out.println("Please consult the flight manual and "
                            + "try again.");
                    flightManualArray();
                                            
                } // close if/else block
            }while(loopSwitchCommAR1 == true); // close do/while block
            
            do{                 
                System.out.println("Please enter second phrase for proper "
                        + "communication to the refueler.");
                String responseAR2 = scanCommAR2.nextLine();
                if(responseAR2.equals("Requesting fuel, over.")){
                    Thread.sleep(1000);
                    System.out.println("Aircraft 202 requesting fuel.");
                    System.out.println("Aircraft 202, proceed to refuel "
                            + "nozzle.");
                    loopSwitchCommAR2 = false;
                    
                }else{
                    System.out.println("*Static*");
                    Thread.sleep(1000);
                    System.out.println("You did not enter the correct phrase.");
                    System.out.println("Please consult the flight manual and "
                            + "try again.");
                    flightManualArray();
                    // call flight manual array   
                } // close if/else block 
                System.out.println("PSSSHHSHHSHSH");
                Thread.sleep(3000);
                fuelCount = 11000;
                System.out.println("Aircraft refueled to " + fuelCount + " "
                        + "lbs.");
            }while(loopSwitchCommAR2 == true); // close do/while block            
    } // close commSystems method
} // close AircraftOperations class

