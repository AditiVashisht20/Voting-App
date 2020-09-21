/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingapp;

/**
 *
 * @author aditi
 */
import java.sql.*;
public class myconnection {
  public  Connection db;
    public myconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbVoting","root","");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

    

