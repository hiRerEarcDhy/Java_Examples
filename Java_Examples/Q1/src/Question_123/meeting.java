/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_123;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author D00195101
 */

//SUBCLASS INHERITS FROM TASK
    class meeting extends task
    {
        String location;
        
        public meeting(int id, String title, LocalDateTime dueDate, String location)
        {
            super(id, title, dueDate);
            this.location = location;
        }
        
        public String getLocation()
        {
            return this.location;
        }

        //hash && equals
        @Override
        public int hashCode() 
        {
            int hash = 7;
            hash = 17 * hash + Objects.hashCode(this.location);
            return hash;
        }

        @Override
        public boolean equals(Object obj) 
        {
            if (this == obj) 
            {
                return true;
            }
            if (obj == null) 
            {
                return false;
            }
            if (getClass() != obj.getClass()) 
            {
                return false;
            }
            final meeting other = (meeting) obj;
            if (!Objects.equals(this.location, other.location)) 
            {
                return false;
            }
            return true;
        }
        
        
        @Override
        public String toString() 
        {
            return "Task " + id + " --> Title : " + title + ", Date : " + dueDate + ", Location : " + location;
        }
   
        
    }
