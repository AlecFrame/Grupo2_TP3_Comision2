package Grupo2_TP3_C2_Ej1;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keter
 */
public class Ventana_Ej1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Ej1
     */
    public Ventana_Ej1() {
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

        jPprincipal = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        jButtonOcultar = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        panelFondCredenciales = new java.awt.Panel();
        panel1 = new java.awt.Panel();
        jPassUsuario = new javax.swing.JPasswordField();
        jtxtUsuario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jlContrasenia = new javax.swing.JLabel();
        jButtonRegistar = new javax.swing.JButton();
        jlCredenciales = new java.awt.Label();
        jlInicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Credenciales");
        setBackground(java.awt.SystemColor.windowBorder);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPprincipal.setBackground(new java.awt.Color(0, 102, 102));

        jButtonOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grupo2_TP3_C2_Ej1/ocultar.png"))); // NOI18N
        jButtonOcultar.setText("Ocultar");
        jButtonOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcultarActionPerformed(evt);
            }
        });

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grupo2_TP3_C2_Ej1/ver.png"))); // NOI18N
        jButtonVer.setText("Ver");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOcultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelFondCredenciales.setBackground(new java.awt.Color(0, 204, 204));

        jPassUsuario.setToolTipText("");
        jPassUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPassUsuarioMouseClicked(evt);
            }
        });

        jlUsuario.setText("Ususario");

        jlContrasenia.setText("Contraseña");

        jButtonRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grupo2_TP3_C2_Ej1/images.jpg"))); // NOI18N
        jButtonRegistar.setText("Registrar");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlContrasenia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtUsuario)
                            .addComponent(jPassUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContrasenia))
                .addGap(31, 31, 31)
                .addComponent(jButtonRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        jlCredenciales.setText("Ingrese sus credenciales");

        javax.swing.GroupLayout panelFondCredencialesLayout = new javax.swing.GroupLayout(panelFondCredenciales);
        panelFondCredenciales.setLayout(panelFondCredencialesLayout);
        panelFondCredencialesLayout.setHorizontalGroup(
            panelFondCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondCredencialesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelFondCredencialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondCredencialesLayout.setVerticalGroup(
            panelFondCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondCredencialesLayout.createSequentialGroup()
                .addComponent(jlCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jlInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlInicioSesion.setForeground(new java.awt.Color(204, 255, 255));
        jlInicioSesion.setText("Inicio de Sesión");

        javax.swing.GroupLayout jPprincipalLayout = new javax.swing.GroupLayout(jPprincipal);
        jPprincipal.setLayout(jPprincipalLayout);
        jPprincipalLayout.setHorizontalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondCredenciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addComponent(jlInicioSesion)
                        .addGap(0, 275, Short.MAX_VALUE))
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPprincipalLayout.setVerticalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelFondCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        String texto= jtxtUsuario.getText();
        String mail= "alumno@ulp.edu.ar";
        char[] passArray = jPassUsuario.getPassword();
        String texto2 = new String(passArray); // Convertimos el array de caracteres en una cadena
        String pass="12345678";
        
        try{
        if(texto.equalsIgnoreCase(mail) && texto2.equals(pass)){
            int respuesta =JOptionPane.showOptionDialog(
                    null,
            "Bienvenido. Ha ingresado con éxito. ¿Desea continuar?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            new Object []{"Sí","No"},
            "Sí"
            );
        }else{
            JOptionPane.showOptionDialog(null, "Usuario y/o contraseña incorrectos.", "Error",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    new Object[]{"Reintentar"},
                    "Reintentar");
        }
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(null, "Ocurrió un error");
        }catch(NullPointerException e){
            JOptionPane.showConfirmDialog(null, "Ocurrió un error");       
                }
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jPassUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPassUsuarioMouseClicked
        jPassUsuario.setText("");
    }//GEN-LAST:event_jPassUsuarioMouseClicked

    private void jButtonOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcultarActionPerformed
        jPassUsuario.setEchoChar('*');
    }//GEN-LAST:event_jButtonOcultarActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        jPassUsuario.setEchoChar((char)0);
    }//GEN-LAST:event_jButtonVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOcultar;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JPasswordField jPassUsuario;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JLabel jlContrasenia;
    private java.awt.Label jlCredenciales;
    private javax.swing.JLabel jlInicioSesion;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JTextField jtxtUsuario;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panelFondCredenciales;
    // End of variables declaration//GEN-END:variables
}
