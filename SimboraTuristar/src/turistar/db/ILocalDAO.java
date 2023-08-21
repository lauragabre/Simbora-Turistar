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
public interface ILocalDAO<Local> {
        
    void inserir(Local objeto) throws FalhaOperacaoBDException;
    
    void excluir(Local objeto) throws FalhaOperacaoBDException;
    
    void atualizar(Local objeto) throws FalhaOperacaoBDException;
    
    Local consultar(Local objeto) throws FalhaOperacaoBDException;
    
    List<Local> listar(Local objeto) throws FalhaOperacaoBDException;
}
