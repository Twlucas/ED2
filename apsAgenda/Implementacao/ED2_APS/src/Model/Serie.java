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
public class Serie {
    private final int id;
    private String nome;
    private List<String> generos;
    private int epAtual;
    private int epTotal;
    private int nota;
    private Produtora prod;
    private Date adicionado;
    private Date lançamento;
    private String diaSemanaLançamento;
    private String estado;

    private String obs;
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Serie(int id) {
        this.id = id;
        generos = new ArrayList<>();
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

    public String getDiaSemanaLançamento() {
        return diaSemanaLançamento;
    }

    public void setDiaSemanaLançamento(String diaSemanaLançamento) {
        this.diaSemanaLançamento = diaSemanaLançamento;
    }

    public int getEpAtual() {
        return epAtual;
    }

    public void setEpAtual(int epAtual) {
        this.epAtual = epAtual;
    }

    public int getEpTotal() {
        return epTotal;
    }

    public void setEpTotal(int epTotal) {
        this.epTotal = epTotal;
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
        return diaSemanaLançamento;
    }

    public void setDiaDeLançamento(String diaDeLançamento) {
        this.diaSemanaLançamento = diaDeLançamento;
    }

    public int getId() {
        return id;
    }
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public void addGenero(String s){
        this.generos.add(s);
    }
}
