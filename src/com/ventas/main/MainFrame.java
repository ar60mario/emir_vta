/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.main;

import com.ventas.entities.EquipoActivo;
import com.ventas.estructura.Constante;
import com.ventas.frame.AbmClientesFrame;
import com.ventas.frame.AbmRubrosFrame;
import com.ventas.frame.AbmSubRubroFrame;
import com.ventas.frame.ProductosAbmFrame;
import com.ventas.services.EquipoActivoService;
import com.ventas.util.UtilFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author argia
 */
public class MainFrame extends javax.swing.JFrame {

    private JPanel contentPanel;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        limpiarFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirBtn = new javax.swing.JButton();
        ventasBtn = new javax.swing.JButton();
        devolucionBtn = new javax.swing.JButton();
        cobranzaBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abmClientesMnu = new javax.swing.JMenuItem();
        abmProductosMnu = new javax.swing.JMenuItem();
        abmRubroMnu = new javax.swing.JMenuItem();
        abmSubRubroMnu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        versionMnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        salirBtn.setText("SALIR");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        ventasBtn.setText("VENTAS");

        devolucionBtn.setText("DEVOLUCION");

        cobranzaBtn.setText("COBRANZA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventasBtn)
                .addGap(18, 18, 18)
                .addComponent(devolucionBtn)
                .addGap(18, 18, 18)
                .addComponent(cobranzaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(salirBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBtn)
                    .addComponent(ventasBtn)
                    .addComponent(devolucionBtn)
                    .addComponent(cobranzaBtn))
                .addContainerGap())
        );

        jMenu1.setText("ARCHIVO");

        abmClientesMnu.setText("ABM CLIENTES");
        abmClientesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmClientesMnuActionPerformed(evt);
            }
        });
        jMenu1.add(abmClientesMnu);

        abmProductosMnu.setText("ABM PRODUCTOS");
        abmProductosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmProductosMnuActionPerformed(evt);
            }
        });
        jMenu1.add(abmProductosMnu);

        abmRubroMnu.setText("ABM RUBRO");
        abmRubroMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmRubroMnuActionPerformed(evt);
            }
        });
        jMenu1.add(abmRubroMnu);

        abmSubRubroMnu.setText("ABM SUBRURBRO");
        abmSubRubroMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmSubRubroMnuActionPerformed(evt);
            }
        });
        jMenu1.add(abmSubRubroMnu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("HERRAMIENTAS");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("INFORMES");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("?");

        versionMnu.setText("VERSION");
        versionMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionMnuActionPerformed(evt);
            }
        });
        jMenu4.add(versionMnu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abmSubRubroMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmSubRubroMnuActionPerformed
        abmSubRubro();
    }//GEN-LAST:event_abmSubRubroMnuActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        salir();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void abmRubroMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmRubroMnuActionPerformed
        abmRubros();
    }//GEN-LAST:event_abmRubroMnuActionPerformed

    private void abmClientesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmClientesMnuActionPerformed
        abmClientes();
        
    }//GEN-LAST:event_abmClientesMnuActionPerformed

    private void abmProductosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmProductosMnuActionPerformed
        abmProductos();
    }//GEN-LAST:event_abmProductosMnuActionPerformed

    private void versionMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionMnuActionPerformed
        mostrarVersion();
    }//GEN-LAST:event_versionMnuActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abmClientesMnu;
    private javax.swing.JMenuItem abmProductosMnu;
    private javax.swing.JMenuItem abmRubroMnu;
    private javax.swing.JMenuItem abmSubRubroMnu;
    private javax.swing.JButton cobranzaBtn;
    private javax.swing.JButton devolucionBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton ventasBtn;
    private javax.swing.JMenuItem versionMnu;
    // End of variables declaration//GEN-END:variables

    private void limpiarFrame() {
//        this.setLocationRelativeTo(null);
        contentPanel = jPanel1;
        contentPanel.setBackground(new java.awt.Color(Constante.getR(), Constante.getG(), Constante.getB()));
        JFrame jFrame = MainFrame.this;
        jFrame.setLocationRelativeTo(null);
        String str0 = UtilFrame.getUsuario(); // + " " + str1;
//        int largo = str0.length();
//        Integer order_num = Integer.valueOf(str0.substring(0, 3));
//        String order_name = str0.substring(6, largo);
        contentPanel.setBorder(new EmptyBorder(5, 5, 100, 5));
        contentPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED),
                str0, TitledBorder.LEFT, TitledBorder.BELOW_BOTTOM));
        jFrame.setDefaultCloseOperation(0);
        setContentPane(contentPanel);
    }

    private void salir() {
        int escape = JOptionPane.showConfirmDialog(null, "CONFIRME SALIR DEL SISTEMA", "Atención - salir de SISTEMA", JOptionPane.YES_NO_OPTION);
        if (escape == 0) {
            int si = cerrarSistema();
            if (si == 0) {
                JOptionPane.showMessageDialog(this, "ERROR SALIENDO DEL SISTEMA");
            }
            System.exit(0);
        }
    }

    private int cerrarSistema() {
        EquipoActivo ea;
        String str0 = UtilFrame.getUsuario(); // + " " + str1;
        int largo = str0.length();
        Integer order_num = Integer.valueOf(str0.substring(0, 3));
        String order_name = str0.substring(11, largo);
//        order_name = UtilFrame.establecerNombre();
//        order_num = UtilFrame.establecerOrden();
//        System.out.println(order_name);
//        System.out.println(order_num);
        try {
            ea = new EquipoActivoService().getEquipoActivoByNombreAndOrden(order_name.trim(), order_num, "A");
        } catch (Exception ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("no se encontro");
            return 0;
        }
        if (ea != null) {
            ea.setActivo(false);
        } else {
            System.out.println("aca pasa algo");
            System.exit(0);
        }
        try {
            new EquipoActivoService().updateEquipoActivo(ea);
            return 1;
        } catch (Exception ex) {
            //Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se actualizo");
            return 0;
        }
    }

    private void abmRubros() {
        AbmRubrosFrame arf = new AbmRubrosFrame();
        arf.setVisible(true);
        this.dispose();
    }

    private void abmClientes() {
        AbmClientesFrame acf = new AbmClientesFrame();
        acf.setVisible(true);
        this.dispose();
    }

    private void abmProductos() {
        ProductosAbmFrame apf = new ProductosAbmFrame();
        apf.setVisible(true);
        this.dispose();
    }

    private void abmSubRubro() {
        AbmSubRubroFrame asrf = new AbmSubRubroFrame();
        asrf.setVisible(true);
        this.dispose();
    }

    private void mostrarVersion() {
        VersionFrame vf = new VersionFrame();
        vf.setVisible(true);
        this.dispose();
    }
}
