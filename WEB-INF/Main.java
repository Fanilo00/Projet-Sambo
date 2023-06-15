package main;

import java.sql.Connection;
import conn.*; 

public class Main {
    public static void main(String[] args){
      

        try {
              Connect dbConnection = new Connect();
        Connection connection = dbConnection.connex();
        } catch (Exception e) {
        }
        
    }
}
