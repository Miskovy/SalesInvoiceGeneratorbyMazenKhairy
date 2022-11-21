/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.FileOperations;
import Model.InvoiceHeader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MainFrame extends javax.swing.JFrame {
    int num1 = 0;
    int total = 0;
    int indexsave = -2;
    InvoiceHeader IH = new InvoiceHeader();
DefaultTableModel model;
    public MainFrame() {
        initComponents();
        model = (DefaultTableModel) table1.getModel();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        createinvoicebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        deleteinvoicebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        invoicenum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        invoicedateTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customernameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        invoicetotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadfilemenu = new javax.swing.JMenuItem();
        savefilemenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        JScrollPane1.setToolTipText("Invoices Table");
        JScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JScrollPane1MouseClicked(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        JScrollPane1.setViewportView(table1);

        createinvoicebtn.setText("Create New Invoice");
        createinvoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createinvoicebtnActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        deleteinvoicebtn.setText("Delete Invoice");
        deleteinvoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteinvoicebtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        invoicenum.setText("0");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Invoice Total");

        invoicetotal.setText("0");

        jScrollPane2.setToolTipText("Invoices Items");
        jScrollPane2.setName("Invoice Items"); // NOI18N

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, "0"},
                {"2", "", null, null, "0"},
                {"3", null, null, null, "0"}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        table2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                table2MouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        jMenu1.setText("File");

        loadfilemenu.setText("Load File");
        loadfilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfilemenuActionPerformed(evt);
            }
        });
        jMenu1.add(loadfilemenu);

        savefilemenu.setText("Save File");
        savefilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefilemenuActionPerformed(evt);
            }
        });
        jMenu1.add(savefilemenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(createinvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(deleteinvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savebtn)
                        .addGap(65, 65, 65)
                        .addComponent(cancelbtn)
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(invoicenum)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(invoicetotal)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(customernameTF)
                                            .addComponent(invoicedateTF)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoicenum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(invoicedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(invoicetotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(JScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createinvoicebtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteinvoicebtn)
                        .addComponent(savebtn)
                        .addComponent(cancelbtn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Create Invoice Button Action
    private void createinvoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createinvoicebtnActionPerformed
        num1++;
        model.insertRow(model.getRowCount(), new Object[]{num1, invoicedateTF.getText() , customernameTF.getText()});
    }//GEN-LAST:event_createinvoicebtnActionPerformed
// Delete Invoice Button Action
    private void deleteinvoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteinvoicebtnActionPerformed
         // check for selected row first
            if(table1.getSelectedRow() != -1) {
               // remove selected row from the model
               model.removeRow(table1.getSelectedRow());
            }
    }//GEN-LAST:event_deleteinvoicebtnActionPerformed
//Loading a file (CSV)
    private void loadfilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfilemenuActionPerformed

                   
    }//GEN-LAST:event_loadfilemenuActionPerformed

    private void JScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JScrollPane1MouseClicked

    }//GEN-LAST:event_JScrollPane1MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
                             // check for selected row first
            if(table1.getSelectedRow() != -1) {
               // gets the selected row index
               invoicenum.setText( String.valueOf(table1.getValueAt(table1.getSelectedRow(), 0)));
               invoicedateTF.setText((String) table1.getValueAt(table1.getSelectedRow(), 1));
               customernameTF.setText((String) table1.getValueAt(table1.getSelectedRow(), 2));
               invoicetotal.setText((String) table1.getValueAt(table1.getSelectedRow(), 3));
               //Updating Data
               if((int)table1.getSelectedRow() == indexsave){
               for (int x = 0 ; x < 3 ; x++){
               switch (x){
               case 0:
               table2.setValueAt(IH.invoiceNum1, x,0);
               table2.setValueAt(IH.arraylist[0][0], x, 1);
               table2.setValueAt(IH.arraylist[1][0], x, 2);
               table2.setValueAt(IH.arraylist[2][0], x, 3);
               table2.setValueAt(IH.invoicetotalprice1, x, 4);
               break;
               case 1:
               table2.setValueAt(IH.invoiceNum2, x,0);
               table2.setValueAt(IH.arraylist[0][1], x, 1);
               table2.setValueAt(IH.arraylist[1][1], x, 2);
               table2.setValueAt(IH.arraylist[2][1], x, 3);
               table2.setValueAt(IH.invoicetotalprice2, x, 4);
               break;
               case 2:
               table2.setValueAt(IH.invoiceNum3, x,0);
               table2.setValueAt(IH.arraylist[0][2], x, 1);
               table2.setValueAt(IH.arraylist[1][2], x, 2);
               table2.setValueAt(IH.arraylist[2][2], x, 3);
               table2.setValueAt(IH.invoicetotalprice3, x, 4);
               break;
           
       }
               }
               }
               else{
               for (int z = 0; z < 3 ; z++){
               switch (z){
                   case 0:
                       table2.setValueAt("", z, 0);
                       table2.setValueAt("", z, 1);
                       table2.setValueAt("", z, 2);
                       table2.setValueAt("", z, 3);
                       table2.setValueAt("", z, 4);
                       break;
                   case 1:
                       table2.setValueAt("", z, 0);
                       table2.setValueAt("", z, 1);
                       table2.setValueAt("", z, 2);
                       table2.setValueAt("", z, 3);
                       table2.setValueAt("", z, 4);
                       break;
                   case 2:
                       table2.setValueAt("", z, 0);
                       table2.setValueAt("", z, 1);
                       table2.setValueAt("", z, 2);
                       table2.setValueAt("", z, 3);
                       table2.setValueAt("", z, 4);
                       break;
               }
               }
               }
            }
            else {
                invoicenum.setText("0");
            }
    }//GEN-LAST:event_table1MouseClicked
