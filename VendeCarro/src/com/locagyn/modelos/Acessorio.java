/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author aluno
 */
public class Acessorio {
     private int id = 0;
    private String descricao = "";
    private String valor = "";
    //Metodos
    public Acessorio(){
    }
    public Acessorio(int id, String descricao, String valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getValor() {
        return valor;
    }
    public void setUrl(String url) {
        this.valor = url;
    }
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valor;
    }
    
}
