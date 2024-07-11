/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Controller;

import java.util.ArrayList;
import mecPlus.Classes.ClienteClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Classes.VeiculoClasse;
import mecPlus.Model.ClienteModel;
import mecPlus.Model.UsuarioModel;
import mecPlus.Model.VeiculoModel;

/**
 *
 * @author bsbru
 */
public class ArquivoController {
    
        public boolean insert(Integer marca, Integer modelo, String placa, String ano,Integer cliente){
        

        
        VeiculoClasse veiculo = new VeiculoClasse();
        
        veiculo.setMarcaId(marca);
        veiculo.setModeloId(modelo);
        veiculo.setPlaca(placa);
        veiculo.setAno(ano);
        veiculo.setClienteId(cliente);
     
   
        
        VeiculoModel veiculoModel =  new VeiculoModel();
        
        if(veiculoModel.insert(veiculo)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<VeiculoClasse> select(){
        
          VeiculoModel veiculoModel =  new VeiculoModel();
          ArrayList<VeiculoClasse> veiculos = null;
          
          try{
             veiculos = veiculoModel.select();
             
        
            return veiculos;
        
             
          }catch(Exception e){

          }
          
         return veiculos;
        
        
    }
    
        public  VeiculoClasse update(VeiculoClasse veiculo){
        
        VeiculoModel veiculoModel =  new VeiculoModel();
            
          
          try{
              
            VeiculoClasse update = veiculoModel.update(veiculo);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return veiculo;
        
        
    }
    
    public boolean remove(VeiculoClasse veiculo){
        
        VeiculoModel veiculoModel =  new VeiculoModel();
  
              
            boolean remove = veiculoModel.remove(veiculo);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
