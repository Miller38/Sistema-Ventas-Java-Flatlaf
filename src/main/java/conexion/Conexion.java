
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para gestionar la conexión a la base de datos.
 * @author Miller
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_sistema_ventas";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());

    /**
     * Establece la conexión a la base de datos.
     * @return Connection objeto Connection a la base de datos o null si ocurre un error.
     */
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error en la conexión a la base de datos: " + e.getMessage(), e);
            return null;
        }
    }

    /**
     * Cierra la conexión a la base de datos.
     * @param cn Objeto Connection que se desea cerrar.
     */
    public static void cerrarConexion(Connection cn) {
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {
                LOGGER.log(Level.WARNING, "Error al cerrar la conexión: " + e.getMessage(), e);
            }
        }
    }
}