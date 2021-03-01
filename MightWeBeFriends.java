/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mightWeBeFriends;

import java.util.Scanner;

/**
 * // Might We Be Friends Project. Chunk 1 Project
 * @author Lewey
 */
public class MightWeBeFriends {
    public static void main(String [] booyakasha){
        // create storage containers (variables)
        int compScore = 60;
        final int COMPATIBILITY_THRESHOLD = 100;
        int response = 0;
        Scanner userInterface = new Scanner(System.in);
        boolean passedThreshold = false; // not used in v.0
        
        // fixed point allotments by question
        final int Q_YES_POINTS = 30;
        final int Q_NO_POINTS = -30;
        
        // create Scanner
        userInterface = new Scanner(System.in);
        // greet user
        System.out.println("Hello, I'm Lewey. Lets see "
                + "if we might be friends.");
        System.out.println("Please answer the following "
                + "questions truthfully!");
        
        // ********************************
        // ****QUESTION 1: Facing fears****
        // ********************************
        
        System.out.println("Do you enjoy facing your fears?"
                + " Enter 1 for yes or any other number for no.");
        response = userInterface.nextInt();
        
        if(response == 1){
            // this block will contain nested logic only run if user
            // is a dare devil
            // add 30 to compScore
            compScore = compScore + Q_YES_POINTS;
            System.out.println("Awesome, me too! Lets go bungie jumping!");            
            System.out.println("Compact score increased to " 
                    + compScore + " points!");
             
            // *****************************
            // ****QUESTION 2: Crazy Level**
            // *****************************
            
            System.out.println("What's your level of crazy? "
                    + "Enter number 1-5 and press enter.");
            System.out.println("1 - Insane in the membrane!");
            System.out.println("2 - Insane!");
            System.out.println("3 - Pretty Insane.");
            System.out.println("4 - Risky.");
            System.out.println("5 - Pretty Risky.");
            
            // allow user input
            response  = userInterface.nextInt(); 
            // switch statement for multiple variables
            switch (response) {
                case 1:
                    // Insane in the membrane!
                    compScore = compScore + 50;
                    System.out.println("Oh yeah! Let's go to space!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                case 2:
                    // Insane!
                    compScore = compScore + 40;
                    System.out.println("Excellent! "
                            + "Let's go scuba diving with some hungry sharks!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                case 3:
                    // Pretty Insane.
                    compScore = compScore + 30;
                    System.out.println("Nice! Let's go wing suiting!");
                    System.out.println("Compact "
                            + "score increased to " + compScore + " points!");
                    break;
                case 4:
                    // Risky.
                    compScore = compScore + 20;
                    System.out.println("Pretty good! Let's go cliff diving!");
                    System.out.println("Compact score"
                            + " increased to " + compScore + " points!");
                    break;
                default:
                    // Pretty Risky.
                    compScore= compScore + 10;
                    System.out.println("Not bad. Let's go skiing!");                    
                    System.out.println("Compact score"
                            + " increased to " + compScore + " points!");
                    break;                       
            } // end chained ifs for q2            
        } else { // this block runs if user entered not 1
                compScore = compScore + Q_NO_POINTS;
                System.out.println("Life is too short to "
                        + "worry about silly fears.");
                System.out.println("Compact score reduced to " + compScore + " points.");
                
                // *****************************
                // ****QUESTION 3: Redemtion****
                // *****************************
            
                // add a redemtion question
                System.out.println("POINT REDEMTION!" );
                System.out.println("Do you like to go fishing?"
                        + " Enter 1 for yes or any other number for no. " );
                // allow user input
                response = userInterface.nextInt();
                // compare answer for 1 
                if(response == 1){
                    compScore = compScore + Q_YES_POINTS;
                System.out.println("Points redeemed! You're back at " 
                        + compScore + " points!");
                }else{
                    compScore = compScore;
                    System.out.println("It's not looking so good. "
                            + "You're score is "
                            + "still at " + compScore + " points.");
                } // close redemtion if/else                       
        } // close Q1 if/else/switch chain
        
        // ********************************
        // ****QUESTION 4: Roller Coasters*
        // ********************************
         
        // print question to user
        System.out.println("Do you enjoy the craziest of roller coasters? "
                + " Enter 1 for yes or any other number for no.");
        // allow user input
        response = userInterface.nextInt();
        // compare users response
        if(response == 1){
            compScore = compScore + Q_YES_POINTS;
            System.out.println("Sweet! Let's go to "
                    + "the nearest amusement park! Points increased to " 
                    + compScore + " points!");            
        } else{
            compScore = compScore + Q_NO_POINTS;
            System.out.println("Ouch, that score took a hit! Score reduced to " 
                    + compScore + " points.");            
        } // end question 4 if/else blocks
        
        // *****************************
        // ****QUESTION 5: Travel*******
        // *****************************
        
        //print question to user
        System.out.println("Do you like to travel? "
                + "Enter 1 for yes or any other number for no.");
        // allow users response 
        response = userInterface.nextInt();
        // compare answer 
        if(response == 1){
            // add points to compScore
            compScore = compScore + Q_YES_POINTS;            
            System.out.println("Oh yeah! Where's the nearest airport!");
            System.out.println("Compact Score increased to " 
                    + compScore + " points!" );
            
            // *********************************
            // ****QUESTION 6:Place of interest*
            // *********************************
            
            // print question to user
            System.out.println("Out of the choices, "
                    + "where would do you prefer to go? "
                    + "Enter number 1-5 and press enter. ");
            System.out.println("1 - Portugal");
            System.out.println("2 - Spain");
            System.out.println("3 - Greece");
            System.out.println("4 - Italy");
            System.out.println("5 - Germany");
            // allow user input
            response = userInterface.nextInt();
            // switch multi question answer
            switch (response){
                case 1: 
                    // Portugal
                    compScore = compScore + 50;
                    System.out.println("Perfect! I know where all "
                            + "the good stuff is!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                case 2: 
                    // Spain
                    compScore = compScore + 40;
                    System.out.println("Awesome! Stick with me, "
                            + "I have a bar in mind!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                case 3: 
                    // Greece
                    compScore = compScore + 30;
                    System.out.println("Sweet! "
                            + "I know where we can get the most delicious food!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                case 4: 
                    // Italy
                    compScore = compScore + 30;
                    System.out.println("Excellent! "
                            + "The pizza is okay, but the pasta is amazing!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
                default: 
                    // Germany
                    compScore = compScore + 30;
                    System.out.println("Sounds good! "
                            + "I know where they serve 2 litre mugs of beers!");
                    System.out.println("Compact score "
                            + "increased to " + compScore + " points!");
                    break;
            } // end chained ifs for question 6
        } else{ // this block runs if user entered not 1
                compScore = compScore + Q_NO_POINTS;
                System.out.println("You need to get out more! "
                    + "There's more to this world other than Pittsburgh!");
                System.out.println("Compact score "
                            + "reduced to " + compScore + " points.");
                    
                // *****************************
                // ****QUESTION 7: Redemtion****
                // *****************************
                
                // add a redemtion question
                System.out.println("POINT REDEMTION!" );
                System.out.println("Do you like to go rock climbing?"
                        + " Enter 1 for yes or any other number for no. " );
                // allow user input
                response = userInterface.nextInt();
                // compare answer for 1 
                if(response == 1){
                    compScore = compScore + Q_YES_POINTS;
                System.out.println("Points redeemed! You're back at " 
                        + compScore + " points!");
                }else{
                    compScore = compScore;
                    System.out.println("Oh no! Well I hope "
                            + "your score can take the loss."
                            + "You're score is "
                            + "still at " + compScore + " points.");                    
                    } // close redemtion if/else blocks
        } // close if/else blocks    
        System.out.println("***Checking Compatibility***");
        // compare user input
        if(compScore >= COMPATIBILITY_THRESHOLD){
             passedThreshold= !passedThreshold;
            System.out.println("Final compatability score: " + compScore + 
                    " Compatibility: " + passedThreshold + 
                    ". You passed! Let's go grab a beer!");
        }else{
            System.out.println("Final compatability score: " + compScore + 
                    " Compatibility: " + passedThreshold +  
                    ". Sorry! Looks like we're not compatible. "
                    + "Thanks for Playing!");
        } // close if/else blocks       
    } // close main method
} // close class MightWeBeFriends
