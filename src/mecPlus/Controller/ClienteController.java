/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Controller;

import java.util.ArrayList;
import mecPlus.Classes.ClienteClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Model.ClienteModel;
import mecPlus.Model.UsuarioModel;

/**
 *
 * @author bsbru
 */
public class ClienteController {
    
        public boolean insert(String nome, String email, String endereco, String cep,String documento, String telefone ){
        

        
        ClienteClasse cliente = new ClienteClasse();
        
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setCep(cep);
        cliente.setDocumento(documento);
        cliente.setTelefone(telefone);
   
        
        ClienteModel clienteModel =  new ClienteModel();
        
        if(clienteModel.insert(cliente)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<ClienteClasse> select(){
        
          ClienteModel clienteModel =  new ClienteModel();
          ArrayList<ClienteClasse> clientes = null;
          
          try{
             clientes = clienteModel.select();
             
        
            return clientes;
        
             
          }catch(Exception e){

          }
          
         return clientes;
        
        
    }
    
        public  ClienteClasse update(ClienteClasse cliente){
        
        ClienteModel clienteModel =  new ClienteModel();
            
          
          try{
              
            ClienteClasse update = clienteModel.update(cliente);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return cliente;
        
        
    }
    
    public boolean remove(ClienteClasse cliente){
        
         ClienteModel clienteModel =  new ClienteModel();
 
  
              
            boolean remove = clienteModel.remove(cliente);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
