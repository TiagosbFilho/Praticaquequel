package loja;

import repositorio.*;

import listas.*;
import java.awt.image.DataBufferDouble;
import java.util.Scanner;

public class SuperLojas {

	static SuperLojas[] lista = new SuperLojas[0];
	static int cont;

	static ListaBrinquedos dd = new ListaBrinquedos();
	static Carrinho in = new Carrinho();
	// Classe Carrinho (carrrinho, cod, descricao, preco, quantidade)

	public static void main(String[] args) {

		int cont;

		Scanner input = new Scanner(System.in);

		int opcao = 0;
		System.out.println(in.produtos);
		in.listaTelevisor();
		in.addProduto();
		in.listaTelevisor();
		
		do {

			System.out.println("1 -> Adicionar produto ao carrinho\n" + "2 -> Remover produto do carrinho\n"
					+ "3 -> Visualizar carrinho de compras\n" + "4 -> Finalizar a compra\n" + "5 -> Cancelar compra");
			opcao = input.nextInt();
			switch (opcao) {

			case 1:
				Adicionar();
				break;
			case 2: // Remover();
				break;
			case 3: // Visualizar
				break;

			case 4: // Finalizar();
				break;
			case 5: // Cancelar();
			}

		} while (opcao > 0 && opcao < 6);

	}

	public static void Adicionar() {
		int escolha;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o produto da sua escolha?");
		System.out.println("1 -> Brinquedos");
		System.out.println("2 -> Televisores");
		escolha = input.nextInt();

		switch (escolha) {
		case 1:
			dd.listaBrinquedo();
			// Pergunta qual codigo quer inserir
			int cod;
			System.out.println("Insira o código referente ao brinquedo da sua escolha: ");
			cod = input.nextInt();
			Brinquedo b = dd.getBrinquedo(cod);

			if (cod == b.getCodigo()) {
				int d;
				System.out.println("Quantos deseja? ");
				d = input.nextInt();
				
			} else {

				System.out.println("no");
			}

		}
		;
		// Digita o codigo desejado

		// chama o getBrinquedo(codigo)
		// Verifica se é um brinquedo ou um brinquedo vazio
		// se for vazio faz nada
		// se existir pergunta a quantidade
		// armazena a quantidade
		// adiciona o brinquedo e a quantidade addBrinquedo(brinquedo, qtd)

	}

}

// Carrinho
/*
 * Add Carrinho -> percorer todo o array de carrinho e verificar se
 * brinqued.godigo existe no carrinho nao existe adicione no carrinho o
 * brinquedo e quantidade existe no carrinho, alterar a quantidade do produto
 * (produto.quantidade + qtd)
 */
