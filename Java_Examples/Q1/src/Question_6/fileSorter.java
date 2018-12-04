/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_6;

import java.util.Arrays;

/**
 *
 * @author RED
 */
public class fileSorter implements Runnable
{
    private String[] input;

    public fileSorter(String[] input)
    {
        this.input = input;
    }

    public String[] getInput()
    {
        return input;
    }

    public void setInput(String[] input)
    {
        this.input = input;
    }

    @Override
    public void run()
    {
        Arrays.sort(input);
        
    }
}
