/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah. Chunk 1 Module 3 mini-proj
 * @author Lewey
 */
public class RoadTrip {
    public static void main(String [] args) {
        // Declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;       
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;         
        
        double legDistance; // declaring this variable but not initializing
                
        // simulation of roadtrip
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " passenger");
        System.out.println("Destination reached? " + destinationReached); 
        
        // print leg 1
        System.out.println("***Leg 1***");
        // Calculate leg distance: 25% of total trip, store in legDistance
        double legDistance1 = distanceToMoabUtah * 0.25;
        System.out.println("Leg distance: " + legDistance1);       
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance1;        
        // subtract leg distance from  distanceTo destination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance1;       
        // "see" hitch hiker heading West
        System.out.println("Look! There's a hitch hiker heading the same way!");        
        // check if ther is room in the car, if so, pick up the hitch hiker
        if (carFull == false) {
            System.out.println("Car is not full! Picking up the hitch hiker!");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;           
        } // close if()
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg1 = (legDistance1 / 39) * 2.400;        
        // deduct $ spent on gas from money remaining and over-write tripBudget
        tripBudget = tripBudget - gasPriceForLeg1;
        //Print gasPriceForLeg1
        System.out.println("Leg 1 gas price: " + gasPriceForLeg1);
        
        // print stats for leg 1
        System.out.println("***Stats of Leg 1***");
        // print how many more miles to go 
        System.out.println("Remainder Distance: " + distanceToMoabUtah);
        // state whether the car is full or not and the current odometer reading
        System.out.println("Full car? " + carFull + "; Current odometer " + tripOdometer);        
        // print how much money is still remaining 
        System.out.println("I have " + tripBudget + " to spend on this trip");
        // print how many passengers are in the vehicle
        System.out.println("How many passengers are in the car: " + currentNumberOfPassengers);
        // print if the destination has been reached or not
        System.out.println("Destination reached? " + destinationReached);
        
        // print leg 2
        System.out.println("***Leg 2***");
        // add 500 miles to the first leg distance        
        double legDistance2 = 500 + legDistance1;
        // print legDistance2
        System.out.println("Leg distance: " + legDistance2);
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance2;        
        // "see" 2 more hitch hikers and try to pick them up 
        System.out.println("Look! Another two hitch hikers!");
        // check if there is room in the car, if so, pick up the hitch hikers
        if (carFull == false) {            
            System.out.println("Car still has space! come on in!");
            //over-write current number of passengers if car can fit 2
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        } // close if ()
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg2 = (legDistance2 / 39) * 2.400;
        // deduct $ spent on gas from money remaining and over-write tripBudget
        tripBudget = tripBudget - gasPriceForLeg2;
        // print gasPriceForLeg2
        System.out.println("Leg 2 gas price: " + gasPriceForLeg2);
        
        // print leg 2 stats
        System.out.println("***Stats of Leg 2***");
        // over-write distanceToMoabUtah with current legDistance
        distanceToMoabUtah = distanceToMoabUtah - legDistance2;
        // print distanceToMoabUtah
        System.out.println("Remaining Distance: " + distanceToMoabUtah);
        // print carFull and tripOdometer
        System.out.println("Full car: " + carFull + "; Current odomter " + tripOdometer);        
        // print tripBudget         
        System.out.println("I have " + tripBudget + " to spend on this trip");
        // print current number of passengers
        System.out.println("How many passengers are in the car: " + currentNumberOfPassengers);
        // print destinationReached
        System.out.println("Destination reached? " + destinationReached);
        
        // print leg 3
        System.out.println("***Leg 3***");
        // calculate legDistance 
        double legDistance3 = distanceToMoabUtah;
        // print legDistance3
        System.out.println("Leg distance: " + legDistance3);
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance3;        
        // "see" 2 more hitch hikers and try to pick them up
        System.out.println("Oh look! 2 more hitch hikers!");
        // set boolean of carFull to true if currentNumberOfPassengers equals 5  
        if(currentNumberOfPassengers == 5){
            carFull = true;
        } // close if()
        // check if ther is room in the car, if so, pick up the hitch hikers
        if(carFull == false){                            
            System.out.println("Sorry, only room for 1 more!");
        } // close if()
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg3 = (legDistance3 / 39) * 2.400;
        // deduct $ spent on gas from money remaining and over-write tripBudget
        tripBudget = tripBudget - gasPriceForLeg3;
        // print gasPriceForLeg3
        System.out.println("Leg 3 gas price: " + gasPriceForLeg3);      
        
        // print leg 3 stats
        System.out.println("***Stats of Leg 3***");
        // over-write distanceToMoabUtah with current legDistance
        distanceToMoabUtah = distanceToMoabUtah - legDistance3;
        // print distanceToMoabUtah
        System.out.println("Remaining Distance: " + distanceToMoabUtah);
        // set boolean for distanceToMoabUtah to true if trip is complete
        if(distanceToMoabUtah == 0.0){
            destinationReached = true;
        } //close if ()
        // print carFull and tripOdometer
        System.out.println("Full car: " + carFull + "; Current odomter " + tripOdometer);        
        // print tripBudget         
        System.out.println("I have " + tripBudget + " to spend on this trip");
        // print current number of passengers
        System.out.println("How many passengers are in the car: " + currentNumberOfPassengers);        
        // print destinationReached
        System.out.println("Destination reached? " + destinationReached);   
    } // close main method    
} // close class RoadTrip
