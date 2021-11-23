/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.print.attribute.standard.DialogOwner;

/**
 *
 * @author Pichau
 */
public class BrighterStain {

    /**
     * @param mensagem
     * @param tempoEspera
     */
    public static void mostrarMensagemComEspera(String mensagem, long tempoEspera) {
        for (char caractere : mensagem.toCharArray()) {
            try {
                System.out.print(caractere);
                System.out.flush();
                TimeUnit.MILLISECONDS.sleep(tempoEspera);
            } catch (InterruptedException ex) {
                System.err.println("ATENÇÃO - ESPERA INTERROMPIDA: " + ex.getMessage());
            }
        }

    }

    public static void main(String[] args) {

        int menu = 0;

        int damageUser = 0;
        int userHp = 0;
        int especialAtk = 0;
        int contador = 0;
        int i = 1;

        Scanner input = new Scanner(System.in);

        //DIÁLOGOS AQUI****** INTRO AO GAME
        do { //menu principal do game
            mostrarMensagemComEspera("          MENU" + "\n", 10);
            mostrarMensagemComEspera("\n BRIGHTER STAIN: THE PROPHECY \n", 25);
            mostrarMensagemComEspera(" [1] Jogar \n", 25);
            mostrarMensagemComEspera(" [2] Tutorial \n", 25);
            mostrarMensagemComEspera(" [3] Créditos \n", 25);
            mostrarMensagemComEspera(" [4] Sair\n", 25);

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("DIGITE UMA DAS OPÇÕES:" + "\n", 10);
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    mostrarMensagemComEspera("   ____                  __      ___           _                 ____       _       _     _            _____ _        _       \n"
                            + " |  _ \\                 \\ \\    / (_)         | |               |  _ \\     (_)     | |   | |          / ____| |      (_)      \n"
                            + " | |_) | ___ _ __ ___    \\ \\  / / _ _ __   __| | ___     __ _  | |_) |_ __ _  __ _| |__ | |_ ___ _ _| (___ | |_ __ _ _ _ __  \n"
                            + " |  _ < / _ | '_ ` _ \\    \\ \\/ / | | '_ \\ / _` |/ _ \\   / _` | |  _ <| '__| |/ _` | '_ \\| __/ _ | '__\\___ \\| __/ _` | | '_ \\ \n"
                            + " | |_) |  __| | | | | |    \\  /  | | | | | (_| | (_) | | (_| | | |_) | |  | | (_| | | | | ||  __| |  ____) | || (_| | | | | |\n"
                            + " |____/ \\___|_| |_| |_|     \\/   |_|_| |_|\\__,_|\\___/   \\__,_| |____/|_|  |_|\\__, |_| |_|\\__\\___|_| |_____/ \\__\\__,_|_|_| |_|\n"
                            + "                                                                              __/ |                                          \n"
                            + "                                                                             |___/                                           \n"
                            + "\n", 1);

                    break;
                case 2:
                    mostrarMensagemComEspera("Bem vindo ao tutorial, vamos mostar como funciona nosso game e sobre a história dele." + "\n", 10);
                    mostrarMensagemComEspera("O game tem 3 classes de batalha que você pode escolher para sua aventura cada um com seus próprios atributos: " + "\n", 10);
                    mostrarMensagemComEspera("Yamato, Espadachim" + "\n", 10);
                    mostrarMensagemComEspera("Kujouz, Arqueiro" + "\n", 10);
                    mostrarMensagemComEspera("Izanagi, Mago" + "\n", 10);
                    mostrarMensagemComEspera("Os comandos do jogo são por digitação de palavras ou por números, como por exemplo, 'ESCOLHA SUA CLASSE: espadachim, arqueiro, mago'\n"
                            + "se deseja escolher a calsse espadachim digite 'espadachim'. " + "\n", 10);
                    mostrarMensagemComEspera("\nNas batalhas você pode selecionar os seu ataques por números, como por exemplo: \n\n'ESCOLHA SEU ATAQUE'\n"
                            + " 1| ATK Simples\n 2| ATK Especial\n Lembrando que cada classe possui uma quantidade de ataques especiais.\n" + "\n", 10);
                    break;
                case 3:
                    mostrarMensagemComEspera("Desenvolvido por: \n Abraão Isaque \n David Landes \n Yuri França \n\n BrighterStain®  \n" + "\n", 10);
                    break;
                case 4:

                    break;
            }
        } while (menu != 1);
        mostrarMensagemComEspera("O JOGO FOI INICIADO " + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        //menu de arma
        Scanner armas = new Scanner(System.in);

        mostrarMensagemComEspera("INFORMAÇÕES SOBRE AS CLASSES:" + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("Classe: Espadachim" + "\n", 10);
        mostrarMensagemComEspera("Nome: Yamato" + "\n", 10);
        mostrarMensagemComEspera("HP: 150" + "\n", 10);
        mostrarMensagemComEspera("Arma: Excalibur" + "\n", 10);
        mostrarMensagemComEspera("Ataque Comum: Lamina Rápida = 25ATK" + "\n", 10);
        mostrarMensagemComEspera("Ataque Especial: Fus Ro Dah = 32ATK" + "\n", 10);
        mostrarMensagemComEspera("Cargas de especial = 6" + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("Classe: Arqueiro" + "\n", 10);
        mostrarMensagemComEspera("Nome: Kujouz" + "\n", 10);
        mostrarMensagemComEspera("HP: 125" + "\n", 10);
        mostrarMensagemComEspera("Arma: Arco Esmeralda " + "\n", 10);
        mostrarMensagemComEspera("Ataque Comum: Ponta de aço = 21ATK" + "\n", 10);
        mostrarMensagemComEspera("Ataque Especial: Eagle Eye = 31ATK" + "\n", 10);
        mostrarMensagemComEspera("Cargas de especial = 4" + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("Classe: Mago" + "\n", 10);
        mostrarMensagemComEspera("Nome: Izanagi" + "\n", 10);
        mostrarMensagemComEspera("HP:115" + "\n", 10);
        mostrarMensagemComEspera("Arma: Atlas Celestial" + "\n", 10);
        mostrarMensagemComEspera("Ataque Comum: Hells Shout = 20ATK" + "\n", 10);
        mostrarMensagemComEspera("Ataque Especial: Conjuração Divina = 34ATK " + "\n", 10);
        mostrarMensagemComEspera("Cargas de especial: 3" + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("DIGITE COM LETRAS MINÚSCULAS" + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("ESCOLHA SUA CLASSE:" + "\n", 10);
        String menuArmas = armas.next();

        mostrarMensagemComEspera("" + "\n", 10);

        String s1 = "espadachim";
        String s2 = "arqueiro";
        String s3 = "mago";

        if (menuArmas.equals(s1)) {
            int hpUser, lamina, especial, contagem;
            hpUser = 0;
            lamina = 0;
            especial = 0;
            contagem = 0;

            userHp = Atributo.espadachimHp(hpUser);
            damageUser = Atributo.espadachimLamina(lamina);
            especialAtk = Atributo.espadachimEspecial(especial);
            contador = Atributo.espadachimContagem(contagem);

            mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("HP: " + userHp + "\n", 100);
            mostrarMensagemComEspera("Lâmina Rápida: " + damageUser + "\n", 100);
            mostrarMensagemComEspera("FusRohDah: " + especialAtk + "\n", 100);
            mostrarMensagemComEspera("Ataque Especial: " + contador + " CARGAS" + "\n", 10);

        } else if (menuArmas.equals(s2)) {

            int hpArqueiro, flecha, especial, contagem;
            hpArqueiro = 0;
            flecha = 0;
            especial = 0;
            contagem = 0;

            userHp = Atributo.arqueiroHp(hpArqueiro);
            damageUser = Atributo.arqueiroDano(flecha);
            especialAtk = Atributo.arqueiroEspecial(especial);
            contador = Atributo.espadachimContagem(contagem);

            mostrarMensagemComEspera("HUD DE ATRIBUTOS: " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("HP: " + userHp + "\n", 100);
            mostrarMensagemComEspera("Ponta de Aço: " + damageUser + "\n", 100);
            mostrarMensagemComEspera("Eagle Eye: " + especialAtk + "\n", 100);
            mostrarMensagemComEspera("Ataque Especial: " + contador + " CARGAS" + "\n", 10);

        } else if (menuArmas.equals(s3)) {

            int hpMago, magia, especial, contagem;
            hpMago = 0;
            magia = 0;
            especial = 0;
            contagem = 0;

            userHp = Atributo.MagoHp(hpMago);
            damageUser = Atributo.MagoDano(magia);
            especialAtk = Atributo.MagoEspecial(especial);
            contador = Atributo.arqueiroContagem(contagem);

            mostrarMensagemComEspera("HUD DE ATRIBUTOS: " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("HP: " + userHp + "\n", 100);
            mostrarMensagemComEspera("Hells Shout: " + damageUser + "\n", 100);
            mostrarMensagemComEspera("Conjuração Divina: " + especialAtk + "\n", 100);
            mostrarMensagemComEspera("Ataque Especial: " + contador + " CARGAS" + "\n", 10);
        }

        Dialogo.dialogoInicio();

        int hpLadrao = 0;
        int contagemLadrao = 0;
        int ladraoAtk = 0;
        int especialLadrao = 0;

        contagemLadrao = AtributosMob.contagemLadrao(contagemLadrao);
        hpLadrao = AtributosMob.ladraoHp(hpLadrao);
        especialLadrao = AtributosMob.especialLadrao(especialLadrao);
        ladraoAtk = AtributosMob.ladraoAtk(ladraoAtk);

        //HUD da batalha
        do {

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            mostrarMensagemComEspera(" " + "\n", 10);

            mostrarMensagemComEspera("\n==================== " + "\n", 10);
            mostrarMensagemComEspera("LUTE! " + "\n", 10);
            mostrarMensagemComEspera("==================== " + "\n", 10);

            Scanner leitor = new Scanner(System.in);

            int leitorBatalha = leitor.nextInt();

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples" + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            mostrarMensagemComEspera("" + "\n", 10);

            int escolhaAtaque = leitorBatalha;

            switch (escolhaAtaque) {
                case 1:
                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Usuario aplicou um Ataque Simples  ." + "\n", 10);

                    mostrarMensagemComEspera(" " + "\n", 10);

                    hpLadrao -= damageUser;
                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Ladrão:  " + hpLadrao + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Ladrao: " + contagemLadrao + "\n", 10);
                    break;
                case 2:
                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Usuario aplicou um Ataque Especial." + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);

                    hpLadrao -= especialAtk;
                    contador--; //contagemespecial = contagemEspecial -1
                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Ladrão: " + hpLadrao + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Ladrao: " + contagemLadrao + "\n", 10);
                    break;
                default:
                    mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA" + "\n", 10);
                    break;
            }
            if (hpLadrao >= 0) {
                escolhaAtaque = leitorBatalha;
                switch (escolhaAtaque) {
                    case 1:
                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Ladrao aplicou um soco. \n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);
                        userHp -= ladraoAtk;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Ladrão: " + hpLadrao + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Ladrao: " + contagemLadrao + "\n", 10);
                        break;
                    case 2:
                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Ladrao aplicou uma facada. " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);
                        userHp -= especialLadrao;
                        contagemLadrao--; //contagemespecial = contagemEspecial -1

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Ladrão: " + hpLadrao + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Ladrao: " + contagemLadrao + "\n", 10);

                        break;
                }
            }

            if (userHp > 0) {
                userHp += 5;
                if (userHp > 150) {
                    userHp = 150;
                }
                if (i % 10 == 0) {
                    contador++;
                    if (contador > 5) {
                        contador = 5;
                    }
                }
            }
            i++;

        } while (userHp > 0 && hpLadrao > 0);

        Scanner decisao = new Scanner(System.in);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("O Ladrao foi derrotado " + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        mostrarMensagemComEspera("Você: Maldito, só acabou me atrasando...\n" + "\n", 10);
        mostrarMensagemComEspera("Após a batalha você continua sua caminhada até onde tem uma bifurcação e avista a entrada de uma caverna.\n" + "\n", 10);
        mostrarMensagemComEspera("Deseja entrar na caverna? sim ou nao " + "\n", 10);

        mostrarMensagemComEspera("" + "\n", 10);

        String caminhoS = "sim";
        String caminhoN = "não";
        String decisaoHistoria = decisao.nextLine();

        if (decisaoHistoria.equals(caminhoS)) {

            mostrarMensagemComEspera("" + "\n", 10);

            Dialogo.dialogoCaverna();

            mostrarMensagemComEspera("" + "\n", 10);

            int dragaoHp = 0;
            int contagemDragao = 0;
            int dragaoAtk = 0;
            int especialDragao = 0;

            contagemDragao = AtributosMob.contagemDragao(contagemDragao);
            dragaoHp = AtributosMob.dragaoHp(dragaoHp);
            especialDragao = AtributosMob.dragaoEspecial(especialDragao);
            dragaoAtk = AtributosMob.dragaoDano(dragaoAtk);

            do {
                mostrarMensagemComEspera("" + "\n", 10);

                mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
                mostrarMensagemComEspera("" + "\n", 10);
                mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
                mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);
                mostrarMensagemComEspera("" + "\n", 10);

                mostrarMensagemComEspera("==================== " + "\n", 10);
                mostrarMensagemComEspera("LUTE! " + "\n", 100);
                mostrarMensagemComEspera("==================== " + "\n", 10);

                Scanner leitor = new Scanner(System.in);

                int leitorBatalha = leitor.nextInt();

                mostrarMensagemComEspera("" + "\n", 10);

                mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
                mostrarMensagemComEspera("" + "\n", 10);
                mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
                mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

                mostrarMensagemComEspera("" + "\n", 10);

                int escolhaAtaque = leitorBatalha;

                switch (escolhaAtaque) {
                    case 1:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Você aplicou um Ataque Simples. " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        dragaoHp -= damageUser;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Dragão: " + dragaoHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Dragão: " + contagemDragao + "\n", 10);
                        break;
                    case 2:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Você aplicou um Ataque Especial. \n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        dragaoHp -= especialAtk;
                        contador--; //contagemespecial = contagemEspecial -1

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Dragão: " + dragaoHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Dragão: " + contagemDragao + "\n", 10);
                        break;
                    default:
                        mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA " + "\n", 10);

                        break;

                }
                if (dragaoHp > 0) {
                    escolhaAtaque = leitorBatalha;
                    switch (escolhaAtaque) {
                        case 1:
                            mostrarMensagemComEspera("" + "\n", 10);

                            mostrarMensagemComEspera("Dragão aplicou o PODER ANCESTRAL. " + "\n", 10);

                            mostrarMensagemComEspera("" + "\n", 10);

                            userHp -= dragaoAtk;

                            mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                            mostrarMensagemComEspera("" + "\n", 10);
                            mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                            mostrarMensagemComEspera("Hp Dragão: " + dragaoHp + "\n", 10);
                            mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                            mostrarMensagemComEspera("Especial Dragão: " + contagemDragao + "\n", 10);
                            break;
                        case 2:

                            mostrarMensagemComEspera("" + "\n", 10);

                            mostrarMensagemComEspera("Dragão aplicou Rei Celeste. " + "\n", 10);

                            mostrarMensagemComEspera("" + "\n", 10);

                            userHp -= especialDragao;
                            contagemDragao--; //contagemespecial = contagemEspecial -1 

                            mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                            mostrarMensagemComEspera("" + "\n", 10);
                            mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                            mostrarMensagemComEspera("Hp Dragão: " + dragaoHp + "\n", 10);
                            mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                            mostrarMensagemComEspera("Especial Dragão: " + contagemDragao + "\n", 10);
                            break;
                    }

                }
                if (userHp <= 55) {
                    userHp += 145;

                }

                if (dragaoHp < 0) {
                    userHp += 100;
                    damageUser += 15;
                    contador += 10;

                    mostrarMensagemComEspera("\nO Dragão foi derrotado " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("VOCÊ GANHOU O FOGO ETERNO DOS DRAGÕES, HOUVE UM AUMENTO DE 100 DE VIDA E 15 DE DANO e 10 RECARGAS DE ESPECIAIS" + "\n", 10);
                    mostrarMensagemComEspera("Você: Essa batalha foi bem díficil, mas acho que esse item pode ser muito útil em algum momento." + "\n", 10);
                }

            } while (userHp > 0 && dragaoHp > 0);
            System.out.println("NOVO HP: " + userHp);
            System.out.println("\nPressione Enter para continuar\n");

        } else if (decisaoHistoria.equals(caminhoN)) {

            Dialogo.dialogoFloresta();

            int espiritoHp = 0;
            int contagemEspirito = 0;
            int espiritoAtk = 0;
            int especialEsp = 0;

            contagemEspirito = AtributosMob.espiritoContagem(contagemEspirito);
            espiritoHp = AtributosMob.espiritoHp(espiritoHp);
            especialEsp = AtributosMob.especialEspirito(especialEsp);
            espiritoAtk = AtributosMob.espiritoAtk(espiritoAtk);

            do {
                mostrarMensagemComEspera("" + "\n", 10);

                mostrarMensagemComEspera("ESECOLHA SEU ATAQUE " + "\n", 10);
                mostrarMensagemComEspera("" + "\n", 10);
                mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
                mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

                mostrarMensagemComEspera("==================== " + "\n", 10);
                mostrarMensagemComEspera("INICIO " + "\n", 10);
                mostrarMensagemComEspera("==================== " + "\n", 10);

                Scanner leitor = new Scanner(System.in);

                int leitorBatalha = leitor.nextInt();

                mostrarMensagemComEspera("" + "\n", 10);

                mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
                mostrarMensagemComEspera("" + "\n", 10);
                mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
                mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

                int escolhaAtaque = leitorBatalha;
                switch (escolhaAtaque) {
                    case 1:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Você aplicou um Ataque Simples. " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        espiritoHp -= damageUser;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Espírito: " + espiritoHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Espírito: " + contagemEspirito + "\n", 10);
                        break;
                    case 2:

                        mostrarMensagemComEspera("" + "\n", 10);

                        System.out.println("Você aplicou um Ataque Especial. ");

                        mostrarMensagemComEspera("" + "\n", 10);

                        espiritoHp -= especialAtk;
                        contador--; //contagemespecial = contagemEspecial -1

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Espíriot: " + espiritoHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Espírito: " + contagemEspirito + "\n", 10);
                        break;
                    default:
                        mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA" + "\n", 10);
                        break;
                }
                if (espiritoHp > 0) {
                    escolhaAtaque = leitorBatalha;
                    switch (escolhaAtaque) {
                        case 1:

                            mostrarMensagemComEspera("" + "\n", 10);

                            mostrarMensagemComEspera("Espírito aplicou Chamadado da Morte. " + "\n", 10);

                            mostrarMensagemComEspera("" + "\n", 10);

                            userHp -= espiritoAtk;

                            mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                            mostrarMensagemComEspera("" + "\n", 10);
                            mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                            mostrarMensagemComEspera("Hp Espírito: " + espiritoHp + "\n", 10);
                            mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                            mostrarMensagemComEspera("Especial Espírito: " + contagemEspirito + "\n", 10);
                            break;
                        case 2:

                            mostrarMensagemComEspera("" + "\n", 10);

                            mostrarMensagemComEspera("Espírito aplicou Ordenancia Demoniaca." + "\n", 10);

                            mostrarMensagemComEspera("" + "\n", 10);

                            userHp -= especialEsp;
                            contagemEspirito--; //contagemespecial = contagemEspecial -1 

                            mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                            mostrarMensagemComEspera("" + "\n", 10);
                            mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                            mostrarMensagemComEspera("Hp Espírito: " + espiritoHp + "\n", 10);
                            mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                            mostrarMensagemComEspera("Especial Espíritos: " + contagemEspirito + "\n", 10);
                            break;
                    }
                } else {
                    mostrarMensagemComEspera("\nO Espírito da Floresta foi derrotado " + "\n", 10);
                    mostrarMensagemComEspera("VOCÊ GANHOU LUVA DAS TREVAS, HOUVE UM AUMENTO DE 50 DE VIDA " + "\n", 10);
                    mostrarMensagemComEspera("Que batalha díficil, mas acredito que esse item pode ser útil em algum momento." + "\n", 10);
                    //MÉTODO PARA PEGAR O ITEM PÓS BATALHA
                }
                if (userHp > 0) {
                    userHp += 50;
                    if (userHp > 150) {
                        userHp = 150;
                    }
                    if (i % 10 == 0) {
                        contador++;
                        if (contador > 5) {
                            contador = 5;
                        }
                    }
                }
                i++;

            } while (userHp > 0 && espiritoHp > 0);

        }
        Dialogo.dialogoVilarejo();

        Dialogo.dialogoQuimera();
        //função pra imprimr HUD
        int quimeraHp = 0;
        int contagemQuimera = 0;
        int quimeraAtk = 0;
        int especialQuimera = 0;

        contagemQuimera = AtributosMob.contagemQuimera(contagemQuimera);
        quimeraHp = AtributosMob.quimeraHp(quimeraHp);
        especialQuimera = AtributosMob.quimeraEspecial(especialQuimera);
        quimeraAtk = AtributosMob.quimeraDano(quimeraAtk);

        do {

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            mostrarMensagemComEspera("==================== " + "\n", 10);
            mostrarMensagemComEspera("INICIO " + "\n", 10);
            mostrarMensagemComEspera("==================== " + "\n", 10);

            Scanner leitor = new Scanner(System.in);

            int leitorBatalha = leitor.nextInt();

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            int escolhaAtaque = leitorBatalha;
            switch (escolhaAtaque) {
                case 1:

                    quimeraHp -= damageUser;

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Quimera: " + quimeraHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Quimera: " + contagemQuimera + "\n", 10);
                    break;
                case 2:

                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Você aplicou um Ataque Especial. " + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);
                    quimeraHp -= especialAtk;
                    contador--; //contagemespecial = contagemEspecial -1

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Quimera: " + quimeraHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Quimera: " + contagemQuimera + "\n", 10);
                    break;
                default:
                    mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA " + "\n", 10);
                    break;
            }
            if (quimeraHp > 0) {
                escolhaAtaque = leitorBatalha;
                switch (escolhaAtaque) {
                    case 1:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Quimera Caçada Mortal " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= quimeraAtk;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Quimera: " + quimeraHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Quimera: " + contagemQuimera + "\n", 10);
                        break;
                    case 2:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Quimera aplicou Mortificação " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= especialQuimera;
                        contagemQuimera--; //contagemespecial = contagemEspecial -1 

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Quimera: " + quimeraHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Quimera: " + contagemQuimera + "\n", 10);
                        break;
                }
                
                }
                if (userHp <= 55) {
                    userHp += 45;

                }