// Saving and exporting data
    private void savefilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefilemenuActionPerformed
JFileChooser fileChooser = new JFileChooser();
 fileChooser.setDialogTitle("Save Invoice");
 int userSelection = fileChooser.showSaveDialog(this);
 

    }//GEN-LAST:event_savefilemenuActionPerformed

    private void table2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseMoved
        
    }//GEN-LAST:event_table2MouseMoved
//Saving Changes Button
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed

        if(table1.getSelectedRow() != -1){
       for (int i = 0; i < 3 ; i++){
       switch (i){
           case 0 -> {
               IH.invoiceNum1 = (String) table2.getValueAt(i, 0);
               IH.arraylist [0][0] = table2.getValueAt(i, 1);
               IH.arraylist [1][0] = table2.getValueAt(i, 2);
               IH.arraylist [2][0] = table2.getValueAt(i, 3);
               IH.invoicetotalprice1 = (String) table2.getValueAt(i, 4);
 
               }
           case 1 -> {
               IH.invoiceNum2 = (String) table2.getValueAt(i, 0);
               IH.arraylist [0][1] = table2.getValueAt(i, 1);
               IH.arraylist [1][1] = table2.getValueAt(i, 2);
               IH.arraylist [2][1] = table2.getValueAt(i, 3);
               IH.invoicetotalprice2 = (String) table2.getValueAt(i, 4);
               }
          case 2 -> {
              IH.invoiceNum3 = (String) table2.getValueAt(i, 0);
              IH.arraylist [0][2] = table2.getValueAt(i, 1);
              IH.arraylist [1][2] = table2.getValueAt(i, 2);
              IH.arraylist [2][2] = table2.getValueAt(i, 3);
              IH.invoicetotalprice3 = (String) table2.getValueAt(i, 4);
               }
       }
       }
       indexsave = table1.getSelectedRow();
       }
    }//GEN-LAST:event_savebtnActionPerformed
// Cancelling Changes Button
    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
                      //Removing Table Items First
        for (int y = 0; y < 3 ; y++){
               switch (y){
                   case 0:
                       table2.setValueAt("", y, 0);
                       table2.setValueAt("", y, 1);
                       table2.setValueAt("", y, 2);
                       table2.setValueAt("", y, 3);
                       table2.setValueAt("", y, 4);
                       break;
                   case 1:
                       table2.setValueAt("", y, 0);
                       table2.setValueAt("", y, 1);
                       table2.setValueAt("", y, 2);
                       table2.setValueAt("", y, 3);
                       table2.setValueAt("", y, 4);
                       break;
                   case 2:
                       table2.setValueAt("", y, 0);
                       table2.setValueAt("", y, 1);
                       table2.setValueAt("", y, 2);
                       table2.setValueAt("", y, 3);
                       table2.setValueAt("", y, 4);
                       break;
               }
               }
        //Saving Changes to Empty Fields in Invoice Header
        indexsave = -2;
    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton createinvoicebtn;
    private javax.swing.JTextField customernameTF;
    private javax.swing.JButton deleteinvoicebtn;
    private javax.swing.JTextField invoicedateTF;
    private javax.swing.JLabel invoicenum;
    private javax.swing.JLabel invoicetotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadfilemenu;
    private javax.swing.JButton savebtn;
    private javax.swing.JMenuItem savefilemenu;
    public javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
