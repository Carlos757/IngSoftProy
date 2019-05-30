package ciber;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Carlos Rios
 */
class PopClickListener extends MouseAdapter{
    public void mousePressed(MouseEvent e){
        if(e.isPopupTrigger())
            doPop(e);
    }
    
    public void mouseReleased(MouseEvent e){
        if(e.isPopupTrigger())
            doPop(e);
    }
    private void doPop(MouseEvent e){
        items menu=new items();
        menu.show(e.getComponent(), e.getX(), e.getY());
        if(menu.item().isSelected()){
            System.out.println("Amor mio");
        }
    }
}
