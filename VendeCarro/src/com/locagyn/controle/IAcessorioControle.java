/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Acessorio;
import com.locagyn.modelos.Marca;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface IAcessorioControle {


    void incluir(Acessorio objeto)throws Exception;
    void alterar(Acessorio objeto)throws Exception;
    ArrayList<Acessorio>listagem()throws Exception;
}
