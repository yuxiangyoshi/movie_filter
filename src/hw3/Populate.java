/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hw3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author yuxia
 */
public class Populate {
 
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver is registered");
        } catch (ClassNotFoundException cnfe)
        {
            System.out.println("Error loading driver: " + cnfe);
        }
        //2. define db url
        String dbUrl = "jdbc:oracle:thin:coen@//localhost:1521/xe";
        
        //3. establish connection
        Connection connection = DriverManager.getConnection(dbUrl, "coen", "pass");
        for (int i = 0; i < args.length; i++){
            String fileName = args[i];
            System.out.println("writting file: " + fileName);
            BufferedReader scnr = new BufferedReader(new FileReader(fileName));
            //ignore title line
            String line = scnr.readLine();
            PreparedStatement statement = null;
            
            switch(fileName){
                case "genres.dat":
                    statement = connection.prepareStatement("Insert into COEN.GENRES (MOVIEID,GENRE) values " + "(?, ?)"); // Genres
                    break;
                case "movies.dat":
                    statement = connection.prepareStatement("Insert into COEN.MOVIES (ID,TITLE,IMDBID,SPANISHTITLE,IMDBPICTUREURL,YEAR,RTID,RTALLCRITICSRATING,RTALLCRITICSNUMREVIEWS,RTALLCRITICSNUMFRESH,RTALLCRITICSNUMROTTEN,RTALLCRITICSSCORE,RTTOPCRITICSRATING,RTTOPCRITICSNUMREVIEWS,RTTOPCRITICSNUMFRESH,RTTOPCRITICSNUMROTTEN,RTTOPCRITICSSCORE,RTAUDIENCERATING,RTAUDIENCENUMRATINGS,RTAUDIENCESCORE,RTPICTUREURL) values " + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    break;
                case "actors.dat":
                    statement = connection.prepareStatement("INSERT INTO ACTORS (MOVIEID, ACTORID, ACTORNAME, RANKING) VALUES " + "(?, ?, ?, ?)"); //Actors
                    break;
                case "directors.dat":
                    statement = connection.prepareStatement("INSERT INTO DIRECTORS (MOVIEID, DIRECTORID, DIRECTORNAME) VALUES " + "(?, ?, ?)");//directors
                    break;
                case "countries.dat":
                    statement = connection.prepareStatement("Insert into COEN.COUNTRIES (MOVIEID,COUNTRY) values " + "(?, ?)"); // Countries
                    break;
                case "mtags.dat":
                    statement = connection.prepareStatement("Insert into COEN.MTAGS (MOVIEID,TAGID,TAGWEIGHT) values " + "(?, ?, ?)"); //mtags
                    break;
                case "tags.dat":
                    statement = connection.prepareStatement("Insert into COEN.TAGS (ID,VALUE) values " + "(?, ?)");
                    break;
                case "usertag.dat":
                    statement = connection.prepareStatement("Insert into COEN.USERTAG (USERID,MOVIEID,TAGID,TIMESTAMP) values " + "(?, ?, ?, ?)");
                    break;
                default:
                    System.out.println("File invalid or not needed: " + fileName);
                    break;
            }
            while((line = scnr.readLine()) != null){
                //line = scnr.readLine();
                String[] delimited;
                delimited = line.split("\t");
                for (int j = 0; j < delimited.length; j++){
                    statement.setString(j+1, delimited[j]);
                }
                statement.executeUpdate();
                
            }
            scnr.close();
        }
        
    }
}
