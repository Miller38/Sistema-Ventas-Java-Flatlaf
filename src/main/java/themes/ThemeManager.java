
package themes;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Frame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Miller
 */
public class ThemeManager {
    
    public static void setFlatLightLaf(){
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                updateUI();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        });
    }
    
     // --------------------------------------------------------------------------------------------------------------- //
    
    public static void setFlatDarkLaf(){
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                updateUI();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        });
    }
    
    // ---------------------------------------------------------------------------------------------------------------- //
    
   public static void setCarbonTheme() {
        SwingUtilities.invokeLater(() -> {
            try {
                IntelliJTheme.setup(ThemeManager.class.getResourceAsStream("/com/formdev/flatlaf/intellijthemes/themes/Carbon.theme.json"));
                updateUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

// -------------------------------------------------------------------------------------------------------------------  //

 public static void setCobaltTheme() {
        SwingUtilities.invokeLater(() -> {
            try {
                IntelliJTheme.setup(ThemeManager.class.getResourceAsStream("/com/formdev/flatlaf/intellijthemes/themes/Cobalt_2.theme.json"));
                updateUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

// ------------------------------------------------------------------------------------------------------------------------------------ //

    public static void setDraculaTheme() {
        SwingUtilities.invokeLater(() -> {
            try {
                IntelliJTheme.setup(ThemeManager.class.getResourceAsStream("/com/formdev/flatlaf/intellijthemes/themes/Dracula.theme.json"));
                updateUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

// ------------------------------------------------------------------------------------------------------------------------------------ //
    private static void updateUI() {
        // Esto actualizará todos los JFrame abiertos
        for (Frame frame : javax.swing.JFrame.getFrames()) {
            SwingUtilities.updateComponentTreeUI(frame);
        }
    }
   
    
}
