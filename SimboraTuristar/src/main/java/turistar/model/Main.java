/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.model;

/**
 *
 * @author Serviços
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FachadaTuristar fachada = new FachadaTuristar();

        // Criar um usuário para adicionar
        Usuario novoUsuario = new Usuario("Nome do Usuário", "usuario@example.com");

        // Adicionar o usuário à fachada
        fachada.adicionarUsuario(novoUsuario);

        // Verificar se o usuário está na lista de usuários da fachada
        List<Usuario> usuarios = fachada.getUsuarios();
        if (usuarios.contains(novoUsuario)) {
            System.out.println("Usuário foi salvo com sucesso!");

            // Imprimir as informações do usuário salvo
            Usuario usuarioSalvo = usuarios.get(usuarios.indexOf(novoUsuario));
            System.out.println("Nome: " + usuarioSalvo.getNome());
            System.out.println("E-mail: " + usuarioSalvo.getEmail());
            // Imprimir outras informações conforme necessário
        } else {
            System.out.println("Falha ao salvar o usuário.");
        }
    }
}
