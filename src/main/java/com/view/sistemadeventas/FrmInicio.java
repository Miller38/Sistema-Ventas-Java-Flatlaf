package com.view.sistemadeventas;

import java.awt.geom.RoundRectangle2D;
import themes.ThemeManager;

/**
 *
 * @author Miller
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {

        setUndecorated(true);
        // Inicializar los componentes visuales (generado automáticamente por NetBeans u otro IDE)
        initComponents();
        // Establecer el tamaño de la ventana (JFrame)
        // this.setSize(1067, 560);
        this.setSize(927, 568);
        //
        // No permitir que el usuario cambie el tamaño de la ventana
        this.setResizable(false);
        // Establecer el título de la ventana
        this.setTitle("Inicio");
        // Centrar la ventana en la pantalla
        this.setLocationRelativeTo(null);

        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_NuevoUsuario = new javax.swing.JMenuItem();
        jMenuItem_GestionarUusarios = new javax.swing.JMenuItem();
        jMenu_NuevoProducto = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem_GestionarProductos = new javax.swing.JMenuItem();
        jMenuItem_ActualizarStock = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_NuevoCliente = new javax.swing.JMenuItem();
        jMenuItem_GestionarClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_NuevaCategoria = new javax.swing.JMenuItem();
        jMenuItem_GestionarCategoria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_NuevaVenta = new javax.swing.JMenuItem();
        jMenuItem_GestionarVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ReportesClientes = new javax.swing.JMenuItem();
        jMenuItem_ReportesCategorias = new javax.swing.JMenuItem();
        jMenuItem_ReportesProductos = new javax.swing.JMenuItem();
        jMenuItem_ReportesVentas = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_VerHistorial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        CerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_NuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_NuevoUsuario.setText("Nuevo Usuario");
        jMenuItem_NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_NuevoUsuario);

        jMenuItem_GestionarUusarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_GestionarUusarios.setText("Gestinar Usuarios");
        jMenuItem_GestionarUusarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GestionarUusariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_GestionarUusarios);

        jMenuBar1.add(jMenu1);

        jMenu_NuevoProducto.setText("Producto");
        jMenu_NuevoProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu_NuevoProducto.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem8.setText("Nuevo Producto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu_NuevoProducto.add(jMenuItem8);

        jMenuItem_GestionarProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_GestionarProductos.setText("Gestinar Producto");
        jMenuItem_GestionarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GestionarProductosActionPerformed(evt);
            }
        });
        jMenu_NuevoProducto.add(jMenuItem_GestionarProductos);

        jMenuItem_ActualizarStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_ActualizarStock.setText("Actualizar Stock");
        jMenuItem_ActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ActualizarStockActionPerformed(evt);
            }
        });
        jMenu_NuevoProducto.add(jMenuItem_ActualizarStock);

        jMenuBar1.add(jMenu_NuevoProducto);

        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_NuevoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_NuevoCliente.setText("Nuevo Cliente");
        jMenuItem_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevoClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_NuevoCliente);

        jMenuItem_GestionarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_GestionarClientes.setText("Gestionar Clientes");
        jMenuItem_GestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GestionarClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_GestionarClientes);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Categoria");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_NuevaCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_NuevaCategoria.setText("Nueva Categoria");
        jMenuItem_NuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_NuevaCategoria);

        jMenuItem_GestionarCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_GestionarCategoria.setText("Gestionar Categoria");
        jMenuItem_GestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GestionarCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_GestionarCategoria);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Factura");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_NuevaVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_NuevaVenta.setText("Nueva Venta");
        jMenuItem_NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaVentaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_NuevaVenta);

        jMenuItem_GestionarVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_GestionarVentas.setText("Gestionar Ventas");
        jMenuItem_GestionarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GestionarVentasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_GestionarVentas);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Reportes");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_ReportesClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_ReportesClientes.setText("Reportes Clientes");
        jMenuItem_ReportesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ReportesClientesActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ReportesClientes);

        jMenuItem_ReportesCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_ReportesCategorias.setText("Reportes Categorias");
        jMenuItem_ReportesCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ReportesCategoriasActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ReportesCategorias);

        jMenuItem_ReportesProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_ReportesProductos.setText("Reportes Productos");
        jMenuItem_ReportesProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ReportesProductosActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ReportesProductos);

        jMenuItem_ReportesVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_ReportesVentas.setText("Reportes Ventas");
        jMenuItem_ReportesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ReportesVentasActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ReportesVentas);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Historial");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_VerHistorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_VerHistorial.setText("Ver Historial");
        jMenuItem_VerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VerHistorialActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_VerHistorial);

        jMenuBar1.add(jMenu8);

        jMenu2.setText("Themes");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Ligth");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Dark");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Carbon");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setText("Cobalt");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setText("Dracula");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        CerrarSesion.setText("Cerrar sesion");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarSesion.setMinimumSize(new java.awt.Dimension(110, 50));
        CerrarSesion.setPreferredSize(new java.awt.Dimension(120, 50));
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(CerrarSesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ThemeManager.setFlatLightLaf();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ThemeManager.setFlatDarkLaf();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ThemeManager.setCarbonTheme();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ThemeManager.setCobaltTheme();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ThemeManager.setDraculaTheme();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void jMenuItem_GestionarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GestionarVentasActionPerformed
        FrmGestionarFacturas frmGestionarFacturas = new FrmGestionarFacturas();
        frmGestionarFacturas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_GestionarVentasActionPerformed

    private void jMenuItem_NuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaCategoriaActionPerformed
        FrmCategoria frmCategoria = new FrmCategoria();
        frmCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NuevaCategoriaActionPerformed

    private void jMenuItem_GestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GestionarCategoriaActionPerformed
        FrmGestionarCategorias frmGestionarCategorias = new FrmGestionarCategorias();
        frmGestionarCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem_GestionarCategoriaActionPerformed

    private void jMenuItem_NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoUsuarioActionPerformed
        FrmNuevoUsuario frmNuevoUsuario = new FrmNuevoUsuario();
        frmNuevoUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NuevoUsuarioActionPerformed

    private void jMenuItem_GestionarUusariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GestionarUusariosActionPerformed
        FrmGestionarUsuarios frmGestionarUsuarios = new FrmGestionarUsuarios();
        frmGestionarUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem_GestionarUusariosActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FrmNuevoProducto frmNuevoProducto = new FrmNuevoProducto();
        frmNuevoProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem_GestionarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GestionarProductosActionPerformed
        FrmGestionarProductos frmGestionarProductos = new FrmGestionarProductos();
        frmGestionarProductos.setVisible(true);
    }//GEN-LAST:event_jMenuItem_GestionarProductosActionPerformed

    private void jMenuItem_ActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ActualizarStockActionPerformed
        FrmActualizarStock frmActualizarStock = new FrmActualizarStock();
        frmActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ActualizarStockActionPerformed

    private void jMenuItem_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoClienteActionPerformed
        FrmNuevoCliente frmNuevoCliente = new FrmNuevoCliente();
        frmNuevoCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NuevoClienteActionPerformed

    private void jMenuItem_GestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GestionarClientesActionPerformed
        FrmGestionarClientes frmGestionarClientes = new FrmGestionarClientes();
        frmGestionarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem_GestionarClientesActionPerformed

    private void jMenuItem_NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaVentaActionPerformed
        FrmNuevaFactura frmNuevaFactura = new FrmNuevaFactura();
        frmNuevaFactura.setVisible(true);
    }//GEN-LAST:event_jMenuItem_NuevaVentaActionPerformed

    private void jMenuItem_ReportesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ReportesClientesActionPerformed
        FrmReportesClientes frmReportesClientes = new FrmReportesClientes();
        frmReportesClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ReportesClientesActionPerformed

    private void jMenuItem_ReportesCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ReportesCategoriasActionPerformed
        FrmReportesCategorias frmReportesCategorias = new FrmReportesCategorias();
        frmReportesCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ReportesCategoriasActionPerformed

    private void jMenuItem_ReportesProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ReportesProductosActionPerformed
        FrmReportesProductos frmReportesProductos = new FrmReportesProductos();
        frmReportesProductos.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ReportesProductosActionPerformed

    private void jMenuItem_ReportesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ReportesVentasActionPerformed
        FrmReportesVentas frmReportesVentas = new FrmReportesVentas();
        frmReportesVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ReportesVentasActionPerformed

    private void jMenuItem_VerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VerHistorialActionPerformed
        FrmVerHistorial frmVerHistorial = new FrmVerHistorial();
        frmVerHistorial.setVisible(true);
    }//GEN-LAST:event_jMenuItem_VerHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CerrarSesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem_ActualizarStock;
    private javax.swing.JMenuItem jMenuItem_GestionarCategoria;
    private javax.swing.JMenuItem jMenuItem_GestionarClientes;
    private javax.swing.JMenuItem jMenuItem_GestionarProductos;
    private javax.swing.JMenuItem jMenuItem_GestionarUusarios;
    private javax.swing.JMenuItem jMenuItem_GestionarVentas;
    private javax.swing.JMenuItem jMenuItem_NuevaCategoria;
    private javax.swing.JMenuItem jMenuItem_NuevaVenta;
    private javax.swing.JMenuItem jMenuItem_NuevoCliente;
    private javax.swing.JMenuItem jMenuItem_NuevoUsuario;
    private javax.swing.JMenuItem jMenuItem_ReportesCategorias;
    private javax.swing.JMenuItem jMenuItem_ReportesClientes;
    private javax.swing.JMenuItem jMenuItem_ReportesProductos;
    private javax.swing.JMenuItem jMenuItem_ReportesVentas;
    private javax.swing.JMenuItem jMenuItem_VerHistorial;
    private javax.swing.JMenu jMenu_NuevoProducto;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
