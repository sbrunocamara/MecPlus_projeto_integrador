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
import mecPlus.Classes.ArquivoClasse;
import mecPlus.Classes.VeiculoClasse;
import mecPlus.Database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ArquivoModel {
    
     public boolean insert(ArquivoClasse arquivo){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into arquivos (descricao,nome) values (?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,arquivo.getDescricao());
           pStatement.setString(2,arquivo.getNome());

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
     
    
    public ArrayList<ArquivoClasse> select(){
        
        String sql = "select * from arquivos";

        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ArquivoClasse> arquivos = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet arquivosSelect = pStatement.executeQuery(sql);
           
           if(arquivosSelect != null){
               arquivos =  new ArrayList<>();

               while(arquivosSelect.next()){
        
                   ArquivoClasse arquivosObjeto = new ArquivoClasse();
                   arquivosObjeto.setDescricao(arquivosSelect.getString("descricao"));
                   arquivosObjeto.setNome(arquivosSelect.getString("nome"));
                   arquivosObjeto.setId(arquivosSelect.getInt("id"));
                  
                  
                   arquivos.add(arquivosObjeto);
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
          
       return arquivos;
        
    }
    
            public ArquivoClasse update(ArquivoClasse arquivo){
 
      String sql = "UPDATE arquivos SET descricao = ? WHERE arquivo.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,arquivo.getDescricao());
           pStatement.setInt(2,arquivo.getId());

           
           
           boolean veiculoUpdate = pStatement.execute();
           

   
            return arquivo;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ArquivoClasse returnArquivo =  new ArquivoClasse();
        
        return returnArquivo;
        
        
    }
        
         public boolean remove(ArquivoClasse arquivo){
        
      String sql = "DELETE FROM arquivos WHERE arquivos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,arquivo.getId());
           
           
           boolean arquivoDelete = pStatement.execute();
          
           

         if(arquivoDelete == false){
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
