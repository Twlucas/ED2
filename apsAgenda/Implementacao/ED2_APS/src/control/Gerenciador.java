/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import estrutura.ArvoreAvl;
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
    private ArvoreAvl series;
    private ArvoreAvl filmes;
    private ArvoreAvl animes;
    private List<Anime> animeAtual;
    private List<Serie> serieAtual;
    private List<Filme> fimeFuturo;
    private List<Anime> animeFuturo;
    private List<Serie> serieFuturo;
    private List<Anime> allAnimes;
    private List<Serie> allSeries;
    private List<Filme> allFilmes;
    
    int tamSerie, tamFilme, tamAnime;

    public Gerenciador() {
        series = new ArvoreAvl();
        filmes = new ArvoreAvl();
        animes = new ArvoreAvl();
        tamSerie = 0;
        tamFilme = 0;
        tamAnime = 0;
        animeAtual = new ArrayList<>();
        animeFuturo = new ArrayList<>();
        serieAtual = new ArrayList<>();
        serieFuturo = new ArrayList<>();
        fimeFuturo = new ArrayList<>();
        allAnimes = new ArrayList<>();
        allFilmes = new ArrayList<>();
        allSeries = new ArrayList<>();
    }

    public int getTamSerie() {
        return tamSerie;
    }

    public void setTamSerie(int tamSerie) {
        this.tamSerie = tamSerie;
    }

    public int getTamFilme() {
        return tamFilme;
    }

    public void setTamFilme(int tamFilme) {
        this.tamFilme = tamFilme;
    }

    public int getTamAnime() {
        return tamAnime;
    }

    public void setTamAnime(int tamAnime) {
        this.tamAnime = tamAnime;
    }
    
    
    public ArvoreAvl getSeries() {
        return series;
    }

    public void setSeries(ArvoreAvl series) {
        this.series = series;
    }

    public ArvoreAvl getFilmes() {
        return filmes;
    }

    public void setFilmes(ArvoreAvl filmes) {
        this.filmes = filmes;
    }

    public ArvoreAvl getAnimes() {
        return animes;
    }

    public void setAnimes(ArvoreAvl animes) {
        this.animes = animes;
    }

    public List<Anime> getAnimeAtual() {
        return animeAtual;
    }

    public void setAnimeAtual(List<Anime> animeAtual) {
        this.animeAtual = animeAtual;
    }

    public List<Serie> getSerieAtual() {
        return serieAtual;
    }

    public void setSerieAtual(List<Serie> serieAtual) {
        this.serieAtual = serieAtual;
    }

    public List<Filme> getFimeFuturo() {
        return fimeFuturo;
    }

    public void setFimeFuturo(List<Filme> fimeFuturo) {
        this.fimeFuturo = fimeFuturo;
    }

    public List<Anime> getAnimeFuturo() {
        return animeFuturo;
    }

    public void setAnimeFuturo(List<Anime> animeFuturo) {
        this.animeFuturo = animeFuturo;
    }

    public List<Serie> getSerieFuturo() {
        return serieFuturo;
    }

    public void setSerieFuturo(List<Serie> serieFuturo) {
        this.serieFuturo = serieFuturo;
    }

    public List<Anime> getAllAnimes() {
        return allAnimes;
    }

    public void setAllAnimes(List<Anime> allAnimes) {
        this.allAnimes = allAnimes;
    }

    public List<Serie> getAllSeries() {
        return allSeries;
    }

    public void setAllSeries(List<Serie> allSeries) {
        this.allSeries = allSeries;
    }

    public List<Filme> getAllFilmes() {
        return allFilmes;
    }

    public void setAllFilmes(List<Filme> allFilmes) {
        this.allFilmes = allFilmes;
    }
    
    
}
