/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.db;

import java.util.List;
import java.util.Vector;
import turistar.db.exceptions.FalhaOperacaoBDException;
import turistar.model.Local;

/**
 *
 * @author Serviços
 */
public class LocalRepositorio implements ILocalDAO<Local> {
  @Override
    public void inserir(Local objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public void excluir(Local objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public void atualizar(Local objeto) throws FalhaOperacaoBDException {
        System.out.println(objeto);
    }

    @Override
    public Local consultar(Local objeto) throws FalhaOperacaoBDException {
        return objeto;
    }

    @Override
    public List<Local> listar(Local objeto) throws FalhaOperacaoBDException {
        List<Local> listaVeiculos = new Vector<Local>();
        listaVeiculos.add(objeto);
        return listaVeiculos;
    }
}
