/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author laura
 */
public class FachadaTuristar {
    private List<Local> locais;
    private List<Usuario> usuarios;

    public FachadaTuristar(){
        locais = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Métodos para gerenciamento de locais

    public void adicionarLocal(Local local) {
        locais.add(local);
    }

    public Local buscarLocalPorNome(String nome) {
        for (Local local : locais) {
            if (local.getNome().equalsIgnoreCase(nome)) {
                return local;
            }
        }
        return null;
    }

    public List<Local> buscarLocaisPorCidade(String cidade) {
        List<Local> locaisPorCidade = new ArrayList<>();
        for (Local local : locais) {
            if (local.getCidade().equalsIgnoreCase(cidade)) {
                locaisPorCidade.add(local);
            }
        }
        return locaisPorCidade;
    }

    public void atualizarLocal(Local localAntigo, Local localNovo) {
        int index = locais.indexOf(localAntigo);
        if (index != -1) {
            locais.set(index, localNovo);
        }
    }

    public void excluirLocal(Local local) {
        locais.remove(local);
    }

    // Métodos para gerenciamento de usuários

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(Usuario usuarioAntigo, Usuario usuarioNovo) {
        int index = usuarios.indexOf(usuarioAntigo);
        if (index != -1) {
            usuarios.set(index, usuarioNovo);
        }
    }

    public void excluirUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
