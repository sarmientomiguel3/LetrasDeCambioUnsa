/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico-
 */
public class TIPOACEPTANTE extends javax.swing.JFrame {

    /**
     * Creates new form TIPOACEPTANTE
     */
    public TIPOACEPTANTE() {
        initComponents();
        
           ctipo.removeAllItems();
            this.iniciarcomboestado();
            contador++;
            this.mostrar();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ctipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        GENERARINFORME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setText("TIPO DE ACEPTANTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setText("TIPO DE ACEPTANTES:");

        ctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ctipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctipoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        GENERARINFORME.setText("GENERAR INFORME");
        GENERARINFORME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERARINFORMEActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(ctipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(GENERARINFORME)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GENERARINFORME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctipoActionPerformed
        // TODO add your handling code here:
         if(this.contador>0){ 
         if(ctipo.getSelectedItem().equals("NATURALES")){
         this.mostrarnatural();
         }else if(ctipo.getSelectedItem().equals("JURIDICOS")){
         this.mostrarjuridicos();
         }else if(ctipo.getSelectedItem().equals("TODOS")){
         this.mostrar();
         }else if(ctipo.getSelectedItem().equals("ACTIVOS")){
         this.mostraractivos();
         }else if(ctipo.getSelectedItem().equals("INACTIVOS")){
         this.mostrarinactivos();
         }
         }
    }//GEN-LAST:event_ctipoActionPerformed

    private void GENERARINFORMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERARINFORMEActionPerformed
        // TODO add your handling code here:
       
  
    }//GEN-LAST:event_GENERARINFORMEActionPerformed

    /**
     * @param args the command line arguments
     */
     public void iniciarcomboestado(){
      ctipo.addItem("TODOS");
         ctipo.addItem("NATURALES");
      ctipo.addItem("JURIDICOS");
       ctipo.addItem("ACTIVOS");
      ctipo.addItem("INACTIVOS");
       
    }
      public void mostrarnatural(){
    DefaultTableModel modelo=new DefaultTableModel();
     modelo.addColumn("CODIGO");
    modelo.addColumn("ApePat");
     modelo.addColumn("ApeMat");
      modelo.addColumn("NOMBRE");
      modelo.addColumn("DIRRECION");
      modelo.addColumn("TELEFONO");
      modelo.addColumn("DocIde");
      modelo.addColumn("NumDoc");
   modelo.addColumn("ESTADO");
      table.setModel(modelo);
      String datos[]=new String[9]; 
      String texto="SELECT AcepCod,AceprApePat,AcepApeMat,AcepNom,AcepDir,AcepTel,DOCUMENTOIDENTIDAD.DocIdeNom, AcepNumDoc,ESTADO.EstNom"
              + " FROM DOCUMENTOIDENTIDAD LEFT JOIN ACEPTANTE ON ACEPTANTE.DOCUMENTOIDENTIDAD_DocIdeCod= DOCUMENTOIDENTIDAD.DocIdeCod "
              + " LEFT JOIN ESTADO ON ACEPTANTE.ESTADO_EstCod=ESTADO.EstCod"+" WHERE ( AcepRazSoc='"+""+"' ) AND ( ESTADO.EstCod!='"+"*' )"
              +" ORDER BY ACEPTANTE.AceprApePat ASC,ACEPTANTE.AcepApeMat ASC,ACEPTANTE.AcepNom ASC";
  
        try {
            Statement st=connection.createStatement();
           ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
              datos[3]=result.getString(4);
              datos[4]=result.getString(5);
            datos[5]=result.getString(6);
              datos[6]=result.getString(7);
              datos[7]=result.getString(8);
              datos[8]=result.getString(9);
           modelo.addRow(datos);
             }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(TIPOACEPTANTE.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
      public void mostrarjuridicos(){
    DefaultTableModel modelo=new DefaultTableModel();
     modelo.addColumn("CODIGO");
      modelo.addColumn("RSOCIAL");
    modelo.addColumn("ApePat");
     modelo.addColumn("ApeMat");
      modelo.addColumn("NOMBRE");
      modelo.addColumn("DIRRECION");
      modelo.addColumn("TELEFONO");
      modelo.addColumn("DocIde");
      modelo.addColumn("NumDocIde");
      modelo.addColumn("ESTADO");
      table.setModel(modelo);
      String datos[]=new String[10]; 
      String texto="SELECT AcepCod,AcepRazSoc,AceprApePat,AcepApeMat,AcepNom,AcepDir,AcepTel,DOCUMENTOIDENTIDAD.DocIdeNom, AcepNumDoc,ESTADO.EstNom"
              + " FROM DOCUMENTOIDENTIDAD LEFT JOIN ACEPTANTE ON ACEPTANTE.DOCUMENTOIDENTIDAD_DocIdeCod= DOCUMENTOIDENTIDAD.DocIdeCod "
             +" LEFT JOIN ESTADO ON ACEPTANTE.ESTADO_EstCod=ESTADO.EstCod" +  " WHERE (AcepRazSoc!='"+""+"') AND (EstCod!='"+ "*')"+ " ORDER BY ACEPTANTE.AcepRazSoc ASC";
  
        try {
            Statement st=connection.createStatement();
           ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
              datos[3]=result.getString(4);
              datos[4]=result.getString(5);
            datos[5]=result.getString(6);
              datos[6]=result.getString(7);
              datos[7]=result.getString(8);
              datos[8]=result.getString(9);
              datos[9]=result.getString(10);
           modelo.addRow(datos);
             }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(TIPOACEPTANTE.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
       public void mostraractivos(){
    DefaultTableModel modelo=new DefaultTableModel();
     modelo.addColumn("CODIGO");
      modelo.addColumn("RSOCIAL");
    modelo.addColumn("ApePat");
     modelo.addColumn("ApeMat");
      modelo.addColumn("NOMBRE");
      modelo.addColumn("DIRRECION");
      modelo.addColumn("TELEFONO");
      modelo.addColumn("DocIde");
      modelo.addColumn("NumDocIde");
      modelo.addColumn("ESTADO");
      table.setModel(modelo);
      String datos[]=new String[10]; 
      String texto="SELECT AcepCod,AcepRazSoc,AceprApePat,AcepApeMat,AcepNom,AcepDir,AcepTel,DOCUMENTOIDENTIDAD.DocIdeNom, AcepNumDoc,ESTADO.EstNom"
              + " FROM DOCUMENTOIDENTIDAD LEFT JOIN ACEPTANTE ON ACEPTANTE.DOCUMENTOIDENTIDAD_DocIdeCod= DOCUMENTOIDENTIDAD.DocIdeCod "
             +" LEFT JOIN ESTADO ON ACEPTANTE.ESTADO_EstCod=ESTADO.EstCod" +  " WHERE ESTADO.EstCod='"+"A"+"'"+" ORDER BY ACEPTANTE.AcepRazSoc ASC,ACEPTANTE.AceprApePat ASC,"
              +"ACEPTANTE.AcepApeMat ASC,ACEPTANTE.AcepNom ASC";
  
        try {
            Statement st=connection.createStatement();
           ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
              datos[3]=result.getString(4);
              datos[4]=result.getString(5);
            datos[5]=result.getString(6);
              datos[6]=result.getString(7);
              datos[7]=result.getString(8);
              datos[8]=result.getString(9);
              datos[9]=result.getString(10);
           modelo.addRow(datos);
             }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(TIPOACEPTANTE.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
       
       public void mostrarinactivos(){
    DefaultTableModel modelo=new DefaultTableModel();
     modelo.addColumn("CODIGO");
      modelo.addColumn("RSOCIAL");
    modelo.addColumn("ApePat");
     modelo.addColumn("ApeMat");
      modelo.addColumn("NOMBRE");
      modelo.addColumn("DIRRECION");
      modelo.addColumn("TELEFONO");
      modelo.addColumn("DocIde");
      modelo.addColumn("NumDocIde");
      modelo.addColumn("ESTADO");
      table.setModel(modelo);
      String datos[]=new String[10]; 
      String texto="SELECT AcepCod,AcepRazSoc,AceprApePat,AcepApeMat,AcepNom,AcepDir,AcepTel,DOCUMENTOIDENTIDAD.DocIdeNom, AcepNumDoc,ESTADO.EstNom"
              + " FROM DOCUMENTOIDENTIDAD LEFT JOIN ACEPTANTE ON ACEPTANTE.DOCUMENTOIDENTIDAD_DocIdeCod= DOCUMENTOIDENTIDAD.DocIdeCod "
             +" LEFT JOIN ESTADO ON ACEPTANTE.ESTADO_EstCod=ESTADO.EstCod" +  " WHERE ESTADO.EstCod='"+"I"+"'"+" ORDER BY ACEPTANTE.AcepRazSoc ASC,ACEPTANTE.AceprApePat ASC,"
              +"ACEPTANTE.AcepApeMat ASC,ACEPTANTE.AcepNom ASC";
  
        try {
            Statement st=connection.createStatement();
           ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
              datos[3]=result.getString(4);
              datos[4]=result.getString(5);
            datos[5]=result.getString(6);
              datos[6]=result.getString(7);
              datos[7]=result.getString(8);
              datos[8]=result.getString(9);
              datos[9]=result.getString(10);
           modelo.addRow(datos);
             }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(TIPOACEPTANTE.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
      public void mostrar(){
    DefaultTableModel modelo=new DefaultTableModel();
     modelo.addColumn("CODIGO");
      modelo.addColumn("RSOCIAL");
    modelo.addColumn("ApePat");
     modelo.addColumn("ApeMat");
      modelo.addColumn("NOMBRE");
      modelo.addColumn("DIRRECION");
      modelo.addColumn("TELEFONO");
      modelo.addColumn("DocIde");
      modelo.addColumn("NumDocIde");
       modelo.addColumn("ESTADO");
      table.setModel(modelo);
      String datos[]=new String[10]; 
   String texto="SELECT AcepCod,AcepRazSoc,AceprApePat,AcepApeMat,AcepNom,AcepDir,AcepTel,DOCUMENTOIDENTIDAD.DocIdeNom,AcepNumDoc,ESTADO.EstNom"
              + " FROM DOCUMENTOIDENTIDAD LEFT JOIN ACEPTANTE ON ACEPTANTE.DOCUMENTOIDENTIDAD_DocIdeCod= DOCUMENTOIDENTIDAD.DocIdeCod "
           +" LEFT JOIN ESTADO ON ACEPTANTE.ESTADO_EstCod=ESTADO.EstCod WHERE ESTADO.EstCod!='"+"*'";
     try {
            Statement st=connection.createStatement();
              ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
              datos[3]=result.getString(4);
            datos[4]=result.getString(5);
              datos[5]=result.getString(6);
              datos[6]=result.getString(7);
            datos[7]=result.getString(8);
              datos[8]=result.getString(9);
                datos[9]=result.getString(10);
            modelo.addRow(datos);
            }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ACEPTANTE.class.getName()).log(Level.SEVERE, null, ex);
        }
            
          
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
            java.util.logging.Logger.getLogger(TIPOACEPTANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIPOACEPTANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIPOACEPTANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIPOACEPTANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIPOACEPTANTE().setVisible(true);
            }
        });
    }
    int opcion=0;
    int contador=0;
String txestado="";
    Conectar co=new Conectar();
Connection connection=co.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GENERARINFORME;
    private javax.swing.JComboBox<String> ctipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables



}