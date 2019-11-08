/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Lab Exercise - 11/7/19                  \
Part 2                                  /    
--------------------------------------  \
*/ 
    
    
    public class GenericStackApp{

        public static void main(String[] args) {
         
            GenericStack<String> stack = new GenericStack<>();

            stack.push("Cat");
            stack.push("Dog");
            stack.push("Rabbit");

            System.out.println(stack.size() + " items in the stack");

            System.out.println("Peek: " + stack.peek());
            System.out.println(stack.size() + " items in the stack");

            System.out.println("Pop: " + stack.pop()); 
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());

            System.out.println(stack.size() + " items in the stack");

        }


    }