/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucab.tesis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguelangel
 */
public class ConexionBaseDeDatos {
    private Connection conexion =null;
    
    public Connection conexionBaseDeDatos() 
    {
        try
        {
           /* Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/"
                    + "tesis_2018";
            this.conexion = DriverManager.getConnection(url,"postgres",
                    "1234"); 
            System.out.println("Conexion establecida");
           // conexion.setAutoCommit(true);*/
            /*
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://ec2-54-204-46-60.compute-1.amazonaws.com:5432/"
                    + "dcusf373p1fjsk?sslmode=require";
            this.conexion = DriverManager.getConnection(url,"dzjsenkjmvnhyy",
                    "2a9690e10bb4aa8d8288890f683efa1b9bb594e34a25b2246dbac580fe2e11e5"); 
            System.out.println("Conexion establecida");
           // conexion.setAutoCommit(true);
            */
          Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://ec2-54-204-46-60.compute-1.amazonaws.com:5432/"
                    + "dcusf373p1fjsk?sslmode=require";
            this.conexion = DriverManager.getConnection(url,"dzjsenkjmvnhyy",
                    "2a9690e10bb4aa8d8288890f683efa1b9bb594e34a25b2246dbac580fe2e11e5"); 
            System.out.println("Conexion base de datos establecida");// conexion.setAutoCommit(true);*/
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error Class NOT FOUND "+e.getMessage().toString() );
        } 
        catch (SQLException e) 
        {
            System.out.println("ERROR Conectar Base de datos"+e.getMessage().toString());
        }
        
        return  conexion;
    }
}
