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
public class Doctor {
    
   /* hayatahahahahahahaahha
    
    /** The start time and end time of a Doctor's availability */
    private Schedule docSchedule;
    
    /**
     * Generates a new instance of the Doctor class
     */
    public Doctor()
    {
        //Calls the Employee super constructor
        super();
        
        //Initializes the docSchedule data member
        Schedule docSchedule = new Schedule();
    }
    
    /**
     * Sets the docSchedule data member to the specified parameters
     * @param s     start time of Doctor's availability
     * @param e     end time of Doctor's availability
     */
    public void setSchedule(<DateTime> s, <DateTime> e)
    {
        docSchedule.setStart(s);
        docSchedule.setEnd(e);
    }
    
    /**
     * Retrieves a Schedule object representing a Doctor's availability 
     * @return      Schedule object representing a Doctor's availability
     */
    public Schedule getSchedule()
    {
        return docSchedule;
    }
}
