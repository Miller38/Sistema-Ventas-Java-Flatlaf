package controlador;

import conexion.Conexion;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 * @author Miller Controlador para gestionar las operaciones CRUD de la entidad
 * Categoria.
 */
public class Ctrl_Categoria {

   // --------------------------------- Metodo para guardar la categoria --------------------------//
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;

        String sql = "INSERT INTO tb_categoria VALUES(?,?,?)";

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setString(2, objeto.getDescripcion());
            pst.setInt(3, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al guardar la categoría: " + e.getMessage());
        }
        return respuesta;
    }

    // -------------------------- Metodo para verificar si existe la categoria --------------------------//
    public boolean existeCategoria(String categoria) {
        boolean existe = false;
        String sql = "SELECT descripcion FROM tb_categoria WHERE descripcion = ?";

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, categoria);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    existe = true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar la categoría: " + e.getMessage());
        }
        return existe;
    }

    // -------------------------- Metodo para actualizar la categoria --------------------------//
      public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;

        String sql = "UPDATE tb_categoria SET descripcion = ? WHERE idCategoria = ?";

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, objeto.getDescripcion());
           pst.setInt(2, idCategoria); // Establecer el idCategoria

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al actualizar la categoría: " + e.getMessage());
        }
        return respuesta;
    }
      
       // -------------------------- Metodo para eliminar la categoria --------------------------//
        public boolean eliminar( int idCategoria) {
          boolean respuesta = false;

          String sql = "DELETE FROM tb_categoria WHERE idCategoria = ?";

          try {
              Connection cn = Conexion.conectar();
              PreparedStatement pst = cn.prepareStatement(sql);

              pst.setInt(1, idCategoria);

              if (pst.executeUpdate() > 0) {
                  respuesta = true;
              }
              cn.close();
          } catch (SQLException e) {
              System.err.println("Error al eliminar la categoría: " + e.getMessage());
          }
          return respuesta;
      }
        
        // -------------------------------- Metodo para cargar las categorias -------------------------------------//
        
        public void CargarComboCategorias(JComboBox<String> comboBox) {
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM tb_categoria";

        try (Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            comboBox.removeAllItems();
            comboBox.addItem("Seleccione categoría:");

            while (rs.next()) {
                comboBox.addItem(rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            System.err.println("Error al cargar las categorías: " + e.getMessage());
        }
    }
}

  

