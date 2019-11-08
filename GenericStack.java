/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Lab Exercise - 11/7/19                  \
Part 1                                  /    
--------------------------------------  \
*/

import java.util.*;

public class GenericStack<Animals> {

    private LinkedList<Animals> stack;

    public GenericStack(){

        stack = new LinkedList<Animals>();

    }


    public void push(Animals e) { 
        
        System.out.println("Push: " + e); 

        stack.addLast(e);
    
    }

    public Animals pop(){ 

        if(stack.size() == 0 ){ 
            return null;
        } else { return stack.removeLast(); }

    }


    public Animals peek() {

        if(stack.size() == 0 ) { 
            return null;
        } else { return stack.getLast(); }
     }


    public int size() { 

        return stack.size();

    }

} /* Closes GenStack */ 

