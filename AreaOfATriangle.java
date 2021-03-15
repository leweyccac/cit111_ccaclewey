/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;


import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

/**
 *
 * @author lewey
 */
public class AreaOfATriangle {
    public static void main(String [] booyakasha){
        //assign ints without declaring them
        double firstPoint;
        
        double secondPoint;
        
        double thirdPoint;
        
        double fourthPoint;
        
        double fifthPoint;
        
        double sixthPoint;
        // print to user to input values
        System.out.println("Please enter the value of X1.");
        
        Scanner point1 = new Scanner(System.in);
        
        firstPoint = point1.nextDouble();
        
        System.out.println("Please enter the value of Y1.");
        
        Scanner point2 = new Scanner(System.in);
        
        secondPoint = point2.nextDouble();
        
        System.out.println("Please enter the value of X2.");
        
        Scanner point3 = new Scanner(System.in);
        
        thirdPoint = point3.nextDouble();
        
        System.out.println("Please enter the value of Y2.");
        
        Scanner point4 = new Scanner(System.in);
        
        fourthPoint = point4.nextDouble();
        
        System.out.println("Please enter the value of X3.");
        
        Scanner point5 = new Scanner(System.in);
        
        fifthPoint = point5.nextDouble();
        
        System.out.println("Please enter the value of Y3.");
        
        Scanner point6 = new Scanner(System.in);
        
        sixthPoint = point6.nextDouble();
        // calculate s to find area
        double s = (firstPoint + secondPoint + thirdPoint + 
                fourthPoint + fifthPoint + sixthPoint) / (2);        
        // calculate portion of area with absolute value to prevent imaginary numbers
        double areaPortion = abs(s * (s - (firstPoint + secondPoint)) * 
                (s - (thirdPoint + fourthPoint)) * 
                (s - (fifthPoint + sixthPoint)));
        // calculate area
        double area = sqrt(areaPortion);
        // print to user the value of s
        System.out.println("Sum of the points divided by 2 : " + s);
        // print to user the value of the traingle's area
        System.out.println("Area of traingle: " + area);
    } // close main method
} // close class AreaOfATraingle
