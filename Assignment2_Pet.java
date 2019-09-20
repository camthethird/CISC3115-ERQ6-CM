import java.io.IOException;
import java.util.Scanner;

/* 
Clifton McDonald 
Brooklyn College 
CISC. 3115 - ERQ6
Assignment 2 - Part 1: Pet Class
*/ 

public class Pet{

    private String name, animal;
    private double age;


    // Set Name
    public void setName(String name) {
        this.name = name;
        }

    // Set animal
        public void setAnimal(String animal) {
        this.animal = animal;
        }

    // Set Age
        public void setAge(double age) {
        this.age = age;    
        }

    // Get Pet Name
        public String getName() {
        return name;
        }

     // Get Animal
        public String getAnimal() {
        return animal;
        }

    // Get Age
        public double getAge() {
        return age;
        }

        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            Pet p = new Pet();    
            try{
                System.out.println("Please enter your pets name: ");
                p.setName(sc.nextLine());
                System.out.println("Please enter the kind of animal your pet is: ");
                p.setAnimal(sc.nextLine());
                System.out.println("Please enter your pets age: ");
                p.setAge(sc.nextDouble());
            } catch(Exception e){ System.out.println("I/O Exception");}
        
        
            System.out.println("Your pet's name is: " + p.getName());
            System.out.println(p.getName() + " is a " + p.getAnimal());
            System.out.println(p.getName() + " is " + p.getAge() + " years old");
        
            sc.close();
        
            }  

}// close Pet Class
   
