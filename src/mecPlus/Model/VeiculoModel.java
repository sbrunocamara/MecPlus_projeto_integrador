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
import mecPlus.Classes.VeiculoClasse;
import mecPlus.Database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class VeiculoModel {
    
     public boolean insert(VeiculoClasse veiculo){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into veiculos (marca,modelo,placa,ano,cliente) values (?,?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setInt(1,veiculo.getMarcaId());
           pStatement.setInt(2,veiculo.getModeloId());
           pStatement.setString(3,veiculo.getPlaca());
           pStatement.setString(4,veiculo.getAno());
           pStatement.setInt(5,veiculo.getClienteId());
           
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
     
    
    public ArrayList<VeiculoClasse> select(){
        
        String sql = "select veiculos.*,marcas_veiculos.descricao as marcaDescricao, modelos_veiculos.descricao as modeloDescricao, clientes.nome as clienteNome from veiculos LEFT JOIN marcas_veiculos \n" +
"ON veiculos.marca = marcas_veiculos.id LEFT JOIN modelos_veiculos ON veiculos.modelo = modelos_veiculos.id LEFT JOIN clientes ON veiculos.cliente = clientes.id";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<VeiculoClasse> veiculos = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet veiculosSelect = pStatement.executeQuery(sql);
           
           if(veiculosSelect != null){
               veiculos =  new ArrayList<>();

               while(veiculosSelect.next()){
        
                   VeiculoClasse veiculosObjeto = new VeiculoClasse();
                   veiculosObjeto.setMarcaDescricao(veiculosSelect.getString("marcaDescricao"));
                   veiculosObjeto.setMarcaId(veiculosSelect.getInt("marca"));
                   veiculosObjeto.setModeloDescricao(veiculosSelect.getString("modeloDescricao"));
                   veiculosObjeto.setModeloId(veiculosSelect.getInt("modelo"));
                   veiculosObjeto.setPlaca(veiculosSelect.getString("placa"));
                   veiculosObjeto.setAno(veiculosSelect.getString("ano"));
                   veiculosObjeto.setClienteNome(veiculosSelect.getString("ClienteNome"));
                   veiculosObjeto.setClienteId(veiculosSelect.getInt("cliente"));
                   veiculosObjeto.setId(veiculosSelect.getInt("id"));
                  
                   veiculos.add(veiculosObjeto);
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
          
       return veiculos;
        
    }
    
            public VeiculoClasse update(VeiculoClasse veiculo){
 
      String sql = "UPDATE veiculos SET marca = ?, modelo = ?, placa = ?, ano = ?, cliente = ? WHERE veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setInt(1,veiculo.getMarcaId());
           pStatement.setInt(2,veiculo.getModeloId());
           pStatement.setString(3,veiculo.getPlaca());
           pStatement.setString(4,veiculo.getAno());
           pStatement.setInt(5,veiculo.getClienteId());
           pStatement.setInt(6,veiculo.getId());
           
           
           boolean veiculoUpdate = pStatement.execute();
           

   
            return veiculo;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        VeiculoClasse returnVeiculo =  new VeiculoClasse();
        
        return returnVeiculo;
        
        
    }
        
         public boolean remove(VeiculoClasse veiculo){
        
      String sql = "DELETE FROM veiculos WHERE veiculos.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,veiculo.getId());
           
           
           boolean veiculoDelete = pStatement.execute();
          
           

         if(veiculoDelete == false){
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
