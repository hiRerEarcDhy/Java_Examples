/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question_6;

public class SumProduct_Calculator implements Runnable
{
    private int input;

    public SumProduct_Calculator(int input)
    {
        this.input = input;
    }

    public int getInput()
    {
        return input;
    }

    public void setInput(int input)
    {
        this.input = input;
    }

    @Override
    public void run()
    {
        //sum must start at 0 for addition
        int SUM = 0;
        //product must start at 1 for multiplication
        int PRODUCT = 1;
        
        //SUM calculation
        for(int i = 0; i <= input; i++)
        {
            SUM += i;
        }
        System.out.println("Sum : " + SUM);
        
        //PRODUCT calculation
        for(int j = 1; j <= input; j++)
        {
            PRODUCT *= j;
        }
        System.out.println("Product : " + PRODUCT);
    }
}
