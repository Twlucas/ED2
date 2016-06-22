package estrutura;

import model.Anime;
import model.Filme;
import model.Serie;

public class No {

    private No esquerda;
    private No direita;
    private No pai;
    private int chave;
    private int balanceamento;
    private Anime anime;
    private Filme filme;
    private Serie serie;

    public No(int k) {
        setEsquerda(setDireita(setPai(null)));
        setBalanceamento(0);
        setChave(k);
    }

    public No(int chave, Anime anime) {
        this.chave = chave;
        this.anime = anime;
    }
    
    public No(int chave, Filme filme) {
        this.chave = chave;
        this.filme = filme;
    }
    
    public No(int chave, Serie serie) {
        this.chave = chave;
        this.serie = serie;
    }

    public String toString() {
        return Integer.toString(getChave());
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public No getPai() {
        return pai;
    }

    public No setPai(No pai) {
        this.pai = pai;
        return pai;
    }

    public No getDireita() {
        return direita;
    }

    public No setDireita(No direita) {
        this.direita = direita;
        return direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
