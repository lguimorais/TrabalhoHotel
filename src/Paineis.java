import java.util.Scanner;
import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;
import CadastrosDeHospedes.CadastrosHospedes;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Paineis {
    Scanner scanf = new Scanner(System.in);

    quartoStandard quartoStandard = new quartoStandard(0, 150.0, true, false, false, false, false, true, 1, 1, 0, 50);
    quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, true, 1, 2, 1, 100);
    quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, true, 2, 3, 1, 150);
    CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);
    CadastrosServicos servicos = new CadastrosServicos("SPA", 100);


    public void painelCadastro() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│               CADASTROS DO HOTEL.               │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  1- Quarto Standard.   │    2- Quarto Suite.    │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│    3- Quarto Luxo.     │      4- Hóspedes.      │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│ 5- Serviços de Quarto. │       0- Voltar.       │");
            System.out.println("│                        │                        │");
            System.out.println("└————————————————————————┴————————————————————————┘");
            System.out.print("-> ");
            int escolhaCadastro = 0;

            if (scanf.hasNextInt()) { // Verifica se há um inteiro disponível
                escolhaCadastro = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();  // Limpa a linha após erro
                continue;
            }
            scanf.nextLine();  // Limpa a linha após nextInt()

            switch (escolhaCadastro) {
                case 1:
                    quartoStandard.salvarCadastroQuartosEmArquivo("Quartos Standard.txt", hospedes);
                    break;
                case 2:
                    quartoSuite.salvarCadastroQuartosEmArquivo("Quartos Suite.txt", hospedes);
                    break;
                case 3:
                    quartoLuxo.salvarCadastroQuartosEmArquivo("Quartos Luxo.txt", hospedes);
                    break;
                case 4:
                    hospedes.salvarCadastroHospedesEmArquivo("Hóspedes.txt");
                    break;
                case 5:
                    servicos.salvarCadastroServicosEmArquivo();
                    break;
                case 0:
                    System.out.println("Voltando ao menu inicial...");
                    return;  // Sai do método e retorna ao menu inicial
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public void painelListagens() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│               CADASTROS DO HOTEL.               │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  1- Abrir Cadastros.   │   2- Abrir Hóspedes.   │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  3- Abrir Serviços.    │       0- Voltar.       │");
            System.out.println("│                        │                        │");
            System.out.println("└————————————————————————┴————————————————————————┘");
            System.out.print("-> ");
            int escolhaCadastro = 0;

            if (scanf.hasNextInt()) { // Verifica se há um inteiro disponível
                escolhaCadastro = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();  // Limpa a linha após erro
                continue;
            }
            scanf.nextLine();  // Limpa a linha após nextInt()

            switch (escolhaCadastro) {
                case 1:
                    painelAbrirCadastros();
                    break;
                case 2:
                    painelAbrirHospedes();
                    break;
                case 3:
                    painelAbrirServicos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu inicial...");
                    return;  // Sai do método e retorna ao menu inicial
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public void painelAbrirCadastros() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│            ESCOLHA O TIPO DE QUARTO.            │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  1- Quartos Standard.  │  2- Quartos Suite.     │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│    3- Quartos Luxo.    │    4- Voltar.          │");
            System.out.println("│                        │                        │");
            System.out.println("└————————————————————————┴————————————————————————┘");
            System.out.print("-> ");
            int escolhaCadastro = 0;

            if (scanf.hasNextInt()) {
                escolhaCadastro = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();
                continue;
            }
            scanf.nextLine();

            switch (escolhaCadastro) {
                case 1:
                    abrirDiretorio("C:\\Hotel\\Quartos\\Quartos Standard.txt");
                    break;
                case 2:
                    abrirDiretorio("C:\\Hotel\\Quartos\\Quartos Suite.txt");
                    break;
                case 3:
                    abrirDiretorio("C:\\Hotel\\Quartos\\Quartos Luxo.txt");
                    break;
                case 0:
                    System.out.println("Voltando ao menu de cadastros...");
                    return;  // Volta para o menu anterior
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void painelAbrirHospedes() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│             ABRIR ARQUIVO DE HÓSPEDES.          │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│   1- Ver Hóspedes.     │       0- Voltar.       │");
            System.out.println("│                        │                        │");
            System.out.println("└————————————————————————┴————————————————————————┘");
            System.out.print("-> ");
            int escolhaHospedes = 0;

            if (scanf.hasNextInt()) {
                escolhaHospedes = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();
                continue;
            }
            scanf.nextLine();

            switch (escolhaHospedes) {
                case 1:
                    abrirDiretorio("C:\\Hotel\\Hóspedes\\Cadastros Hospedes.txt");
                    break;
                case 0:
                    return;  // Volta ao menu anterior
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public void painelAbrirServicos() {
        while (true) {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│           ESCOLHA O SERVIÇO PARA VER.           │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│   1- Serviço SPA.      │ 2- Serviço Lavanderia. │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│  3- Serviço Refeição.  │  4- Serviço Limpeza.   │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┴————————————————————————┤");
            System.out.println("│                                                 │");
            System.out.println("│                  5- Voltar.                     │");
            System.out.println("│                                                 │");
            System.out.println("└—————————————————————————————————————————————————┘");
            System.out.print("-> ");
            int escolhaServico = 0;

            if (scanf.hasNextInt()) {
                escolhaServico = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();
                continue;
            }
            scanf.nextLine();

            switch (escolhaServico) {
                case 1:
                    abrirDiretorio("C:\\Hotel\\Serviços\\Servico Spa.txt");
                    break;
                case 2:
                    abrirDiretorio("C:\\Hotel\\Serviços\\Servico Lavanderia.txt");
                    break;
                case 3:
                    abrirDiretorio("C:\\Hotel\\Serviços\\Servico Refeicao.txt");
                    break;
                case 4:
                    abrirDiretorio("C:\\Hotel\\Serviços\\Servico Limpeza.txt");
                    break;
                case 5:
                    return;  // Volta ao menu anterior
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void abrirDiretorio(String caminho) {
        File arquivo = new File(caminho);
        if (arquivo.exists()) {
            try (java.util.Scanner scanner = new java.util.Scanner(arquivo)) {
                System.out.println("Conteúdo do arquivo " + caminho + ":");
                while (scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
                    System.out.println(linha);
                }
            } catch (IOException e) {
                System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("O arquivo não existe no caminho especificado: " + caminho);
        }
    }
}
