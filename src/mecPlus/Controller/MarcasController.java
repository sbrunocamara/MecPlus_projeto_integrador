/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Controller;

import java.util.ArrayList;
import mecPlus.Classes.MarcasClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Model.MarcaModel;
import mecPlus.Model.UsuarioModel;

/**
 *
 * @author bsbru
 */
public class MarcasController {
    
        public boolean insert(String descricao){
        

        
        MarcasClasse marca = new MarcasClasse();
        
        marca.setDescricao(descricao);

        
        MarcaModel marcaModel =  new MarcaModel();
        
        if(marcaModel.insert(marca)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<MarcasClasse> select(){
        
          MarcaModel marcaModel =  new MarcaModel();
          ArrayList<MarcasClasse> marcas = null;
          
          try{
             marcas = marcaModel.select();
             
        
            return marcas;
        
             
          }catch(Exception e){

          }
          
         return marcas;
        
        
    }
    
    
        public  MarcasClasse update(MarcasClasse marca){
        
            MarcaModel marcaModel =  new MarcaModel();
            
          
          try{
              
            MarcasClasse update = marcaModel.update(marca);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return marca;
        
        
    }
    
    public boolean remove(MarcasClasse marca){
        
         MarcaModel marcaModel =  new MarcaModel();
 
  
              
            boolean remove = marcaModel.remove(marca);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
