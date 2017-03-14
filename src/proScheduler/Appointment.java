/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proScheduler;

/**
 *
 * @author 014944954
 */
public class Appointment 
{
        private String date;
        private String time;
        private Doctor doctorID;
        private Patient patientID;
        
        // constructor
        Appointment(String date, String time, Doctor doctorI, Patient patientI )
        {
            this.date = date;
            this.time = time;
            doctorID = doctorI;
            patientID = patientI;
        }
        
         //getteres
        public String getDate()
        {
            return date;
        }
        public String getTime()
        {
            return time;
        } 
        public String getDoctorID()
        {
            return Doctor.getDoctorID()
        }
        public String getPatientID()
        {
            return patientID.getPatientID();
        }

        //setters
        public void setTime(String time)
        {
            this.time  = time;
        }
        public void setDate(String date)
        {
            this.date = date;
        }
        
        
}

