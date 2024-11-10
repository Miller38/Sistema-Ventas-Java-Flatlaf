package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Producto;

/**
 *
 * @author Miller
 */
public class Ctrl_Producto {

    // --------------------------------- Metodo para guardar el producto --------------------------//
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;

        String sql = "INSERT INTO tb_producto VALUES(?,?,?,?,?,?,?,?)";

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setString(2, objeto.getNombre());
            pst.setInt(3, objeto.getCantidad());
            pst.setDouble(4, objeto.getPrecio());
            pst.setString(5, objeto.getDescripcion());
            pst.setInt(6, objeto.getPorcentajeIva());
            pst.setInt(7, objeto.getIdCategoria());
            pst.setInt(8, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al guardar el producto : " + e.getMessage());
        }
        return respuesta;
    }

    // -------------------------- Metodo para verificar si existe el producto  --------------------------//
    public boolean existeProducto(String producto) {
        boolean existe = false;
        String sql = "SELECT descripcion FROM tb_producto WHERE nombre = ?";

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, producto);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    existe = true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar la producto : " + e.getMessage());
        }
        return existe;
    }

}
