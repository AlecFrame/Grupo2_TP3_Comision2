
package Grupo2_TP3_Comision2;

import java.awt.Color;
import javax.swing.JFrame;


public class Ventana extends javax.swing.JFrame {
    
    /// Participantes - Grupo 2 - Comision 2///
    // > Walter Alexander Vertacnik
    // > Soto Vela Luciano Ezequiel
    // > Ferro Julieta
    // > Pagnone Patricia
    // > Muñoz Maycol
    
    @SuppressWarnings("unchecked") // NO modificar el Generated Code de aqui abajo
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        /////////////////// Ventana Propiedades /////////////////////////////////
        JFrame ventana = new JFrame("NombreVentana");
        ventana.setBackground(Color.white);
        ventana.setSize(400,400); //Valores por defecto por ahora
        ventana.setVisible(true);
        /////////////////////////////////////////////////////////////////////////
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
