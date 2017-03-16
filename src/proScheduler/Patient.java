
package proScheduler;

/**
 *
 * @author Hayat
 */


public class Patient extends Person
{
    private String patientID;
   
 
    //constructor
    public Patient(String fName, String lName, String eMail, String phone, 
           String dob, String str, int zip, String stat)
    {
        super(fName, lName, eMail, phone, dob, str, zip); 
       
    
    } 
    //getteres
    public String getPatientID()
    {
        return patientID;
    }
     

    //setters
    public void setPatientID(String patientI)
    {
        patientID = patientI;
    }
    
}