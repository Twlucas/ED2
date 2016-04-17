/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Convidado
 */
public class Produto {
    
    private String nome;
    private int id;
    private long preco;

    public Produto() {
    }

    public Produto(String nome, int id, long preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPreco() {
        return preco;
    }

    public void setPreco(long preco) {
        this.preco = preco;
    }
    
    
    public Object[] getDados(){
        return new Object[] {id, nome, preco};
    }
    
}
