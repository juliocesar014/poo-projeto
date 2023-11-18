import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente gerente = new Gerente("João", 5000, 1000);
        Caixa caixa = new Caixa("Maria", 3000, 20);
        Escriturario escriturario = new Escriturario("Carlos", 2500);

        try {
            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Acessar perfil do Gerente");
                System.out.println("2. Acessar perfil do Caixa");
                System.out.println("3. Acessar perfil do Escriturário");
                System.out.println("0. Sair");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Informe o novo salário para o Gerente:");
                        double novoSalarioGerente = scanner.nextDouble();
                        gerente = new Gerente(gerente.getNome(), novoSalarioGerente, gerente.getBonus());
                        break;
                    case 2:
                        System.out.println("Informe o novo salário para o Caixa:");
                        double novoSalarioCaixa = scanner.nextDouble();
                        caixa = new Caixa(caixa.getNome(), novoSalarioCaixa, caixa.getHorasExtras());
                        break;
                    case 3:
                        System.out.println("Informe o novo salário para o Escriturário:");
                        double novoSalarioEscriturario = scanner.nextDouble();
                        escriturario = new Escriturario(escriturario.getNome(), novoSalarioEscriturario);
                        break;
                    case 0:
                        System.out.println("Saindo do programa. Adeus!");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

                System.out.println("\nInformações do Gerente:");
                gerente.exibirInformacoes();
                System.out.println("Salário Final: R$" + gerente.calcularSalarioFinal());

                System.out.println("\nInformações do Caixa:");
                caixa.exibirInformacoes();
                System.out.println("Salário Final: R$" + caixa.calcularSalarioFinal());

                System.out.println("\nInformações do Escriturário:");
                escriturario.exibirInformacoes();
                System.out.println("Salário Final: R$" + escriturario.calcularSalarioFinal());
            }
        } finally {
            scanner.close();
        }
    }
}
