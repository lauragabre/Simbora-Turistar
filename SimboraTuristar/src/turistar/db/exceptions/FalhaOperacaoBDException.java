/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.db.exceptions;

import turistar.db.IRetornoBD;

/**
 *
 * @author Serviços
 */
public class FalhaOperacaoBDException extends Exception {
    private IRetornoBD retorno;

    public FalhaOperacaoBDException() {
    }
    
    public FalhaOperacaoBDException(IRetornoBD retorno) {
        this.retorno = retorno;
    }
    
    

    public IRetornoBD getRetorno() {
        return retorno;
    }

    public void setRetorno(IRetornoBD retorno) {
        this.retorno = retorno;
    }
    
    
}
