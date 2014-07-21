/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem.UI;

import librarysystem.Data;
import librarysystem.Entities.Book;
import librarysystem.Entities.Magazine;

/**
 *
 * @author Pjayswal
 */
public class Publication extends javax.swing.JPanel {
    boolean publicationComboFilled;
    /**
     * Creates new form Publication
     */
    public Publication() {
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

        bookRadio = new javax.swing.JRadioButton();
        magazineRadio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        numberPub = new javax.swing.JTextField();
        publicationCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Publication"));

        bookRadio.setSelected(true);
        bookRadio.setText("Book");
        bookRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRadioActionPerformed(evt);
            }
        });

        magazineRadio.setText("Magazine");
        magazineRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineRadioActionPerformed(evt);
            }
        });

        jLabel6.setText("Available Copies:");

        numberPub.setEditable(false);
        numberPub.setEnabled(false);
        numberPub.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                numberPubPropertyChange(evt);
            }
        });

        publicationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicationComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Item:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bookRadio)
                        .addGap(93, 93, 93)
                        .addComponent(magazineRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publicationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberPub, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookRadio)
                    .addComponent(magazineRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numberPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRadioActionPerformed
        
        publicationComboFilled =false;
        publicationCombo.removeAllItems();
        
        for(Book p: Data.books){
            publicationCombo.addItem(p);
        }
        publicationComboFilled =true;
        Publication pub =(Publication)publicationCombo.getItemAt(0);
        //selectAction(pub);
    }//GEN-LAST:event_bookRadioActionPerformed

    private void magazineRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineRadioActionPerformed
        publicationComboFilled =false;
        publicationCombo.removeAllItems();

        for(Magazine p: Data.magazines){
            publicationCombo.addItem(p);
        }
        publicationComboFilled =true;
        Publication pub =(Publication)publicationCombo.getItemAt(0);
        //selectAction(pub);

    }//GEN-LAST:event_magazineRadioActionPerformed

    private void numberPubPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_numberPubPropertyChange
        // TODO add your handling code here:
//        if(numberPub.getText().toString().equals("0")){
//            loanButton.setEnabled(false);
//            reserveButton.setEnabled(true);
//        }
    }//GEN-LAST:event_numberPubPropertyChange

    private void publicationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicationComboActionPerformed
        // TODO add your handling code here:
//        if(publicationComboFilled){
//            Publication pub =(Publication)publicationCombo.getSelectedItem();
//            selectAction(pub);
//        }
    }//GEN-LAST:event_publicationComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bookRadio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton magazineRadio;
    private javax.swing.JTextField numberPub;
    private javax.swing.JComboBox publicationCombo;
    // End of variables declaration//GEN-END:variables
}