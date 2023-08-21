/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.db;

//import concessionaria.db.exceptions.FalhaOperacaoBDException;
import turistar.model.Usuario;
import java.util.List;
import java.util.Vector;
import turistar.db.exceptions.FalhaOperacaoBDException;

/**
 *
 * @author Serviços
 */
public class UsuarioRepositorio implements IUsuarioDAO<Usuario> {
  @Override
    public void inserir(Usuario objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public void excluir(Usuario objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public void atualizar(Usuario objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public Usuario consultar(Usuario objeto) throws FalhaOperacaoBDException {
        return objeto;
    }

    @Override
    public List<Usuario> listar(Usuario objeto) throws FalhaOperacaoBDException {
        List<Usuario> listaVeiculos = new Vector<Usuario>();
        listaVeiculos.add(objeto);
        return listaVeiculos;
    }
}
