package Livraria.main;

import Livraria.model.Livro;
import Livraria.service.LivrariaService;

import java.util.Scanner;

public class LivrariaMain {
    public static void main(String[] args) {

        LivrariaService service = new LivrariaService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===Sistema de Livraria===");
            System.out.println("1.Adicionar Livro");
            System.out.println("2.Listar Livros");
            System.out.println("3.Buscar Livro por Título");
            System.out.println("4.Remover Livro");
            System.out.println("5.Sair");
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine(); //Consumir a linha para evitar erros

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o preço do livro:");
                    Double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade em estoque:");
                    int estoque = scanner.nextInt();
                    scanner.nextLine();

                    service.adicionarLivro(new Livro(titulo, autor, preco, estoque));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    service.listartLivros();
                    break;
                case 3:
                    System.out.println("Digite o título do livro que deseja buscar:");
                    String buscarTitulo = scanner.nextLine();
                    Livro livro = service.buscarLivroPorTitulo(buscarTitulo);

                    if (livro != null) {
                        System.out.println(livro);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o título do livro que deseja remover:");
                    String removeTitulo = scanner.nextLine();

                    if (service.removerLivro(removeTitulo)) {
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
