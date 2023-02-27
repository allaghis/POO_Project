

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
import javax.swing.JTextField;

/** interface de l'approvisionnement */

public class Approvisionnement extends javax.swing.JFrame {

    
    /** les declarations */
    
    
    ResultSet rs;
    bdd db;
    int old, dec, now;
    
    
    /** fonction pour la connexion avec la bdd */
    public Approvisionnement() {
        db = new bdd(new parametres().HOST_DB, new parametres().USERNAME_DB, new parametres().PASSWORD_DB, new parametres().IPHOST, new parametres().PORT);
        
        initComponents();
        table();
        jam();
    }
/** fontion de la table */
    public void table() {
        String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
        rs = db.querySelect(colon, "approvisionnement");
        tbl_four.setModel(new ResultSetTableModel(rs));
        
        
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
        tbl_four = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        jLabel8 = new javax.swing.JLabel();
        txtfin = new javax.swing.JTextField();
        txtfour = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqte = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtstock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        tbl_four.setBackground(new java.awt.Color(204, 204, 204));
        tbl_four.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Fournisseur", "Description", "Type", "Couleur", "Finition", "Prix", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_four.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_four.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_four.setRowHeight(40);
        tbl_four.setShowGrid(false);
        tbl_four.setShowHorizontalLines(true);
        tbl_four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_fourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_four);
        if (tbl_four.getColumnModel().getColumnCount() > 0) {
            tbl_four.getColumnModel().getColumn(5).setMinWidth(100);
            tbl_four.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbl_four.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Approvisionnement");

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Recherche par Catégorie :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(260, 0, 250, 20);

        comrech.setBackground(new java.awt.Color(204, 204, 204));
        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Nom", "Fournisseur", "Description", "Type", "Couleur", "Finition", "Prix" }));
        jPanel2.add(comrech);
        comrech.setBounds(260, 30, 240, 30);

        txtrech.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtrech);
        txtrech.setBounds(360, 70, 180, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Code :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 117, 100, 40);

