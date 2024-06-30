/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bsbru
 */
public class ConnectionDB {
    
    public Connection getConnection(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            
            e.printStackTrace();
            
        }
        
        try{
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mecPlus?useSSL=false","root","698523");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
