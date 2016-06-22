/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Convidado
 */
public class Filme {
    final int id;
    private String nome;
    private List<String> generos;
    private Double duracao;
    private int nota;
    private Produtora prod;
    private Date adicionado;
    private Date lançamento;
    private String diaDeLançamento;
    private String estado;
    private String obs;

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public void addGenero(String s){
        this.generos.add(s);
    }
    public Filme(int id) {
        this.id = id;
        generos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

   
    public Produtora getProd() {
        return prod;
    }

    public void setProd(Produtora prod) {
        this.prod = prod;
    }

    public Date getAdicionado() {
        return adicionado;
    }

    public void setAdicionado(Date adicionado) {
        this.adicionado = adicionado;
    }
    
    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Date getLançamento() {
        return lançamento;
    }

    public void setLançamento(Date lançamento) {
        this.lançamento = lançamento;
    }

    public String getDiaDeLançamento() {
        return diaDeLançamento;
    }

    public void setDiaDeLançamento(String diaDeLançamento) {
        this.diaDeLançamento = diaDeLançamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
