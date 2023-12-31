/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menus;
import Clases.Productos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//import java.util.HashMap;
import java.util.List;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rauli
 */
public class FrmConsultarProducto extends javax.swing.JInternalFrame {

    
    HttpClient Cliente = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    DefaultTableModel modelProducto;
    //String Url = "http://localhost/API_Ventas/2-MOSTRAR-RegProd.php";
    String Url = "http://localhost/APII/IndexTabla1.php";
    //String Url2 = "http://localhost/API_Ventas/1-INSERTAR-RegProd.php";
    ObjectMapper mapper = new ObjectMapper();

    
 
    public FrmConsultarProducto() {
        initComponents();
        modelProducto = (DefaultTableModel)TablaProductos.getModel();
        Mostrar();
    }

    
        
     private void Mostrar(){
    
    HttpRequest Peticion = HttpRequest.newBuilder().GET().
            uri(URI.create(Url)).build();
    
     try{
         
        HttpResponse<String> response = Cliente.send(Peticion,HttpResponse.BodyHandlers.ofString());
        List<Productos> productosLista = getData(response.body(),new TypeReference<List<Productos>>(){
        });
        
         //System.out.println(ProductoLista.size());
         for(Productos productos:productosLista){
             Object datos[]={productos.getIdprod(),productos.getNombre(),productos.getMarca(),productos.getPresentacion(),productos.getPrecio()};
             modelProducto.addRow(datos);
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
        TablaProductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Productos");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProd", "Nombre", "Marca", "Presentacion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
