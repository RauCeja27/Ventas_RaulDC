/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menus;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;


public class FrmEliminarVenta extends javax.swing.JInternalFrame {



    /**
     * Creates new form FrmEliminarVenta
     */
    public FrmEliminarVenta() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId_Venta = new javax.swing.JSpinner();
        txtId_Producto = new javax.swing.JSpinner();
        txtNombre_Producto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JSpinner();
        txtCantidad = new javax.swing.JSpinner();
        txtImporte = new javax.swing.JSpinner();
        txtFecha_Venta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Venta");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ID Venta:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("ID Producto:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Nombre Producto:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Precio por Unidad:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad: ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Importe:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Fecha de la Venta:");

        txtId_Venta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtId_Venta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtId_Producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtNombre_Producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_ProductoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtImporte.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtFecha_Venta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(txtId_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(txtId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(txtNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(txtFecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtFecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_ProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{

            URL url=new URL("http://localhost/APII/IndexTabla4.php?id_venta="+txtId_Venta.getValue()+"");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode == 200){

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());

                }

                scanner.close();
                //System.out.println(informationString);

                JSONArray jsonArray = new JSONArray(informationString.toString());
                JSONObject jsonObject = jsonArray.getJSONObject(0);

                txtId_Producto.setValue(jsonObject.getInt("id_producto"));
                txtNombre_Producto.setText(jsonObject.getString("nombre_producto"));
                txtPrecio.setValue(jsonObject.getInt("precio"));
                txtCantidad.setValue(jsonObject.getInt("cantidad"));
                txtImporte.setValue(jsonObject.getInt("importe"));
                txtFecha_Venta.setText(jsonObject.getString("fecha_venta"));

            }else{
                JOptionPane.showMessageDialog(null,"ERROR: ID de Venta no Encontrado, \n porfavor ingrese la venta primero. ");
                //throw new RuntimeException("Ocurrio un Error "+ responseCode);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: ID de Venta no Encontrado, \n porfavor ingrese la venta primero. ");

            txtId_Producto.setValue(0);
            txtNombre_Producto.setText("");
            txtPrecio.setValue(0);
            txtCantidad.setValue(0);
            txtImporte.setValue(0);
            txtFecha_Venta.setText("");

            //e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         try{
            URL url=new URL("http://localhost/APII/IndexTabla4.php?id_venta="+txtId_Venta.getValue()+"");
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

                txtId_Producto.setValue(0);
                txtNombre_Producto.setText("");
                txtPrecio.setValue(0);
                txtCantidad.setValue(0);
                txtImporte.setValue(0); 
                txtFecha_Venta.setText("");

                
            }

        } catch(Exception e){
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtFecha_Venta;
    private javax.swing.JSpinner txtId_Producto;
    private javax.swing.JSpinner txtId_Venta;
    private javax.swing.JSpinner txtImporte;
    private javax.swing.JTextField txtNombre_Producto;
    private javax.swing.JSpinner txtPrecio;
    // End of variables declaration//GEN-END:variables
}
