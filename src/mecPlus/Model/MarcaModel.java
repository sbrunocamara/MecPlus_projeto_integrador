/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import mecPlus.Classes.UsuarioClasse;
import java.sql.Connection;
import java.sql.ResultSet;
import mecPlus.Classes.MarcasClasse;
import mecPlus.Database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class MarcaModel {
    
     public boolean insert(MarcasClasse marca){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into marcas_veiculos (descricao) values (?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,marca.getDescricao());

           
          boolean insert = pStatement.execute();
  
  
              
          
       }catch(SQLException e){
            e.printStackTrace();
           
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
       return true;
       
       
    }
     

    
    public ArrayList<MarcasClasse> select(){
        
        String sql = "select * from marcas_veiculos";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<MarcasClasse> marcas = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet marcasSelect = pStatement.executeQuery(sql);
           
           if(marcasSelect != null){
               marcas =  new ArrayList<>();
               
               while(marcasSelect.next()){
                   MarcasClasse marcaObjeto = new MarcasClasse();
                   marcaObjeto.setDescricao(marcasSelect.getString("descricao"));
                   marcaObjeto.setId(marcasSelect.getInt("id"));
                   marcas.add(marcaObjeto);
               } 
           }
           
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
          
       return marcas;
        
    }
    
            public MarcasClasse update(MarcasClasse marca){
 
      String sql = "UPDATE marcas_veiculos SET descricao = ? WHERE marcas_veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,marca.getDescricao());
           pStatement.setInt(2,marca.getId());
           
           
           boolean marcasUpdate = pStatement.execute();
           

   
            return marca;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        MarcasClasse returnMarca =  new MarcasClasse();
        
        return returnMarca;
        
        
    }
        
         public boolean remove(MarcasClasse marca){
        
      String sql = "DELETE FROM marcas_veiculos WHERE marcas_veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,marca.getId());
           
           
           boolean marcaDelete = pStatement.execute();
          
           

         if(marcaDelete == false){
          return true;
                  } 
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
         
        return false;
        
        
    }
    
}
