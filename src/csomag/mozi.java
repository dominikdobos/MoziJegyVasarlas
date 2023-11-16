package csomag;

import javax.swing.ImageIcon;

public class mozi extends javax.swing.JFrame {

    public mozi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        poszter = new javax.swing.JPanel();
        kep = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbFilm = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        rbtn2D = new javax.swing.JRadioButton();
        rbtn3D = new javax.swing.JRadioButton();
        rbtnAngol = new javax.swing.JRadioButton();
        rbtnMagyar = new javax.swing.JRadioButton();
        pJegyek = new javax.swing.JPanel();
        pFelnott = new javax.swing.JPanel();
        lblFDb = new javax.swing.JLabel();
        spnFelnott = new javax.swing.JSpinner();
        chbFelnott = new javax.swing.JCheckBox();
        pDiak = new javax.swing.JPanel();
        lblDDb = new javax.swing.JLabel();
        spnDiak = new javax.swing.JSpinner();
        chbDiak = new javax.swing.JCheckBox();
        btnTorol = new javax.swing.JButton();
        btnFoglal = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        tfFizetendo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        poszter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Poszter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N
        poszter.setPreferredSize(new java.awt.Dimension(200, 300));

        kep.setIcon(new javax.swing.ImageIcon("C:\\Users\\DobosDominik(SZOFT_2\\Desktop\\Java\\MoziJegyVasarlas\\cinema.jpg")); // NOI18N

        javax.swing.GroupLayout poszterLayout = new javax.swing.GroupLayout(poszter);
        poszter.setLayout(poszterLayout);
        poszterLayout.setHorizontalGroup(
            poszterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poszterLayout.createSequentialGroup()
                .addComponent(kep)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        poszterLayout.setVerticalGroup(
            poszterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poszterLayout.createSequentialGroup()
                .addComponent(kep)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filmek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N

        cmbFilm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbFilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz egy filmet!", "57 másodperc", "A lapkirály lánya", "Állati iramban", "A mi kocsmánk", "Az ördögűző: A hívő" }));
        cmbFilm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFilmItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Megtekinthető", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N

        buttonGroup1.add(rbtn2D);
        rbtn2D.setText("2D");

        buttonGroup1.add(rbtn3D);
        rbtn3D.setText("3D");

        buttonGroup2.add(rbtnAngol);
        rbtnAngol.setText("Angol");

        buttonGroup2.add(rbtnMagyar);
        rbtnMagyar.setText("Magyar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn2D)
                    .addComponent(rbtn3D))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMagyar)
                    .addComponent(rbtnAngol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn2D)
                    .addComponent(rbtnAngol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMagyar)
                    .addComponent(rbtn3D))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pJegyek.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jegyek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N

        pFelnott.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Felnőtt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblFDb.setText("Darab:");

        spnFelnott.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        chbFelnott.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbFelnottItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pFelnottLayout = new javax.swing.GroupLayout(pFelnott);
        pFelnott.setLayout(pFelnottLayout);
        pFelnottLayout.setHorizontalGroup(
            pFelnottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFelnottLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbFelnott)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFDb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pFelnottLayout.setVerticalGroup(
            pFelnottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFelnottLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFelnottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chbFelnott)
                    .addComponent(lblFDb)
                    .addComponent(spnFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pDiak.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diák", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblDDb.setText("Darab:");

        spnDiak.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnDiak.setEnabled(false);

        chbDiak.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbDiakItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pDiakLayout = new javax.swing.GroupLayout(pDiak);
        pDiak.setLayout(pDiakLayout);
        pDiakLayout.setHorizontalGroup(
            pDiakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDiakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbDiak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDDb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnDiak, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDiakLayout.setVerticalGroup(
            pDiakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDiakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDiakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chbDiak)
                    .addComponent(lblDDb)
                    .addComponent(spnDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pJegyekLayout = new javax.swing.GroupLayout(pJegyek);
        pJegyek.setLayout(pJegyekLayout);
        pJegyekLayout.setHorizontalGroup(
            pJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJegyekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(pFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        pJegyekLayout.setVerticalGroup(
            pJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJegyekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pJegyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTorol.setBackground(new java.awt.Color(255, 51, 51));
        btnTorol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTorol.setForeground(new java.awt.Color(255, 255, 255));
        btnTorol.setText("Törlés");

        btnFoglal.setBackground(new java.awt.Color(255, 140, 65));
        btnFoglal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFoglal.setForeground(new java.awt.Color(255, 255, 255));
        btnFoglal.setText("Foglalás");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fizetendő", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N

        tfFizetendo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfFizetendo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ft");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poszter, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnFoglal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFoglal, btnTorol});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(poszter, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFoglal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFoglal, btnTorol});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFilmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFilmItemStateChanged
        poszter();
    }//GEN-LAST:event_cmbFilmItemStateChanged

    private void chbDiakItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbDiakItemStateChanged
        fizetendo();
    }//GEN-LAST:event_chbDiakItemStateChanged

    private void chbFelnottItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbFelnottItemStateChanged
        fizetendo();
    }//GEN-LAST:event_chbFelnottItemStateChanged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mozi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoglal;
    private javax.swing.JButton btnTorol;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chbDiak;
    private javax.swing.JCheckBox chbFelnott;
    private javax.swing.JComboBox<String> cmbFilm;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel kep;
    private javax.swing.JLabel lblDDb;
    private javax.swing.JLabel lblFDb;
    private javax.swing.JPanel pDiak;
    private javax.swing.JPanel pFelnott;
    private javax.swing.JPanel pJegyek;
    private javax.swing.JPanel poszter;
    private javax.swing.JRadioButton rbtn2D;
    private javax.swing.JRadioButton rbtn3D;
    private javax.swing.JRadioButton rbtnAngol;
    private javax.swing.JRadioButton rbtnMagyar;
    private javax.swing.JSpinner spnDiak;
    private javax.swing.JSpinner spnFelnott;
    private javax.swing.JTextField tfFizetendo;
    // End of variables declaration//GEN-END:variables

    private void poszter() {
        int kivalasztottFilm = cmbFilm.getSelectedIndex();
        if (kivalasztottFilm == 0) {
            ImageIcon icon = new ImageIcon("cinema.jpg");
            kep.setIcon(icon);
        }
        if (kivalasztottFilm == 1) {
            ImageIcon icon = new ImageIcon("otvenhetmp.jpg");
            kep.setIcon(icon);
        }
        if (kivalasztottFilm == 2) {
            ImageIcon icon = new ImageIcon("lapkiraly.jpg");
            kep.setIcon(icon);
        }
        if (kivalasztottFilm == 3) {
            ImageIcon icon = new ImageIcon("allatiiram.jpg");
            kep.setIcon(icon);
        }
        if (kivalasztottFilm == 4) {
            ImageIcon icon = new ImageIcon("mikocsmank.jpg");
            kep.setIcon(icon);
        }
        if (kivalasztottFilm == 5) {
            ImageIcon icon = new ImageIcon("ordoguzo.jpg");
            kep.setIcon(icon);
        }
    }

    private void fizetendo() {
        int alap = 1;
        if (chbDiak.isSelected()) {
            spnDiak.setValue(Integer.valueOf(alap));
            spnDiak.setEnabled(true);
            
        }
        else {
            spnDiak.setValue(0);
            spnDiak.setEnabled(false);
        }
    }
}
