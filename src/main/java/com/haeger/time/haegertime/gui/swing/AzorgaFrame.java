/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.gui.swing;

/**
 *
 * @author Andreas
 */
public class AzorgaFrame extends java.awt.Frame {

    /**
     * Creates new form AzorgaFrame
     */
    public AzorgaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        textfieldDatum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textfieldTaetigkeit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbKategorie = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        textfieldDauer = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 5, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 500, 210));

        jLabel1.setText("Dauer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 40, -1));

        textfieldDatum.setText("dd.mm.yyyy");
        jPanel1.add(textfieldDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, -1));

        jLabel2.setText("Tätigkeit");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        jPanel1.add(textfieldTaetigkeit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 310, -1));

        jLabel3.setText("Datum");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, -1));

        cbKategorie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbKategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 110, -1));

        jLabel4.setText("Kategorie");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, -1));
        jPanel1.add(textfieldDauer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 40, -1));

        buttonSave.setText("Speichern");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AzorgaFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox cbKategorie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textfieldDatum;
    private javax.swing.JTextField textfieldDauer;
    private javax.swing.JTextField textfieldTaetigkeit;
    // End of variables declaration//GEN-END:variables
}