package main;
import java.sql.Connection;
import java.sql.Date;
import conn.*; 
import port.*;

public class Main {
    public static void main(String[] args){
      
        try {
        Prevision prevision = new Prevision();
        prevision.setID_Prevision(1);
        prevision.setID_Bateau(123);
        prevision.setDate_debut(Date.valueOf("2023-06-01"));
        prevision.setDate_fin(Date.valueOf("2023-06-30"));
    
        Connect connection = new Connect();
        Connection c=connection.connex();
    
        prevision.InsertPrevision(prevision, c);
        
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
