/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author RED
 */
public class Q6b {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException 
    {
        
        start();
        
    }
    
    public static void start() throws FileNotFoundException, IOException, InterruptedException
    {
        String line;
       

        try 
        (
            InputStream fis = new FileInputStream("words.txt");
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);
        ) 
        {
            while ((line = br.readLine()) != null) 
            {
                Scanner keyboard = new Scanner(System.in);

                System.out.println("Menu\n================\n\nPlease choose an option : \n");
                System.out.println("1. Display contents of text file.\n2. Display contents of text file in alphabetical order.\n3. Display line of text file based on user input.\n4. Exit\n");
                System.out.print("Option : ");

                int option = keyboard.nextInt();

                    String[] words = line.split(" ", 10000);

                    String[] lines = line.split("/", 10);
                    
                    //display all text in file
                    if(option == 1)
                    {
                        System.out.println(line + "\n\n");
                        start();
                    }
                    //sort words alphabetically
                    else if(option == 2)
                    {
                        fileSorter fSort = new fileSorter(words);
                        Thread t1 = new Thread(fSort);
                        t1.start();
                        t1.join();
                        System.out.println(Arrays.toString(words)+ "\n\n");
                        start();
                    }
                    //display line based on user's choice
                    else if(option == 3)
                    {
                        System.out.println("Please choose which line to print: [0 - " + (lines.length -1) + "]");
                        int i = keyboard.nextInt();

                        if(i > lines.length -1)
                        {
                            System.out.println("That line of text doesnt exist, please try again.");
                        }
                        else
                        {
                            String lineChoice = lines[i];
                            System.out.println("Line " + i + " : " + lineChoice);
                        }
                        start();
                    }
                    //exit app
                    else if(option == 4)
                    {
                        System.out.println("=====================================================\nGoodbye");
                        exit();
                    }


            }

        }
    }
}

