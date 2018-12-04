/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_123;

import java.util.Comparator;

/**
 *
 * @author RED
 */

class TitleComparator implements Comparator<task>
{  
    @Override
    public int compare(task t1,task t2)
    {  
        return t1.getTitle().compareTo(t2.getTitle());  
    }  
}
