/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

//Este paquete es de java no es del driver de mysql
import java.sql.*;
public class Conexion {
    
    public static Connection conectarse(String login, String password) throws ClassNotFoundException, SQLException{
    
    //Primero escribimos la url del servidor de mysql
    String url="jdbc:mysql://localhost:3306/mysql";
    
            //ahora hacemos el cargado con codigo del driver
    //Cargamos el driver de mysql para que se la 
    //a mysql
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=  DriverManager.getConnection(url, login, password);
           
           return con;
    
}
}
