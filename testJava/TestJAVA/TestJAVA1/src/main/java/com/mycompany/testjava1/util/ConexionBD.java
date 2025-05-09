/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjava1.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author camper
 */
public class ConexionBD {



public class conexionBD {
    private static final String host = "jdbc:mysql://localhost:3306/";
    private static final String db = "SolucionesEficientes";
    private static final String url = host + db;
    private static final String user = "root";
    private static final String password = "campus2023"; 

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(" Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }
}


    
}
