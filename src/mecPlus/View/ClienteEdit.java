/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecPlus.View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mecPlus.Classes.ClienteClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Controller.ClienteController;

/**
 *
 * @author bsbru
 */
public class ClienteEdit extends javax.swing.JFrame {

    /**
     * Creates new form ClienteEdit
     */
    
       public  ClienteClasse clientes;
       
    public ClienteEdit(ClienteClasse cliente) {
        
         initComponents();
        
        clienteNomeEdit.setText(cliente.getNome());
        ClienteEmailEdit.setText(cliente.getEmail());
        clienteTelefoneEdit.setText(cliente.getTelefone());
        clienteCpfEdit.setText(cliente.getDocumento());
        clienteEnderecoEdit.setText(cliente.getEndereco());
        clienteCepEdit.setText(cliente.getCep());
        
        this.clientes = cliente;
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteTelefoneTelefoneLabel = new javax.swing.JLabel();
        clienteTelefoneEdit = new javax.swing.JFormattedTextField();
        clienteEnderecoEdit = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        clienteCpfEditLabel = new javax.swing.JLabel();
        nomeEditLabel = new javax.swing.JLabel();
        clienteCpfEdit = new javax.swing.JFormattedTextField();
        clienteNomeEdit = new javax.swing.JFormattedTextField();
        cepEditLabel = new javax.swing.JLabel();
        clienteEnderecoEditLabel = new javax.swing.JLabel();
        ClienteEmailEdit = new javax.swing.JFormattedTextField();
        clienteEditSave = new javax.swing.JButton();
        clienteEnderecoAddLabel5 = new javax.swing.JLabel();
        clienteCepEdit = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        clienteTelefoneTelefoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clienteTelefoneTelefoneLabel.setText("Telefone:");

        try {
            clienteTelefoneEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        clienteTelefoneEdit.setToolTipText("");
        clienteTelefoneEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTelefoneEditActionPerformed(evt);
            }
        });

        clienteEnderecoEdit.setToolTipText("");
        clienteEnderecoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteEnderecoEditActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        jLabel1.setText("Alterar Cliente");

        clienteCpfEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clienteCpfEditLabel.setText("CPF/CNPJ:");

        nomeEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nomeEditLabel.setText("Nome:");

        clienteCpfEdit.setToolTipText("");
        clienteCpfEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCpfEditActionPerformed(evt);
            }
        });

        clienteNomeEdit.setToolTipText("");
        clienteNomeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteNomeEditActionPerformed(evt);
            }
        });

        cepEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cepEditLabel.setText("Email:");

        clienteEnderecoEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clienteEnderecoEditLabel.setText("Endereço:");

        ClienteEmailEdit.setToolTipText("");
        ClienteEmailEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteEmailEditActionPerformed(evt);
            }
        });

        clienteEditSave.setText("Salvar");
        clienteEditSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteEditSaveActionPerformed(evt);
            }
        });

        clienteEnderecoAddLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clienteEnderecoAddLabel5.setText("CEP:");

        try {
            clienteCepEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        clienteCepEdit.setToolTipText("");
        clienteCepEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCepEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(clienteTelefoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(87, 87, 87)
                                            .addComponent(clienteNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nomeEditLabel)
                                            .addGap(366, 366, 366)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(clienteCpfEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(clienteEnderecoAddLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(clienteCepEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(clienteEnderecoEditLabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(clienteEnderecoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(clienteCpfEditLabel)
                                            .addGap(366, 366, 366))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(clienteTelefoneTelefoneLabel)
                            .addGap(366, 366, 366))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(ClienteEmailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cepEditLabel)
                                .addGap(366, 366, 366)))))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clienteEditSave)
                .addGap(344, 344, 344))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEditLabel)
                    .addComponent(clienteNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteEmailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepEditLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteTelefoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteTelefoneTelefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteCpfEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteCpfEditLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteEnderecoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteEnderecoEditLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteCepEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteEnderecoAddLabel5))
                .addGap(71, 71, 71)
                .addComponent(clienteEditSave)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clienteTelefoneEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTelefoneEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteTelefoneEditActionPerformed

    private void clienteEnderecoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteEnderecoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteEnderecoEditActionPerformed

    private void clienteCpfEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCpfEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteCpfEditActionPerformed

    private void clienteNomeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteNomeEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteNomeEditActionPerformed

    private void ClienteEmailEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteEmailEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteEmailEditActionPerformed

    private void clienteEditSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteEditSaveActionPerformed
        // TODO add your handling code here:
        
            if(clienteCpfEdit.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Documento não informado!");
             return;
        }
        
           if(this.limpaCampo(clienteCepEdit.getText()).isEmpty()){
             JOptionPane.showMessageDialog(null, "CEP não informado!");
             return;
        }
           
              if(this.limpaCampo(clienteTelefoneEdit.getText()).isEmpty()){
             JOptionPane.showMessageDialog(null, "Telefone não informado!");
             return;
        }
        
            if(this.limpaCampo(clienteNomeEdit.getText()).isEmpty()|| this.limpaCampo(ClienteEmailEdit.getText()).isEmpty() ||this.limpaCampo(clienteTelefoneEdit.getText()).isEmpty() || this.limpaCampo(clienteCpfEdit.getText()).isEmpty() || this.limpaCampo(clienteEnderecoEdit.getText()).isEmpty() || this.limpaCampo(clienteCepEdit.getText()).isEmpty()){
            
           JOptionPane.showMessageDialog(null, "Dados incompletos!");
           return;
            
        }
            
            this.clientes.setNome(clienteNomeEdit.getText());
            this.clientes.setEmail(ClienteEmailEdit.getText());
            this.clientes.setTelefone(clienteTelefoneEdit.getText());
            this.clientes.setDocumento(clienteCpfEdit.getText());
            this.clientes.setEndereco(clienteEnderecoEdit.getText());
            this.clientes.setCep(clienteCepEdit.getText());
        try{
            
            ClienteController clienteController = new ClienteController();
            
            ClienteClasse update = clienteController.update(this.clientes);
      
            
           if(this.clientes == update){
             JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
             this.clientes = update;
//             this.atualizaTela(evt);
            
            }
            
            
        }catch(Exception e){
            
            
            return;
        
    }
        

    }//GEN-LAST:event_clienteEditSaveActionPerformed

    private void clienteCepEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCepEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteCepEditActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
         ClienteController  clienteController = new ClienteController();
        ArrayList<ClienteClasse> carregaClientes = clienteController.select();
        
         Clientes clientesTela =  new Clientes(carregaClientes);
        clientesTela.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

        private String limpaCampo(String campo){
        
      String campoLimpo = campo.replaceAll("[()\\-_\\.]", "");
      
      String retorno = "";
      
      
        for (int i = 0; i < campoLimpo.length(); i++) {
            if (campoLimpo.charAt(i) != ' ') {
                retorno = retorno + campoLimpo.charAt(i);
                
            }
              
            }
            
            
    
        return retorno;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
clienteCepEdit       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ClienteEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ClienteEmailEdit;
    private javax.swing.JLabel cepEditLabel;
    private javax.swing.JFormattedTextField clienteCepEdit;
    private javax.swing.JFormattedTextField clienteCpfEdit;
    private javax.swing.JLabel clienteCpfEditLabel;
    private javax.swing.JButton clienteEditSave;
    private javax.swing.JLabel clienteEnderecoAddLabel5;
    private javax.swing.JFormattedTextField clienteEnderecoEdit;
    private javax.swing.JLabel clienteEnderecoEditLabel;
    private javax.swing.JFormattedTextField clienteNomeEdit;
    private javax.swing.JFormattedTextField clienteTelefoneEdit;
    private javax.swing.JLabel clienteTelefoneTelefoneLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeEditLabel;
    // End of variables declaration//GEN-END:variables
}
