/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.Random;

/**
 *
 * @author Pichau
 */
public class AtributosMob {
    
//Ladrao*****************************************************************
    public static int ladraoHp(int hpLadrao) {
        hpLadrao = 80;

        return hpLadrao;
    }

    public static int ladraoAtk(int soco) {
        soco = 10;

        return soco;
    }

    public static int especialLadrao(int facada) {
        facada = 18;

        return facada;
    }

    public static int contagemLadrao(int contagemLadrao) {
        contagemLadrao = 3;
        

        return contagemLadrao;
    }
    
    //Espirito**************************************************************
    public static int espiritoHp(int hpEspirito) {
        hpEspirito = 95;

        return hpEspirito;
    }

    public static int espiritoAtk(int golpeEsp) {
        golpeEsp = 19;

        return golpeEsp;
    }

    public static int especialEspirito(int especialEsp) {
        especialEsp = 28;

        return especialEsp;
    }

    public static int espiritoContagem(int contagemEsp) {
        contagemEsp = 2;

        return contagemEsp;
    }
    
    //Dragão*****************************************************************
    public static int dragaoHp(int hpDragao) {
        hpDragao = 105;

        return hpDragao;
    }

    public static int dragaoDano(int danoDragao) {
        danoDragao = 22;

        return danoDragao;
    }
    
    public static int dragaoEspecial(int especialDragao) {
        especialDragao = 34;

        return especialDragao;
    }
    
    public static int contagemDragao(int contagemDragao) {
        contagemDragao = 3;

        return contagemDragao;
    }

    //Quimera******************************************************************
    public static int quimeraHp(int hpQuimera) {
        hpQuimera = 120;

        return hpQuimera;
    }

    public static int quimeraDano(int danoQuimera) {
        danoQuimera = 21;

        return danoQuimera;
    }
    
    public static int quimeraEspecial(int especialQuimera) {
        especialQuimera= 39;

        return especialQuimera;
    }
    
    public static int contagemQuimera(int contagemQuimera) {
        contagemQuimera = 2;

        return contagemQuimera;
    }
    
    //Draugr*******************************************************************
    public static int draugrHp(int hpDraugr) {
        hpDraugr = 125;

        return hpDraugr;
    }

    public static int draugrDano(int danoDraugr) {
        danoDraugr = 25;

        return danoDraugr;
    }
    
    public static int draugrEspecial(int especialDraugr) {
        especialDraugr = 34;

        return especialDraugr;
    }
    
    public static int contagemDraugr(int contagemDraugr) {
        contagemDraugr = 3;

        return contagemDraugr;
    }
    
    //Boss Final***************************************************************
    public static int bossHp(int hpBoss) {
        hpBoss = 150;

        return hpBoss;
    }

    public static int bossDano(int danoBoss) {
        
        Random poder = new Random();
        
        danoBoss = poder.nextInt(60) + 2;
        
        return danoBoss;
    }
    
    public static int bossEspecial(int especialBoss) {
        especialBoss = 34;

        return especialBoss;
    }
    
    public static int contagemBoss(int contagemBoss) {
        contagemBoss = 3;

        return contagemBoss;
    }
}
