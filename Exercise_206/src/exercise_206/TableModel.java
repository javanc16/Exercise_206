/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_206;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ich
 */
public class TableModel extends AbstractTableModel {
    private ArrayList<Storage> st = new ArrayList<>();
    
    private static String[] colnames = {"ID", "Description", "Amount", "Place"};
    @Override
    public int getRowCount() {
        return st.size();
    }

    @Override
    public int getColumnCount() {
       return colnames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return st.get(rowIndex).getColValue(columnIndex);
    }
    
}
