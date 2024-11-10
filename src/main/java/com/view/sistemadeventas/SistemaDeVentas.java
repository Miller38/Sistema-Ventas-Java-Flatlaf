
package com.view.sistemadeventas;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Miller
 */
public class SistemaDeVentas {

    public static void main(String[] args) {
       FlatLightLaf.setup();
      FrmLogin frmLogin = new FrmLogin();
      frmLogin.setVisible(true);
    }
}
