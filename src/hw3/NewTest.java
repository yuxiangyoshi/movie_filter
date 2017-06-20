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
public class NewTest {
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
        //File file = new File("src/res/genres.dat");
        args = new String[]{"genres.dat", "actors.dat", "directors.dat", "countries.dat", "movies.dat", "mtags.dat", "tags.dat"};
		String prefix = "src/res/";
        for (int i = 0; i < args.length; i++){
            String fileName = prefix + args[i];
            System.out.println("for loop file name: " + fileName);
            BufferedReader scnr = new BufferedReader(new FileReader(fileName));
            //ignore title line
            String line = scnr.readLine();
            PreparedStatement statement = null;
            
            switch(fileName){
                case "src/res/genres.dat":
                    System.out.println("inside switch" + fileName);
                    statement = connection.prepareStatement("Insert into COEN.GENRES (MOVIEID,GENRE) values " + "(?, ?)"); // Genres
                    break;
                case "src/res/movies.dat":
                    //have to delete line 3, or gives cannot find line exception for some reason
                    System.out.println("inside switch" + fileName);
                    statement = connection.prepareStatement("Insert into COEN.MOVIES (ID,TITLE,IMDBID,SPANISHTITLE,IMDBPICTUREURL,YEAR,RTID,RTALLCRITICSRATING,RTALLCRITICSNUMREVIEWS,RTALLCRITICSNUMFRESH,RTALLCRITICSNUMROTTEN,RTALLCRITICSSCORE,RTTOPCRITICSRATING,RTTOPCRITICSNUMREVIEWS,RTTOPCRITICSNUMFRESH,RTTOPCRITICSNUMROTTEN,RTTOPCRITICSSCORE,RTAUDIENCERATING,RTAUDIENCENUMRATINGS,RTAUDIENCESCORE,RTPICTUREURL) values " + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    break;
                case "src/res/actors.dat":
                    statement = connection.prepareStatement("INSERT INTO ACTORS (MOVIEID, ACTORID, ACTORNAME, RANKING) VALUES " + "(?, ?, ?, ?)"); //Actors
                    break;
                case "src/res/directors.dat":
                    statement = connection.prepareStatement("INSERT INTO DIRECTORS (MOVIEID, DIRECTORID, DIRECTORNAME) VALUES " + "(?, ?, ?)");//directors
                    break;
                case "src/res/countries.dat":
                    System.out.println("inside countries " + fileName);
                    statement = connection.prepareStatement("Insert into COEN.COUNTRIES (MOVIEID,COUNTRY) values " + "(?, ?)"); // Countries
                    break;
                case "src/res/mtags.dat":
                    statement = connection.prepareStatement("Insert into COEN.MTAGS (MOVIEID,TAGID,TAGWEIGHT) values " + "(?, ?, ?)"); //mtags
                    break;
                case "src/res/tags.dat":
                    statement = connection.prepareStatement("Insert into COEN.TAGS (ID,VALUE) values " + "(?, ?)"); //tags
                    break;
                default:
                    System.out.println("File invalid or not needed: " + fileName);
                    break;
            }
            //PreparedStatement statement = connection.prepareStatement("Insert into COEN.ACTORS (MOVIEID,GENRE) values " + "(?, ?, ?, ?)");
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
