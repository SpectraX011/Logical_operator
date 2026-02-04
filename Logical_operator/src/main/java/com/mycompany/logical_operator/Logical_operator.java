/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logical_operator;

/**
 *
 * @author Nullroot 13
 */
public class Logical_operator {

    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        
        double temp = 35;
        boolean isSunny = false;
        
        //&&
        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is Good😒");        
            System.out.println("It is Sunny outside😍");
        
        }// ! not 
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is Good");
            System.out.println("It is Cloudy outside");
        
        
        }// || or
        else if(temp > 30 || temp < 0 ){
            System.out.println("The weather is bad ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
}
