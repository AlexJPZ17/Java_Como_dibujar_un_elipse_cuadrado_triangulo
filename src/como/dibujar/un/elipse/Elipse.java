/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package como.dibujar.un.elipse;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Elipse extends javax.swing.JFrame {

    /**
     * Creates new form Elipse
     */
    public Elipse() {
        initComponents(); 
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Graficar = new javax.swing.JButton();
        Button_Limpiar = new javax.swing.JButton();
        TextField_Diametro = new javax.swing.JTextField();
        ComboBox_Figuras = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dibujar un elipse");

        Button_Graficar.setText("Graficar");
        Button_Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_GraficarActionPerformed(evt);
            }
        });

        Button_Limpiar.setText("Limpiar");
        Button_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LimpiarActionPerformed(evt);
            }
        });

        ComboBox_Figuras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Figuras", "Circulo", "Cuadrado", "Triangulo" }));

        jLabel1.setText("Diametro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_Figuras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextField_Diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Button_Graficar)
                                .addGap(26, 26, 26)
                                .addComponent(Button_Limpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboBox_Figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Graficar)
                    .addComponent(Button_Limpiar)
                    .addComponent(TextField_Diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_GraficarActionPerformed
      Graficar();
    }//GEN-LAST:event_Button_GraficarActionPerformed

    private void Button_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LimpiarActionPerformed
        TextField_Diametro.setText("");
        Graphics g = getGraphics();
        super.paint(g);
        g.drawLine(50, 150, 390, 150); //Eje horizontal
        g.drawLine(150, 50, 150, 350);//Eje vertical

    }//GEN-LAST:event_Button_LimpiarActionPerformed
   //Motodo paint
    public void paint(Graphics g){
        //Graficamos las lineas
        super.paint(g);
        g.drawLine(50, 150, 390, 150); //Eje horizontal
        g.drawLine(150, 50, 150, 350);//Eje vertical
    }
    //Método para graficar 
    public void Graficar(){
        // Declaramos las siguientes variable
        int dm,y1=160,x2=160;
        String figuras;
        //Evaluamos nuestro TextField
        if (TextField_Diametro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un Diametro");
            TextField_Diametro.requestFocus();
        }else{
            //Obtenemos el datos del TextField
             dm = Integer.parseInt(TextField_Diametro.getText());
            //Capturamos el valor escogido en el comboBox
             figuras = ComboBox_Figuras.getSelectedItem().toString();
             //instanciamos un objeto del método Graphics
              Graphics g = getGraphics();
              //Ciclo for que grafica los puntos de las líneas
                                         // i = i+8
              for (int i = 150; i < 350; i+=8) {
                //Graficamos los puntos de los ejes
                g.drawLine(145, i, 155, i);
                g.drawLine( i, 145, i, 155);
            }
              //Instrucción switch que evalúa la variable figuras
              switch(figuras){
                  case "Figuras":
                      JOptionPane.showMessageDialog(null, "Seleccione una figura");
                      break;
                      //Grafica un circulo
                  case "Circulo":
                      g.setColor (Color.red);
                      g.drawOval (150, 150, dm, dm);
                      break;
                      //Grafica un cuadrado
                  case "Cuadrado":
                      g.setColor (Color.red);
                      g.drawRect(150, 150, dm, dm);
                      break;
                      //Grafica una linea para poder graficar un triangulo
                  case "Triangulo":
                      g.setColor (Color.red);     
                      y1 = y1 + dm;
                      x2 = x2 + dm;
                      g.setColor (Color.red);        
                      g.drawLine(140, y1, x2,140); 
                      break;
              }
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(Elipse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elipse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elipse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elipse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elipse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Graficar;
    private javax.swing.JButton Button_Limpiar;
    private javax.swing.JComboBox ComboBox_Figuras;
    private javax.swing.JTextField TextField_Diametro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
