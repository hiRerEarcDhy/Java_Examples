/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question_6;

import java.util.Scanner;

public class SumProduct
{
    public static void main(String[] args) throws InterruptedException
    {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter number to create sum + product: ");
        int number = kb.nextInt();
        SumProduct_Calculator calculator = new SumProduct_Calculator(number);
        
        Thread t1 = new Thread(calculator);
        t1.start();
        t1.join();
    }
}
