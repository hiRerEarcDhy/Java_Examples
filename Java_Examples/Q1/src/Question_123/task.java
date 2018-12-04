/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_123;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author RED
 */
//SUPER CLASS
    class task  implements Comparable<task>
    {
        int id;
        String title;
        LocalDateTime dueDate;
        
        public task(int id, String title, LocalDateTime dueDate)
        {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id) 
        {
            this.id = id;
        }
        
        public String getTitle()
        {
            return title;
        }
        
        public void setTitle(String title) 
        {
            this.title = title;
        }
        
        public LocalDateTime getDate()
        {
            return dueDate;
        }

        public void setDueDate(LocalDateTime dueDate) 
        {
            this.dueDate = dueDate;
        }
        
        
        @Override
        public int compareTo(task t1) 
        {
            if(id==t1.id)  
            {
                return 0;
            }  
            else if(id>t1.id)  
            {    
                return 1;  
            }
            else 
            {
                return -1; 
            }
        }
        
        @Override
        public String toString() 
        {
            return "Task " + id + " --> Title : " + title + ", Date : " + dueDate +  '}';
        }
        
        
        //gets task using provided title
        public static ArrayList<task> findTaskByTitle( ArrayList<task> list )
        {
            ArrayList<task> searchTitles = new ArrayList<task>();
            Scanner kb = new Scanner(System.in);

            System.out.print("Search title : ");       
            String input = kb.nextLine();
            
            
            for(task t : list)
            {
                if( t.getTitle().contains(input) )
                {
                    searchTitles.add(t);
                }
            }
            
            return searchTitles;
        }

        
        //sorts all tasks by id
        public static ArrayList<task> sortTaskById( ArrayList<task> list )
        {
            ArrayList<task> sortedById = new ArrayList<task>();

            for(task t : list)
            {
                
                    sortedById.add(t);
                
            }
            Collections.sort(sortedById);
            
            return sortedById;
        }
        
        
        public static ArrayList<task> loadTasks(ArrayList<task> list) throws FileNotFoundException
        {
            String fileName = "tasks.txt";
            ArrayList<task> box = new ArrayList();
            Scanner fIn = new Scanner(new File(fileName));
            while(fIn.hasNextLine())
            {
                String line = fIn.nextLine();
                StringTokenizer st = new StringTokenizer(line, ";");

                String type = st.nextToken().trim();
                
                String ID = st.nextToken().trim();
                int idToken = Integer.parseInt(ID);

                String titleToken = st.nextToken().trim();

                String Date = st.nextToken().trim();
                DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                LocalDateTime dateToken = LocalDateTime.parse(Date,formatter);
                
                
                if(type.equals("None"))
                {

                    task thing = new task(idToken, titleToken, dateToken);
                    box.add(thing);
                        
                }
                else if(type.equals("Meeting"))
                {
                    String locationToken = st.nextToken().trim();
                    task thing = new meeting(idToken, titleToken, dateToken, locationToken);
                    box.add(thing);
                        
                }
                else if(type.equals("Phonecall"))
                {
                    String PhoneNumber = st.nextToken().trim();
                    Integer phonecallToken = Integer.parseInt(PhoneNumber);
                    task thing = new phoneCall(idToken, titleToken, dateToken, phonecallToken);
                    box.add(thing);
                        
                }
            }
            

            for(int i = 0; i < box.size(); i++)
            {
                System.out.println(box.get(i).toString());
            }
            
            return box;
        }
        
        
        
    }
