package main;

import java.sql.Connection;
import connex.*; 

public class Main {
    public static void main(String[] args) {
        Connect dbConnection = new Connect();
        Connection connection = dbConnection.connect();
        
        
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
