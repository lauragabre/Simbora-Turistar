/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Serviços
 */
public class Usuario {
    
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
