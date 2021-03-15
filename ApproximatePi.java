/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author lewey
 */
public class ApproximatePi {
    public static void main(String [] booyakasha){
        System.out.println("What's Pi folks?");
        // assign variables
        double variable1 = 4.0;
        
        double variable2 = 1.0;
        
        double variable3 = (-1.0/3.0);
        
        double variable4 = (1.0/5.0);
        
        double variable5 = (-1.0/7.0);
        
        double variable6 = (1.0/9.0);
        
        double variable7 = (-1.0/11.0);
        
        double variable8 = (1.0/13.0);
        // multiply first factor by the sum of the variables
        double pi1 = (variable1) * 
                (variable2 + variable3 + variable4 + variable5 
                + variable6 + variable7);
        double pi2 = (variable1) * 
                (variable2 + variable3 + variable4 + variable5 
                + variable6 + variable7 + variable8);
        // print the pi approximations to user
        System.out.println("The approximate of Pi equals: " + pi1);
        System.out.println("The approximate of Pi equals: " + pi2);        
    } // close main method
} // close class ApproximatePi
