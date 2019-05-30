package ciber;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Carlos Rios
 */
public class CellRenderer extends DefaultTableCellRenderer{

    private int columna_patron;

    public CellRenderer(int Colpatron) {
        this.columna_patron = Colpatron;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        Color amarillo = new Color(255,255,255);
        setBackground(amarillo);//color de fondo
        table.setForeground(Color.black);//color de texto
         boolean oddRow = (row % 2 == 0);
         Color oro = new Color(25, 158, 218);
        
         if (oddRow) {
            setBackground(Color.white);
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }

}




