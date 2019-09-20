/* 
Clifton McDonald 
Brooklyn College 
CISC. 3115 - ERQ6
Assignment 2 - Part 1: Pet Class
*/ 


class Pet{

    private String name;
    private String animal;
    private double age;


    // Set Pet Name
    public void setName(String petName) {
        name = petName;
        }

    // Set animal
        public void setAnimal(String animalName) {
        animal = animalName;
        }

    // Set Age
        public void setAge(double petAge) {
        age = petAge;    
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
        
        }    

} //Close Pet Class   
