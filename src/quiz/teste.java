    package quiz;

    import java.util.Scanner;

    public class teste {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);


            cabecalho cabecalho1 = new cabecalho();
            System.out.println("===========================================================================================");
            cabecalho1.facudade = "FACUDADE: UNIFAN";
            cabecalho1.nome = "NOME: Lucas Freitas Fé Silva";

            cabecalho1.professor = "PROFESSOR: Brenno";

            cabecalho1.materia = "MATERIA: Algoritmos e programação II";

            cabecalho1.escrevaCabecalho();
            System.out.println("===========================================================================================");

            int acertos = 0;


            questoes questoes1 = new questoes();

            questoes1.pergunta = "Qual é o título do filme que ganhou o Oscar de Melhor Filme em 2022?";
            questoes1.opcaoA = "A-)Nomadland";
            questoes1.opcaoB = "B-)Minari";
            questoes1.opcaoC = "C-)The Trial of the Chicago 7";
            questoes1.opcaoD = "D-)Promising Young Woman";
            questoes1.opcaoE = "E-)Sound of Metal";
            questoes1.escrevaQuestoes();
            questoes1.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta = leia.nextLine();
            if (resposta.equals(questoes1.iscorreta(resposta))) {
            } else {
            }
            if (resposta.equals(questoes1.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes2 = new questoes();

            questoes2.pergunta = "2-)Quem dirigiu o filme Icenption (A Origem)?";
            questoes2.opcaoA = "A-)Christopher Nolan";
            questoes2.opcaoB = "B-)Quentin Tarantino";
            questoes2.opcaoC = "C-)Steven Spielberg";
            questoes2.opcaoD = "D-)James Cameron";
            questoes2.opcaoE = "E-)Martin Scorsese" ;
            questoes2.escrevaQuestoes();
            questoes2.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta2 = leia.nextLine();
            if (resposta.equals(questoes2.iscorreta(resposta2))) {
            } else {

            }
            if (resposta2.equals(questoes2.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }



            System.out.println("========================================================================================");

            questoes questoes3 = new questoes();

            questoes3.pergunta = "3-)Em que ano foi lançado o clássico filme de ficção científica Blade Runner";
            questoes3.opcaoA = "A-)1979";
            questoes3.opcaoB = "B-)1982";
            questoes3.opcaoC = "C-)1985";
            questoes3.opcaoD = "D-)1990";
            questoes3.opcaoE = "E-)1995";
            questoes3.escrevaQuestoes();
            questoes3.correta = "b";
            System.out.println("digite a resposta correta");
            String resposta3 = leia.nextLine();
            if (resposta.equals(questoes3.iscorreta(resposta3))) {
            } else {

            }
            if (resposta3.equals(questoes3.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }

            System.out.println("========================================================================================");

            questoes questoes4 = new questoes();

            questoes4.pergunta = "4-)Qual ator interpretou o papel principal em Forrest Gump?";
            questoes4.opcaoA = "A-)Tom hanks";
            questoes4.opcaoB = "B-)Robert De Niro";
            questoes4.opcaoC = "C-)Brad Pitt";
            questoes4.opcaoD = "D-)Leonardo DiCaprio";
            questoes4.opcaoE = "E-Johnny Depp";
            questoes4.escrevaQuestoes();
            questoes4.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta4 = leia.nextLine();
            if (resposta.equals(questoes4.iscorreta(resposta4))) {
            } else {

            }
            if (resposta4.equals(questoes4.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes5 = new questoes();

            questoes5.pergunta = "5-)Em qual cidade se passa a trama do filme La La Land ?";
            questoes5.opcaoA = "A-)Nova york";
            questoes5.opcaoB = "B-)Los Angeles";
            questoes5.opcaoC = "C-)Paris";
            questoes5.opcaoD = "D-)Londres";
            questoes5.opcaoE = "E-)Chicago";
            questoes5.escrevaQuestoes();
            questoes5.correta = "b";
            System.out.println("digite a resposta correta");
            String resposta5 = leia.nextLine();
            if (resposta.equals(questoes5.iscorreta(resposta5))) {
            } else {

            }
            if (resposta5.equals(questoes5.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes6 = new questoes();

            questoes6.pergunta = "6-)Quem foi o protagonista do filme de ação John Wick?";
            questoes6.opcaoA = "A-)Keanu Reeves";
            questoes6.opcaoB = "B-)Jason Statham";
            questoes6.opcaoC = "C-)Tom Cruise";
            questoes6.opcaoD = "D-)Liam Neeson";
            questoes6.opcaoE = "E-)Chris Hemsworth";
            questoes6.escrevaQuestoes();
            questoes6.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta6 = leia.nextLine();
            if (resposta.equals(questoes6.iscorreta(resposta6))) {
            } else {

            }
            if (resposta6.equals(questoes6.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes7 = new questoes();

            questoes7.pergunta = "7-)ual é a animação da Disney sobre um leão que perde seu pai e precisa enfrentar desafios para reivindicar seu lugar como rei?";
            questoes7.opcaoA = "A-)Aladdin";
            questoes7.opcaoB = "B-)A bela e a Fera";
            questoes7.opcaoC = "C-)O Rei Leão";
            questoes7.opcaoD = "D-)Mulan";
            questoes7.opcaoE = "E-)Frozen";
            questoes7.escrevaQuestoes();
            questoes7.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta7 = leia.nextLine();
            if (resposta.equals(questoes7.iscorreta(resposta7))) {
            } else {

            }
            if (resposta7.equals(questoes7.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes8 = new questoes();

            questoes8.pergunta = "8-Qual é o nome do vilão interpretado por Heath Ledger em The Dark Knight (O Cavaleiro das Trevas)? ";
            questoes8.opcaoA = "A-)Duas-Caras";
            questoes8.opcaoB = "B-)Pimguim";
            questoes8.opcaoC = "C-)Coringa";
            questoes8.opcaoD = "D-)Espantalho";
            questoes8.opcaoE = "E-)Ra's al Ghul";
            questoes8.escrevaQuestoes();
            questoes8.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta8 = leia.nextLine();
            if (resposta.equals(questoes8.iscorreta(resposta8))) {
            } else {

            }
            if (resposta8.equals(questoes8.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes9 = new questoes();

            questoes9.pergunta = "9-Quem dirigiu o filme vencedor do Oscar Birdman? ";
            questoes9.opcaoA = "A-)Alejandro G. Iñárritu";
            questoes9.opcaoB = "B-)Guillermo del Toro";
            questoes9.opcaoC = "C-)Alfonso Cuarón";
            questoes9.opcaoD = "D-)Pedro Almodóvar";
            questoes9.opcaoE = "E-)Martin McDonagh";
            questoes9.escrevaQuestoes();
            questoes9.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta9 = leia.nextLine();
            if (resposta.equals(questoes9.iscorreta(resposta9))) {
            } else {

            }
            if (resposta9.equals(questoes9.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes10 = new questoes();

            questoes10.pergunta = "10-Em que década se passa a história de Stranger Things, uma série original da Netflix? ";
            questoes10.opcaoA = "A-)Anos 70";
            questoes10.opcaoB = "B-)Anos 80";
            questoes10.opcaoC = "C-)Anos 2010";
            questoes10.opcaoD = "D-)Anos 2000";
            questoes10.opcaoE = "E-)Anos 80";
            questoes10.escrevaQuestoes();
            questoes10.correta = "e";
            System.out.println("digite a resposta correta");
            String resposta10 = leia.nextLine();
            if (resposta.equals(questoes10.iscorreta(resposta10))) {
            } else {

            }
            if (resposta10.equals(questoes10.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes11 = new questoes();

            questoes11.pergunta = "11-)Qual é o nome da protagonista feminina em The Hunger Games (Jogos Vorazes)?";
            questoes11.opcaoA = "A-)Rey";
            questoes11.opcaoB = "B-)Tris Prior";
            questoes11.opcaoC = "C-)Hermione Granger";
            questoes11.opcaoD = "D-)Bella Swan";
            questoes11.opcaoE = "E-)Katniss Everdeen";
            questoes11.escrevaQuestoes();
            questoes11.correta = "e";
            System.out.println("digite a resposta correta");
            String resposta11 = leia.nextLine();
            if (resposta.equals(questoes11.iscorreta(resposta11))) {
            } else {

            }
            if (resposta11.equals(questoes11.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes12 = new questoes();

            questoes12.pergunta = "12-Quem interpretou o papel de Tony Stark, também conhecido como Homem de Ferro, no Universo Cinematográfico da Marvel?";
            questoes12.opcaoA = "A-)Chris Evans";
            questoes12.opcaoB = "B-)Chris Hemsworth";
            questoes12.opcaoC = "C-)Robert Downey jr";
            questoes12.opcaoD = "D-)Mark Ruffalo";
            questoes12.opcaoE = "E-)Scarlett johansson";
            questoes12.escrevaQuestoes();
            questoes12.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta12 = leia.nextLine();
            if (resposta.equals(questoes12.iscorreta(resposta12))) {
            } else {

            }
            if (resposta12.equals(questoes12.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes13 = new questoes();

            questoes13.pergunta = "13-)Qual é o título do primeiro filme da trilogia O Senhor dos Anéis?";
            questoes13.opcaoA = "A-)A sociedade do Anel";
            questoes13.opcaoB = "B-)As Duas Torres";
            questoes13.opcaoC = "C-)O retorno do Rei";
            questoes13.opcaoD = "D-)O hobbit ";
            questoes13.opcaoE = "E-)A batalha dos Cincos Exércitos";
            questoes13.escrevaQuestoes();
            questoes13.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta13 = leia.nextLine();
            if (resposta.equals(questoes13.iscorreta(resposta13))) {
            } else {

            }
            if (resposta13.equals(questoes13.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes14 = new questoes();

            questoes14.pergunta = "14-)Em que ano foi lançado o filme de ficção científica Back to the Future (De Volta para o Futuro)?";
            questoes14.opcaoA = "A-)1980";
            questoes14.opcaoB = "B-)1995";
            questoes14.opcaoC = "C-)1990";
            questoes14.opcaoD = "D-)1985";
            questoes14.opcaoE = "E-)2000";
        questoes14.escrevaQuestoes();
        questoes14.correta = "d";
        System.out.println("digite a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta14))) {
        } else {

        }
        if (resposta14.equals(questoes14.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes15 = new questoes();

        questoes15.pergunta = "15-)Qual é o gênero cinematográfico predominante no filme The Shawshank Redemption (Um Sonho de Liberdade)?";
        questoes15.opcaoA = "A-)Drama";
        questoes15.opcaoB = "B-)Comédia";
        questoes15.opcaoC = "C-)Ação";
        questoes15.opcaoD = "D-)Ficção Cientifíca";
        questoes15.opcaoE = "E-)Terror";
        questoes15.escrevaQuestoes();
        questoes15.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta15))) {
        } else {

        }
        if (resposta15.equals(questoes15.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        System.out.println("você acertou " + acertos + " de 15 perguntas");
        if (acertos <= 5) {
            System.out.println("TENTE NOVAMENTE!!!! VOCÊ FOI MAL DEMAIS ");
        }
        if (acertos < 10 & acertos > 5) {
            System.out.println("VOCÊ FOI REGULAR");
        }
        if (acertos > 10 & acertos <= 14) {
            System.out.println("PAREBENS VOCÊ FOI MUITO BEM");
        }
        if (acertos > 14) {
            System.out.println("PAREBENS VOCÊ FOI  EXCELENTE");

        }


    }
}
