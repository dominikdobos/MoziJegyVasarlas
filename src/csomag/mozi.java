package csomag;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Mozi extends javax.swing.JFrame {

    public Mozi() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(79, 74, 69));
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("control", new Color(79,74,69));
            UIManager.put("info", new Color(255, 140, 65));
            UIManager.put("nimbusBase", new Color(79,74,69));
            UIManager.put("nimbusAlertYellow", new Color(255, 140, 65));
            UIManager.put("nimbusDisabledText", new Color(108,95,91));
            UIManager.put("nimbusFocus", new Color(255, 140, 65));
            UIManager.put("nimbusGreen", new Color(255, 140, 65));
            UIManager.put("nimbusInfoBlue", new Color(255, 140, 65));
            UIManager.put("nimbusLightBackground", new Color(108,95,91));
            UIManager.put("nimbusOrange", new Color(255, 140, 65));
            UIManager.put("nimbusRed", new Color(255, 140, 65));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(255, 140, 65));
            UIManager.put("text", new Color(255, 255, 255));
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException exc) {
            System.err.println("Nimbus: Unsupported Look and feel!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        poszter = new javax.swing.JPanel();
        kep = new javax.swing.JLabel();
        pFilmek = new javax.swing.JPanel();
        cmbFilm = new javax.swing.JComboBox<>();
        pMegtekintheto = new javax.swing.JPanel();
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
        setTitle("Cinema City");

        poszter.setBackground(new java.awt.Color(79, 74, 69));
        poszter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Poszter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18), new java.awt.Color(255, 140, 65))); // NOI18N
        poszter.setForeground(new java.awt.Color(255, 140, 65));
        poszter.setPreferredSize(new java.awt.Dimension(200, 300));

        kep.setIcon(new javax.swing.ImageIcon("C:\\Users\\bog44\\OneDrive\\Asztali gép\\Java\\MoziJegyVasarlas\\cinema.jpg")); // NOI18N

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

        pFilmek.setBackground(new java.awt.Color(79, 74, 69));
        pFilmek.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filmek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18), new java.awt.Color(255, 140, 65))); // NOI18N

        cmbFilm.setBackground(new java.awt.Color(108, 95, 91));
        cmbFilm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbFilm.setForeground(new java.awt.Color(255, 140, 65));
        cmbFilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz egy filmet!", "57 másodperc", "A lapkirály lánya", "Állati iramban", "A mi kocsmánk", "Az ördögűző: A hívő" }));
        cmbFilm.setOpaque(true);
        cmbFilm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFilmItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pFilmekLayout = new javax.swing.GroupLayout(pFilmek);
        pFilmek.setLayout(pFilmekLayout);
        pFilmekLayout.setHorizontalGroup(
            pFilmekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFilmekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFilmekLayout.setVerticalGroup(
            pFilmekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFilmekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pMegtekintheto.setBackground(new java.awt.Color(79, 74, 69));
        pMegtekintheto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Megtekinthető", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18), new java.awt.Color(255, 140, 65))); // NOI18N

        buttonGroup1.add(rbtn2D);
        rbtn2D.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn2D.setForeground(new java.awt.Color(255, 140, 65));
        rbtn2D.setText("2D");

        buttonGroup1.add(rbtn3D);
        rbtn3D.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn3D.setForeground(new java.awt.Color(255, 140, 65));
        rbtn3D.setText("3D");

        buttonGroup2.add(rbtnAngol);
        rbtnAngol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnAngol.setForeground(new java.awt.Color(255, 140, 65));
        rbtnAngol.setText("Angol");

        buttonGroup2.add(rbtnMagyar);
        rbtnMagyar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnMagyar.setForeground(new java.awt.Color(255, 140, 65));
        rbtnMagyar.setText("Magyar");

        javax.swing.GroupLayout pMegtekinthetoLayout = new javax.swing.GroupLayout(pMegtekintheto);
        pMegtekintheto.setLayout(pMegtekinthetoLayout);
        pMegtekinthetoLayout.setHorizontalGroup(
            pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMegtekinthetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn2D)
                    .addComponent(rbtn3D))
                .addGap(38, 38, 38)
                .addGroup(pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMagyar)
                    .addComponent(rbtnAngol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pMegtekinthetoLayout.setVerticalGroup(
            pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMegtekinthetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn2D)
                    .addComponent(rbtnAngol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pMegtekinthetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMagyar)
                    .addComponent(rbtn3D))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pJegyek.setBackground(new java.awt.Color(79, 74, 69));
        pJegyek.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jegyek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18), new java.awt.Color(255, 140, 65))); // NOI18N

        pFelnott.setBackground(new java.awt.Color(79, 74, 69));
        pFelnott.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Felnőtt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 140, 65))); // NOI18N

        lblFDb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFDb.setForeground(new java.awt.Color(255, 140, 65));
        lblFDb.setText("Darab:");

        spnFelnott.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spnFelnott.setEnabled(false);
        spnFelnott.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFelnottStateChanged(evt);
            }
        });

        chbFelnott.setIcon(new javax.swing.ImageIcon("C:\\Users\\bog44\\OneDrive\\Asztali gép\\Java\\MoziJegyVasarlas\\uncheckbox.jpg")); // NOI18N
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

        pDiak.setBackground(new java.awt.Color(79, 74, 69));
        pDiak.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diák", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 140, 65))); // NOI18N

        lblDDb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDDb.setForeground(new java.awt.Color(255, 140, 65));
        lblDDb.setText("Darab:");

        spnDiak.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spnDiak.setEnabled(false);
        spnDiak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDiakStateChanged(evt);
            }
        });

        chbDiak.setBorder(null);
        chbDiak.setContentAreaFilled(false);
        chbDiak.setIcon(new javax.swing.ImageIcon("C:\\Users\\bog44\\OneDrive\\Asztali gép\\Java\\MoziJegyVasarlas\\uncheckbox.jpg")); // NOI18N
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
        btnTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorolActionPerformed(evt);
            }
        });

        btnFoglal.setBackground(new java.awt.Color(255, 140, 65));
        btnFoglal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFoglal.setForeground(new java.awt.Color(255, 255, 255));
        btnFoglal.setText("Foglalás");
        btnFoglal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoglalActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(79, 74, 69));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fizetendő", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18), new java.awt.Color(255, 140, 65))); // NOI18N

        tfFizetendo.setBackground(new java.awt.Color(108, 95, 91));
        tfFizetendo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfFizetendo.setForeground(new java.awt.Color(255, 140, 65));
        tfFizetendo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFizetendo.setText("0");
        tfFizetendo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfFizetendo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 140, 65));
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
                            .addComponent(pFilmek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMegtekintheto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
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
                        .addComponent(pFilmek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pMegtekintheto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pJegyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFoglal, btnTorol});

        pack();
        setLocationRelativeTo(null);
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

    private void spnDiakStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDiakStateChanged
       jegyAr();
    }//GEN-LAST:event_spnDiakStateChanged

    private void spnFelnottStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFelnottStateChanged
        jegyAr();
    }//GEN-LAST:event_spnFelnottStateChanged

    private void btnFoglalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoglalActionPerformed
        boolean diakJegyPipa = chbDiak.isSelected() == true;
        boolean felnottJegyPipa = chbFelnott.isSelected() == true;
        int filmKivalasztva = cmbFilm.getSelectedIndex();
        boolean ketDPipa = rbtn2D.isSelected() == true;
        boolean haromDPipa = rbtn3D.isSelected() == true;
        boolean angolPipa = rbtnAngol.isSelected() == true;
        boolean magyarPipa = rbtnMagyar.isSelected() == true;
        
        String foglalas = "Film címe: "+ cmbFilm.getSelectedItem() +"\n";
        if (diakJegyPipa) {
            foglalas += "Diák jegy(ek): "+ spnDiak.getValue() +" db\n";
        }
        if (felnottJegyPipa) {
            foglalas += "Felnőtt jegy(ek): "+ spnFelnott.getValue() +" db\n";
        }
        foglalas += "Megtekintés módja: ";
        if (ketDPipa) {
            foglalas += "2D, ";
        }
        if (haromDPipa) {
            foglalas += "3D, ";
        }
        if (angolPipa) {
            foglalas += "angol szinkron.\n";
        }
        if (magyarPipa) {
            foglalas += "magyar szinkron.\n";
        }
        foglalas += "Fizetendő: "+ tfFizetendo.getText() +" Ft.-";
        
        if((diakJegyPipa || felnottJegyPipa) && filmKivalasztva > 0 && (ketDPipa || haromDPipa) && (angolPipa || magyarPipa)) {
            Object[] opciok = {"Igen","Mégse"};
            int kivalasztottOpcio = JOptionPane.showOptionDialog(rootPane, "Biztosan lefoglalja a kiválasztott konfigurációt?\n"+foglalas, "Foglalás megerősítés", 2, 2, null, opciok, EXIT_ON_CLOSE);
            if (kivalasztottOpcio == 0) {
                JOptionPane.showMessageDialog(rootPane, "A foglalása sikeres volt.\nJó szórakozást!", "SIKERES FOGLALÁS!", 1);
                buttonGroup1.clearSelection();
                buttonGroup2.clearSelection();
                chbDiak.setSelected(false);
                chbFelnott.setSelected(false);
                cmbFilm.setSelectedIndex(0);
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Hibás konfiguráció!", "HIBA! - Foglalás", 0);
        }
    }//GEN-LAST:event_btnFoglalActionPerformed

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
        Object[] opciok = {"Igen","Mégse"};
        int kivalasztottTorlesek = JOptionPane.showOptionDialog(rootPane, "Biztos törlöd a kiválasztott beállításokat?", "Törlés megerősítés", 2, 2, null, opciok, EXIT_ON_CLOSE);
        if (kivalasztottTorlesek == 0) {
            buttonGroup1.clearSelection();
            buttonGroup2.clearSelection();
            chbDiak.setSelected(false);
            chbFelnott.setSelected(false);
            cmbFilm.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnTorolActionPerformed

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
            java.util.logging.Logger.getLogger(Mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mozi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mozi().setVisible(true);
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel kep;
    private javax.swing.JLabel lblDDb;
    private javax.swing.JLabel lblFDb;
    private javax.swing.JPanel pDiak;
    private javax.swing.JPanel pFelnott;
    private javax.swing.JPanel pFilmek;
    private javax.swing.JPanel pJegyek;
    private javax.swing.JPanel pMegtekintheto;
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
            spnDiak.setValue(alap);
            spnDiak.setEnabled(true);
            ImageIcon icon = new ImageIcon("checkbox.jpg");
            chbDiak.setIcon(icon);
        }
        else {
            spnDiak.setValue(0);
            spnDiak.setEnabled(false);
            ImageIcon icon = new ImageIcon("uncheckbox.jpg");
            chbDiak.setIcon(icon);
        }
        
        if (chbFelnott.isSelected()) {
            spnFelnott.setValue(alap);
            spnFelnott.setEnabled(true);
            ImageIcon icon = new ImageIcon("checkbox.jpg");
            chbFelnott.setIcon(icon);
        }
        else {
            spnFelnott.setValue(0);
            spnFelnott.setEnabled(false);
            ImageIcon icon = new ImageIcon("uncheckbox.jpg");
            chbFelnott.setIcon(icon);
        }
        
    }

    private int jegyAr() {
        int diakJegy = 1500;
        int felnottJegy = 3000;
        
        int diakJegyDb = (int) spnDiak.getValue();
        int felnottJegyDb = (int) spnFelnott.getValue();
        
        int fizetendoAr = (diakJegy * diakJegyDb) + (felnottJegy * felnottJegyDb);
        
        tfFizetendo.setText(String.valueOf(fizetendoAr));
        
        return fizetendoAr;
    }

    private void torles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

