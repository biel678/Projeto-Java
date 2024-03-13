package ProjetoECommerce;

import java.io.IOException;
import java.util.Scanner;

import ProjetoECommerce.model.BackLog;

public class MenuECom {
	public static void main(String[] args) {
		
		/*String nome, plataforma, genero;
		int ano, tempo;
		float preco;
		*/
		BackLog tt = new BackLog("jogo", 2020, "terror", "pc", 20, 10.0f);
		tt.visualizar();
		
		Scanner scan = new Scanner(System.in);
		
		boolean check = true;
		while (check == true) {
			chamarMenu();
			int opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do jogo: ");
				System.out.println("Digite o ano do jogo: ");
				System.out.println("Digite o gênero do jogo: ");
				System.out.println("Digite a plataforma do jogo: ");
				System.out.println("Digite o tempo de jogatina:");
				System.out.println("Digite o preço do jogo: ");

				keyPress();
				break;
			case 2:
				// listar
				keyPress();
				break;
			case 3:
				// buscar
				keyPress();
				break;
			case 4:
				// apagar
				keyPress();
				break;
			case 5:
				// atualizar
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
