/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import estrutura.ArvoreAvl;
import model.Anime;
import test.NewJFrame;
import test.TableFilterSorter;
import test.TableSearch11;
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
        
        
        Gerenciador ger = new Gerenciador();
        /*ArvoreAvl arvoreAvl = new ArvoreAvl();
        TelaAdd telaAdd = new TelaAdd(arvoreAvl, gerenciador);
        //back back1 = new back();*/
        
        Anime an = new Anime(10);
        an.setDiaDeLançamento("12/10/1000");
        an.setNome("aaa");
        an.setEpAtual(1);
        an.setEpTotal(5);
        an.setEstado("assistindo");
        an.setNota(10);
        an.setObs("asdasd");
        ger.getAnimes().inserir(10, an);
        ger.getAllAnimes().add(an);
        an = new Anime(5);
        an.setDiaDeLançamento("12/10/1000");
        an.setNome("abaa");
        an.setEpAtual(1);
        an.setEpTotal(5);
        an.setEstado("assistindo");
        an.setNota(5);
        an.setObs("asdasd");
        ger.getAnimes().inserir(5, an);
        ger.getAnimeAtual().add(an);
        ger.getAllAnimes().add(an);
        an = new Anime(111);
        an.setDiaDeLançamento("12/10/1000");
        an.setNome("ca");
        an.setEpAtual(1);
        an.setEpTotal(5);
        an.setEstado("assistindo");
        an.setNota(2);
        an.setObs("asdasd");
        ger.getAnimeAtual().add(an);
        ger.getAnimes().inserir(111, an);
        ger.getAllAnimes().add(an);
        TelaInicial tI = new TelaInicial(ger);
        
    }
}