/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_5;



/**
 *
 * @author RED
 */
public class genericStackApp 
{
    public static void main (String [] args)
    {
        stackGeneric numberStack = new stackGeneric();
        
        //adding to stack
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(4);
        
        System.out.println(numberStack);
        
        //removing from stack
        numberStack.pop();
        
        System.out.println(numberStack);
        
        //getting top element
        System.out.println("Number stack top element = " + numberStack.peek());
        
        //number of elements in stack
        System.out.println("Number stack size = " + numberStack.getSize());
        
        //determines if stack is empty
        System.out.println("Number stack empty = " + numberStack.isEmpty());
    }
    
     
    
 
}
