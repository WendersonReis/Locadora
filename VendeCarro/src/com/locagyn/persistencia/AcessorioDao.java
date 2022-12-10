/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ID.GeradorIdentificador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class AcessorioDao {

public class AcessorioDao implements AcessorioDao {

    private String nomeDoArquivoNoDisco;

    public AcessorioDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivodedados/Acessorio.txt";
    }

    @Override
    public void incluir(Acessorio objeto) throws Exception {
        try {  
                        
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //incluindo o id no objeto******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            //Não sei se tiro
            throw erro;
        }

    }

    @Override
    public void alterar(Acessorio objeto) throws Exception {
        try {
            Iterator<Acessorio> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Acessorio aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }

    }

    @Override
    public ArrayList<Acessorio> listagem() throws Exception {
        try {
            ArrayList<Acessorio> listaDeMarcas = new ArrayList<Acessorio>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Acessorio objetoMarca = new Acessorio();
                String vetorString[] = linha.split(";");
                objetoAcessorio.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorio.setDescricao(vetorString[1]);
                objetoAcessorio.setUrl(vetorString[2]);
                listaDeAcessorio.add(objetoAcessorio);
            }
            br.close();
            return listaDeAcessorio;
        } catch (Exception erro) {
            throw erro;
        }

    }

   
    
       
}

}