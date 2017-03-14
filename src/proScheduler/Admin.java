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
public class Admin extends Employee {
    
    /**
     * Generates a new instance of the Admin class
     */
    public Admin()
    {
        super();
    }
    
    /**
     * Accepts new user information and adds that information to a database
     * @param name  username of new user
     * @param pass  password of new user
     * @param pos   position of new user
     */
    public void addUser(String name, String pass, String pos)
    {
        switch (pos)
        {
            case "clerk":
                Clerk newUser = new Clerk();
                newUser.setUsername(name);
                newUser.setPassword(pass);
                break;
            
            case "doctor":
                Doctor newUser = new Doctor();
                newUser.setUsername(name);
                newUser.setPassword(pass);
                break;
        }
        
        //Add to database
    }
    
    /**
     * Deletes an existing user from the database
     * @param name  username of user to be deleted
     * @return      true, if delete sucessful, otherwise false
     */
    public boolean deleteUser(String name)
    {
        //Query the database to verify existing user
        
        
        //If the user does not exist return false
        if (<Result Set> != null)
        {
            //Delete from database
            
        
            //Once the user has been deleted return true;
            return true;
        }
        
        return false;
    }
}
