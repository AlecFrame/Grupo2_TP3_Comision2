
package Grupo2_TP3_Grupo2_C2;

import Grupo2_TP3_C2_Ej1.Ventana_Ej1;
import Grupo2_TP3_C2_Ej2.ConversorTemperatura;

public class Ventana extends javax.swing.JFrame {
    
    ///............EJERCICIO 1.............
    /// Participantes - Grupo 2 - Comision 2///
    // > Walter Alexander Vertacnik
    // > Soto Vela Luciano Ezequiel
    // > Ferro Julieta
    // > Pagnone Patricia
    // > Muñoz Maycol
    
    public Ventana() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked") // NO modificar el Generated Code de aqui abajo
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        bEjercicio1 = new javax.swing.JButton();
        bEjercicio2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setText("Trabajo Práctico 3 - Grupo 2 - C2");

        bEjercicio1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bEjercicio1.setText("Ejercicio 1");
        bEjercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEjercicio1ActionPerformed(evt);
            }
        });

        bEjercicio2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bEjercicio2.setText("Ejercicio 2");
        bEjercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEjercicio2ActionPerformed(evt);
            }
        });

        jLabel1.setText("El Ej2 es un convertidor de unidades de temperatura");

        jLabel2.setText("El Ej1 es un formulario de login.");

        jLabel3.setText("El usario predeterminado es: alumno@ulp.edu.ar");

        jLabel4.setText("La contraseña predeterminada es: 1234578");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bEjercicio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bEjercicio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEjercicio1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEjercicio2)
                    .addComponent(jLabel1))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEjercicio1ActionPerformed
        Ventana_Ej1 ventanaej1 = new Ventana_Ej1();
        ventanaej1.setVisible(true);
    }//GEN-LAST:event_bEjercicio1ActionPerformed

    private void bEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEjercicio2ActionPerformed
        ConversorTemperatura ventanaej2 = new ConversorTemperatura();
        ventanaej2.setVisible(true);
    }//GEN-LAST:event_bEjercicio2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton bEjercicio1;
    private javax.swing.JButton bEjercicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
