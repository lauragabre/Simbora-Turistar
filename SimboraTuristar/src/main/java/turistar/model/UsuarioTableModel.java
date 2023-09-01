/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import turistar.model.Usuario;

public class UsuarioTableModel extends AbstractTableModel {
    private List<Usuario> usuarios;
    private String[] colunas = {"Nome", "Email"};

    public UsuarioTableModel(List<Usuario> usuario) {
        this.usuarios = usuario;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
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
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getNome();
            case 1:
                return usuario.getEmail();
            default:
                return null;
        }
    }
    
    public void atualizarTabelaUsuario(List<Usuario> usuario) {
        this.usuarios = usuarios;
        fireTableDataChanged();
    }
}
