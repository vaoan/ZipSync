/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.refactor.view;

import e.utility.AccionesVentana;
import e.utility.FilesUtility;
import e.utility.JFolderChooser;
import e.utility.TextAreaOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangarita
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    AccionesVentana nuevo;
    String strRoot = System.getProperty("user.dir");
    JFolderChooser chooser;
    java.util.ArrayList<String> fileList;

    public Index() {        
        AccionesVentana.LooknFeel();
        initComponents();
        this.nuevo = new AccionesVentana(this, "e-Repackage");
        PrintStream con = null;
        try {
            con = new PrintStream(new TextAreaOutputStream(this.txtConsole, 400), true, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.setOut(con);
        System.out.println("Welcome!");
    }

    private void SearchingFolder() {
        try {
            this.txtFolderProyect.setText(this.chooser.getStrPath());
            this.btnRead.setEnabled(true);
        } catch (Exception ex) {
            this.btnRead.setEnabled(false);
            txtFolderProyect.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlFolder = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtFolderProyect = new javax.swing.JTextField();
        btnRead = new javax.swing.JButton();
        tbbData = new javax.swing.JTabbedPane();
        pnlData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        chkCopyAll = new javax.swing.JCheckBox();
        chkAddNewFiles = new javax.swing.JCheckBox();
        chkInclude = new javax.swing.JCheckBox();
        txtRegexInclude = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        btnFix = new javax.swing.JButton();
        pnlFolder1 = new javax.swing.JPanel();
        btnSearch1 = new javax.swing.JButton();
        txtFolderProyect1 = new javax.swing.JTextField();
        btnRead1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFolder.setBorder(javax.swing.BorderFactory.createTitledBorder("To Sync Folder"));

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtFolderProyect.setEditable(false);
        txtFolderProyect.setBackground(new java.awt.Color(255, 255, 255));
        txtFolderProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolderProyectActionPerformed(evt);
            }
        });

        btnRead.setText("Leer");
        btnRead.setEnabled(false);
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFolderLayout = new javax.swing.GroupLayout(pnlFolder);
        pnlFolder.setLayout(pnlFolderLayout);
        pnlFolderLayout.setHorizontalGroup(
            pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFolderProyect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRead)
                .addContainerGap())
        );
        pnlFolderLayout.setVerticalGroup(
            pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtFolderProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRead))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ARCHIVOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlData.setViewportView(tblData);

        tbbData.addTab("Lista de archivos", pnlData);

        txtConsole.setBackground(new java.awt.Color(51, 51, 51));
        txtConsole.setColumns(20);
        txtConsole.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtConsole.setForeground(new java.awt.Color(102, 255, 0));
        txtConsole.setRows(5);
        jScrollPane1.setViewportView(txtConsole);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        tbbData.addTab("Consola", jPanel1);

        chkCopyAll.setText("Realizar BackUp de los archivos leídos");
        chkCopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCopyAllActionPerformed(evt);
            }
        });

        chkAddNewFiles.setSelected(true);
        chkAddNewFiles.setText("Agregar archivos que no se encuentren en los archivos seleccionados");

        chkInclude.setText("Incluir SOLO archivos por nombre según cumplan con la expresión regular descrita");

        txtRegexInclude.setText("^.*(ob12\\.zip)$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegexInclude)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCopyAll)
                            .addComponent(chkAddNewFiles)
                            .addComponent(chkInclude))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkCopyAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAddNewFiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkInclude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegexInclude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        tbbData.addTab("Opciones", jPanel2);

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnFix.setText("Iniciar");
        btnFix.setEnabled(false);
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        pnlFolder1.setBorder(javax.swing.BorderFactory.createTitledBorder("Origin Folder"));

        btnSearch1.setText("Buscar");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        txtFolderProyect1.setEditable(false);
        txtFolderProyect1.setBackground(new java.awt.Color(255, 255, 255));
        txtFolderProyect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolderProyect1ActionPerformed(evt);
            }
        });

        btnRead1.setText("Leer");
        btnRead1.setEnabled(false);
        btnRead1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRead1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFolder1Layout = new javax.swing.GroupLayout(pnlFolder1);
        pnlFolder1.setLayout(pnlFolder1Layout);
        pnlFolder1Layout.setHorizontalGroup(
            pnlFolder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFolderProyect1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRead1)
                .addContainerGap())
        );
        pnlFolder1Layout.setVerticalGroup(
            pnlFolder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFolder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch1)
                    .addComponent(txtFolderProyect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRead1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbbData)
                    .addComponent(pnlFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFix))
                    .addComponent(pnlFolder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbbData, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFix, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.chooser = new JFolderChooser();
        this.chooser.OpenChooser("");
        SearchingFolder();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFolderProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolderProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolderProyectActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        java.io.File file = new java.io.File(this.txtFolderProyect.getText());

        String DriveDesc = FilesUtility.PathRootDesc(file.getPath());
        System.out.println(DriveDesc);

        if (!DriveDesc.toLowerCase().contains("disco local")) {
            javax.swing.JOptionPane.showMessageDialog(null, "El proceso debe realizarse en un disco local");

            return;
        }

        this.fileList = this.chooser.getFileList(false);

        javax.swing.table.TableModel model = this.tblData.getModel();

        java.util.Iterator<String> ite = this.fileList.iterator();
        int cont = 0;

        while (ite.hasNext()) {
            String ele = (String) ite.next();
            model.setValueAt(ele, cont, 0);
            cont++;
        }

        this.pnlFolder.setEnabled(false);
        this.btnRead.setEnabled(false);
        this.btnSearch.setEnabled(false);

        this.btnFix.setEnabled(true);
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed
        this.btnFix.setEnabled(false);

        String strPath = this.txtFolderProyect.getText();

        if (!this.chkCopyAll.isSelected()) {
            String strMessaje = "¿Seguro que desea SOBREESCRIBIR los archivos originales?\n(Una vez iniciado el proceso los archivos orignales serán irrecuperables)";

            int showConfirmDialog = javax.swing.JOptionPane.showConfirmDialog(this.rootPane, strMessaje);

            switch (showConfirmDialog) {
                case 1:
                    this.chkCopyAll.setSelected(true);
                    break;
                case 0:
                    this.chkCopyAll.setSelected(false);
                    break;
                default:
                    this.btnFix.setEnabled(true);
                    return;
            }
        }

        this.lblMessage.setText("Trabajando...");

        Object[] objParams = {
            strPath,
            this.lblMessage,
            this.chkCopyAll.isSelected(),
            this.chkAddNewFiles.isSelected(),
            chkInclude.isSelected() ? txtRegexInclude.getText() : "*"
        };

        this.tbbData.setSelectedIndex(1);

        Thread main = new Thread(new Run(objParams));
        main.start();
    }//GEN-LAST:event_btnFixActionPerformed

    private void chkCopyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCopyAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCopyAllActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void txtFolderProyect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolderProyect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolderProyect1ActionPerformed

    private void btnRead1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRead1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRead1ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFix;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnRead1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JCheckBox chkAddNewFiles;
    private javax.swing.JCheckBox chkCopyAll;
    private javax.swing.JCheckBox chkInclude;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JScrollPane pnlData;
    private javax.swing.JPanel pnlFolder;
    private javax.swing.JPanel pnlFolder1;
    private javax.swing.JTabbedPane tbbData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextField txtFolderProyect;
    private javax.swing.JTextField txtFolderProyect1;
    private javax.swing.JTextField txtRegexInclude;
    // End of variables declaration//GEN-END:variables
}
