/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Convidado
 */
public class Produtora {
    private final String nome;
    private List<Serie> series;

    public Produtora(String nome) {
        this.nome = nome;
        series = new ArrayList<>();
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public String getNome() {
        return nome;
    }
    
    
}
