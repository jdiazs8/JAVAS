/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.vista;

import servidor.controlador.Controlador;

/**
 *
 * @author Jorge
 */
public class Monitor extends javax.swing.JFrame {
    
    Controlador controlador;
    /**
     * Creates new form Monitor
     * @param controlador
     */
    public Monitor(Controlador controlador) {
        this();
        this.controlador = controlador;
        controlador.setRegistro(jtaLogueos);
    }
    
    public Monitor() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jtaLogueos = new javax.swing.JTextArea();
        jmbMenu = new javax.swing.JMenuBar();
        jmServidor = new javax.swing.JMenu();
        jmiExportar = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmBaseDatos = new javax.swing.JMenu();
        jmiConectar = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtaLogueos.setColumns(20);
        jtaLogueos.setRows(5);
        jScrollPane2.setViewportView(jtaLogueos);

        jmServidor.setText("Servidor");

        jmiExportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiExportar.setText("Exportar");
        jmiExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExportarActionPerformed(evt);
            }
        });
        jmServidor.add(jmiExportar);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmServidor.add(jmiSalir);

        jmbMenu.add(jmServidor);

        jmBaseDatos.setText("Base de Datos");

        jmiConectar.setText("Conectar");
        jmiConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConectarActionPerformed(evt);
            }
        });
        jmBaseDatos.add(jmiConectar);

        jmbMenu.add(jmBaseDatos);

        jmAyuda.setText("Ayuda");
        jmbMenu.add(jmAyuda);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConectarActionPerformed
        // TODO add your handling code here:
        ConexionBD conexion = new ConexionBD(controlador);
        conexion.setVisible(true);
    }//GEN-LAST:event_jmiConectarActionPerformed

    private void jmiExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExportarActionPerformed
        // TODO add your handling code here:
        controlador.ExportarRegistro();
    }//GEN-LAST:event_jmiExportarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmBaseDatos;
    private javax.swing.JMenu jmServidor;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiConectar;
    private javax.swing.JMenuItem jmiExportar;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JTextArea jtaLogueos;
    // End of variables declaration//GEN-END:variables
}
