/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SHAHADAT
 */
public class DatabaseConnection {
    public static Connection connect(){
        Connection _connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            _connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/firstservlet", "postgres", "admin");
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return _connection;
    }
}
