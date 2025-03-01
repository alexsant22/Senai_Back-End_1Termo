package atividade5;

import java.util.Scanner;

public class TestePadaria {
    public static void main(String[] args) {
        //criando scanner
        Scanner scan = new Scanner(System.in);

        //pegando infos
        //paes
        System.out.println("Qual pão você deseja?");
        String p1 = scan.nextLine();
        System.out.println("Outro pão que deseje.");
        String p2 = scan.nextLine();
        //bolos
        System.out.println(""); //espaçamento
        System.out.println("Qual bolo você deseja?");
        String b1 = scan.nextLine();
        System.out.println("Outro bolo que deseje.");
        String b2 = scan.nextLine();
        //doces
        System.out.println(""); //espaçamento
        System.out.println("Qual doce você deseja?");
        String d1 = scan.nextLine();
        System.out.println("Outro doce que deseje.");
        String d2 = scan.nextLine();
        System.out.println(""); //espaçamento

        //instaciando produtos
        //pao1
        Pao pao1 = new Pao(p1, 10);
        pao1.exibir(p1, 10);
        //pao2
        Pao pao2 = new Pao(p2, 12);
        pao1.exibir(p2, 12);
        //bolo1
        Bolo bolo1 = new Bolo(b1, 25);
        bolo1.exibir(b1, 25);
        //bolo2
        Bolo bolo2 = new Bolo(b2, 30);
        bolo2.exibir(b2, 30);
        //doce1
        Doce doce1 = new Doce(d1, 6);
        doce1.exibir(d1,6);
        //doce2
        Doce doce2 = new Doce(d2, 6);
        doce2.exibir(d2, 6);

        //infos comilão
        // 1 pao, 1 bolo, 2 doces
        //pao
        System.out.println("Você vai comer a primeira ou segunda opção de pão?");
        System.out.println("Digite '1' para a primeira opção.");
        System.out.println("Digite '2' para a segunda opção.");
        int op = scan.nextInt();
        //bolo
        System.out.println(""); //espaçamento
        System.out.println("Você vai comer a primeira ou segunda opção de bolo?");
        System.out.println("Digite '1' para a primeira opção.");
        System.out.println("Digite '2' para a segunda opção.");
        int op1 = scan.nextInt();

        System.out.println(""); //espaçamento

        //instanciando comilao
        PessoaComer pessoa = new PessoaComer();

        //acão do comilao.comer();
        switch (op) {
            case 1:
                pessoa.comer(p1);
                break;
            case 2:
                pessoa.comer(p2);
                break;
            default:
                System.out.println("Digite uma opção válida.");
                break;
        }
        switch (op1) {
            case 1:
                pessoa.comer(b1);
                break;
            case 2:
                pessoa.comer(b2);
                break;
            default:
                System.out.println("Digite uma opção válida.");
                break;
        }
        pessoa.comer(d1);
        pessoa.comer(d2);
    }
}
