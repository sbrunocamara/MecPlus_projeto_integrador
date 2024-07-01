/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Controller;

import java.util.ArrayList;
import mecPlus.Classes.ModelosClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Model.MarcaModel;
import mecPlus.Model.ModeloModel;
import mecPlus.Model.UsuarioModel;

/**
 *
 * @author bsbru
 */
public class ModelosController {
    
        public boolean insert(String descricao){
        

        
        ModelosClasse modelo = new ModelosClasse();
        
        modelo.setDescricao(descricao);

        
        ModeloModel modeloModel =  new ModeloModel();
        
        if(modeloModel.insert(modelo)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<ModelosClasse> select(){
        
          ModeloModel modeloModel =  new ModeloModel();
          ArrayList<ModelosClasse> modelos = null;
          
          try{
             modelos = modeloModel.select();
             
        
            return modelos;
        
             
          }catch(Exception e){

          }
          
         return modelos;
        
        
    }
    
    
        public  ModelosClasse update(ModelosClasse modelo){
        
             ModeloModel modeloModel =  new ModeloModel();
            
          
          try{
              
            ModelosClasse update = modeloModel.update(modelo);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return modelo;
        
        
    }
    
    public boolean remove(ModelosClasse modelo){
        
          ModeloModel modeloModel =  new ModeloModel();
 
  
              
            boolean remove = modeloModel.remove(modelo);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
