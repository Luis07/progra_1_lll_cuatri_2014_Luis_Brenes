/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

import FrontEnd.FrmGraficos;
import FrontEnd.FrmMain;

/**
 *
 * @author Luis B
 */
public class Clase15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrontEnd.FrmMain oFrmMain= new FrmMain();
        FrontEnd.FrmGraficos oFrmGraficos= new FrmGraficos();
        oFrmMain.setVisible(true);
        oFrmGraficos.setVisible(true);
    }
    
}
