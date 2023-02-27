

package app;

import database.ResultSetTableModel;
import database.parametres;
import database.bdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/** interface de la caisse pour les caissiers */

public class Caisse extends javax.swing.JFrame {

   /** les declarations */
    
    
    ResultSet rs;
    bdd db;
    int old, dec, now;
    
     /** fonction pour la connexion avec la bdd */
    public Caisse() {
        db = new bdd(new parametres().HOST_DB, new parametres().USERNAME_DB, new parametres().PASSWORD_DB, new parametres().IPHOST, new parametres().PORT);
        
        initComponents();
        table();
        jam();
        
    }
/** fontion de la table */
    public void table() {
        String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
        rs = db.querySelect(colon, "produits");
        tbl_prod.setModel(new ResultSetTableModel(rs));
    }
/** fontion pour la date */
    public void jam() {
        Date s = new Date();
        SimpleDateFormat jma = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat hm = new SimpleDateFormat("HH:mm");
        
        lbl2.setText(jma.format(s));}
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox();
        txtrech = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcou = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        txtqte = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtfini = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        tbl_prod.setBackground(new java.awt.Color(204, 204, 204));
        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Description", "Type", "Couleur", "Finition", "Prix", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_prod.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_prod.setRowHeight(30);
        tbl_prod.setShowHorizontalLines(true);
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Caisse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Recherche par Catégorie :");

        comrech.setBackground(new java.awt.Color(204, 204, 204));
        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Nom", "Description", "Type", "Couleur", "Finition", "Prix" }));

        txtrech.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Code :");

        txtcode.setBackground(new java.awt.Color(204, 204, 204));
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });

        txtnom.setBackground(new java.awt.Color(204, 204, 204));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Nom :");

        txttype.setBackground(new java.awt.Color(204, 204, 204));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Prix :");

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Type :");

        txtcou.setBackground(new java.awt.Color(204, 204, 204));
        txtcou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcouActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Couleur :");

        txtprix.setBackground(new java.awt.Color(204, 204, 204));
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });

        txtqte.setBackground(new java.awt.Color(204, 204, 204));
        txtqte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqteActionPerformed(evt);
            }
        });
        txtqte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqteKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Quantité :");

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Vendre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("DZD : ");

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setForeground(new java.awt.Color(204, 204, 255));
        lbltot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot1.setText("0");

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Recherche ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Actualiser");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Sortir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        txtfini.setBackground(new java.awt.Color(204, 204, 204));
        txtfini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiniActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Finition :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(230, 578, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtcou, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(txtqte, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(txtfini, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbltot1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcou, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltot1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtcouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcouActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void txtqteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       /** fonction pour la recherche par categorie */
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir votre recherche.");
        } else {
            if (comrech.getSelectedItem().equals("code_produit")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Code LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Nom")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Nom LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Description")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Description LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Type")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Type LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Couleur")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Couleur LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Finition")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Finition LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Prix")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Prix LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Stock")) {
                String colon[] = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "produits", "Stock LIKE '" + txtrech.getText() + "' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            
            
            
                
            
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /** fonction pour demander a l'utilisateur de saisir la quantité à vendre */
        if (txtqte.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir la quantité.");
        
        } else {
            
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "Erreur : La quantité demandée dépasse le stock disponible pour ce produit. Veuillez réduire la quantité ou sélectionner un produit différent.");
                } else {
                    def(); //true
                    table(); //true
                }
            } catch (SQLException ex) {
                Logger.getLogger(Caisse.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
           JOptionPane.showMessageDialog(this, "Produit vendu");
        }
       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtqteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqteKeyReleased
 subtotal();        // TODO add your handling code here:
    }//GEN-LAST:event_txtqteKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     /** pour actualiser la table */
      txtcode.setText("");
            txtnom.setText (""); 
                    
                             txttype.setText("");
                                     txtcou.setText("");
                                             txtfini.setText("");
                                                     txtprix.setText("");
                                                            
                                                                     txtqte.setText("");
                                                                     lbltot1.setText("0");
        table();  
     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 /** pour se deconnecter */
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
 
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
      /** quand on clique sur un produit dans le tableau les informations seront afficher dans les champs text */
        txtcode.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0)));
        txtcode.setEditable(false);
        txtnom.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 1)));       
        txtnom.setEditable(false);
        txttype.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 3)));
        txttype.setEditable(false);
        txtcou.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 4)));
        txtcou.setEditable(false);
        txtfini.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 5)));
        txtfini.setEditable(false);
        txtprix.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 6)));
        txtprix.setEditable(false);
      

    }//GEN-LAST:event_tbl_prodMouseClicked

    private void txtfiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiniActionPerformed

   /** fonction pour calculer le prix total quand l'utilisateur saisi une quantité */
    
   
     public void subtotal() {
        double a = Double.parseDouble(txtprix.getText());
        double b = Double.parseDouble(txtqte.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));}
     
      /** fonction pour verifier si la quantité saisi par l'utilisateur est disponible */
       public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produits","Code='" + txtcode.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Stock");
        }
        dec = Integer.parseInt(txtqte.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }

       /** fonction pour soustraire la quantité saisi par l'utilisateur du stock */
    public void def() throws SQLException {
        rs = db.querySelectAll("produits", "Code='" + txtcode.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Stock");
        }
        dec = Integer.parseInt(txtqte.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"Stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produits", colon, isi, "Code='" + txtcode.getText() + "'"));
    }

    
    
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
            java.util.logging.Logger.getLogger(Caisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caisse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox comrech;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbltot1;
    private javax.swing.JTable tbl_prod;
    public static javax.swing.JTextField txtcode;
    public static javax.swing.JTextField txtcou;
    private javax.swing.JTextField txtfini;
    public static javax.swing.JTextField txtnom;
    public static javax.swing.JTextField txtprix;
    public static javax.swing.JTextField txtqte;
    public static javax.swing.JTextField txtrech;
    public static javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
