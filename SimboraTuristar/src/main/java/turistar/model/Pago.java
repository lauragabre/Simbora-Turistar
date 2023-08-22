/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

/**
 *
 * @author laura
 */
public class Pago extends Local{
    private double custo;
    
    public Pago(String nome, String cidade, String descricao, Double custo){
        super(nome, cidade, descricao);
        this.custo = custo;
    }   
    
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
