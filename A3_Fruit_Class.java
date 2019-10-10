/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Assignmet 3 - Part 1 : "Fruit Class"    \    
--------------------------------------  /
*/

/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Assignmet 3 - Part 1 : "Fruit Class"    \    
--------------------------------------  /
*/

//import java.util.*;

class Fruit {

    //Attributes
   protected String name = "fruit";
   protected String taste = "taste"; 
   protected String size = "size"; 

    public void eat(){

            System.out.println("Fruit: " + name);
            System.out.println("Taste: " + taste);
            System.out.println("You're eating an " + name + " that tastes " + taste + "."); 
     }
     
}// Closes Fruit Class

    //Apple ext.
    class Apple extends Fruit {
        
        public Apple(){
            name = "Apple";
            taste = "Sweet";
            size = "big";
        }

    } //Closes Apple ext. 

    //Orange ext. 
    class Orange extends Fruit {

        public Orange(){

            name = "Orange";
            taste = "Tangy";
            size = "small";

        }

        
    }//Closes Orange ext. 


    //Main Class/ Fruit Driver
public class Main {   
    public static void main(String[] args) {
        Apple redApple = new Apple();
        redApple.eat();
      

        Orange jaffaOrange = new Orange();
        jaffaOrange.eat();
      
    }
 } 
