/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Convidado
 */
public class Control_List {
    private List<Produto> listp= new ArrayList<>();

    private int[] listpos=new int[5000];

    public int[] getListin() {
        return listpos;
    }

    public void setListin(int[] li) {
        this.listpos = li;
    }
    
    public List<Produto> getListp() {
        return listp;
    }

    public Control_List() {
        
        for (int i = 0; i < listpos.length; i++) {
            listpos[i]=i;
        }
        
    }
    
    public void setListp(List<Produto> listp) {
        this.listp = listp;
    }
    
    public void printList(){
        
        int j;
        for (int i = 0; i < this.listp.size(); i++) {
            j=this.listpos[i];
            System.out.println(listp.get(j).getId()+" "+listp.get(j).getNome()+
                    " "+listp.get(j).getPreco());
        }
        
    }
    
}
