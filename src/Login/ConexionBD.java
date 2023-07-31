/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.sql.*;

public class ConexionBD {
    
    Connection cn;
    Statement st;
    
    public Connection Conexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");    
           cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ventas","root","");
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }return cn;
    
    }
   
    
}
