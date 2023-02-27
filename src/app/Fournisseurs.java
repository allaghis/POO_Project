
package app;


import com.mysql.jdbc.ResultSetMetaData;
import database.ResultSetTableModel;
import database.bdd;
import database.parametres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** interface des fournisseurs */
public class Fournisseurs extends javax.swing.JFrame {

    /** les declarations */
    public Fournisseurs() {
        initComponents();
        cnx();
        charger();
        
        getContentPane().setBackground(new java.awt.Color(0, 0, 51));
    }
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    ResultSet rs;
    bdd db;
    
    /** fonction pour la connexion avec la bdd */
    public void cnx(){
        
        db = new bdd(new parametres().HOST_DB, new parametres().USERNAME_DB, new parametres().PASSWORD_DB, new parametres().IPHOST, new parametres().PORT);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_produits", "root", "");
           // System.out.println("Connection Sucessful");
        } 
        catch(ClassNotFoundException ex){
            Logger.getLogger(Fournisseurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /** fonction pour charger les informations depuis la bdd */
    public void charger(){

        int a;

        try {
            pst = con.prepareStatement("select * from fournisseurss;");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while(rs.next()){
                Vector v2 = new Vector();
                for(int i=1;i<=a;i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("Nom"));
                    v2.add(rs.getString("Telephone"));
                    v2.add(rs.getString("Email"));
                    v2.add(rs.getString("Adresse"));
                }
                df.addRow(v2);
            }
            

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /** fontion de la table */
    public void table() {
        String t[] = {"id","Nom","Telephone","Email","Adresse"};
        rs = db.querySelect(t, "fournisseurss");
        jTable1.setModel(new ResultSetTableModel(rs));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txttlfn = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtadress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        txtrech = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jframe");
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Nom :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Telephone :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("E-mail :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Adresse :");

        txtnom.setBackground(new java.awt.Color(204, 204, 204));

        txttlfn.setBackground(new java.awt.Color(204, 204, 204));

        txtemail.setBackground(new java.awt.Color(204, 204, 204));

        txtadress.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Effacer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nom", "Telephone", "E-Mail", "Adresse"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jTable1.setShowHorizontalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fournisseurs");

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Retour");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(279, 279, 279)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Recherche par Catégorie :");

        comrech.setBackground(new java.awt.Color(204, 204, 204));
        comrech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom", "Telephone", "E-mail", "Adresse" }));

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Recherche");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtrech.setBackground(new java.awt.Color(204, 204, 204));
        txtrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrechActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Actualiser");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrech, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /** fonction pour ajouter un fournisseur */
       if (txtnom.getText().equals("") || txttlfn.getText().equals("") || txtemail.getText().equals("")
                || txtadress.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir toutes les informations.");
        } else {
        try{
            String vname = txtnom.getText();
            String phone = txttlfn.getText();
            String email = txtemail.getText();
            String addr = txtadress.getText();


            pst = con.prepareStatement("insert into fournisseurss(Nom, Telephone, Email, Adresse) values(?, ?, ?, ?);");
            pst.setString(1, vname);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, addr);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fournisseur ajouté");

            txtnom.setText("");
            txttlfn.setText("");
            txtemail.setText("");
            txtadress.setText("");
            txtnom.requestFocus();
            charger();


        }
        catch(SQLException e){
            Logger.getLogger(Fournisseurs.class.getName()).log(Level.SEVERE, null, e);
        }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /** quand on clique sur un produit dans le tableau les informations seront afficher dans les champs text */ 
        df = (DefaultTableModel) jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        txtnom.setText(df.getValueAt(selected, 1).toString());
        txttlfn.setText(df.getValueAt(selected, 2).toString());
        txtemail.setText(df.getValueAt(selected, 3).toString());
        txtadress.setText(df.getValueAt(selected, 4).toString());
        
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /** fonction pour modifier un utilisateur */
        df = (DefaultTableModel) jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        String vname = txtnom.getText();
        String phone = txttlfn.getText();
        String email = txtemail.getText();
        String addr = txtadress.getText();
        
        try{
            


            pst = con.prepareStatement("update fournisseurss set Nom=?, Telephone=?, Email=?, Adresse=? where id=?");
            pst.setString(1, vname);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, addr);
            pst.setInt(5, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fournisseur mis à jour");

            txtnom.setText("");
            txttlfn.setText("");
            txtemail.setText("");
            txtadress.setText("");
            txtnom.requestFocus();
            charger();

            jButton2.setEnabled(true);

        }
        catch(SQLException e){
            Logger.getLogger(Fournisseurs.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /** fonction pour supprimer un fournisseur */
        df = (DefaultTableModel) jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        try{
            


            pst = con.prepareStatement("delete from fournisseurss where id=?");
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Fournisseur supprimé");

            txtnom.setText("");
            txttlfn.setText("");
            txtemail.setText("");
            txtadress.setText("");
            txtnom.requestFocus();
            charger();

            jButton2.setEnabled(true);

        }
        catch(SQLException e){
            Logger.getLogger(Fournisseurs.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /** pour effacer tout les champs text */
        txtnom.setText("");
        txttlfn.setText("");
        txtemail.setText("");
        txtadress.setText("");
       // txtnom.requestFocus();
        charger();

        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /** fonction pour la recherche par categorie */
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir votre recherche.");
        } else {
            if (comrech.getSelectedItem().equals("Nom")) {
                rs = db.querySelectAll("fournisseurss", "Nom LIKE '%" + txtrech.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Telephone")) {
                rs = db.querySelectAll("fournisseurss", "Telephone LIKE '%" + txtrech.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("E-mail")) {
                rs = db.querySelectAll("fournisseurss", "Email LIKE '%" + txtrech.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Adresse")) {
                rs = db.querySelectAll("fournisseurss", "Adresse LIKE '%" + txtrech.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            }
        }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrechActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /** pour retouner vers le menu pincipale */
         Principale a=new Principale();
a.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /** pour actualiser la table */
        table();
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Fournisseurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fournisseurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txttlfn;
    // End of variables declaration//GEN-END:variables
}
