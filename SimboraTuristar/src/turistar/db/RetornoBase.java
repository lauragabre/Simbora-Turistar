/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.db;

/**
 *
 * @author Serviços
 */
public class RetornoBase implements IRetornoBD {
    private int codigoRetorno;
    
    private String descResultado;

    public RetornoBase(int codigoRetorno, String descResultado) {
        this.codigoRetorno = codigoRetorno;
        this.descResultado = descResultado;
    }
    
    public RetornoBase() {
        this.codigoRetorno = 0;
        this.descResultado = "";
    }
    
    

    @Override
    public int getCodigo() {
        return codigoRetorno;
    }

    @Override
    public String getDescricao() {
        return descResultado;
    }

    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public void setDescResultado(String descResultado) {
        this.descResultado = descResultado;
    }
    
    
}
