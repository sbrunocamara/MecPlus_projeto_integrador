/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecPlus.View;

import javax.swing.JOptionPane;

/**
 *
 * @author bsbru
 */
public class Servicos extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Servicos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFornecedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        servicoAddButton = new javax.swing.JButton();
        ServicoEditButton = new javax.swing.JButton();
        ServicoButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/servico.png"))); // NOI18N
        jLabel1.setText("Servicos");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Prob identificado", "Prob relatado", "Veiculo", "CPF/CNPJ Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.setToolTipText("");
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanelFornecedoresLayout = new javax.swing.GroupLayout(jPanelFornecedores);
        jPanelFornecedores.setLayout(jPanelFornecedoresLayout);
        jPanelFornecedoresLayout.setHorizontalGroup(
            jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE))
        );
        jPanelFornecedoresLayout.setVerticalGroup(
            jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        servicoAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        servicoAddButton.setText("Novo");
        servicoAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servicoAddButtonMouseClicked(evt);
            }
        });

        ServicoEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        ServicoEditButton.setText("Editar");
        ServicoEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicoEditButtonMouseClicked(evt);
            }
        });
        ServicoEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicoEditButtonActionPerformed(evt);
            }
        });

        ServicoButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        ServicoButtonDelete.setText("Excluir");
        ServicoButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicoButtonDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(servicoAddButton)
                                .addGap(18, 18, 18)
                                .addComponent(ServicoEditButton)
                                .addGap(18, 18, 18)
                                .addComponent(ServicoButtonDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServicoEditButton)
                            .addComponent(ServicoButtonDelete)
                            .addComponent(servicoAddButton))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void servicoAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicoAddButtonMouseClicked
        // TODO add your handling code here:
        
        ClientesAdd clientesAddTela =  new ClientesAdd();
        clientesAddTela.setVisible(true);
       
    }//GEN-LAST:event_servicoAddButtonMouseClicked

    private void ServicoEditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicoEditButtonMouseClicked
        // TODO add your handling code here:
        ClienteEdit clientesEditTela =  new ClienteEdit();
        clientesEditTela.setVisible(true);


    }//GEN-LAST:event_ServicoEditButtonMouseClicked

    private void ServicoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicoEditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicoEditButtonActionPerformed

    private void ServicoButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicoButtonDeleteMouseClicked
        // TODO add your handling code here:
   int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);

    }//GEN-LAST:event_ServicoButtonDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Servicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ServicoButtonDelete;
    private javax.swing.JButton ServicoEditButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JButton servicoAddButton;
    // End of variables declaration//GEN-END:variables
}
