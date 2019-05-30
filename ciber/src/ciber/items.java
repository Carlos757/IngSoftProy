package ciber;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Carlos Rios
 */

public class items extends JPopupMenu{
    JMenuItem eliminar;
    public items(){
        eliminar = new JMenuItem("Eliminar");
        add(eliminar);
    }
    
     public JMenuItem item(){
         return eliminar;
     }
}
