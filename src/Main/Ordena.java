/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;

/**
 *
 * @author Convidado
 */
public class Ordena {
    
    
    
    private int partitionNome(List<Produto> list,int[] A, int be, int end) {
        int aux;
        Produto pivot = new Produto();
        pivot = list.get(A[end]);
        int pIndex = be;
        for (int i = be; i < end; i++) {
            if (list.get(A[i]).getNome().compareTo(pivot.getNome()) < 0) {
                aux = A[i];
                A[i] = A[pIndex];
                A[pIndex] = aux;
                pIndex++;
            }
        }
        aux = A[pIndex];
        A[pIndex] = A[end];
        A[end] = aux;
        return pIndex;
    }
    
    
    public int[] porNome(Control_List clist, int be, int end){
         
        if (be < end) {
            int particionIndex = partitionNome(clist.getListp(), clist.getListin(), be, end);
            porNome(clist, be, particionIndex - 1);
            porNome(clist, particionIndex + 1, end);
        }
        return clist.getListin();        
    }
    
    private int partitionId(List<Produto> list,int[] A, int be, int end) {
        int aux;
        Produto pivot = new Produto();
        pivot = list.get(A[end]);
        int pIndex = be;
        for (int i = be; i < end; i++) {
            if (list.get(A[i]).getId() <= pivot.getId()) {
                aux = A[i];
                A[i] = A[pIndex];
                A[pIndex] = aux;
                pIndex++;
            }
        }
        aux = A[pIndex];
        A[pIndex] = A[end];
        A[end] = aux;
        return pIndex;
    }
    
    
    public int[] porId(Control_List clist, int be, int end){
         
        if (be < end) {
            int particionIndex = partitionId(clist.getListp(), clist.getListin(), be, end);
            porId(clist, be, particionIndex - 1);
            porId(clist, particionIndex + 1, end);
        }
        return clist.getListin();        
    }
    
    private int partitionPreco(List<Produto> list,int[] A, int be, int end) {
        int aux;
        Produto pivot ;
        pivot = list.get(A[end]);
        int pIndex = be;
        for (int i = be; i < end; i++) {
            if (list.get(A[i]).getPreco()<= pivot.getPreco()) {
                aux = A[i];
                A[i] = A[pIndex];
                A[pIndex] = aux;
                pIndex++;
            }
        }
        aux = A[pIndex];
        A[pIndex] = A[end];
        A[end] = aux;
        return pIndex;
    }
    
    
    public int[] porPreco(Control_List clist, int be, int end){
         
        if (be < end) {
            int particionIndex = partitionPreco(clist.getListp(), clist.getListin(), be, end);
            porPreco(clist, be, particionIndex - 1);
            porPreco(clist, particionIndex + 1, end);
        }
        return clist.getListin();        
    }
    
}
