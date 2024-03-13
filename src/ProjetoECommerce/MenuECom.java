package ProjetoECommerce;

import java.io.IOException;
import java.util.Scanner;

import ProjetoECommerce.controller.EComController;
import ProjetoECommerce.model.BackLog;

public class MenuECom {
	public static void main(String[] args) {
		EComController log = new EComController();
		Scanner scan = new Scanner(System.in);

		String nome, plataforma, genero;
		int ano, tempo, codigo = 0;
		float preco;

		boolean check = true;
		while (check == true) {
			chamarMenu();
			int opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Criar log\n\n");

				System.out.println("Digite um código para o jogo:");
				codigo = scan.nextInt();
				System.out.println("Digite o nome do jogo: ");
				scan.skip("\\R?");
				nome = scan.nextLine();
				System.out.println("Digite o ano do jogo: ");
				ano = scan.nextInt();
				System.out.println("Digite o gênero do jogo: ");
				scan.skip("\\R?");
				genero = scan.nextLine();
				System.out.println("Digite a plataforma do jogo: ");
				scan.skip("\\R?");
				plataforma = scan.nextLine();
				System.out.println("Digite o tempo de jogatina:");
				tempo = scan.nextInt();
				System.out.println("Digite o preço do jogo: ");
				preco = scan.nextFloat();

				log.cadastrar(new BackLog(codigo, nome, ano, genero, plataforma, tempo, preco));
				keyPress();
				break;
			case 2:
				log.listarTodos();
				keyPress();
				break;
			case 3:
				scan.skip("\\R?");
				System.out.println(" Digite o nome do jogo que quer procurar: ");
				codigo = scan.nextInt();

				log.procurarPorCodigo(codigo);

				keyPress();
				break;
			case 4:
				System.out.println("Digite o código do log que quer deletar: ");
				
				log.deletar(codigo);
				
				keyPress();
				break;
			case 5:
				System.out.println("Digite o código do log que deseja alterar: ");
				codigo =scan.nextInt();
				
				var buscaLog = log.buscarNaCollection(codigo);
				
				if(buscaLog != null) {				
				System.out.println("Digite o nome do jogo: ");
				scan.skip("\\R?");
				nome = scan.nextLine();
				System.out.println("Digite o ano do jogo: ");
				ano = scan.nextInt();
				System.out.println("Digite o gênero do jogo: ");
				scan.skip("\\R?");
				genero = scan.nextLine();
				System.out.println("Digite a plataforma do jogo: ");
				scan.skip("\\R?");
				plataforma = scan.nextLine();
				System.out.println("Digite o tempo de jogatina:");
				tempo = scan.nextInt();
				System.out.println("Digite o preço do jogo: ");
				preco = scan.nextFloat();
				log.atualizar(new BackLog(codigo, nome, ano, genero, plataforma, tempo, preco));
				} else {
					System.out.println("A conta não foi encontrada!");
				}
				keyPress();
				break;
			case 0:
				sobre();
				check = false;
				scan.close();
				break;
			default:
				System.out.println("\nOpção inválida tente novamente!");
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:  ");
		System.out.println("Gabriel Carvalho Tomarchio - bieltomarchio@hotmail.com");
		System.out.println("github.com/biel678/");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	public static void chamarMenu() {
		System.out.println("\n***************************************************");
		System.out.println("                                                     ");
		System.out.println("                      Games101                       ");
		System.out.println("           Sua plataforma de backlog gamer           ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Lista de jogos                 ");
		System.out.println("            2 - Listar todas os jogos da sua lista   ");
		System.out.println("            3 - Buscar Jogo por Nome                 ");
		System.out.println("            4 - Apagar jogo                          ");
		System.out.println("            5 - Atualizar jogo                       ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
	}
}
