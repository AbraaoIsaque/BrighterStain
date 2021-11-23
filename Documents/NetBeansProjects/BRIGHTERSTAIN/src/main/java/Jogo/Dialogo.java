package Jogo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//https://github.com/yuri-tcfranca/BrighterStain

/**
 *
 * @author Yuri
 */
public class Dialogo {

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

    //DIALOGO SAINDO DA VILA E LUTA CONTRA O LADRÃO
    public static void dialogoInicio() {

        
        mostrarMensagemComEspera("\n | Prólogo |\n" + "\n", 10);
        
        mostrarMensagemComEspera("\nApós seu vilarejo ser atacado e destruído pelos Dark Royal Knights a mandado do Rei Lord Darkness" + "\n", 10);
        mostrarMensagemComEspera("você cresce sendo alimentado pelo desejo de vingança e de trazer a paz de volta ao mundo" + "\n", 10);
        mostrarMensagemComEspera("acabando com o reinado de Lord Darkness para que momentos" + "\n", 10);
        mostrarMensagemComEspera("como os quais você passou não aconteça em mais nenhum lugar desse mundo.\n\n" + "\n", 10);
        mostrarMensagemComEspera("Após anos treinando e aperfeiçoando suas técnicas e conhecimento chega o dia em que você deicide partir\n e iniciar seu jornada de vingança.\n\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Obrigado mestre por todo esse tempo de treinos e pelos conhecimentos que você me passou.\n" + "\n", 10);
        mostrarMensagemComEspera("Ziech, o Mago: Muito cuidado jovem discípulo, tem coisas em sua jornada que vão além do meu conhecimento,\n onde você mesmo terá que descobrir.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Eu sei Ziech, obrigado pelos seus esforços e pela sua ajuda durante esses anos. \n" + "\n", 10);
        mostrarMensagemComEspera("Ziech, o Mago: Não há pelo que agradecer, agora vá, e que os deuses te proteja.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Até a volta, Ziech! \n\n" + "\n", 10);

        mostrarMensagemComEspera("Você parte em sua jornada...\n" + "\n", 30);

        mostrarMensagemComEspera("Ao se aproximar de um vale você é surpreendido por um Ladrão!\n" + "\n", 10);
        mostrarMensagemComEspera("Ladrão: Parado aí, é melhor você me passar tudo o que você tem ai!\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Acho melhor você sair do meio caminho amigo.\n" + "\n", 10);
        mostrarMensagemComEspera("Ladrão: Acha que tenho medo de um zé ninguém como você?! HA HA HA\n" + "\n", 10);
        mostrarMensagemComEspera("Responder: sim ou não?\n" + "\n", 10);

        Scanner dialogo = new Scanner(System.in);
        String dialogo1 = "sim";
        String dialogo2 = "não";

        String entrada = dialogo.nextLine();

        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Eu acho que sim! vem pra cima então! \n" + "\n", 10);

        }else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Pois deveria ter amigo!\n" + "\n", 10);

        }

    }

    //DIALOGO ENTRANDO NA CAVERNA E LUTA CONTRA O DRAGÃO
    public static void dialogoCaverna() {

        String dialogo1 = "sim";
        String dialogo2 = "não";

        mostrarMensagemComEspera("Você entrou na caverna\n" + "\n", 10);
        mostrarMensagemComEspera("???: Olá belo guerreiro...\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Quem é você? O que você quer?\n" + "\n", 10);
        mostrarMensagemComEspera("Lynx: Eu sou a Ninfa Lynx, vivo nessa caverna, e você guerreiro? o que faz por aqui?\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Estou procurando pela saída dessa caverna tenho assuntos muito importantes a resolver, "
                + "não tenho tempo para conversas.\n" + "\n", 10);
        mostrarMensagemComEspera("Lynx: Hummm entendo sua pressa, mas será que você nao teria nem alguns minutos para ouvir sobre "
                + "o que você pode encontrar nessa caverna?\n" + "\n", 10);
        mostrarMensagemComEspera("Deseja ouvir o que a Lynx tem a dizer? sim ou não? \n" + "\n", 10);
        
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Você: Bem, vamos lá o que você está escondendo? \n" + "\n", 10);
            mostrarMensagemComEspera("Lynx: Muito bem, sabia escolha, irei te contar o que há nas profundezas dessa caverna, "
                    + "mas já te digo que não será fácil.\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Entendo, o que tenho que fazer? e o que eu ganho com isso?\n" + "\n", 10);
            mostrarMensagemComEspera("Lynx: Há um item mágico com um poder de luz que é maior do que qualquer tipo de magia...\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Isso me interessa.\n" + "\n", 10);
            mostrarMensagemComEspera("Lynx: Eu sei que sim, mas agora é a parte difícil. "
                    + "Esse item é protegido por um Dragão ancestral.\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Farei o que for preciso para ter esse item, custe o que custar!\n" + "\n", 10);
            mostrarMensagemComEspera("Lynx: Siga em frente bravo guerreiro, e que os deuses te protejam.\n" + "\n", 10);
            mostrarMensagemComEspera("Você seguiu o caminho pela caverna a procura do Dragão...\n" + "\n", 10);
            mostrarMensagemComEspera("Você ouve um barulho estranho e se aproxima...\n" + "\n", 40);
            mostrarMensagemComEspera("Você encontra o Dragão! que te avista e vem em sua direção!\n" + "\n", 40);

        } else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Você: Não, nada aqui nessa caverna me interessa a não ser a saída!\n" + "\n", 10);
            mostrarMensagemComEspera("Lynx: Certo guerreiro, compreendo, mas você pode se arrepender por essa escolha, "
                    + "que os deuses te proteja.\n" + "\n", 10);
            mostrarMensagemComEspera("Você seguiu seu prórpio caminho através da caverna...\n" + "\n", 10);
            mostrarMensagemComEspera("Você ouve um barulho estranho e se aproxima...\n" + "\n", 40);
            mostrarMensagemComEspera("Você se depara com um Dragão! que parte em direção a você!\n" + "\n", 40);
        }

    }

    //DIALOGO ENTRANDO NA FLORESTA E LUTA CONTRA O ESPÍRITO
    public static void dialogoFloresta() {

        String dialogo1 = "sim";
        String dialogo2 = "não";

        mostrarMensagemComEspera("Você seguiu seu caminho pela floresta...\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Mas que lugar sinistro, que energia sombria é essa?!\n" + "\n", 10);
        mostrarMensagemComEspera("???: Ei guerreiro, o que te traz à esse lugar? acredito que você não deveria estar aqui.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Quem é você?! eu que pergunto o que você faz aqui.\n" + "\n", 10);
        mostrarMensagemComEspera("Dana: Meu nome é Dana, sou uma Druidesa que habita essa floresta.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Certo, bem... procuro pela saída dessa floresta, opde me falar? \n" + "\n", 10);
        mostrarMensagemComEspera("Dana: Claro, mas o caminho até a saída não é tão fácil, há muitos perigos adiante.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Nada é capaz de me parar!\n" + "\n", 10);
        mostrarMensagemComEspera("Dana: Você é muito determinado, mas há algo que pode contestar sua determinação.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Isso eu duvido.\n" + "\n", 10);
        mostrarMensagemComEspera("Dana: Quer saber o que há nessa floresta capaz de te parar?\n" + "\n", 10);
        mostrarMensagemComEspera("Responder: sim ou não\n" + "\n", 10);
        
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();


        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Você: Tudo bem, pode falar, o que me espera pela frente?\n" + "\n", 10);
            mostrarMensagemComEspera("Dana: Muito bem guerreiro, pois bem, nessa floresta habita um Espírito malígno que proteje um artefato mágico...\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Que tipo de artefato?\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Um artefato que pode aumentar os poderes mágicos de qualquer ser, \n"
                    + "mas usá-lo pode custar caro a quem usar\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Entendo... como encontro esse Espírito? por onde devo ir?\n" + "\n", 10);
            mostrarMensagemComEspera("Dana: Siga em frente, o Espírito irá te encontrar, ele pode estar em qualquer lugar, esteja atento.\n" + "\n", 10);
            mostrarMensagemComEspera("Você: Certo, vou estar preparado!\n" + "\n", 10);
            mostrarMensagemComEspera("Dana: Que os deuses te protejam bravo Guerreiro.\n" + "\n", 10);
            mostrarMensagemComEspera("Você adentra cada vez mais a floresta...\n" + "\n", 40);
            mostrarMensagemComEspera("Até que um ar totalmente sombrio te cerca... \n" + "\n", 40);
            mostrarMensagemComEspera("É o Espírito da Floresta! Esteja preparado para o combate! \n" + "\n", 10);

        } else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Você: Não tenho tempo pra isso! Tenho assuntos mais importantes a tratar.\n" + "\n", 10);
            mostrarMensagemComEspera("Dana: Certo bravo guerreiro, compreendo, mas você pode se arrepender por essa escolha, "
                    + "que os deuses te proteja.\n" + "\n", 10);
            mostrarMensagemComEspera("Você seguiu floresta adentro... \n" + "\n", 10);
            mostrarMensagemComEspera("Você percebe um ar totalmente sombrio ao seu redor... \n" + "\n", 40);
            mostrarMensagemComEspera("Um Espírito malígno surge diante de você! Esteja preparado para a batalha!\n" + "\n", 10);

        }

    }

    //DIALOGO ENTRANDO NA VILA E CONVERSANDO COM ALGUNS NPCs
    public static void dialogoVilarejo() {

        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        mostrarMensagemComEspera("Após a batalha, e ter encontrado a saída você caminha até avistar um vilarejo.\n" + "\n", 10);
        mostrarMensagemComEspera("Quanto mais próximo do vilarejo você se aproxima você sente um ambiente sombrio... \n" + "\n", 10);
        mostrarMensagemComEspera("Pelo caminho você vê placas estarnhas, e quanto mais próximo a vila, mais sombrio fica. \n" + "\n", 10);
        mostrarMensagemComEspera("Finalmente você chega ao portal principal do vilarejo e avista algumas pessoas e se aproxima para conversar.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Olá senhor, poderia me dizer o que aconteceu com essa vila?\n" + "\n", 30);
        mostrarMensagemComEspera("Morador: Olá, vejo que você aparenta ser um guerreiro certo? \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Sim, tem razão, estou procurando pelo Lord Darkness!\n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: Eu sabia que esse dia chegaria.\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Como assim do que você está falando?!\n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: Como você pode ver ao seu redor essa vila está amaldiçoada,\nQuem fez isso conosco foi Lord Darkness.\n"
                + "Nosso vilarejo foi atacado e tomado pelo governo de trevas de Darkness.\n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: Mas há anos foi nos passado de geração em geração uma profecia, \nde que um dia, um guerreiro predestinado "
                + "surgiria e derrotaria Lord Darkness\n e colocaria um fim em todo o seu reinado de trevas.\n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: E pelos deuses! você pode ser nossa espernça, você é a criança da profecia!\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Não posso te afirmar caro senhor, mas tenho a certeza que irei encontrar Darkness \n"
                + "e fazer ele pagar por todo caos que ele causou nesse mundo! \n"
                + "Anote minhas palavras, eu vou derrotar Darkness e trazer a paz de volta ao mundo!\n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: Bravo guerreiro, eu acredito que você terá muito êxito em sua missão\n, em nome da vila despositamos nossa fé em você \n"
                + "que os deuses te acompanhe e te abençõe com a vitória\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Obrigado Senhor, poderia me dizer qual caminho devo seguir para encontrar Darkness? \n" + "\n", 10);
        mostrarMensagemComEspera("Senhor: Além desse vilarejo, você caminhará por um vasto campo imbuído em trevas, \nao horizonte você verá o castelo de Darkness\n" + "\n", 10);
        mostrarMensagemComEspera("Você: Entendido, muito obrigado, e que os deuses estejam com vocês!\n" + "\n", 10);
        mostrarMensagemComEspera("Você parte em direção ao fim do vilarejo pensando nas palavras do Senhor... \n" + "\n", 10);
        mostrarMensagemComEspera("...Profecia?!, será que eu sou mesmo o escolhido para cumprir essa tal profecia?!... \n" + "\n", 50);
        mostrarMensagemComEspera("...Após muito caminhar, você chega ao campo, tomado completamente por trevas. \n"
                + "e como dito, ao horizonte, onde quase não se vê um feixe de luz, lá está, o castelo de Lord Darkness\n" + "\n", 10);
        mostrarMensagemComEspera("Totalmente determinado você segue em frente, cruzando o imenso campo em direção ao castelo... \n" + "\n", 10);

    }

    public static void dialogoQuimera() {

        String dialogo1 = "sim";
        String dialogo2 = "não";

        //QUIMERA
        
        mostrarMensagemComEspera("Você: Acho que mais uma batalha se aproxima... Estou exausto, mas tenho que continuar! \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Onde você pensa que vai? \n", 10);
        mostrarMensagemComEspera("Você: Não importa para onde vou! O que importa é que está atrapalhando meu caminho! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Quem é você? \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Meu nome é Quimera, eu sou um dos Dark Royal Knights! \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Eu faço a segurança do meu Lord! \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Eu sei quem você é, pode tirar seu corpo imundo do caminho, sua jornada foi em vão! \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Caso contrário serei obrigado a te destruir, do mesmo jeito que fiz com seu vilarejo insignificante! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Então foi você seu maldito? \n" + "\n", 10);
        mostrarMensagemComEspera("Quimera: Claro que sim, quem mais poderia ser? Quer saber como foi o ataque? \n " + "\n", 10);
        mostrarMensagemComEspera("Responder: sim ou não \n" + "\n", 10);
        
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        
        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Você: Não acredito que seja tão desprezível à esse ponto... \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Se gabar pela desgraça de um povo! \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Isso é o que faço de melhor, aliás, o povo do seu vilarejo tinha um espirito heróico igual ao seu. \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Pena que nenhum deles durou o bastante contra mim... \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Todos foram aniquilados... um por um. \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Maldito! Não quero ouvir mais uma palavra da sua boca! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Só de pensar no sofrimento do meu povo me da calafrios... Todos serão vingados! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Não terei um pingo de misericórdia contra você! \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: É o que veremos então! \n" + "\n", 10);

        } else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Você: Não quero ouvir! De mim você terá apenas o desprezo! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Um ser como você não merece minha atenção, merece apenas minha vingança! \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Acha que será fácil? \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Creio que não saiba com que está falando! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Chega de conversa e vamos para o que interessa! \n" + "\n", 10);
            mostrarMensagemComEspera("Quimera: Então vamos garoto! \n" + "\n", 10);

        }
    }

    public static void dialogoDraugr() {

        String dialogo1 = "sim";
        String dialogo2 = "não";

        //DRAUGR
        
        mostrarMensagemComEspera("Você: Essa batalha com a Quimera me desgastou muito mais do que eu imaginava... \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Foi uma batlaha bem díficil... \n" + "\n", 10);
        mostrarMensagemComEspera("???: Então foi você... Você derrotou meu irmão? \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Quem é você? Não sei do que está falando? \n" + "\n", 10);
        mostrarMensagemComEspera("Draugr: Não se faça de desintendido... Sou Draugr, irmão de Quimera, que você acabou de derrotar! \n" + "\n", 10);
        mostrarMensagemComEspera("Draugr: Não posso acreditar que meu irmão falhou em sua missão... \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Agora tudo faz sentido... Os dois irmãos que protegem a entrada do reino. \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Mas enfim... Se não quiser ter o mesmo destino que seu irmão, sugiro que não me enfrente! \n" + "\n", 10);
        mostrarMensagemComEspera("Draugr: Não se trata de combate... Se trata honra da familia... \n" + "\n", 10);
        mostrarMensagemComEspera("VocêMas pra que toda essa lealdade? \n" + "\n", 10);
        mostrarMensagemComEspera("Draugr: Quer saber nosso propósito? \n" + "\n", 10);
        mostrarMensagemComEspera("Responder: sim ou não \n" + "\n", 10);
        
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Você: Não que eu esteja muito interesado... Mas gostaria de saber o que pensam antes de te aniquilar! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: É bom saber que está otimista assim, isso me empolga mais para decretar minha vingança! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Desde quando Lord Darkness planejou dominar os territórios, tinhamos os mesmos pensamentos! \n" + "\n", 10);
            mostrarMensagemComEspera("Darugr: Pareciam até laços de sangue, algo que não tinhamos sentido ainda... \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Juramos lealdade a ele... Entregando nossas vidas se for necessário! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: História muito bonita... Infelizmente nem toda história tem o seu final feliz" + "\n", 10);
            mostrarMensagemComEspera("Draugr: É o que acontecerá com você! O fim te aguarda jovem guerreiro... Está mais próximo do que imagina! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Quimera será vingado, e o reino continuara protegido! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Veremos Draugr... Já derrotei um... Não será nada complicado derrotar outro!  \n" + "\n", 10);

        } else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Você: Vocês gostam muito de falar! Creio que deve ser de familia! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Já disse,terão apenas meu desprezo! De mim conhecerão apenas a vingança! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Não sabe o que te espera jovem guerreiro! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Se você tem motivos para vingança, quero que também conheça os meus motivos! \n" + "\n", 10);
            mostrarMensagemComEspera("Draugr: Não sairá daqui com vida! De forma alguma! \n" + "\n", 10);

        }

    }

    public static void dialogoBoss() {

        String dialogo1 = "sim";
        String dialogo2 = "não";

        //LORD DARKNESS
        
        mostrarMensagemComEspera("Lord Darkness: Então é você.. Você é a tão falada criança da profecia? \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Quem está aí?... Onde você está?... Não consigo ver nada! \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: No momento certo terá as respostas... \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Não estou surpreso de ter derrotado Draugr e Quimera... Estavam comigo a tanto tempo, me protegendo e andando lado a lado comigo! \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Mas não foram pareos para a criança que foi profetizado me derrotar! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Então é você... Lord Darkness? \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Isso mesmo jovem... Não lembra de mim? Faz muito tempo desde o ataque mas um rosto como o meu é díficil de esquecer! \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Ah, é mesmo... Perdoe minha ignorância... Esqueci que era apenas um bebê quando tudo aconteceu! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Não... Não ouse mencionar esse dia... \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Ora, mas porque não? Desde aquele dia as coisas estão como deveriam estar... Todos sob o meu comando! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Você não tem noção do que fala... Não sabe quantas vidas tirou, quantas familias foram afetadas... \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Pessoas vivendo das piores maneiras, num lugar amaldiçoado por você... \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Realmente... Não procuro saber sobre futilidades! \n" + "\n", 10);
        mostrarMensagemComEspera("Lord Darkness: Quer saber o motivo de todo esse ataque? \n" + "\n", 10);
        mostrarMensagemComEspera("Responder: sim ou não \n" + "\n", 10);
        
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();


        if (dialogo1.equals(dialogo1)) {

            mostrarMensagemComEspera("Você: Claro que sim, o que correm são boatos... Quero escutar da sua boca o motivo de toda essa crueldade! \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Não chame de crueldade garoto... Querer o que é seu de direito não pode ser crueldade. \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Tempos atrás as terras eram dominadas por pessoas que controlavam magia. \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Com o passar do tempo, a população de pessoas normais como o pessoal da sua vila cresceram muito. \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Com isso fomos obrigados a dar nossas terras para seu desenvolvimento, sem nada em troca. \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Isso não poderia ficar assim... Por isso parti para a retomada do que era nosso por direito! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Não consigo acreditar que o motivo de tantas vidas serem perdidas foi esse... Simplesmente a ganancia... \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Esse desejo sujo de ter poder sobre as pessoas... Não posso deixar que isso fique impune... Não posso... \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Você é um jovem muito ousado, por sinal, você teve dificuldades lutando contra Quimera e Draugr... \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Seria uma decisão burra tentar a sorte contra mim! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Já cheguei até aqui... Não posso voltar atrás... \n" + "\n", 10);
            mostrarMensagemComEspera("Você: A profecia tem que ser cumprida! \n" + "\n", 10);

        } else if (dialogo2.equals(dialogo2)) {

            mostrarMensagemComEspera("Você: Jamais!!! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Tudo que vivi já me basta! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Não quero retomar o sofrimento que tenho passado em todos esses anos! \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Certo! Se está aqui creio que tem um motivo... \n" + "\n", 10);
            mostrarMensagemComEspera("Lord Darkness: Veio atrás do cumprimento da profecia! Não posso deixar que isso aconteça! \n" + "\n", 10);
            mostrarMensagemComEspera("Você: Não poderá fazer nada para me impedir! Meu destino está escrito... E eu irei atrás dele! \n" + "\n", 10);

        }
    }

    public static void dialogoWin() {

        //FINAL (SE VENCER)
        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        mostrarMensagemComEspera("Você: Não acredito... Deu certo... Eu consegui! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Meu corpo está muito ferido e eu estou muito desgastado... Mas acho que vou ficar bem! \n" + "\n", 10);
        mostrarMensagemComEspera("O Líder da Vila entra no castelo e vê você ferido após a batalha, mas exalando um poder de luz. \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Quem é você? O que aconteceu? \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Fique calmo... Acabou.. Eu derrotei ele! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Então era você.. O jovem que passou na nossa vila a pouco tempo... \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Não posso acreditar que era mesmo a criança da profecia... \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Sou eu mesmo... Consegui derrotar Quimera e Draugr que faziam a segurança do Lord Darkness! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Não sei de onde tirei forças para derrotá-lo... Só sei que está feito! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Acabaram-se os tempos de dominação e trevas! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Isso mesmo... Era você, o destinado a nos trazer de volta a paz! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: OBRIGADO DEUSES! OBRIGADO PELAS BENÇÃOS! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: A Profecia falava, que o guerreiro que destruisse Lord Darkness, herdaria o poder de Licht. \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: E seu poder de luz governaria tempos de paz sobre o mundo! É você... É você o escolhido para nos governar! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Acho que não podemos tomar decisões preciptadas... \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Não há decisões preciptadas, profecias são profecias! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Tome seu lugar que é de direito e governe tempos de paz! \n" + "\n", 10);
        mostrarMensagemComEspera("Você: Acho que é o certo a se fazer mesmo... A profecia será cumprida! De hoje, até o ultimo dia da minha vida! \n" + "\n", 10);

    }

    public static void dialogoDerrota() {

        Scanner dialogo = new Scanner(System.in);

        String entrada = dialogo.nextLine();

        mostrarMensagemComEspera("Após seu sacrifício para aprisionar Lord Darkness em sua arma, toda magia obscura que ronda os vilarejos começa a se dissipar! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Mas o que é isso?... O que está acontecendo?... \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Toda a magia esta se dissipando... Será que aconteceu algo no castelo? \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Chamarei a equipe de defesa para averiguar comigo o que pode ter acontecido no castelo! \n" + "\n", 10);
        mostrarMensagemComEspera("O Líder da Vila e sua equipe de defesa vão em direção ao castelo, e logo de cara observam o corpo de Quimera e Draugr ao chão. \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Não pode ser... Os dois foram derrotados... Quem será o responsável por isso? \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Vamos entrar para olhar! \n" + "\n", 10);
        mostrarMensagemComEspera("Após entrarem, eles avistam o corpo de Lord Darkness e do jovem guerreiro que tinha passado a pouco tempo em seu vilarejo. \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: É ele, o jovem guerreiro que a pouco tempo passou por nós em nossa vila... Não é possível que ele tenha derrotado o Lord Darkness! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Defesa: É ele mesmo! E não só derrotou, como aprisionou o espirito maligno de Lord Darkness em sua arma! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Defesa: Aqui está sua arma com um selo... Eu conheço esse selo, é um selo de aprisionamento muito antigo! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Defesa: O que faremos com essa arma? \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Faremos o correto a se fazer... Jogaremos ela do mais alto penhasco de nossa vila... \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Onde nunca, nenhuma pessoa teve acesso! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Lá ela estará segura, e teremos certeza que o sacrifício desse jovem guerreiro, a criança da profecia, não será em vão! \n" + "\n", 10);
        mostrarMensagemComEspera("Líder da Vila: Tempos de paz virão! É nossa obrigação mante-lo! \n" + "\n", 10);
        mostrarMensagemComEspera("A Equipe de Defesa juntamente do Líder da Vila foram ao alto do penhasco mais alto e arremessaram de lá a espada com o espirito de Lord Darkness aprisionado. \n" + "\n", 10);
        mostrarMensagemComEspera("Com a certeza de que os tempos de dominação e treva estavão no passado! A partir dali, se daria início aos tempos de paz! \n" + "\n", 10);

    }

}
