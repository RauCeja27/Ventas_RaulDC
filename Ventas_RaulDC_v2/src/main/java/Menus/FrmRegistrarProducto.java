/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menus;
import Clases.Productos;

//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.HashMap;
//import java.util.List;
//import java.util.List;

import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rauli
 */


public class FrmRegistrarProducto extends javax.swing.JInternalFrame {

    HttpClient Cliente = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    //DefaultTableModel modelProducto;
    //String Url = "http://localhost/API_Ventas/1-INSERTAR-RegProd.php";
    String Url = "http://localhost/APII/IndexTabla1.php";
    ObjectMapper mapper = new ObjectMapper();
    
    
    public FrmRegistrarProducto() {
        initComponents();
    }

   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtIdProd = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ID del Producto: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Marca: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Presentación: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Precio: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 280, 30));

        txtMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 280, 30));

        txtPresentacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 280, 30));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR REGISTRO");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, 60));

        txtIdProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIdProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, 30));

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        HashMap parametros = new HashMap();
        Productos producto = new Productos();
       
        producto.setIdprod((Integer) txtIdProd.getValue());
        producto.setNombre(txtNombre.getText());
        producto.setMarca(txtMarca.getText());
        producto.setPresentacion(txtPresentacion.getText());
        producto.setPrecio((Integer) txtPrecio.getValue());
        
        parametros.put("idprod",producto.getIdprod());
        parametros.put("nombre",producto.getNombre());
        parametros.put("marca",producto.getMarca());
        parametros.put("presentacion",producto.getPresentacion());
        parametros.put("precio",producto.getPrecio());
        
        try{
            
        String DatosProducto = mapper.writeValueAsString(parametros);
        
        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(DatosProducto)).
            uri(URI.create(Url)).build();
        
        HttpResponse<String> response = Cliente.send(request, HttpResponse.BodyHandlers.ofString());
        
        if(response.body().trim() == "TRUE"){
            JOptionPane.showMessageDialog(null,"PRODUCTO REGISTRADO");
                
        }else{ 
            JOptionPane.showMessageDialog(null,"PRODUCTO REGISTRADO");
        }
        
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"ERROR: ");
        }
        txtIdProd.setValue(0);
        txtNombre.setText("");
        txtMarca.setText("");
        txtPresentacion.setText("");
        txtPrecio.setValue(0);
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner txtIdProd;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPrecio;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
