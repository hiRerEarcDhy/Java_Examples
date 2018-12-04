/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_5;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author RED
 */
public class stackGeneric <Integer>
{
    public ArrayList<Integer> numbers;
    
    public stackGeneric()
    {
        numbers = new ArrayList<Integer>();
    }

    
    //Add integer element
    public void push(Integer x)
    {
        numbers.add(x);
    }
    
    //Remove integer element
    public Integer pop()      
    {
        if (!isEmpty())
 			return numbers.remove(numbers.size()-1);
 		else
 			throw new EmptyStackException();
    }
    
    
    public int getSize()
    {
        return numbers.size();
    }
    
    //Gets integer on top of stack
    public Integer peek()
    {
        if (!isEmpty())
        {
            return numbers.get(numbers.size()-1);
        }
 	else
        {
            throw new EmptyStackException();
        }
    }
    
    //Checks if stack is empty
    public boolean isEmpty() 
    {
 	return (numbers.size() == 0);
    }
    
    @Override
	public String toString() {
		return "Generic Stack [Numbers = " + numbers.toString() + "]";
 
 	}
    
}
