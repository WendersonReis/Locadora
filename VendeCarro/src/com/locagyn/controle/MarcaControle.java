/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import com.locagyn.persistencia.MarcaDao;
import com.locagyn.persistencia.IMarcaDao;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author USaleS & Aleardo
 */
public class MarcaControle implements IMarcaControle {

    IMarcaDao marcaPersistencia = null;

    public MarcaControle() {
        this.marcaPersistencia = new MarcaDao();
    }

    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                Marca aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Marca objeto) throws Exception {

        marcaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {

        marcaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }

    public void checarTxt() {

        try {
            marcaPersistencia.ChecarTxt();
        } catch (Exception e) {
        }

    }

}
