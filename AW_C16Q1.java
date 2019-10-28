/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Recursion Practice                      \
Algorithm Workbench | CH16 Q1           /
Gaddis 6th Edition                      \    
--------------------------------------  /
*/


/* Write a method that accepts a String as an argument. The method should use recursion
to display each individual character in the String */

import java.util.*;
import java.lang.*;


class AW_C16Q1{ 

    public static void readin(String input){

        if(input.length() == 0){ return;} 
            else { 
                    System.out.println(input.charAt(0));
                    readin(input.substring(1));
                }
    }//Closes readup method

        public static void main(String[] args) {
            
            readin("Howdy, Partner!");

        }// End Main. 
    
}/* End Class */ 


