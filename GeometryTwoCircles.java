/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import static java.lang.StrictMath.abs;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

/**
 *
 * @author lewey
 */
public class GeometryTwoCircles {
    public static void main(String[] booyah){
        
        // declare varaibles, but don't assign values
        double centerX1;
        
        double centerY1;
        
        double centerX2;
        
        double centerY2;
        
        double circleRadius1;
        
        double circleRadius2;
        
        boolean loop = true;
        // set do for a loop cycle at the end of the program
        do{
        // prompt user to input values and assign values to variables
        System.out.println("Please enter the center coordinate of X1 and press enter.");
        Scanner pointX1 = new Scanner(System.in);
        centerX1 = pointX1.nextDouble();       
        
        System.out.println("Please enter the center coordinate of Y1 and press enter.");
        Scanner pointY1 = new Scanner(System.in);        
        centerY1 = pointY1.nextDouble();
        
        System.out.println("Please enter the radius of Circle 1 and press enter.");
        Scanner radius1 = new Scanner(System.in);        
        circleRadius1 = radius1.nextDouble();
        
        System.out.println("Please enter the center coordinate of X2 and press enter.");
        Scanner pointX2 = new Scanner(System.in);
        centerX2 = pointX2.nextDouble();
        
        System.out.println("Please enter the center coordinate of Y2 and press enter.");
        Scanner pointY2 = new Scanner(System.in);
        centerY2 = pointY2.nextDouble();
        
        System.out.println("Please enter the radius of Circle 2 and press enter.");
        Scanner radius2 = new Scanner(System.in);
        circleRadius2 = radius2.nextDouble();
        
        // assign variables for easy input to main equation
        double radiusDifference = abs(circleRadius1 - circleRadius2);
        
        double radiusSum = circleRadius1 + circleRadius2;
        
        double xDifference = (centerX2 - centerX1);
                
        double yDifference = centerY2 - centerY1;       
        
        double distance = sqrt(abs((Math.pow(xDifference, 2)+(Math.pow(yDifference, 2)))));
        // print data entered to user for double check
        System.out.println("Data entered: ");
        System.out.println("X1 = " + centerX1);
        System.out.println("Y1 = " + centerY1);
        System.out.println("X2 = " + centerX2);
        System.out.println("Y2 = " + centerY2);
        System.out.println("Radius 1 = " + circleRadius1);
        System.out.println("Radius 2 = " + circleRadius2);
        System.out.println("Distance = " + distance);
        
        // compare data
        if(distance <= radiusDifference){
            System.out.println("Circle 2 is inside circle 1.");
        }else if(distance <= radiusSum){
            System.out.println("Circle 2 overlaps circle 1.");
        }else{
            System.out.println("Circle 2 is outside circle 1.");
        } // close else/if combo
        
        // prompt user to see if they would like to keep the program looping
        System.out.println("Would you like to check another set of cirlces? "
                + "Please press 1 for yes and any other number for no and "
                + "press enter.");
        Scanner response = new Scanner(System.in);
        int loopCheck;
        loopCheck = response.nextInt();
        // compate users response
        if(loopCheck == 1){
            loop = loop;
        } else{
            loop = !loop;
        } // close if/else block  
        
        // set while to loop depending on the true or false value for loop
        } while(loop == true); // close while/do block
        
        // print to user goodbye message
        System.out.println("Thanks for checking!");
        
    } // close main method       
} // close class GeometryTwoCircles
    

