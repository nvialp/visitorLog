


/**
 *
 * @author Nicholas Vialpando
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.awt.event.*;
import javax.swing.*;
//imports for saving persistent data
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataCenter_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DataCenter_GUI
     */
    DataCenter DigitalFortress;
    private ArrayList<Visitor> signedIn = new ArrayList<Visitor>();
    private DefaultListModel listSignedInModel = new DefaultListModel();
    static String fileLocation = "visitors_dat.txt";
    
    //constructor
    public DataCenter_GUI() {
        DigitalFortress = new DataCenter();
        initComponents();        
        lblSignInSuccess.setVisible(false);
        lblSignOutSuccess.setVisible(false);        
    }
    
    private void clearTextFields(){
        txtfldFirstName.setText("");
        txtfldLastName.setText("");
        txtfldCompany.setText(""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurrentlySignedIn = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtfldFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtfldLastName = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        txtfldCompany = new javax.swing.JTextField();
        rbtnVendor = new javax.swing.JRadioButton();
        btnSignIn = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        lblSignInSuccess = new javax.swing.JLabel();
        lblSignOutSuccess = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSignedIn = new javax.swing.JList<>();
        btnVisitorRecords = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCurrentlySignedIn.setText("Currently Signed In:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("DIGITAL FORTRESS");

        lblFirstName.setText("First Name");

        txtfldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name");

        txtfldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldLastNameActionPerformed(evt);
            }
        });

        lblCompany.setText("Company");

        txtfldCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldCompanyActionPerformed(evt);
            }
        });

        rbtnVendor.setText("Vendor ?");
        rbtnVendor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rbtnVendor.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        rbtnVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVendorActionPerformed(evt);
            }
        });

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnSignOut.setText("Sign Out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        lblSignInSuccess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSignInSuccess.setText("You have been signed in successfully!");

        lblSignOutSuccess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSignOutSuccess.setText("You have been signed out successfully!");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        listSignedIn.setModel(listSignedInModel);
        listSignedIn.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSignedIn.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSignedInValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listSignedIn);

        btnVisitorRecords.setText("Visitor Records");
        btnVisitorRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitorRecordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblFirstName)
                                .addGap(32, 32, 32)
                                .addComponent(lblLastName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompany)
                            .addComponent(txtfldCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rbtnVendor))
                    .addComponent(lblSignInSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignOutSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignIn)
                    .addComponent(btnClear)
                    .addComponent(btnVisitorRecords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSignOut))
                    .addComponent(lblCurrentlySignedIn))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(277, 277, 277))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSignIn, btnSignOut, btnVisitorRecords});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName)
                                    .addComponent(lblCompany))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfldCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rbtnVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignIn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSignInSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisitorRecords))
                        .addGap(41, 41, 41)
                        .addComponent(lblSignOutSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblCurrentlySignedIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignOut)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnSignIn, btnSignOut});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldFirstNameActionPerformed
        
    }//GEN-LAST:event_txtfldFirstNameActionPerformed

    private void txtfldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldLastNameActionPerformed

    private void txtfldCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldCompanyActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        if(!txtfldFirstName.getText().equals("") && !txtfldLastName.getText().equals("") && !txtfldCompany.getText().equals("")) {
            if (rbtnVendor.isSelected()) {
                Visitor newVendor = new Visitor(txtfldFirstName.getText().trim(), txtfldLastName.getText().trim(), txtfldCompany.getText().trim(), true);
                DigitalFortress.addVisitor(newVendor);
                signedIn.add(newVendor);
                clearTextFields();
                lblSignInSuccess.setVisible(true);
                Timer timer = new Timer(2000, e -> lblSignInSuccess.setVisible(false));
                timer.setRepeats(false);
                timer.start();
                
                //jlist operations to display currently signed in vendors
                listSignedInModel.removeAllElements();
                for(Visitor v: signedIn){
                    Boolean vendor = v.getVendorStatus();
                    if(vendor == true){
                        listSignedInModel.addElement(v.getVendorInfo()); 
                    }                  
                    else{
                        listSignedInModel.addElement(v.getVisitorInfo());
                    }
                }
                rbtnVendor.setSelected(false);
            }
            else{
                Visitor newVisitor = new Visitor(txtfldFirstName.getText().trim(), txtfldLastName.getText().trim(), txtfldCompany.getText().trim());
                DigitalFortress.addVisitor(newVisitor);
                signedIn.add(newVisitor);
                clearTextFields();
                lblSignInSuccess.setVisible(true);
                Timer timer = new Timer(2000, e -> lblSignInSuccess.setVisible(false));
                timer.setRepeats(false);
                timer.start();
                
                listSignedInModel.removeAllElements();
                for(Visitor v: signedIn){
                    Boolean vendor = v.getVendorStatus();
                    if(vendor == false){
                       listSignedInModel.addElement(v.getVendorInfo()); 
                    }                  
                    else{
                        listSignedInModel.addElement(v.getVisitorInfo());
                    }
                }
                rbtnVendor.setSelected(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(DataCenter_GUI.this, "Visitor fields cannot be blank.");
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        int listSignedInIndex = listSignedIn.getSelectedIndex();
        if(listSignedInIndex >= 0){
            //update record with sign out time
            Visitor tempVisitor = signedIn.get(listSignedInIndex);
            DigitalFortress.getVisitor(DigitalFortress.getVisitorIndex(tempVisitor)).setTimeOut();
            
            //save operation
            try{
                    String s = DigitalFortress.getVisitor(DigitalFortress.getVisitorIndex(tempVisitor)).getVisitorData();
                    FileWriter w = new FileWriter(fileLocation,true);
                    BufferedWriter writer = new BufferedWriter(w);
                    writer.write(s);
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(DataCenter_GUI.this, "Record saved");
                }
                catch (IOException e){
                    JOptionPane.showMessageDialog(DataCenter_GUI.this, "File Error");
                }
            
            //remove visitor from the gui
            signedIn.remove(listSignedInIndex);
            clearTextFields();
            lblSignOutSuccess.setVisible(true);
            Timer timer = new Timer(2000, e -> lblSignOutSuccess.setVisible(false));
            timer.setRepeats(false);
            timer.start();
        }
        
        listSignedInModel.removeAllElements();
        for (Visitor v : signedIn) {
            Boolean vendor = v.getVendorStatus();
            if (vendor == false) {
                listSignedInModel.addElement(v.getVendorInfo());
            } else {
                listSignedInModel.addElement(v.getVisitorInfo());
            }
        }
        rbtnVendor.setSelected(false);
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void rbtnVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnVendorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearTextFields();
        lblSignInSuccess.setVisible(false);
        lblSignOutSuccess.setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void listSignedInValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSignedInValueChanged
        int listSignedInIndex = listSignedIn.getSelectedIndex();
        if(listSignedInIndex >= 0){
            Visitor v = signedIn.get(listSignedInIndex);
            txtfldFirstName.setText(v.getFirstName());
            txtfldLastName.setText(v.getLastName());
            txtfldCompany.setText(v.getCompany());
        }
    }//GEN-LAST:event_listSignedInValueChanged

    private void btnVisitorRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitorRecordsActionPerformed
        new VisitorRecords_GUI(DigitalFortress).setVisible(true);
    }//GEN-LAST:event_btnVisitorRecordsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataCenter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataCenter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataCenter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataCenter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataCenter_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnVisitorRecords;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCurrentlySignedIn;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSignInSuccess;
    private javax.swing.JLabel lblSignOutSuccess;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> listSignedIn;
    private javax.swing.JRadioButton rbtnVendor;
    private javax.swing.JTextField txtfldCompany;
    private javax.swing.JTextField txtfldFirstName;
    private javax.swing.JTextField txtfldLastName;
    // End of variables declaration//GEN-END:variables
}
