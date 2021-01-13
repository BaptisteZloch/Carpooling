/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import covoiturage.Avis;
import covoiturage.Conducteur;
import covoiturage.Message;
import covoiturage.Passager;
import covoiturage.Trajet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

/**
 *
 * @author admin
 */
public class FAdmin extends javax.swing.JDialog {

    private ArrayList<Conducteur> listeconduc;
    private ArrayList<Passager> listepassa;
    private ArrayList<Trajet> listetraj;
    private ArrayList<Avis> listeavis;
    private ArrayList<Message> listemsg;

    /**
     *
     * @param indexcb
     * @param index
     */
    public void initialiserListes(int indexcb, int index) {
        try {
            indexcb = CBListe.getSelectedIndex();
            index = LListeSpe.getSelectedIndex();
            if (indexcb < 0 || index < 0) {
                Exception excpetion = null;
                throw excpetion;
            }
            switch (indexcb) {
                case 0:
                    listeconduc = ((FAccueil) getParent()).getLeSite().getTabConducteur();
                    TAAffichage.setText(listeconduc.get(index).toString());
                    listeconduc.get(index).getPdp().afficher(LPhoto);
                    BContacter.setVisible(true);
                    break;
                case 1:
                    listepassa = ((FAccueil) getParent()).getLeSite().getTabPassager();
                    TAAffichage.setText(listepassa.get(index).toString());
                    listepassa.get(index).getPdp().afficher(LPhoto);
                    BContacter.setVisible(true);
                    break;
                case 2:
                    BContacter.setVisible(false);
                    LPhoto.setVisible(false);
                    listetraj = ((FAccueil) getParent()).getLeSite().getTabTrajet();
                    TAAffichage.setText(listetraj.get(index).toString());
                    break;
                case 3:
                    BContacter.setVisible(false);
                    LPhoto.setVisible(false);
                    listeavis = ((FAccueil) getParent()).getLeSite().getTabAvis();
                    TAAffichage.setText(listeavis.get(index).toString());
                    break;
                case 4:
                    BContacter.setVisible(false);
                    LPhoto.setVisible(false);
                    listemsg = ((FAccueil) getParent()).getLeSite().getTabMessages();
                    TAAffichage.setText(listemsg.get(index).toString());
                    break;
            }
        } catch (Exception exception) {
        }
    }

    /**
     *
     */
    public void initialiser() {
        ((FAccueil) getParent()).getLeSite().navigAdmin(LListeSpe, CBListe.getSelectedIndex());
    }

    /**
     * Creates new form FAdmin
     * @param parent
     * @param modal
     */
    public FAdmin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        LListeSpe = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        BDeconnexion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CBListe = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAAffichage = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        BContacter = new javax.swing.JButton();
        LNom = new javax.swing.JLabel();
        TFMessage = new javax.swing.JTextField();
        BEnvoyer = new javax.swing.JButton();
        LPhoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LListeSpe.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LListeSpeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LListeSpe);

        jLabel4.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        jLabel4.setText("Liste selectionnée : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BDeconnexion.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 35)); // NOI18N
        BDeconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Déconnexion 32 UI.png"))); // NOI18N
        BDeconnexion.setText(" Déconnexion");
        BDeconnexion.setToolTipText("");
        BDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeconnexionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        jLabel2.setText("Consulter : ");

        CBListe.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        CBListe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liste des Conducteurs", "Liste des Passagers", "Liste des Trajets", "Liste des Avis", "Liste des Messages" }));
        CBListe.setToolTipText("Cliquer pour sélectionner une liste à voir.");
        CBListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBListeActionPerformed(evt);
            }
        });

        TAAffichage.setColumns(20);
        TAAffichage.setRows(5);
        jScrollPane2.setViewportView(TAAffichage);

        jLabel5.setFont(new java.awt.Font("Avenir LT Std 35 Light", 0, 30)); // NOI18N
        jLabel5.setText("Element selectionné :");

        BContacter.setText("Contacter");
        BContacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContacterActionPerformed(evt);
            }
        });

        BEnvoyer.setText("Envoyer");
        BEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnvoyerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TFMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BEnvoyer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BContacter))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LNom, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LNom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BContacter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BEnvoyer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TFMessage)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(670, 100));

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin 64 UI.png"))); // NOI18N
        jLabel1.setText(" Administrateur");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BDeconnexion)
                        .addContainerGap())))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(BDeconnexion)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBListeActionPerformed
        ((FAccueil) getParent()).getLeSite().navigAdmin(LListeSpe, CBListe.getSelectedIndex());
    }//GEN-LAST:event_CBListeActionPerformed

    private void LListeSpeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LListeSpeValueChanged
        this.initialiserListes(CBListe.getSelectedIndex(), LListeSpe.getSelectedIndex());
    }//GEN-LAST:event_LListeSpeValueChanged

    private void BDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeconnexionActionPerformed
        this.setVisible(false);
        try {
            ((FAccueil) getParent()).getLeSite().sauvegarde();//sauvegarde dans les fichiers
        } catch (IOException ex) {
            Logger.getLogger(FMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((FAccueil) getParent()).desinit();
        //((FAccueil) getParent()).getLeSite().flushListes();//nettoie les listes pour éviter les doublons
        ((FAccueil) getParent()).setVisible(true);//permet le connexion d'un autre utilisateur   
    }//GEN-LAST:event_BDeconnexionActionPerformed

    private void BContacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContacterActionPerformed
        LNom.setVisible(true);
        TFMessage.setVisible(true);
        BEnvoyer.setVisible(true);
        int index = LListeSpe.getSelectedIndex();
        int indexcb = CBListe.getSelectedIndex();
        if (index >= 0 && indexcb >= 0) {
            switch (indexcb) {
                case 0:
                    LNom.setText("Envoyez un message à : " + listeconduc.get(index).getMail());
                    break;
                case 1:
                    LNom.setText("Envoyez un message à : " + listepassa.get(index).getMail());
                    break;
            }
        }
    }//GEN-LAST:event_BContacterActionPerformed

    private void BEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnvoyerActionPerformed
        int index = LListeSpe.getSelectedIndex();
        int indexcb = CBListe.getSelectedIndex();
        if (index >= 0 && indexcb >= 0) {
            switch (indexcb) {
                case 0:
                    ((FAccueil) getParent()).getLeSite().contacter("admin.blablacarpe@gmail.com", listeconduc.get(index).getMail(), TFMessage.getText());
                    break;
                case 1:
                    ((FAccueil) getParent()).getLeSite().contacter("admin.blablacarpe@gmail.com", listepassa.get(index).getMail(), TFMessage.getText());
                    break;
            }
        }
        this.initialiserBouton(false);
    }//GEN-LAST:event_BEnvoyerActionPerformed

    /**
     *
     * @param visi
     */
    public void initialiserBouton(boolean visi) {
        BContacter.setVisible(visi);
        LNom.setVisible(visi);
        TFMessage.setVisible(visi);
        BEnvoyer.setVisible(visi);
    }

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
            java.util.logging.Logger.getLogger(FAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FAdmin dialog = new FAdmin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BContacter;
    private javax.swing.JButton BDeconnexion;
    private javax.swing.JButton BEnvoyer;
    private javax.swing.JComboBox<String> CBListe;
    private javax.swing.JList<String> LListeSpe;
    private javax.swing.JLabel LNom;
    private javax.swing.JLabel LPhoto;
    private javax.swing.JTextArea TAAffichage;
    private javax.swing.JTextField TFMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}