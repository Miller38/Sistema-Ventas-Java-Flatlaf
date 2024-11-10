package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;

/**
 *
 * @author Miller
 */
public class Ctrl_Usuario {

// ---------------------- Metodo para iniciar sesion -----------------------------//
    public boolean loginUser(Usuario objeto) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    String sql = "SELECT usuario, password FROM tb_usuario WHERE usuario = ? AND password = ?";
    
    try (PreparedStatement ps = cn.prepareStatement(sql)) {
        ps.setString(1, objeto.getUsuario()); // Configura el primer parámetro
        ps.setString(2, objeto.getPassword()); // Configura el segundo parámetro
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                // Si el resultado existe, el login es exitoso
                respuesta = true;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al iniciar sesión: " + e.getMessage());
    }
    return respuesta;
}


}
