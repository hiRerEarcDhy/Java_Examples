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
public class arrStackApp 
{
   public static void main(String[] args) {

        arrStack stack = new arrStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        
        System.out.print(stack);
        
        
        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    } 
    
    
}
