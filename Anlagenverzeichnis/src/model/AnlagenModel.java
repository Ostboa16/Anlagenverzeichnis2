package model;

import data.AnlagenBL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AnlagenModel extends AbstractTableModel{

    public static List<AnlagenBL> list = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
