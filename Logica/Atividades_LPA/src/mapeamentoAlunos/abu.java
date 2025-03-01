package mapeamentoAlunos;

import java.io.*;
import java.util.*;

public class abu {

    private static final int LINHAS = 5; // Número de fileiras (ilhas)
    private static final int COLUNAS = 5; // Número de cadeiras por fileira
    private static String[][] sala = new String[LINHAS][COLUNAS];

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        inicializarSala(); // Inicializa a matriz com "Vazio"

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Visualizar Mapeamento");
            System.out.println("3. Gerenciar Assentos");
            System.out.println("4. Gerar Relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    visualizarSala();
                    break;
                case 3:
                    gerenciarAssento(scanner);
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void inicializarSala() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                sala[i][j] = "Vazio";
            }
        }
    }

    private static void cadastrarAluno(Scanner scanner) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número da fileira (1 a " + LINHAS + "): ");
        int linha = scanner.nextInt() - 1;
        System.out.print("Digite o número da cadeira (1 a " + COLUNAS + "): ");
        int coluna = scanner.nextInt() - 1;

        if (linha >= 0 && linha < LINHAS && coluna >= 0 && coluna < COLUNAS) {
            if (sala[linha][coluna].equals("Vazio")) {
                sala[linha][coluna] = nome;
                System.out.println("Aluno cadastrado com sucesso!");
            } else {
                System.out.println("Assento já ocupado. Tente outro.");
            }
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }

    private static void visualizarSala() {
        System.out.println("\n=== Mapeamento da Sala ===");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(sala[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void gerenciarAssento(Scanner scanner) {
        System.out.print("Digite o número da fileira atual do aluno (1 a " + LINHAS + "): ");
        int linhaAtual = scanner.nextInt() - 1;
        System.out.print("Digite o número da cadeira atual do aluno (1 a " + COLUNAS + "): ");
        int colunaAtual = scanner.nextInt() - 1;

        if (linhaAtual >= 0 && linhaAtual < LINHAS && colunaAtual >= 0 && colunaAtual < COLUNAS) {
            if (!sala[linhaAtual][colunaAtual].equals("Vazio")) {
                String aluno = sala[linhaAtual][colunaAtual];
                sala[linhaAtual][colunaAtual] = "Vazio";

                System.out.print("Digite o número da nova fileira (1 a " + LINHAS + "): ");
                int novaLinha = scanner.nextInt() - 1;
                System.out.print("Digite o número da nova cadeira (1 a " + COLUNAS + "): ");
                int novaColuna = scanner.nextInt() - 1;

                if (novaLinha >= 0 && novaLinha < LINHAS && novaColuna >= 0 && novaColuna < COLUNAS) {
                    if (sala[novaLinha][novaColuna].equals("Vazio")) {
                        sala[novaLinha][novaColuna] = aluno;
                        System.out.println("Assento alterado com sucesso!");
                    } else {
                        System.out.println("Novo assento já ocupado. Operação cancelada.");
                        sala[linhaAtual][colunaAtual] = aluno; // Restaura o aluno
                    }
                } else {
                    System.out.println("Posição inválida. Operação cancelada.");
                    sala[linhaAtual][colunaAtual] = aluno; // Restaura o aluno
                }
            } else {
                System.out.println("Não há aluno nesse assento.");
            }
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }

    private static void gerarRelatorio() {
        int disponiveis = 0;
        int ocupados = 0;
        StringBuilder relatorio = new StringBuilder();

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (sala[i][j].equals("Vazio")) {
                    disponiveis++;
                } else {
                    ocupados++;
                    relatorio.append("Assento [").append(i + 1).append(", ").append(j + 1).append("] -> ").append(sala[i][j]).append("\n");
                }
            }
        }

        System.out.println("\n=== Relatório ===");
        System.out.println("Assentos Disponíveis: " + disponiveis);
        System.out.println("Assentos Ocupados: " + ocupados);
        System.out.println(relatorio);
    }
}
