/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_4;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author RED
 */
public class mainApp 
{
    public static void main(String [] args)
    {
        Map<Integer, String> commissions = new HashMap<Integer, String>();
        ArrayList cObjects = new ArrayList();
        
        
    }
    
    public static String pad(String s, int size)
    {
        while(s.length() < size)
        {
            s = "*" + s;
        }
        return s;
    }
   
    public static String dePad(String s)
    {
        while(s.charAt(0)=='*')
        {
            s = s.substring(1);
        }
        return s;
    }
   
    public static String readString(DataInputStream dis, int size) throws IOException
    {
        byte[] data = new byte[size];
        dis.read(data);
        String s = new String(data);
        return s;
    }
}
