/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Assignmet 3 - Part 1 : "Fruit Class"    \    
--------------------------------------  /
*/

import java.util.*;
import java.lang.*;
import java.lang.Throwable;


class Fruit {

    //Attributes
   protected String name = "fruit";
   protected String taste = "taste"; 
   protected double size = 0; 


    public void eat(){
            System.out.println("Fruit: " + name);
            System.out.println("Taste: " + taste);
            System.out.println("Size: " + size);
            System.out.println("You're eating an " + name + " that tastes " + taste + ".");
             
     }
 

}// Closes Fruit Class

    //Apple ext.
    class Apple extends Fruit {
        
        public Apple(){
            name = "Apple";
            taste = "Sweet";
            size = 2;

        }

    } //Closes Apple ext. 

    //Orange ext. 
    class Orange extends Fruit {

        public Orange(){

            name = "Orange";
            taste = "Tangy";
            size = 1;

        }

        
    }//Closes Orange ext. 


    //Main Class/ Fruit Driver
public class Main {   
    public static void main(String[] args) throws IllegalArgumentException {
        
        Apple redApple = new Apple();
        redApple.eat();
    
        
        Orange jaffaOrange = new Orange();
        jaffaOrange.eat();
        
    
    }
 } 
