/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecPlus.Controller;

import java.util.ArrayList;
import mecPlus.Classes.ArquivoClasse;

import mecPlus.Model.ArquivoModel;


/**
 *
 * @author bsbru
 */
public class ArquivoController {
    
        public boolean insert(String descricao, String nome){
        

        
         ArquivoClasse arquivo = new ArquivoClasse();
        
        arquivo.setDescricao(descricao);
        arquivo.setNome(nome);

     
   
        
        ArquivoModel arquivoModel =  new ArquivoModel();
        
        if(arquivoModel.insert(arquivo)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<ArquivoClasse> select(){
        
          ArquivoModel arquivoModel =  new ArquivoModel();
          ArrayList<ArquivoClasse> arquivos = null;
          
          try{
             arquivos = arquivoModel.select();
             
        
            return arquivos;
        
             
          }catch(Exception e){

          }
          
         return arquivos;
        
        
    }
    
        public  ArquivoClasse update(ArquivoClasse arquivo){
        
            ArquivoModel arquivoModel =  new ArquivoModel();
            
          
          try{
              
              ArquivoClasse update = arquivoModel.update(arquivo);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return arquivo;
        
        
    }
    
    public boolean remove(ArquivoClasse arquivo){
        
          ArquivoModel arquivoModel =  new ArquivoModel();
  
              
            boolean remove = arquivoModel.remove(arquivo);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