                if (quimeraHp < 0) {
                    userHp += 50;
                    damageUser += 15;
                    contador += 6;
                    
                mostrarMensagemComEspera("\nQuimera foi derrotado " + "\n", 10);
                mostrarMensagemComEspera("\nBeleza, um já foi,preciso seguir em frente..." + "\n", 10);

                //DIÁLOGOS AQUI********
            }

        } while (userHp > 0 && quimeraHp > 0);

        Dialogo.dialogoDraugr();
        //Batalaha vs Draugr

        int draugrHp = 0;
        int contagemDraugr = 0;
        int draugrAtk = 0;
        int especialDraugr = 0;

        contagemDraugr = AtributosMob.contagemDraugr(contagemDraugr);
        draugrHp = AtributosMob.draugrHp(draugrHp);
        especialDraugr = AtributosMob.draugrEspecial(especialDraugr);
        draugrAtk = AtributosMob.draugrDano(draugrAtk);

        //função pra imprimr HUD
        do {

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            mostrarMensagemComEspera("==================== " + "\n", 10);
            mostrarMensagemComEspera("LUTE! " + "\n", 10);
            mostrarMensagemComEspera("==================== " + "\n", 10);

            Scanner leitor = new Scanner(System.in);

            int leitorBatalha = leitor.nextInt();

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples " + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            int escolhaAtaque = leitorBatalha;
            switch (escolhaAtaque) {
                case 1:

                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Você aplicou um Ataque Simples. " + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);

                    draugrHp -= damageUser;

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Draugr: " + draugrHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Draugr: " + contagemDraugr + "\n", 10);
                    break;
                case 2:

                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Você aplicou um Ataque Especial. " + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);

                    draugrHp -= especialAtk;
                    contador--; //contagemespecial = contagemEspecial -1

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Draugr: " + draugrHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Draugr: " + contagemDraugr + "\n", 10);
                    break;
                default:
                    mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA " + "\n", 10);
                    break;
            }
            if (draugrHp > 0) {
                escolhaAtaque = leitorBatalha;
                switch (escolhaAtaque) {
                    case 1:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Draugr aplicou  Caçada Fanstasma. " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= draugrAtk;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Draugr: " + draugrHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Draugr: " + contagemDraugr + "\n", 10);
                        break;
                    case 2:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Draugr aplicou Chamado da Espada Fantasma " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= especialDraugr;
                        contagemDraugr--; //contagemespecial = contagemEspecial -1

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Draugr: " + draugrHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Draugr: " + contagemDraugr + "\n", 10);
                        break;
                }
                }
                if (userHp <= 55) {
                    userHp += 145;

                }

                if (draugrHp < 0) {
                    userHp += 100;
                    damageUser += 15;
                    contador += 10;
                
            
                mostrarMensagemComEspera("\nDraugr foi derrotado " + "\n", 10);
                mostrarMensagemComEspera("\nVocê: Esse parece que foi mais díficil que o anterior... " + "\n", 10);
                mostrarMensagemComEspera("\nVocê: Mas não importa, agora posso ir diereto ao meu objetivo sem mais nenhuma interrupção.\n" + "\n", 10);
                mostrarMensagemComEspera("\nVocê atravessa o saguão principal em direção a um trono onde avista a silhueta de Lord Darkness..." + "\n", 10);

            }

        } while (userHp > 0 && draugrHp > 0);

        Dialogo.dialogoBoss();

        int bossHp = 0;
        int contagemBoss = 0;
        int bossAtk = 0;
        int especialBoss = 0;

        contagemBoss = AtributosMob.contagemBoss(contagemBoss);
        bossHp = AtributosMob.bossHp(bossHp);
        especialBoss = AtributosMob.bossEspecial(especialBoss);
        bossAtk = AtributosMob.bossDano(bossAtk);

        //função pra imprimr HUD
        do {

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples" + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial " + "\n", 10);

            mostrarMensagemComEspera("==================== " + "\n", 10);
            mostrarMensagemComEspera("LUTE! " + "\n", 10);
            mostrarMensagemComEspera("==================== " + "\n", 10);

            Scanner leitor = new Scanner(System.in);

            int leitorBatalha = leitor.nextInt();

            mostrarMensagemComEspera("" + "\n", 10);

            mostrarMensagemComEspera("ESCOLHA SEU ATAQUE " + "\n", 10);
            mostrarMensagemComEspera("" + "\n", 10);
            mostrarMensagemComEspera("[1] Ataque Simples" + "\n", 10);
            mostrarMensagemComEspera("[2] Ataque Especial" + "\n", 10);

            mostrarMensagemComEspera("", 10);

            int escolhaAtaque = leitorBatalha;
            switch (escolhaAtaque) {
                case 1:

                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Você aplicou um Atk simples. " + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);

                    bossHp -= damageUser;

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Rei Darkness: " + bossHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Rei Darkness: " + contagemBoss + "\n", 10);
                    break;
                case 2:

                    mostrarMensagemComEspera("" + "\n", 10);

                    mostrarMensagemComEspera("Você aplicou um Ataque Especial. " + "\n", 10);

                    mostrarMensagemComEspera("" + "\n", 10);

                    bossHp -= especialAtk;
                    contador--; //contagemespecial = contagemEspecial -1

                    mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                    mostrarMensagemComEspera("" + "\n", 10);
                    mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                    mostrarMensagemComEspera("Hp Rei Darkness: " + bossHp + "\n", 10);
                    mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                    mostrarMensagemComEspera("Especial Rei Darkness: " + contagemBoss + "\n", 10);
                    break;
                default:
                    mostrarMensagemComEspera("Getrald: VOCÊ NÃO PODE IR POR ESSE CAMINHO GUERREIRO, A MORTE É A ÚNICA CERTEZA DE SUA VINGANÇA " + "\n", 10);
                    break;
            }
            if (bossHp > 0) {
                escolhaAtaque = leitorBatalha;
                switch (escolhaAtaque) {
                    case 1:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Rei Darkness aplicou Morte Evidente." + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= bossAtk;

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Rei Darkness: " + bossHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Rei Darkness: " + contagemBoss + "\n", 10);
                        break;
                    case 2:

                        mostrarMensagemComEspera("" + "\n", 10);

                        mostrarMensagemComEspera("Darkness aplicou Lorde Impetuoso. " + "\n", 10);

                        mostrarMensagemComEspera("" + "\n", 10);

                        userHp -= especialBoss;
                        contagemBoss--; //contagemespecial = contagemEspecial -1 

                        mostrarMensagemComEspera("HUD DE ATRIBUTOS " + "\n", 10);
                        mostrarMensagemComEspera("" + "\n", 10);
                        mostrarMensagemComEspera("Hp: " + userHp + "\n", 10);
                        mostrarMensagemComEspera("Hp Rei Darkness: " + bossHp + "\n", 10);
                        mostrarMensagemComEspera("Cargas de Especial: " + contador + "\n", 10);
                        mostrarMensagemComEspera("Especial Rei Darkness: " + contagemBoss + "\n", 10);
                        break;
                }
                
            }if (bossHp > 0 && userHp <= 0) {
                System.out.println("\nPressione para contiunar\n");
                
                Dialogo.dialogoDerrota();
                mostrarMensagemComEspera("Seu sacrifício não foi em vão, logo após a arma ser lançadas nas profundezas do penhasco\n"
                        + "uma estátua foi levantada em sua homenagem e a partir daquele dia a paz voltou a reinar no mundo."+"\n", 10);
            
            
            }if (userHp > 0 && bossHp <= 0) {
                System.out.println("\nPressione para contiunar\n");
                
                Dialogo.dialogoWin();
                mostrarMensagemComEspera("Após vencer Lord Darknes você herda os poderes do antigo Deus de luz, Licth e inicia um novo,\n"
                        + "período de governo, e estabelece o seu reino de Luz, libertando todo o mundo das trevas de Lord Darkness"+"\n", 10);
                
            }

        } while (userHp > 0 && bossHp > 0);

    }
}
