/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import covoiturage.Avis;
import covoiturage.Utilisateur;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author admin
 */
public class FLesAvis extends javax.swing.JDialog {

    /**
     * Creates new form FLesAvis
     */
    private ArrayList<Avis> listeAvis;
    private Avis avis;

    /**
     *
     * @param parent
     * @param modal
     */
    public FLesAvis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     *
     */
    public void initialiser() {
        listeAvis = ((FAccueil) getParent()).getfRechTraj().getTrajet().getPilote().getTabAvis();//affiche la liste des trajets selectionnés par  
        ((FAccueil) getParent()).getLeSite().afficherAvisConducteur(LAvis, listeAvis);//met à jour la liste
    }

    /**
     *
     */
    public void initialiserAvis() {
        if (listeAvis.isEmpty() == false && LAvis.getSelectedIndex() >= 0) {
            avis = listeAvis.get(LAvis.getSelectedIndex());
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

        BRetour = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LAvis = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LNote2 = new javax.swing.JLabel();
        LNote5 = new javax.swing.JLabel();
        LNote3 = new javax.swing.JLabel();
        LNote4 = new javax.swing.JLabel();
        LNote1 = new javax.swing.JLabel();
        LAuteur = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAContenu = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        LMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BRetour.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        BRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retour Black 32.png"))); // NOI18N
        BRetour.setText("Retour");
        BRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRetourActionPerformed(evt);
            }
        });

        LAvis.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LAvis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LAvisValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LAvis);

        jLabel4.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        jLabel4.setText("Qui a laissé un avis ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        LNote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile.png"))); // NOI18N
        LNote2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile Vide 32.png"))); // NOI18N

        LNote5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile.png"))); // NOI18N
        LNote5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile Vide 32.png"))); // NOI18N

        LNote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile.png"))); // NOI18N
        LNote3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile Vide 32.png"))); // NOI18N

        LNote4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile.png"))); // NOI18N
        LNote4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile Vide 32.png"))); // NOI18N

        LNote1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile.png"))); // NOI18N
        LNote1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etoile Vide 32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LNote1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LNote2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LNote3)
                .addGap(15, 15, 15)
                .addComponent(LNote4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LNote5)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LNote1)
                    .addComponent(LNote2)
                    .addComponent(LNote3)
                    .addComponent(LNote4)
                    .addComponent(LNote5))
                .addContainerGap())
        );

        LAuteur.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N

        TAContenu.setColumns(20);
        TAContenu.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 18)); // NOI18N
        TAContenu.setRows(5);
        jScrollPane2.setViewportView(TAContenu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(466, 100));

        LMessage.setFont(new java.awt.Font("Segoe WP SemiLight", 0, 70)); // NOI18N
        LMessage.setForeground(new java.awt.Color(255, 255, 255));
        LMessage.setText("Les avis");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(LMessage)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BRetour)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(BRetour)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRetourActionPerformed
        if (((FAccueil) getParent()).getTypeUser2()) {//conducteur
            this.setVisible(false);
            //((FAccueil) getParent()).getfRechTraj().setVisible(true);
        } else {//passager
            this.setVisible(false);
            ((FAccueil) getParent()).getfRechTraj().setVisible(true);
        }
    }//GEN-LAST:event_BRetourActionPerformed

    private void LAvisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LAvisValueChanged
        this.initialiserAvis();
        if (LAvis.getSelectedIndex() != -1) {
            TAContenu.setText(avis.getTexte());//affiche l'indice seletionné dans le texte area
            LAuteur.setText(avis.getAuteur());

            switch (avis.getNote()) {
                case 0:
                    LNote1.setVisible(false);
                    LNote2.setVisible(false);
                    LNote3.setVisible(false);
                    LNote4.setVisible(false);
                    LNote5.setVisible(false);
                    break;
                case 1:
                    LNote1.setVisible(true);
                    LNote2.setVisible(false);
                    LNote3.setVisible(false);
                    LNote4.setVisible(false);
                    LNote5.setVisible(false);
                    break;
                case 2:
                    LNote1.setVisible(true);
                    LNote2.setVisible(true);
                    LNote3.setVisible(false);
                    LNote4.setVisible(false);
                    LNote5.setVisible(false);
                    break;
                case 3:
                    LNote1.setVisible(true);
                    LNote2.setVisible(true);
                    LNote3.setVisible(true);
                    LNote4.setVisible(false);
                    LNote5.setVisible(false);
                    break;
                case 4:
                    LNote1.setVisible(true);
                    LNote2.setVisible(true);
                    LNote3.setVisible(true);
                    LNote4.setVisible(true);
                    LNote5.setVisible(false);
                    break;
                case 5:
                    LNote1.setVisible(true);
                    LNote2.setVisible(true);
                    LNote3.setVisible(true);
                    LNote4.setVisible(true);
                    LNote5.setVisible(true);
                    break;
                default:
                    LNote1.setVisible(false);
                    LNote2.setVisible(false);
                    LNote3.setVisible(false);
                    LNote4.setVisible(false);
                    LNote5.setVisible(false);
                    break;
            }
        }

    }//GEN-LAST:event_LAvisValueChanged

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
            java.util.logging.Logger.getLogger(FLesAvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLesAvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLesAvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLesAvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FLesAvis dialog = new FLesAvis(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRetour;
    private javax.swing.JLabel LAuteur;
    private javax.swing.JList<String> LAvis;
    private javax.swing.JLabel LMessage;
    private javax.swing.JLabel LNote1;
    private javax.swing.JLabel LNote2;
    private javax.swing.JLabel LNote3;
    private javax.swing.JLabel LNote4;
    private javax.swing.JLabel LNote5;
    private javax.swing.JTextArea TAContenu;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
