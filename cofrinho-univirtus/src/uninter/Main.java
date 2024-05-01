package uninter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover valor de uma moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	System.out.print("Digite o nome da moeda (Dólar, Euro, Real): ");
                    String nomeMoeda = scanner.next();
                    System.out.print("Digite o valor da moeda: ");
                    double valorMoeda = scanner.nextDouble();
                    Moeda novaMoeda = null;
                    switch (nomeMoeda) {
                        case "Dólar":
                            novaMoeda = new Dolar(valorMoeda);
                            break;
                        case "Euro":
                            novaMoeda = new Euro(valorMoeda);
                            break;
                        case "Real":
                            novaMoeda = new Real(valorMoeda);
                            break;
                        default:
                            System.out.println("Moeda não reconhecida.");
                            break;
                    }
                    if (novaMoeda != null) {
                        cofrinho.adicionarMoeda(novaMoeda);
                        System.out.println("Moeda adicionada com sucesso.");
                    }

                    break;
                case 2:
                	System.out.print("Digite o nome da moeda: ");
                    String nomeMoedaString = scanner.next();
                    System.out.print("Digite o valor a ser removido: ");
                    double valorRemover = scanner.nextDouble();
                    cofrinho.removerMoeda(nomeMoedaString, valorRemover);

                    break;
                case 3:
                	cofrinho.listarMoedas();

                    break;
                case 4:
                	double totalReal = cofrinho.calcularTotalEmReal();
                    System.out.println("Total em Real: " + totalReal);
                   
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}
