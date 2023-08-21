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
    List<String> listarLocal(String nome, String cidade, String descricao);
    
    void excluirLocal(String nome);
    void incluirLocal(String nome, String cidade, String descricao);
    void atualizarLocal(String nome, String cidade, String descricao);
    
    List<String> listarUsuario();
    List<String> listarUsuario(String nome, String email);
    
    void excluirUsuario(String email);
    void incluirUsuario(String nome, String email);
    void atualizarUsuario(String nome, String email);
}
