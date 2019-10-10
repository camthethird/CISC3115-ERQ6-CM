/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Assignmet 3 - Part 2 : "Shape Class"    \    
--------------------------------------  /
*/


class Shape{

    protected String shape = "shape";

    public void draw(){

        System.out.println("Drawing " + shape);

    }

    public void erase(){

        System.out.println("Erasing " + shape);

    }

} /* Close Shape Class */

    /* Shapes Subclasses */ 
    class Circle extends Shape{

        public Circle(){
            shape = "Circle";
        }

    }/* Closes Circle ext. */


    class Triangle extends Shape{

        public Triangle(){
            shape = "Triangle";
        }
    }

    class Square extends Shape{

        public Square(){
            shape = "Square";
        }

    }

        /*ShapeDemo Class / Main */
        public class ShapeDemo {

            public static void main(String[] args){

                Shape c = new Circle();
                c.draw();
                c.erase();

                Shape t = new Triangle();
                t.draw();
                t.erase();

                Shape s = new Square();
                s.draw();
                s.erase();

            }

        }/* Main (ShapeDemoClass) */