/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Menus.BarraMenus;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author rauli
 */
public class LoginInicio extends javax.swing.JFrame {

    String nombre="Raul",clave="123";
    /*Raul Ismael*/
    
    
    /**
     * Creates new form LoginInicio
     */
    public LoginInicio() {
        initComponents();
           this.setLocationRelativeTo(null);
    }

    
    
       
 public void GET(){
     
    try{
        
        URL url=new URL("http://localhost/API/Index.php");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        
        int responseCode = conn.getResponseCode();
        if(responseCode != 200){
            throw new RuntimeException("Ocurrio un Error "+ responseCode);
        }else{
            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            
            while(scanner.hasNext()){
                informationString.append(scanner.nextLine());
            }
            scanner.close();
            System.out.println(informationString);
        }
        
        
          } catch(Exception e){
              e.printStackTrace();
       }
    }
    

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TextClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Sesion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 190));

        TextClave.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        getContentPane().add(TextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 240, 70));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("USUARIO: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("CONTRASEÑA: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Ingresar.png"))); // NOI18N
        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 140, 120));

        TextNombre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        getContentPane().add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 240, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Palmeras.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
        BarraMenus ventana = new BarraMenus();
        
        if(TextNombre.getText().equals(nombre) && TextClave.getText().equals(clave)){
        ventana.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_BotonIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonIngresar;
    private javax.swing.JTextField TextClave;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
