/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import turistar.model.Local;
import turistar.model.Pago;

public class LocalTableModel extends AbstractTableModel {
    private List<Pago> locais;
    private String[] colunas = {"Nome", "Cidade", "Descrição", "Custo"};

    public LocalTableModel(List<Pago> locais) {
        this.locais = locais;
    }

    @Override
    public int getRowCount() {
        return locais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pago local = locais.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return local.getNome();
            case 1:
                return local.getCidade();
            case 2:
                return local.getDescricao();
            case 3:
                return local.getCusto();
            default:
                return null;
        }
    }
    
    public void atualizarTabelaClientes(List<Pago> locais) {
        this.locais = locais;
        fireTableDataChanged();
    }
}
