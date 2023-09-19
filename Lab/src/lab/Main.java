package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nomeAluno = scanner.nextLine();

	        System.out.print("Digite o número de matrícula do aluno: ");
	        int numeroMatriculaAluno = scanner.nextInt();
	        scanner.nextLine();  

	        Aluno aluno = new Aluno(nomeAluno, numeroMatriculaAluno);
	        Vendas venda = new Vendas(aluno);

	        while (true) {
	            System.out.println("\nMenu de opções:");
	            System.out.println("1. Comprar cachorro-quente");
	            System.out.println("2. Encerrar compra e mostrar detalhes");
	            System.out.println("3. Sair");

	            int escolha = scanner.nextInt();
	            scanner.nextLine();  // Consumir a nova linha

	            if (escolha == 1) {
	                System.out.println("\nEscolha a proteína do cachorro-quente (salsicha, linguiça, frango ou bacon): ");
	                String proteina = scanner.nextLine();

	                System.out.println("Escolha o queijo do cachorro-quente (mussarela, prato, parmesão ou coalho): ");
	                String queijo = scanner.nextLine();

	                List<String> ingredientesAdicionais = new ArrayList<>();
	                System.out.println("Deseja adicionar maionese? (S/N): ");
	                if (scanner.nextLine().equalsIgnoreCase("S")) {
	                    ingredientesAdicionais.add("maionese");
	                }
	                System.out.println("Deseja adicionar ketchup? (S/N): ");
	                if (scanner.nextLine().equalsIgnoreCase("S")) {
	                    ingredientesAdicionais.add("ketchup");
	                }
	                System.out.println("Deseja adicionar ovo? (S/N): ");
	                if (scanner.nextLine().equalsIgnoreCase("S")) {
	                    ingredientesAdicionais.add("ovo");
	                }
	                System.out.println("Deseja adicionar batata palha? (S/N): ");
	                if (scanner.nextLine().equalsIgnoreCase("S")) {
	                    ingredientesAdicionais.add("batata palha");
	                }

	                System.out.println("Escolha a bebida (Coca-cola, Del Rio ou Suco do Chaves): ");
	                String bebida = scanner.nextLine();

	                CachorroQuente cachorroQuente = new CachorroQuente(proteina, queijo, ingredientesAdicionais, bebida);
	                venda.adicionarCachorroQuente(cachorroQuente);
	                System.out.println("Cachorro-quente adicionado à venda.");
	            } else if (escolha == 2) {
	                System.out.println("\nDetalhes da venda:");
	                System.out.println("Aluno: " + venda.getAluno().getNome() + " (Matrícula: " + venda.getAluno().getNumeroMatricula() + ")");
	                System.out.println("Cachorros-quentes comprados:");
	                for (CachorroQuente cachorroQuente : venda.getCachorrosQuentes()) {
	                    System.out.println("Proteína: " + cachorroQuente.getProteina());
	                    System.out.println("Queijo: " + cachorroQuente.getQueijo());
	                    System.out.println("Ingredientes adicionais: " + cachorroQuente.getIngredientesAdicionais());
	                    System.out.println("Bebida: " + cachorroQuente.getBebida());
	                    System.out.println("-------------------");
	                }
	                System.out.println("Total de cachorros-quentes: " + venda.getCachorrosQuentes().size());
	            } else if (escolha == 3) {
	                break;
	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }
	        }

	        scanner.close();
	    }
		
		
		
	
	
	
		
		
	}


