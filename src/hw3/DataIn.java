/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.beans.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author yuxia
 */
//load All the data into the database
public class DataIn {
    //Connection connection;
    //Statement statement;
    
    public static void loadData() throws FileNotFoundException, ClassNotFoundException, SQLException{
        //1. load Driver
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) 
            { 
                System.out.println("Error loading driver: " + cnfe); 
            }
        
        //OracleDataSource ds;
        //2. define db url
        //String dbUrl = "jdbc:oracle:thin:coen/coenpass@localhost:1521:XE";
        String dbUrl = "jdbc:oracle:thin:coen@//localhost:1521/xe";
        
        //3. establish connection
        Connection connection = DriverManager.getConnection(dbUrl, "coen", "pass");
        
        //4. create statement
        //Statement statement = connection.createStatement();
        
        
        
        String filePath;
        String filePathPrefix = "src/res/";
        String[] fileNames = new String[]{"genres", "actors", "directors", "coutries", "movies", "mtags", "tags"};
        /*File file = new File("src/res/actors.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        String[] delimited;
        delimited = line.split("\t");*/
        
        
        //System.out.print(line);
        /*for(String str: delimited){
            System.out.println(str);
        }*/
        loadGenres(connection);
        /*loadActors();
        loadDirectors();
        loadCountries();
        loadMovies();
        loadMtags();
        loadTags();*/
    }
    
    public static void loadGenres(Connection connection) throws FileNotFoundException, SQLException{
        File file = new File("src/res/genres.dat");
        Scanner scnr = new Scanner(file);
        //ignore title line
        String line = scnr.nextLine();
        PreparedStatement statement = connection.prepareStatement("Insert into COEN.GENRES (MOVIEID,GENRE) values " + "(?, ?)");
        while(scnr.hasNextLine()){
        line = scnr.nextLine();
        String[] delimited;
        delimited = line.split("\t");
        for (int i = 0; i < delimited.length; i++){
            statement.setString(i+1, delimited[i]);
        }
        statement.executeUpdate();
        
        }
        
        
        scnr.close();
    }
    
    /*public static void loadActors() throws FileNotFoundException{
        File file = new File("src/res/actors.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }
    
    
    public static void loadDirectors() throws FileNotFoundException{
        File file = new File("src/res/directors.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }
    
    public static void loadCountries() throws FileNotFoundException{
        File file = new File("src/res/countries.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }
    
    public static void loadMovies() throws FileNotFoundException{
        File file = new File("src/res/movies.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }
    
    public static void loadMtags() throws FileNotFoundException{
        File file = new File("src/res/mtags.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }
    
    public static void loadTags() throws FileNotFoundException{
        File file = new File("src/res/tags.dat");
        Scanner scnr = new Scanner(file);
        String line = scnr.nextLine();
        scnr.close();
    }*/
    
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException{
        //loadData();
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) 
            { 
                System.out.println("Error loading driver: " + cnfe); 
            }
        
        //OracleDataSource ds;
        //2. define db url
        //String dbUrl = "jdbc:oracle:thin:coen/coenpass@localhost:1521:XE";
        String dbUrl = "jdbc:oracle:thin:coen@//localhost:1521/xe";
        
        //3. establish connection
        Connection connection = DriverManager.getConnection(dbUrl, "coen", "pass");
        File file = new File("src/res/genres.dat");
        Scanner scnr = new Scanner(file);
        //ignore title line
        String line = scnr.nextLine();
        PreparedStatement statement = connection.prepareStatement("Insert into COEN.GENRES (MOVIEID,GENRE) values " + "(?, ?)");
        while(scnr.hasNextLine()){
        line = scnr.nextLine();
        String[] delimited;
        delimited = line.split("\t");
        for (int i = 0; i < delimited.length; i++){
            statement.setString(i+1, delimited[i]);
        }
        statement.executeUpdate();
        
        }
        
        
        scnr.close();
    }
}
