/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

import turistar.interfac.ILocal;

/**
 *
 * @author laura
 */
public abstract class Local implements ILocal{
    private String nome;
    private String cidade;
    private String descricao;

    public Local(String nome, String cidade, String descricao) {
        this.nome = nome;
        this.cidade = cidade;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getDescricao() {
        return descricao;
    }
}
