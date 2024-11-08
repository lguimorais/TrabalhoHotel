import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastrosServicos {
    String nomeServico;
    int precoServico;
    int escolhaServico = -1;

    public CadastrosServicos(String nomeServico, int precoServico) {
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
    }

    public void salvarCadastroServicosEmArquivo() {
        Scanner scanner = new Scanner(System.in);

        while (escolhaServico != 5) { // Continue enquanto a escolha não for 'Voltar'
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│              CADASTROS DE SERVIÇOS.             │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│    1- Ser. de Spa.     │ 2- Ser. de Lavanderia. │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  3- Ser. de Refeição.  │   4- Ser. de Limpeza.  │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┴————————————————————————┤");
            System.out.println("│                                                 │");
            System.out.println("│                   5- Voltar.                    │");
            System.out.println("│                                                 │");
            System.out.println("└—————————————————————————————————————————————————┘");
            System.out.print("-> ");
            int escolhaServico = scanner.nextInt();
            scanner.nextLine(); // Consome a linha em branco que fica após o nextInt()

            switch (escolhaServico) {
                case 1:
                    cadastrarServico(scanner, "SPA", "C:\\Hotel\\Serviços\\ServicoSpa.txt");
                    break;
                case 2:
                    cadastrarServico(scanner, "Lavanderia", "C:\\Hotel\\Serviços\\ServicoLavanderia.txt");
                    break;
                case 3:
                    cadastrarServico(scanner, "Refeição", "C:\\Hotel\\Serviços\\ServicoRefeicao.txt");
                    break;
                case 4:
                    cadastrarServico(scanner, "Limpeza", "C:\\Hotel\\Serviços\\ServicoLimpeza.txt");
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarServico(Scanner scanner, String tipoServico, String caminhoArquivo) {
        try (FileWriter escritor = new FileWriter(caminhoArquivo, true)) {
            System.out.println("Qual tipo de serviço (nome) de '" + tipoServico + "' você quer adicionar?");
            System.out.print("-> ");
            nomeServico = scanner.nextLine();
            escritor.write("Nome do Serviço: " + nomeServico + "\n");

            System.out.println("Qual o preço deste serviço de '" + tipoServico + "'?");
            System.out.print("-> ");
            precoServico = scanner.nextInt();
            scanner.nextLine(); // Consome a linha em branco após o nextInt()
            escritor.write("Preço do Serviço: " + precoServico + "\n");

            System.out.println("Serviço de " + tipoServico + " cadastrado com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao salvar cadastro: " + e.getMessage());
        }
    }
}
