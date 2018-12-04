/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_123;

import java.time.LocalDateTime;

/**
 *
 * @author D00195101
 */

//SUBCLASS INHERITS FROM TASK
    class phoneCall extends task
    {
        Integer phoneNumber;
        
        public phoneCall(int id, String title, LocalDateTime dueDate, Integer phoneNumber)
        {
            super(id, title, dueDate);
            this.phoneNumber = phoneNumber;
        }
        
        public int getNumber()
        {
            return this.phoneNumber;
        }

        //hash && equals
        @Override
        public int hashCode() 
        {
            int hash = 7;
            hash = 53 * hash + this.phoneNumber;
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
            final phoneCall other = (phoneCall) obj;
            if (this.phoneNumber != other.phoneNumber) 
            {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() 
        {
            return "Task " + id + " --> Title : " + title + ", Date : " + dueDate + ", Phone Number : " + phoneNumber + '}';
        }
        
    }
