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
import mecPlus.Classes.ClienteClasse;
import mecPlus.Database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ClienteModel {
    
     public boolean insert(ClienteClasse cliente){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into clientes (nome,email,endereco,cep,documento,telefone) values (?,?,?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,cliente.getNome());
           pStatement.setString(2,cliente.getEmail());
           pStatement.setString(3,cliente.getEndereco());
           pStatement.setString(4,cliente.getCep());
           pStatement.setString(5,cliente.getDocumento());
           pStatement.setString(6,cliente.getTelefone());
           
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
    
    public ArrayList<ClienteClasse> select(){
        
        String sql = "select id,nome,email,endereco,cep,documento,telefone from clientes";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ClienteClasse> clientes = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet clientesSelect = pStatement.executeQuery(sql);
           
           if(clientesSelect != null){
               clientes =  new ArrayList<>();
               
               while(clientesSelect.next()){
                   ClienteClasse clienteObjeto = new ClienteClasse();
                   clienteObjeto.setNome(clientesSelect.getString("nome"));
                   clienteObjeto.setEmail(clientesSelect.getString("email"));
                   clienteObjeto.setEndereco(clientesSelect.getString("endereco"));
                   clienteObjeto.setCep(clientesSelect.getString("cep"));
                   clienteObjeto.setDocumento(clientesSelect.getString("documento"));
                   clienteObjeto.setTelefone(clientesSelect.getString("telefone"));
                   clienteObjeto.setId(clientesSelect.getInt("id"));
                   clientes.add(clienteObjeto);
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
          
       return clientes;
        
    }
    
            public ClienteClasse update(ClienteClasse cliente){
 
      String sql = "UPDATE clientes SET nome = ?, email = ?, endereco = ?, cep = ?, documento = ?, telefone = ? WHERE clientes.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,cliente.getNome());
           pStatement.setString(2,cliente.getEmail());
           pStatement.setString(3,cliente.getEndereco());
           pStatement.setString(4,cliente.getCep());
           pStatement.setString(5,cliente.getDocumento());
           pStatement.setString(6,cliente.getTelefone());
           pStatement.setInt(7,cliente.getId());
           
           
           boolean fornecedoresUpdate = pStatement.execute();
           

   
            return cliente;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ClienteClasse returnCliente =  new ClienteClasse();
        
        return returnCliente;
        
        
    }
        
         public boolean remove(ClienteClasse cliente){
        
      String sql = "DELETE FROM clientes WHERE clientes.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,cliente.getId());
           
           
           boolean clienteDelete = pStatement.execute();
          
           

         if(clienteDelete == false){
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
