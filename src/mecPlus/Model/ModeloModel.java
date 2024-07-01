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
import mecPlus.Classes.ModelosClasse;
import mecPlus.Database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ModeloModel {
    
     public boolean insert(ModelosClasse modelo){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into modelos_veiculos (descricao) values (?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,modelo.getDescricao());

           
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
     

    
    public ArrayList<ModelosClasse> select(){
        
        String sql = "select * from modelos_veiculos";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ModelosClasse> modelos = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet modelosSelect = pStatement.executeQuery(sql);
           
           if(modelosSelect != null){
               modelos =  new ArrayList<>();
               
               while(modelosSelect.next()){
                   ModelosClasse modeloObjeto = new ModelosClasse();
                   modeloObjeto.setDescricao(modelosSelect.getString("descricao"));
                   modeloObjeto.setId(modelosSelect.getInt("id"));
                   modelos.add(modeloObjeto);
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
          
       return modelos;
        
    }
    
            public ModelosClasse update(ModelosClasse modelo){
 
      String sql = "UPDATE modelos_veiculos SET descricao = ? WHERE modelos_veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,modelo.getDescricao());
           pStatement.setInt(2,modelo.getId());
           
           
           boolean marcasUpdate = pStatement.execute();
           

   
            return modelo;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ModelosClasse returnModelos =  new ModelosClasse();
        
        return returnModelos;
        
        
    }
        
         public boolean remove(ModelosClasse modelos){
        
      String sql = "DELETE FROM modelos_veiculos WHERE modelos_veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,modelos.getId());
           
           
           boolean modeloDelete = pStatement.execute();
          
           

         if(modeloDelete == false){
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
