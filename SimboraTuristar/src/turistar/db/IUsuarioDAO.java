/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package turistar.db;


import java.util.List;
import turistar.db.exceptions.FalhaOperacaoBDException;

/**
 *
 * @author Serviços
 */
public interface IUsuarioDAO<Usuario> {
    
    void inserir(Usuario objeto) throws FalhaOperacaoBDException;
    
    void excluir(Usuario objeto) throws FalhaOperacaoBDException;
    
    void atualizar(Usuario objeto) throws FalhaOperacaoBDException;
    
    Usuario consultar(Usuario objeto) throws FalhaOperacaoBDException;
    
    List<Usuario> listar(Usuario objeto) throws FalhaOperacaoBDException;
}
