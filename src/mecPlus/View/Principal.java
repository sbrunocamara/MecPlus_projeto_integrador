/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecPlus.View;

import java.util.ArrayList;
import mecPlus.Classes.ClienteClasse;
import mecPlus.Classes.MarcasClasse;
import mecPlus.Classes.ModelosClasse;
import mecPlus.Classes.UsuarioClasse;
import mecPlus.Classes.VeiculoClasse;
import mecPlus.Controller.ClienteController;
import mecPlus.Controller.MarcasController;
import mecPlus.Controller.ModelosController;
import mecPlus.Controller.UsuarioController;

/**
 *
 * @author bsbru
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ClientesMenuCall = new javax.swing.JMenu();
        VeiculosMenuCall = new javax.swing.JMenu();
        MarcasMenuCall = new javax.swing.JMenu();
        ModelosMenuCall = new javax.swing.JMenu();
        ServicosMenuCall = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fundo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ClientesMenuCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pessoas.png"))); // NOI18N
        ClientesMenuCall.setText("Clientes");
        ClientesMenuCall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ClientesMenuCall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ClientesMenuCall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ClientesMenuCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMenuCallMouseClicked(evt);
            }
        });
        jMenuBar1.add(ClientesMenuCall);

        VeiculosMenuCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/moto.png"))); // NOI18N
        VeiculosMenuCall.setText("Veiculos");
        VeiculosMenuCall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        VeiculosMenuCall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VeiculosMenuCall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VeiculosMenuCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VeiculosMenuCallMouseClicked(evt);
            }
        });
        jMenuBar1.add(VeiculosMenuCall);

        MarcasMenuCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/marca.png"))); // NOI18N
        MarcasMenuCall.setText("Marcas");
        MarcasMenuCall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MarcasMenuCall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MarcasMenuCall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MarcasMenuCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarcasMenuCallMouseClicked(evt);
            }
        });
        jMenuBar1.add(MarcasMenuCall);

        ModelosMenuCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/modelos.png"))); // NOI18N
        ModelosMenuCall.setText("Modelos");
        ModelosMenuCall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ModelosMenuCall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModelosMenuCall.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ModelosMenuCall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModelosMenuCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModelosMenuCallMouseClicked(evt);
            }
        });
        jMenuBar1.add(ModelosMenuCall);

        ServicosMenuCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/servico.png"))); // NOI18N
        ServicosMenuCall.setText("Serviços");
        ServicosMenuCall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ServicosMenuCall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ServicosMenuCall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ServicosMenuCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicosMenuCallMouseClicked(evt);
            }
        });
        jMenuBar1.add(ServicosMenuCall);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arquivo.png"))); // NOI18N
        jMenu7.setText("Arquivos");
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/usuario.png"))); // NOI18N
        jMenu8.setText("Usuarios");
        jMenu8.setToolTipText("");
        jMenu8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesMenuCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMenuCallMouseClicked
        // TODO add your handling code here:
        
        ClienteController  clienteController = new ClienteController();
        ArrayList<ClienteClasse> carregaClientes = clienteController.select();
        
         Clientes clientesTela =  new Clientes(carregaClientes);
        clientesTela.setVisible(true);
    }//GEN-LAST:event_ClientesMenuCallMouseClicked

    private void VeiculosMenuCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeiculosMenuCallMouseClicked
        // TODO add your handling code here:
        
         ArrayList<VeiculoClasse> veiculos = new  ArrayList<VeiculoClasse>();
         Veiculos veiculosTela =  new Veiculos(veiculos);
        veiculosTela.setVisible(true);
    }//GEN-LAST:event_VeiculosMenuCallMouseClicked

    private void MarcasMenuCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcasMenuCallMouseClicked
        // TODO add your handling code here:
        MarcasController  marcaController = new MarcasController();
        ArrayList<MarcasClasse> carregaMarcas = marcaController.select();
        
        Marcas marcasTela =  new Marcas(carregaMarcas);
        marcasTela.setVisible(true);
    }//GEN-LAST:event_MarcasMenuCallMouseClicked

    private void ModelosMenuCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModelosMenuCallMouseClicked
        // TODO add your handling code here:
        
        ModelosController modelosController = new ModelosController();
        ArrayList<ModelosClasse> carregaModelos = modelosController.select();
        
        Modelos modelosTela =  new Modelos(carregaModelos);
        modelosTela.setVisible(true);
    }//GEN-LAST:event_ModelosMenuCallMouseClicked

    private void ServicosMenuCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicosMenuCallMouseClicked
        // TODO add your handling code here:
        
        
        Servicos servicosTela =  new Servicos();
        servicosTela.setVisible(true);
    }//GEN-LAST:event_ServicosMenuCallMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        
        
        Arquivos arquivosTela = new Arquivos();
        arquivosTela.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        UsuarioController  usuarioController = new UsuarioController();
        ArrayList<UsuarioClasse> carregaUsuarios = usuarioController.select();

        
        Usuarios telaUsuarios = new Usuarios(carregaUsuarios);
        telaUsuarios.setVisible(true);
        
    }//GEN-LAST:event_jMenu8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ClientesMenuCall;
    private javax.swing.JMenu MarcasMenuCall;
    private javax.swing.JMenu ModelosMenuCall;
    private javax.swing.JMenu ServicosMenuCall;
    private javax.swing.JMenu VeiculosMenuCall;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
