/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proScheduler;

/**
 *
 * @author Elena
 */


public class Schedule {
    
    /**  */
    private <DateTime> start;
    /**  */
    private <DateTime> end;
    
    /**
     * Generates a new instance of the Schedule class
     */
    public Schedule()
    {
        start = new <Date>();
        end = new <Date>();
    }
    
    /**
     * Sets the start time
     * @param s     
     */
    public void setStart(<Date> s)
    {
        start = s;
    }
    
    public <Date> getStart()
    {
        return start;
    }
    
    public void setEnd(<Date> e)
    {
        end = e;
    }
    
    public <Date> getEnd()
    {
        return end;
    }
}
