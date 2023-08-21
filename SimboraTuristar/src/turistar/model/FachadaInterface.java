/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package turistar.model;

import java.util.List;

/**
 *
 * @author Serviços
 */
public interface FachadaInterface {
    
    List<String> listarLocal();
    
    void excluirLocal(String nome);
    void incluirLocal(String nome, String cidade, String descricao);
    void atualizarLocal(String nome, String cidade, String descricao);
    
    void atualizarUsuario(String nome, String email);
}
