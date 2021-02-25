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
    public myconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbVoting","root","123456");
            if(db != null){
                System.out.println("DB CONNECTED");
            }
            Statement stmt = db.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbadmin` (\n" +
                "  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,\n" +
                "  `username` varchar(50) NOT NULL,\n" +
                "  `password` varchar(50) NOT NULL\n" +
                ")");
            
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbcandidate` (\n" +
                "  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,\n" +
                "  `candidatename` varchar(50) NOT NULL,\n" +
                "  `city` varchar(50) NOT NULL,\n" +
                "  `partyid` int(11) NOT NULL,\n" +
                "  `age` int(11) NOT NULL,\n" +
                "  `education` varchar(50) NOT NULL,\n" +
                "  `AdharcardNo` varchar(50) NOT NULL,\n" +
                "  `contact` varchar(50) NOT NULL,\n" +
                "  `gender` varchar(50) NOT NULL,\n" +
                "  `Address` varchar(50) NOT NULL,\n" +
                "  `email` varchar(50) NOT NULL\n" +
                ")");
            
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbparty` (\n" +
                "  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,\n" +
                "  `partyname` varchar(50) NOT NULL,\n" +
                "  `symbol` varchar(50) NOT NULL\n" +
                ")");
            
            
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbvoter` (\n" +
                    "  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,\n" +
                    "  `fname` varchar(50) NOT NULL,\n" +
                    "  `lname` varchar(50) NOT NULL,\n" +
                    "  `age` int(11) NOT NULL,\n" +
                    "  `email` varchar(50) NOT NULL,\n" +
                    "  `contact` int(11) NOT NULL,\n" +
                    "  `adharno` varchar(50) NOT NULL,\n" +
                    "  `address` varchar(50) NOT NULL,\n" +
                    "  `gender` varchar(50) NOT NULL,\n" +
                    "  `city` varchar(50) NOT NULL\n" +
                    ")");
            
            stmt.execute("CREATE TABLE IF NOT EXISTS `tbvoting` (\n" +
                    "  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,\n" +
                    "  `voterid` int(11) NOT NULL,\n" +
                    "  `candidateid` int(11) NOT NULL,\n" +
                    "  `partyid` int(11) NOT NULL\n" +
                    ")");

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

    

