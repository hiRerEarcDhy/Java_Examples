/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question_123;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static Question_123.task.findTaskByTitle;
import static Question_123.task.sortTaskById;
import java.time.LocalDateTime;
import java.time.Month;
import static javafx.application.Platform.exit;
import static Question_123.task.loadTasks;

/**
 *
 * @author D00195101
 */

public class mainApp 
{

    //MAIN 
    public static void main(String[] args) throws FileNotFoundException
    {
        
        start();

    }

    public static void start() throws FileNotFoundException
    {
        //MENU
        System.out.println("=======================================\nWelcome\n=======================================");
        System.out.println("Choose an option : \n");
        System.out.println("1. Display all tasks");
        System.out.println("2. Find a task by title input");
        System.out.println("3. Sort all tasks by Id and display");
        System.out.println("4. Sort all tasks by Title and display");
        System.out.println("5. Load data from text file and display");
        System.out.println("6. Exit\n");
        
        //ARRAYLISTS USED AS RETURN FOR METHODS
        ArrayList<task> tasks = new ArrayList<>();
        ArrayList<task> titles;
        ArrayList<task> sortedById;
        ArrayList<task> loadedFromFile;
        
        //HARD CODED TASKS AS SAMPLES
        tasks.add(new task(199, "Meeting", LocalDateTime.of(2019, Month.MARCH, 2, 12, 0)));
        tasks.add(new task(4, "Aaaaa", LocalDateTime.of(2021, Month.NOVEMBER, 26, 9, 0)));
        tasks.add(new task(25, "Bbbbb", LocalDateTime.of(2018, Month.JANUARY, 5, 18, 0)));
        tasks.add(new task(100, "Fffff", LocalDateTime.of(2021, Month.OCTOBER, 8, 15, 30)));
        tasks.add(new meeting(1, "Meet Ryan", LocalDateTime.of(2054, Month.OCTOBER, 6, 12, 30), "Apartment 27"));
        tasks.add(new phoneCall(127, "Phone the man", LocalDateTime.of(2024, Month.OCTOBER, 12, 10, 00), 123));

        
        Scanner kb = new Scanner(System.in);
        System.out.print("\t");
        int choice = kb.nextInt();
        System.out.print("\n");
        
        //CHOICES
        
        //Displays all tasks currently in "tasks" arraylist
        if(choice == 1)
        {
            for( task t : tasks)
            {
                System.out.println(t);
            }
            start();
        }
        //Search method (titles only)
        else if(choice == 2)
        {
            titles = findTaskByTitle( tasks );
            for( task t : titles)
            {
                System.out.println(t);
            }
            start();
        }
        //Sorts tasks (descending) by id field and displays current tasks
        else if(choice == 3)
        {
            sortedById = sortTaskById( tasks );
            for( task t : sortedById)
            {
                System.out.println(t);
            }
            start();
        }
        //Sorts tasks (descending) by title field and displays current tasks
        else if(choice == 4)
        {

            TitleComparator tCompare = new TitleComparator();
            Collections.sort(tasks, tCompare);
            for( task t : tasks)
            {
                System.out.println(t);
            }
            start();
        }
        //Loads tasks from a custom text file in the project
        else if(choice == 5)
        {
            System.out.println("Writing tasks from specified text file . . .\nWrite complete.");
            
            loadedFromFile = loadTasks( tasks );
            for( task t : tasks)
            {
                
                System.out.println(t);
            }
            start();
        }
        //Exits and closes the program
        else if(choice == 6)
        {
            exit();
        }
        
    }


   
}
  
        



