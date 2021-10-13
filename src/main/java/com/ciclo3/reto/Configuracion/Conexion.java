package com.ciclo3.reto.Configuracion;

import java.sql.*;

/**
 * Clase que permite conectar con la base de datos
 * 
 *
 */
public class Conexion {
   /**Parametros de conexion*/
   static String bd = "tienda";
   static String login = "EQUIPO3";
   static String password = "G563qu1p03*";
   static String url = "jdbc:mysql://grupo56.czo3ixoe3xoe.us-east-1.rds.amazonaws.com";

   Connection connection = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);

         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }

   public void desconectar(){
      connection = null;
   }
}