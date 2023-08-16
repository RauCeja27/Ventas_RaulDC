/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menus;
import java.util.Scanner;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author rauli
 */
public class FrmEliminarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEliminarProducto
     */
    public FrmEliminarProducto() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JSpinner();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Productos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("ID del Producto: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Marca: ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Presentación: ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Precio: ");

        txtIdProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIdProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPresentacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBorrar.setText("ELIMINAR REGISTRO");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            URL url=new URL("http://localhost/APII/IndexTabla1.php?idprod="+txtIdProd.getValue()+"");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode != 200){
                JOptionPane.showMessageDialog(null,"ERROR: PRODUCTO NO REGISTRADO");
                throw new RuntimeException("Ocurrio un Error "+ responseCode);
            }else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                
                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
                }

                scanner.close();
                //System.out.println(informationString);

                
                JSONArray jsonArray = new JSONArray(informationString.toString());
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                txtNombre.setText(jsonObject.getString("nombre"));
                txtMarca.setText(jsonObject.getString("marca"));
                txtPresentacion.setText(jsonObject.getString("presentacion"));
                txtPrecio.setValue(jsonObject.getInt("precio"));
                //txtPrecio2.setValue(jsonObject.getInt("precio"));
                
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try{
            URL url=new URL("http://localhost/APII/IndexTabla1.php?idprod="+txtIdProd.getValue()+"");
            //URL url=new URL("http://localhost/API_Ventas/3-ELIMINAR-RegProd.php?idprod="+txtIdProd.getValue()+"");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode != 200){
                JOptionPane.showMessageDialog(null,"ERROR: PRODUCTO NO REGISTRADO");
                throw new RuntimeException("Ocurrio un Error "+ responseCode);
               
            }else{
                
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                JOptionPane.showMessageDialog(null,"PRODUCTO ELIMINADO CORRECTAMENTE");

                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
                }

                scanner.close();

                txtIdProd.setValue(0);
                txtNombre.setText("");
                txtMarca.setText("");
                txtPresentacion.setText("");
                txtPrecio.setValue(0);

                
            }

        } catch(Exception e){
            
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner txtIdProd;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPrecio;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
