/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_ice_cream;

import java.awt.ComponentOrientation;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    private IceCreamSelling ice;
    
    public MainScreen() {
        initComponents();
        this.setTitle("Happy Cup");
        this.setResizable(false);
        this.setComponentOrientation(ComponentOrientation.UNKNOWN);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.FillTopSelling();
    }
private void FillTopSelling(){
         ResultSet data =   clsOrderItem.TopSellingItems();
         if (data ==null)
         {
             return;
         }
         try{
             data.next();
         lblTopItemName.setText(data.getString("type"));
         lblSellingCount.setText(data.getString("sellingcount"));
         }
         catch (Exception ex)
         {
             //JOptionPane.showMessageDialog(null, ex.getMessage());
             System.err.println(ex.getMessage());
             lblTopItemName.setText("");
             lblSellingCount.setText("");
         }
         
    }
       
    public MainScreen(int Quantity,double total,IceCreamSelling screen) {
        initComponents();
        this.ice = screen;
        this.setTitle("Happy Cup");
        this.txtQuantity.setText(String.valueOf(Quantity));
        this.txtSubTotal.setText(String.valueOf(ice.Order.getTotalwithtax()));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
       btnNewOrder1.setText("Edit Order");
       txtQuantity.setEditable(false);
       this.FillTopSelling();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnNewOrder1 = new javax.swing.JButton();
        btnNewOrder2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTopItemName = new javax.swing.JLabel();
        lblSellingCount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_ice_cream/happycup400.png"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel6.setText("Main");

        btnNewOrder.setText("Print");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        txtSubTotal.setEditable(false);
        txtSubTotal.setForeground(new java.awt.Color(255, 0, 0));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        jLabel3.setText("This order total");

        btnNewOrder1.setText("Begin Order");
        btnNewOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder1ActionPerformed(evt);
            }
        });

        btnNewOrder2.setText("New order");
        btnNewOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Item Name:");

        lblTopItemName.setText("ItemName");

        lblSellingCount.setText("0");

        jLabel7.setText("Selling Count:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTopItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSellingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblSellingCount))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblTopItemName)))
                .addContainerGap())
        );

        jLabel4.setText("Top Selling Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(txtQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewOrder1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtSubTotal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNewOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewOrder2)))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewOrder1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewOrder)
                    .addComponent(btnNewOrder2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // print 
        
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void btnNewOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder1ActionPerformed
        // TODO add your handling code here:
         int quantity=0;
        try
        {
            quantity = Integer.parseInt(txtQuantity.getText());
            if (quantity<=0)
            {
                JOptionPane.showMessageDialog(this, "Value couldnt be negative");
                return;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Invalid quantity value");
            return;
            
        }
        if (quantity>0)
        {
            if (this.ice == null)
            {
                this.ice = new IceCreamSelling(quantity);
            }
            this.ice.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnNewOrder1ActionPerformed

    private void btnNewOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder2ActionPerformed
        // TODO add your handling code here:
        this.ice.dispose();
        this.ice = null;
        txtQuantity.setText("");
        txtSubTotal.setText("");
        btnNewOrder1.setText("Begin Order");
        txtQuantity.setEditable(true);
       
    }//GEN-LAST:event_btnNewOrder2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnNewOrder1;
    private javax.swing.JButton btnNewOrder2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSellingCount;
    private javax.swing.JLabel lblTopItemName;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables
}
