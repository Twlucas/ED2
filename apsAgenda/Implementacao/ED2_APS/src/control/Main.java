/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import estrutura.ArvoreAvl;
import test.NewJFrame;
import test.TableFilterSorter;
import test.TableSearch;
import test.telatest;
import test.test;
import view.TelaAdd;
import view.TelaInicial;
import view.back;

/**
 *
 * @author Convidado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*test l = new test();

        l.setVisible(true);
        int k ;
        for(k = -120;k  <= 1000;k++){

            k++;
            l.cred.setLocation(k,1);
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }


            if(k == 999){
                k = -120;
            }
        }


    }*/
        
        //telatest tt= new telatest();
        /*TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        TableSearch ts = new TableSearch();
        ts.setVisible(true);*/
        
        
        Gerenciador gerenciador = new Gerenciador();
        ArvoreAvl arvoreAvl = new ArvoreAvl();
        TelaAdd telaAdd = new TelaAdd(arvoreAvl, gerenciador);
        //back back1 = new back();
        
    }
}