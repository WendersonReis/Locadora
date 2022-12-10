/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import com.locagyn.persistencia.IAcessorioDao;
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
public class AcessorioControle implements IAcessorioControle {

    IAcessorioDao acessorioPersistencia = null;

    public AcessorioControle() {
        this.acessorioPersistencia= new AcessorioDao();
    }

    private boolean buscarAcessorio(String descricao) throws Exception {
        try {
            ArrayList<Marca> listagem = acessorioPersistencia.listagem();
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

        acessorioPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {

        acessorioPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return acessorioPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return acessorioPersistencia.buscar(id);
    }

    public void checarTxt() {

        try {
            acessorioPersistencia.ChecarTxt();
        } catch (Exception e) {
        }

    }

}
