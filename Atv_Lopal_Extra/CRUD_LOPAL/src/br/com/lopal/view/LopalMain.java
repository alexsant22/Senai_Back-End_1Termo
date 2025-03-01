package br.com.lopal.view;

import java.util.Scanner;

import br.com.lopal.dao.LopalDAO;
import br.com.lopal.dao.MovDao;
import br.com.lopal.model.Movimentacao;
import br.com.lopal.model.Produto;

public class LopalMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// instanciando objs
		LopalDAO lopalDAO = new LopalDAO();
		MovDao movDao = new MovDao();
		Produto produto;
		Movimentacao movi;
		int opc;
		do {
			System.out.println("\n--- Gerenciamento de Produtos em Estoque ---");

			System.out.println("1. Listar produtos");
			System.out.println("2. Buscar produto por ID");
			System.out.println("3. Inserir produto");
			System.out.println("4. Atualizar produto");
			System.out.println("5. Excluir produto do banco de dados");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opc = scan.nextInt();
			scan.nextLine();

			switch (opc) {
			case 1: // read
				System.out.println("Lendo a lista de produtos...");
				for(Produto produto_lido : lopalDAO.read()) {
					System.out.println("Lista dos produtos:\n" + "ID: " + produto_lido.getId() + 
							" | Nome: " + produto_lido.getNome() + 
							" | Quantidade: " + produto_lido.getQuantidade() + 
							" | Categoria: " + produto_lido.getCategoria());
				}
				break;
				
			case 2: // read produto especifico
				System.out.println("Digite o ID do produto para buscar:");
				int idB = scan.nextInt();
				for(Produto produto_lido : lopalDAO.read()) {
					if (produto_lido.getId() == idB) {
						System.out.println("Lista dos produtos:\n" + "ID: " + produto_lido.getId() + 
								"\nNome: " + produto_lido.getNome() + 
								"\nQuantidade: " + produto_lido.getQuantidade() + 
								"\nCategoria: " + produto_lido.getCategoria());
					}
				}
				break;
			
			case 3: // create
				produto = new Produto();
				System.out.println("Digite o nome do produto:");
				produto.setNome(scan.nextLine());
				System.out.println("Digite a quantidade do produto:");
				produto.setQuantidade(scan.nextInt());
				scan.nextLine();
				System.out.println("Digite a categoria do produto:");
				produto.setCategoria(scan.nextLine());
				lopalDAO.create(produto);
				
                // Registrar movimentação de entrada
                movi = new Movimentacao();
                movi.setProdutoId(produto.getId());  // ID atribuído
                movi.setQtd_Entrada(produto.getQuantidade());
                movi.setQtd_Saida(0);  // Nenhuma saída, apenas entrada
                movi.setQtd_Atual(produto.getQuantidade());
                movDao.create(movi); // Criar movimentação

                System.out.println("Produto adicionado ao estoque!");
				break;
				
			case 4: // update
				produto = new Produto();
				System.out.println("Digite o ID do produto para atualizar: ");
				produto.setId(scan.nextInt());
				scan.nextLine();
				System.out.println("Digite o nome do produto:");
				produto.setNome(scan.nextLine());
				System.out.println("Digite a quantidade do produto:");
				produto.setQuantidade(scan.nextInt());
				scan.nextLine();
				System.out.println("Digite a categoria do produto:");
				produto.setCategoria(scan.nextLine());
				lopalDAO.update(produto);
				
				// Registrar movimentação de saída ou entrada
                movi = new Movimentacao();
                movi.setProdutoId(produto.getId());

                // Verifica se teve aumento ou nao no estoque
                int qtdAlterada = produto.getQuantidade();
                if (qtdAlterada > 0) {
                    movi.setQtd_Entrada(qtdAlterada);  // Aumenta o estoque no BD
                    movi.setQtd_Saida(0);
                } else {
                    movi.setQtd_Entrada(0);  // Diminuiu o estoque no BD
                    movi.setQtd_Saida(Math.abs(qtdAlterada));
                }

                movi.setQtd_Atual(produto.getQuantidade());
                movDao.create(movi); // Criar movimentação

				break;
				
			case 5: // delete
				produto = new Produto();
				System.out.println("Digite o ID do produto para DELETAR:");
				int id = scan.nextInt();
				scan.nextLine();
				lopalDAO.delete(id);
				
				// Registrar movimentação de saída
                movi = new Movimentacao();
                movi.setProdutoId(id);
                movi.setQtd_Entrada(0);
                movi.setQtd_Saida(1); // Produto excluído
                movi.setQtd_Atual(0); // Produto excluído, quantidade 0
                movDao.create(movi); // Criar movimentação

				break;
				
			case 0: // exit
				System.out.println("Saindo . . .");
				break;
				
			default:
				System.out.println("Digite uma opção válida.");
				break;
				
			}

		} while (opc != 0);

		scan.close();
	}

}