/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Tela.Tela1;

/**
 *
 * @author Convidado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control_List list = new Control_List();
        Produto p = new Produto("hoi", 0, 65);
        
        list.getListp().add(p);
        /*p.setId(1);
        p.setNome("ho");
        p.setPreco(60)ho;*/
        p= new Produto("hoa", 1, 25);list.getListp().add(p);
        p= new Produto("hor", 2, 1);list.getListp().add(p);
        p= new Produto("hoq", 3, 200);list.getListp().add(p);
        p= new Produto("hob", 4, 150);list.getListp().add(p);
        p= new Produto("hoa", 5, 25);list.getListp().add(p);
        p= new Produto("h", 6, 9);list.getListp().add(p);
        
        
        Ordena o = new Ordena();
        o.porNome(list, 0, list.getListp().size()-1);
        list.printList();
        System.out.println("\n\n");
        o.porId(list, 0, list.getListp().size()-1);
        list.printList();
        System.out.println("\n\n");
        o.porPreco(list, 0, list.getListp().size()-1);
        list.printList();
        
        Tela1 tela1 = new Tela1(list);
    }
    
}
