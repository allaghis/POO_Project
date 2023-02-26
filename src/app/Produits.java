
package app;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import database.parametres;
import database.ResultSetTableModel;
import database.bdd;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/** interface des produits */

public class Produits extends javax.swing.JFrame {

    /** les declarations */
    java.sql.Connection con;
    
    DefaultTableModel df;
    ResultSet rs;
    bdd db;
    
    /** fonction pour la connexion avec la bdd */
    public Produits() {
        db = new bdd(new parametres().HOST_DB, new parametres().USERNAME_DB, new parametres().PASSWORD_DB, new parametres().IPHOST, new parametres().PORT);
        initComponents();
        table();
    }
    
    /** fontion de la table */
     public void table() {
        String t[] = {"id","Code","Nom","Description","Type","Couleur","Finition","Prix","Stock","Seuil"};
        rs = db.querySelect(t, "produits");
        tbl_prod.setModel(new ResultSetTableModel(rs));
    }
     
     /** fonction pour effacer les champs text */
     void actualiser() {
        txtcode.setText("");
        txtnom.setText("");
        txtdes.setText("");
        txttype.setText("");
        txtcouleur.setText("");
        txtfini.setText("");
        txtstock.setText("");
        txtprix.setText("");
        txtseuil.setText("");
     }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtfini = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtprix = new javax.swing.JTextField();
        txtcouleur = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        comrech = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtrech = new javax.swing.JTextField();
        txtseuil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 900));
        jPanel1.setLayout(null);

        tbl_prod.setBackground(new java.awt.Color(204, 204, 204));
        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Code", "Nom", "Description", "Type", "Couleur", "Finition", "Prix", "Stock", "Seuil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_prod.setRowHeight(30);
        tbl_prod.setShowHorizontalLines(true);
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 840, 150);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 220, 120, 40);

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(130, 220, 110, 40);

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 220, 130, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Code Produit :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 0, 120, 50);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Couleur  :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(270, 0, 90, 50);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Finition  :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(270, 60, 90, 50);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Nom :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 60, 70, 50);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Description :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 120, 110, 50);

        txtdes.setBackground(new java.awt.Color(204, 204, 204));
        txtdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesActionPerformed(evt);
            }
        });
        jPanel2.add(txtdes);
        txtdes.setBounds(120, 130, 100, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Stock :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(270, 120, 70, 50);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("Prix :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(270, 180, 80, 50);

        txttype.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txttype);
        txttype.setBounds(120, 190, 100, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setText("Type   :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 170, 90, 70);

        txtcode.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtcode);
        txtcode.setBounds(120, 10, 100, 30);

        txtnom.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtnom);
        txtnom.setBounds(120, 70, 100, 30);

        txtfini.setBackground(new java.awt.Color(204, 204, 204));
        txtfini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiniActionPerformed(evt);
            }
        });
        jPanel2.add(txtfini);
        txtfini.setBounds(360, 70, 100, 30);

        txtstock.setBackground(new java.awt.Color(204, 204, 204));
        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });
        jPanel2.add(txtstock);
        txtstock.setBounds(360, 130, 100, 30);

        txtprix.setBackground(new java.awt.Color(204, 204, 204));
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });
        jPanel2.add(txtprix);
        txtprix.setBounds(360, 190, 100, 30);

        txtcouleur.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtcouleur);
        txtcouleur.setBounds(360, 10, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 270, 500, 240);

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(0, 140, 136, 40);

        comrech.setBackground(new java.awt.Color(204, 204, 204));
        comrech.setEditable(true);
        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Nom", "Description", "Type", "Couleur", "Finition", "Stock", "Seuil" }));
        comrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comrechActionPerformed(evt);
            }
        });
        jPanel3.add(comrech);
        comrech.setBounds(40, 70, 240, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Recherche par catégorie :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 30, 250, 30);

        txtrech.setBackground(new java.awt.Color(204, 204, 204));
        txtrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrechActionPerformed(evt);
            }
        });
        jPanel3.add(txtrech);
        txtrech.setBounds(150, 140, 150, 40);

        txtseuil.setBackground(new java.awt.Color(204, 204, 204));
        txtseuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseuilActionPerformed(evt);
            }
        });
        jPanel3.add(txtseuil);
        txtseuil.setBounds(70, 240, 100, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Seuil :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 230, 80, 50);

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Actualiser");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(200, 0, 110, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 220, 310, 290);

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Effacer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(390, 220, 130, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion des Produits");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 10, 370, 30);

        jPanel4.setBackground(new java.awt.Color(255, 51, 0));
        jPanel4.setLayout(null);

        jButton7.setBackground(new java.awt.Color(0, 0, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Retour");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(0, 0, 72, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 840, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /** fonction pour ajouter un produit */
        if (txtcode.getText().equals("") || txtnom.getText().equals("") || txtdes.getText().equals("")
                || txtcouleur.getText().equals("") || txttype.getText().equals("") || txtfini.getText().equals("")
                || txtstock.getText().equals("") || txtprix.getText().equals("") || txtseuil.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer toutes les informations.");
        } else {
            String[] colon = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock","Seuil"};
            String[] inf = {txtcode.getText(), txtnom.getText(), txtdes.getText(),txttype.getText(),txtcouleur.getText()
            ,txtfini.getText(),txtprix.getText(),txtstock.getText(),txtseuil.getText()};
            System.out.println(db.queryInsert("produits", colon, inf));
            table();
            actualiser();
            JOptionPane.showMessageDialog(this, "Produit ajouté");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /** fonction pour modifier un produit */
        if (txtcode.getText().equals("") || txtnom.getText().equals("") || txtdes.getText().equals("")
                || txtcouleur.getText().equals("") || txttype.getText().equals("") || txtfini.getText().equals("")
                || txtstock.getText().equals("") || txtprix.getText().equals("") || txtseuil.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer toutes les informations.");
        } else {
                  String[] colon = {"Code","Nom","Description","Type","Couleur","Finition","Prix","Stock","Seuil"};
              String[] inf = {txtcode.getText(), txtnom.getText(), txtdes.getText(),txttype.getText(),txtcouleur.getText()
            ,txtfini.getText(),txtprix.getText(),txtstock.getText(),txtseuil.getText()};
            String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produits", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
            JOptionPane.showMessageDialog(this, "Produit mis à jour");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        /** fonction pour supprimer un produit */
        String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer?", "Attention!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produits", "id=" + id);
        } else {
            return;
        }
        table();
        JOptionPane.showMessageDialog(this, "Produit supprimé");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
/** pour effacer tout les champs text */
        actualiser();
        table();
        jButton2.setEnabled(true);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/** fonction pour la recherche par categorie */
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir votre recherche.");
        } else {
            if (comrech.getSelectedItem().equals("Code")) {
                rs = db.querySelectAll("produits", "Code LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Nom")) {
                rs = db.querySelectAll("produits", "Nom LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Descrition")) {
                rs = db.querySelectAll("produits", "Description LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Type")) {
                rs = db.querySelectAll("produits", "Type LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Couleur")) {
                rs = db.querySelectAll("produits", "Couleur LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Finition")) {
                rs = db.querySelectAll("produits", "Finition LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Prix")) {
                rs = db.querySelectAll("produits", "Prix LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Stock")) {
                rs = db.querySelectAll("produits", "Stock LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Seuil")) {
                rs = db.querySelectAll("produits", "Seuil LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            
            
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
       /** quand on clique sur un produit dans le tableau les informations seront afficher dans les champs text */ 
        txtcode.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 1)));
        txtnom.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 2)));
        txtdes.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 3)));
        txttype.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 4)));
