
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hayat
 * 
 */
import java.sql.*;
import java.util.Scanner;
import java.io.*;  
public class Person 
{
    private int person_ID;
    private String first_Name;
    private String last_Name;
    private String email;
    private String cellPhone;
    private String DoB;
    private String street;
    private int zipCode;
    
 
    //constructor
    public Person(String fName, String lName, String eMail, String phone, 
           String dob, String str, int zip)
    {
   
           first_Name = fName;
           last_Name = lName;
           email = eMail;
           cellPhone = phone;
           DoB = dob;
           street = str;
           zipCode = zip;
     
    
    }

    public int getID()
    {
        return person_ID;
    }
    
    public void insert()
    {
           //jdbc driver name and database url
            Connection conn = null;
            Statement stmt = null;

            String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
            String DB_URL = "jdbc:derby://localhost:1527/pro2";
    
            //Database credentials
            String USER = "test";
            String PASS = "test";
           // Connection conn = null;
            //Statement stmt = null;
            try
            {
            //connect to database
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
                       String sql = "INSERT INTO Person " +
                        "VALUES (" + person_ID + ", '" + first_Name  + "', '" +last_Name + "', '"
                        + email  + "','" + cellPhone  + "', '" + DoB + "','" + street  + "', " + zipCode + " )";
            stmt.executeUpdate(sql);  //execute command                
        }catch(SQLException se){
        //Handle errors for JDBC
             se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
            se.printStackTrace();
            }//end finally try
        }//end try
    }//end main
}










    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


