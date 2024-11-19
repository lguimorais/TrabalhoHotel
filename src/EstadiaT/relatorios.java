package EstadiaT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Pagamentos.Pagamentos;

public class relatorios {
    Scanner scanner = new Scanner(System.in);
    GerenciadorDeEstadias gerenciador = new GerenciadorDeEstadias();
    Pagamentos pagamentos = new Pagamentos();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public void Relatorios() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│        MENU DE GERENCIAMENTO DE ESTADIAS.       │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  1- Adicionar Estadia. │  2- Listar Estadias.   │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  3- Salvar em Arquivo. │ 4- Realizar Pagamento. │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┴————————————————————————┤");
            System.out.println("│                                                 │");
            System.out.println("│                   5- Voltar.                    │");
            System.out.println("│                                                 │");
            System.out.println("└—————————————————————————————————————————————————┘");
            System.out.print("-> Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("Digite os serviços consumidos (separados por vírgula): ");
                    String servicos = scanner.nextLine();
                    List<String> servicosConsumidos = List.of(servicos.split(",\\s*"));

                    System.out.print("Horário de Entrada (dd/MM/yyyy HH:mm): ");
                    LocalDateTime horarioEntrada;
                    try {
                        horarioEntrada = LocalDateTime.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Formato de data inválido!");
                        break;
                    }

                    System.out.print("Horário de Saída (dd/MM/yyyy HH:mm): ");
                    LocalDateTime horarioSaida;
                    try {
                        horarioSaida = LocalDateTime.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Formato de data inválido!");
                        break;
                    }

                    Estadia estadia = new Estadia(nomeCliente, servicosConsumidos, horarioEntrada, horarioSaida);
                    gerenciador.adicionarEstadia(estadia);
                    System.out.println("Estadia adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- Listagem de Estadias ---");
                    gerenciador.listarEstadias();
                    break;
                case 3:
                    System.out.print("Digite o nome do arquivo para salvar as estadias: ");
                    String nomeArquivo = scanner.nextLine();
                    gerenciador.salvarEstadiasEmArquivo(nomeArquivo);
                    break;
                case 4:
                    System.out.println("\n--- Realizar Pagamento ---");
                    System.out.print("Digite o índice da estadia (0 para listar todas): ");
                    int indiceEstadia = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    if (indiceEstadia == 0) {
                        System.out.println("\n--- Listagem de Estadias ---");
                        gerenciador.listarEstadias();
                        break;
                    }

                    // Obter estadia com base no índice
                    Estadia estadiaSelecionada;
                    try {
                        estadiaSelecionada = gerenciador.getEstadias().get(indiceEstadia - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Estadia inválida. Retornando ao menu.");
                        break;
                    }

                    // Verificar se já foi paga
                    if (estadiaSelecionada.isPago()) {
                        System.out.println("Pagamento já realizado para esta estadia. Retornando ao menu.");
                        break;
                    }

                    // Exibir informações da estadia
                    System.out.println("\n--- Informações da Estadia ---");
                    System.out.println(estadiaSelecionada.formatarEstadia());

                    // Realizar o pagamento
                    pagamentos.realizarPagamento(estadiaSelecionada, scanner);

                    break;
                case 5:
                    System.out.println("Voltando ao Menu...");
                    return; // Sai do método e retorna ao menu principal
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
