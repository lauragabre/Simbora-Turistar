/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

/**
 *
 * @author Serviços
 */
public class Gratuito extends Local{
    private boolean reserva;
    
    public Gratuito(String nome, String cidade, String descricao, Boolean reserva){
        super(nome, cidade, descricao);
        this.reserva = reserva;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
}