        txtcode.setBackground(new java.awt.Color(204, 204, 204));
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtcode);
        txtcode.setBounds(150, 120, 160, 30);

        txtnom.setBackground(new java.awt.Color(204, 204, 204));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        jPanel2.add(txtnom);
        txtnom.setBounds(150, 170, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Nom :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 170, 100, 30);

        txttype.setBackground(new java.awt.Color(204, 204, 204));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        jPanel2.add(txttype);
        txttype.setBounds(150, 270, 160, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Prix :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(440, 220, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Type :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 270, 100, 30);

        txtcou.setBackground(new java.awt.Color(204, 204, 204));
        txtcou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcouActionPerformed(evt);
            }
        });
        jPanel2.add(txtcou);
        txtcou.setBounds(490, 120, 160, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Couleur :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(420, 120, 90, 30);

        txtprix.setBackground(new java.awt.Color(204, 204, 204));
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });
        jPanel2.add(txtprix);
        txtprix.setBounds(490, 220, 160, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Finition :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(420, 170, 110, 30);

        txtfin.setBackground(new java.awt.Color(204, 204, 204));
        txtfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfinActionPerformed(evt);
            }
        });
        jPanel2.add(txtfin);
        txtfin.setBounds(490, 170, 160, 30);

        txtfour.setBackground(new java.awt.Color(204, 204, 204));
        txtfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfourActionPerformed(evt);
            }
        });
        jPanel2.add(txtfour);
        txtfour.setBounds(150, 220, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Fournisseur  :  ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 220, 110, 30);

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
        jPanel2.add(txtqte);
        txtqte.setBounds(80, 330, 160, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Quantité  :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 330, 100, 30);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Acheter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(260, 370, 260, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("DZD : ");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(280, 330, 60, 30);

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setForeground(new java.awt.Color(204, 204, 255));
        lbltot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot1.setText("0");
        jPanel2.add(lbltot1);
        lbltot1.setBounds(340, 330, 170, 30);

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Recherche ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(200, 70, 140, 30);

        txtstock.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtstock);
        txtstock.setBounds(490, 270, 160, 30);

        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Stock :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(440, 270, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(655, 0, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfinActionPerformed

    private void txtfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfourActionPerformed

    private void txtqteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       /** fonction pour la recherche par categorie */
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir votre recherche.");
        } else {
            if (comrech.getSelectedItem().equals("Code")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Code LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Nom")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Nom LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Fournisseur")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Fournisseur LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Description")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Description LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Type")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Type LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Couleur")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Couleur LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Finition")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Finition LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Prix")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Prix LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Stock")) {
                String colon[] = {"Code","Nom","Fournisseur","Description","Type","Couleur","Finition","Prix","Stock"};
                rs = db.fcSelectCommand(colon, "approvisionnement", "Stock LIKE '" + txtrech.getText() + "' ");
                tbl_four.setModel(new ResultSetTableModel(rs));
            
            
            
                
            
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /** fonction pour demander a l'utilisateur de saisir la quantité à acheter */
        if ( txtqte.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir la quantité.");
        
        } else {
            String[] colon = {"Code","Nom","Type","Couleur","Finition","Prix","Stock"};
            String[] isi = {txtcode.getText(), txtnom.getText(), txttype.getText(), txtcou.getText(), txtfin.getText(), txtprix.getText(), txtqte.getText()};
            System.out.println(db.queryInsert("produits", colon, isi));
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "Erreur : La quantité demandée dépasse le stock disponible pour ce produit. Veuillez réduire la quantité ou sélectionner un produit différent.");
                } else {
                    def(); //true
                    table(); //true
                     JOptionPane.showMessageDialog(this, "Produit acheté");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Approvisionnement.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
           
        }
       // JOptionPane.showMessageDialog(this, "Produit acheté");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtqteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqteKeyReleased
 subtotal();        
    }//GEN-LAST:event_txtqteKeyReleased

    private void tbl_fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_fourMouseClicked
       /** quand on clique sur un produit dans le tableau les informations seront afficher dans les champs text */
        txtcode.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 0)));
        txtcode.setEditable(false);
        txtnom.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 1)));
        txtnom.setEditable(false);
        txtfour.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 2)));
        txtfour.setEditable(false);
        txttype.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 4)));
        txttype.setEditable(false);
        txtcou.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 5)));
        txtcou.setEditable(false);
        txtfin.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 6)));
        txtfin.setEditable(false);
        txtprix.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 7)));
        txtprix.setEditable(false);
        txtstock.setText(String.valueOf(tbl_four.getValueAt(tbl_four.getSelectedRow(), 8)));
        txtstock.setEditable(false);
        
        
        
        
    }//GEN-LAST:event_tbl_fourMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         /** pour retouner vers le menu pincipale */
         Principale a=new Principale();
a.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /** pour actualiser */
        txtcode.setText("");
            txtnom.setText (""); 
                    txtfour.setText("");
                             txttype.setText("");
                                     txtcou.setText("");
                                             txtfin.setText("");
                                                     txtprix.setText("");
                                                             txtstock.setText("");
                                                                     txtqte.setText("");
                                                                     lbltot1.setText("0");
                                                                     table();
    }//GEN-LAST:event_jButton3ActionPerformed

    
   
    /** fonction pour calculer le prix total quand l'utilisateur saisi une quantité */
    public void subtotal() {
        double a = Double.parseDouble(txtprix.getText());
        double b = Double.parseDouble(txtqte.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));
    }
     
      /** fonction pour verifier si la quantité saisi par l'utilisateur est disponible chez le fournisseur */
       public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("approvisionnement","Code='" + txtcode.getText() + "'");
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
       
/** fonction pour soustraire la quantité saisi par l'utilisateur du stock du fournisseurs */
    public void def() throws SQLException {
        rs = db.querySelectAll("approvisionnement", "Code='" + txtcode.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Stock");
        }
        dec = Integer.parseInt(txtqte.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"Stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("approvisionnement", colon, isi, "Code='" + txtcode.getText() + "'"));
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
                new Approvisionnement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox comrech;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbltot1;
    private javax.swing.JTable tbl_four;
    public static javax.swing.JTextField txtcode;
    public static javax.swing.JTextField txtcou;
    public static javax.swing.JTextField txtfin;
    public static javax.swing.JTextField txtfour;
    public static javax.swing.JTextField txtnom;
    public static javax.swing.JTextField txtprix;
    public static javax.swing.JTextField txtqte;
    public static javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtstock;
    public static javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
