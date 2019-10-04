/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Assignmet 3 - Part 1 : "Fruit Class"    \    
--------------------------------------  /
*/

class Fruit {

    //Attributes
   protected String name = "";
   protected String taste = ""; 
   protected String size = ""; 


    static void eat(){

       //filler
       System.out.println("Delicious!");
        
    }
}// Closes Fruit Class

    //Apple ext.
    class Apple extends Fruit {

         private String name = "Apple";

             public static void main(String[] args){

            //filler
    
            }


    } //Closes Apple ext. 

    //Orange ext. 
    class Orange extends Fruit {

        private String name = "Orange";

        
    }//Closes Orange ext. 

