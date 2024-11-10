package com.view.sistemadeventas;

import conexion.Conexion;
import controlador.Ctrl_Categoria;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author Miller
 */
public class FrmNuevoProducto extends javax.swing.JFrame {

    int obtenerIdCategoriaCombo = 0;

    public FrmNuevoProducto() {
        initComponents();
        this.setSize(400, 384);
        this.setResizable(false);
        this.setTitle("Nuevo Producto.");
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.CargarComboCategorias();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        Cmb_iva = new javax.swing.JComboBox<>();
        Cmb_Categorias = new javax.swing.JComboBox<>();
        Btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Producto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Precio :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Iva :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Categorias :");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_descripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Cmb_iva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cmb_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Iva:", "No grava Iva", "12%", "14%" }));

        Cmb_Categorias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cmb_Categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria :", "Item 2", "Item 3", "Item 4" }));

        Btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_guardar.setText("Guardar");
        Btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_descripcion)
                                    .addComponent(Cmb_iva, 0, 164, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cmb_Categorias, 0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txt_cantidad)
                                    .addComponent(txt_precio))))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cmb_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Cmb_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_guardar)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_guardarActionPerformed
        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String iva = Cmb_iva.getSelectedItem().toString().trim();
        String categoria = Cmb_Categorias.getSelectedItem().toString().trim();

// Validaciones: verificar campos vacíos y mostrar advertencia
        if (txt_nombre.getText().trim().isEmpty() || txt_cantidad.getText().trim().isEmpty() || txt_precio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            txt_nombre.setBackground(Color.red);
            txt_cantidad.setBackground(Color.red);
            txt_precio.setBackground(Color.red);
        } else {
            // Verificar si el producto ya existe
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {

                // Validación de selección de IVA
                if (iva.equals("Seleccione Iva:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione IVA.");
                } // Validación de selección de categoría
                else if (categoria.equals("Seleccione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione categoría.");
                } else {
                    try {
                        // Asignar valores al objeto producto
                        producto.setNombre(txt_nombre.getText().trim());
                        producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));

                        // Procesar el precio, reemplazando coma por punto si es necesario
                        String precioTXT = txt_precio.getText().trim().replace(",", ".");
                        double precio = Double.parseDouble(precioTXT);
                        producto.setPrecio(precio);

                        producto.setDescripcion(txt_descripcion.getText().trim());

                        // Asignar porcentaje de IVA
                        switch (iva) {
                            case "No grava iva":
                                producto.setPorcentajeIva(0);
                                break;
                            case "12%":
                                producto.setPorcentajeIva(12);
                                break;
                            case "14%":
                                producto.setPorcentajeIva(14);
                                break;
                        }

                        // Asignar categoría
                        this.idCategoria();
                        producto.setIdCategoria(obtenerIdCategoriaCombo);
                        producto.setEstado(1);

                        // Guardar producto
                        if (controlProducto.guardar(producto)) {
                            JOptionPane.showMessageDialog(null, "Registro guardado.");
                            txt_nombre.setBackground(Color.green);
                            txt_cantidad.setBackground(Color.green);
                            txt_precio.setBackground(Color.green);
                            txt_descripcion.setBackground(Color.green);

                            this.CargarComboCategorias();
                            Cmb_iva.setSelectedItem("Seleccione Iva:");
                            this.limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar.");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.err.println("Error en: " + e.getMessage());
                        JOptionPane.showMessageDialog(null, "Error en los datos ingresados.");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe.");
            }
        }

    }//GEN-LAST:event_Btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_guardar;
    private javax.swing.JComboBox<String> Cmb_Categorias;
    private javax.swing.JComboBox<String> Cmb_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    // ------------------------------Metodo para limpiar los campos---------------------------------------------//
    private void limpiar() {
        txt_nombre.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        txt_cantidad.setText("");
    }

    //-------------------------------Método para cargar las categorías------------------------------------------//
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM tb_categoria";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Cmb_Categorias.removeAllItems();
            Cmb_Categorias.addItem("Seleccione categoria:");

            while (rs.next()) {
                Cmb_Categorias.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar las categorias." + e.getMessage());
        }
    }

    // ---------------------------- Metodo para obtener idCategoria -----------------------------------------//
    private int idCategoria() {
        String sql = "SELECT * FROM tb_categoria WHERE descripcion = '" + this.Cmb_Categorias.getSelectedItem() + "' ";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la categoria " + e.getMessage());
        }
        return obtenerIdCategoriaCombo;
    }
}
