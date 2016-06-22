/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Anime;
import model.Filme;
import model.Produtora;
import model.Serie;

/**
 *
 * @author Convidado
 */
public class Gerenciador {
    private List<Anime> animes;
    private List<Serie> series;
    private List<Filme> filmes;
    private List<Produtora> produtoras;
    private List<Object> all;

    public Gerenciador() {
        this.animes = new ArrayList<>();
        this.series = new ArrayList<>();
        this.filmes = new ArrayList<>();
        this.produtoras = new ArrayList<>();
        this.all = new ArrayList<>();
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(List<Anime> animes) {
        this.animes = animes;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Produtora> getProdutoras() {
        return produtoras;
    }

    public void setProdutoras(List<Produtora> produtoras) {
        this.produtoras = produtoras;
    }

    public List<Object> getAll() {
        return all;
    }

    public void setAll(List<Object> all) {
        this.all = all;
    }
    
    
}
