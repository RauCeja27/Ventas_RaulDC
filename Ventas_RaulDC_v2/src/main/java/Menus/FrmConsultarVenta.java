/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menus;
import Clases.Ventas;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rauli
 */
public class FrmConsultarVenta extends javax.swing.JInternalFrame {

    HttpClient Cliente = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    DefaultTableModel modelInventario;
    String Url = "http://localhost/APII/IndexTabla4.php";
    ObjectMapper mapper = new ObjectMapper();
    
    
    /**
     * Creates new form FrmConsultarVenta
     */
    public FrmConsultarVenta() {
        initComponents();
        modelInventario= (DefaultTableModel)TablaVenta.getModel();
        Mostrar();
    }

    
    
     private void Mostrar(){
    
    HttpRequest Peticion = HttpRequest.newBuilder().GET().
            uri(URI.create(Url)).build();
    
     try{
         
        HttpResponse<String> response = Cliente.send(Peticion,HttpResponse.BodyHandlers.ofString());
        List<Ventas> productosInventario = getData(response.body(),new TypeReference<List<Ventas>>(){
        });
        
         //System.out.println(ProductoLista.size());
         for(Ventas inventario:productosInventario){
             Object datos[]={inventario.getId_venta(),inventario.getId_producto(),inventario.getNombre_producto(),inventario.getPrecio(),inventario.getCantidad(), inventario.getImporte(),inventario.getFecha_venta()};
             modelInventario.addRow(datos);
         }
         
         
        }catch(Exception e){
         }
   
    }
    
    
     private <T> T getData(String json,TypeReference<T> referencia)
     {
         try {
             return mapper.readValue(json, referencia);
         } catch (Exception e) {e.printStackTrace();
         }
          return null;
     }
     
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Venta");

        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Venta", "Id Producto", "Nombre Producto", "Precio", "Cantidad", "Importe", "Fecha Venta"
            }
        ));
        jScrollPane1.setViewportView(TablaVenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