txtcouleur.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 5)));
txtfini.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 6)));
txtprix.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 7)));
txtstock.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 8)));
txtseuil.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 9)));

jButton2.setEnabled(false);

       
    }//GEN-LAST:event_tbl_prodMouseClicked

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void txtfiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiniActionPerformed

    private void txtrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrechActionPerformed

    private void comrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comrechActionPerformed

    private void txtdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesActionPerformed

    private void txtseuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseuilActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     /** pour actualiser la table et notifier l'utilisateur si il ya un produit en rupture de stock */
        table();
notif(tbl_prod);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /** pour retouner vers le menu pincipale */
        Principale a=new Principale();
a.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

   
  /** fonction pour changer la couleur de la ligne d'un produit dans la table si il a atteint le seuil */
    public void notif(JTable table) {
        
    
        // cnx a la bdd
       try {
        // Connect to the database and execute a query to retrieve products and their stock and stock limit
         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestion_produits", "root", "");
         Statement stmt = (Statement) con.createStatement();
         rs = stmt.executeQuery("SELECT * FROM produits");
		
        // Iterate over the result set and highlight the corresponding rows in the table
        while (rs.next()) {
            int productId = rs.getInt("id");
            int stock = rs.getInt("Stock");
            int stockLimit = rs.getInt("Seuil");
            if (stock < stockLimit) {
                for (int row = 0; row < table.getRowCount(); row++) {
                    if (table.getValueAt(row, 0).equals(productId)) {
                        table.setSelectionBackground(Color.RED); // Change the row color to yellow
                    }
                }
            }
        }
        
        // Close the database connection and resources
        rs.close();
        stmt.close();
        con.close();
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
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
            java.util.logging.Logger.getLogger(Produits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_prod;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcouleur;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtfini;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtseuil;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
