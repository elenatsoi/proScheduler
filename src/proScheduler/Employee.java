
package proScheduler;


/**
 *
 * @author 014944954
 */
import java.sql.*;
import java.io.*;     

public class Employee extends Person
{
    private String password;
 
    //constructor
    public Employee(String fName, String lName, String eMail, String phone, 
           String dob, String str, int zip, String passW)
    {
        super(fName, lName, eMail, phone, dob, str, zip);
        password = passW;
    
    } 
    //getteres
    
    public String getPassword()
    {
        return password;
    }   

    //setters
   /* public void setUsername(String userN)
    {
        username = userN;
    }*/
    public void setPassword(String passW)
    {
        password  = passW;
    } 
    public void insert2(int id)
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
            
            String sql = "INSERT INTO Employee " +
                "VALUES ( " + id + ",'" + password + "' )";
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
   static public void login(int empID,String passW)
    {
           //jdbc driver name and database url
            String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
            String DB_URL = "jdbc:derby://localhost:1527/pro2";
    
            //Database credentials
            String USER = "test";
            String PASS = "test";
            Connection conn = null;
            Statement stmt = null;
            try
            {
            //connect to database
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "select password from Person natural join Employee "
                    + "where Employee.person_ID = "+empID+""; 

            ResultSet rs = stmt.executeQuery(sql);  //execute command           
            while(rs.next())
            {
                
               String pass = rs.getString("password");
                if (pass.equals(passW))
                
                System.out.println("success");
                else
                   System.out.println("fail");
            }
            
            System.out.println();
            rs.close();
            
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

