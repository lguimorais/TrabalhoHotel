import java.util.Scanner;
import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;

public class Painel {
    private boolean continuar = true; // Controla o loop principal
    private final Scanner scanf; // Scanner único e compartilhado

    // Instâncias das classes
    quartoStandard quartoStandard = new quartoStandard(0, 150.0, true, false, false, false, false, true, 1, 1, 0);
    quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, true, 1, 2, 1);
    quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, true, 2, 3, 1);
    CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);
    CadastrosServicos servicos = new CadastrosServicos("SPA", 100);

    public Painel(Scanner scanf) {
        this.scanf = scanf;
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void painel1() {
        try {
            System.out.println("┌—————————————————————————————————————————————————┐");
            System.out.println("│       SISTEMA PRIVADO DO HOTEL BET-CUSCUZ       │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│      1- Cadastros.     │      0- Sair.          │");
            System.out.println("│                        │                        │");
            System.out.println("└————————————————————————┴————————————————————————┘");
            System.out.print("-> ");

            if (!scanf.hasNextInt()) { // Valida se a entrada é um número
                System.out.println("Entrada inválida! Digite um número.");
                scanf.nextLine(); // Descarta a entrada inválida
                return;
            }

            int escolha = scanf.nextInt();
            scanf.nextLine(); // Limpa o buffer

            switch (escolha) {
                case 1:
                    painel2();
                    break;
                case 0:
                    continuar = false; // Finaliza o programa
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            if (scanf.hasNextLine()) {
                scanf.nextLine(); // Limpa o buffer se necessário
            }
        }
    }

    public void painel2() {
        boolean voltar = false;

        while (!voltar) {
            try {
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
                System.out.println("│ 5- Serviços de Quarto. │       6- Voltar.       │");
                System.out.println("│                        │                        │");
                System.out.println("└————————————————————————┴————————————————————————┘");
                System.out.print("-> ");

                if (!scanf.hasNextInt()) {
                    System.out.println("Entrada inválida! Digite um número.");
                    scanf.nextLine(); // Limpa a entrada inválida
                    continue;
                }

                int escolha = scanf.nextInt();
                scanf.nextLine(); // Limpa o buffer

                switch (escolha) {
                    case 1:
                        quartoStandard.salvarCadastroQuartosEmArquivo("Quartos Standard.txt");
                        break;
                    case 2:
                        quartoSuite.salvarCadastroQuartosEmArquivo("Quartos Suite.txt");
                        break;
                    case 3:
                        quartoLuxo.salvarCadastroQuartosEmArquivo("Quartos Luxo.txt");
                        break;
                    case 4:
                        hospedes.salvarCadastroHospedesEmArquivo("Hóspedes.txt");
                        break;
                    case 5:
                        servicos.salvarCadastroServicosEmArquivo();
                        break;
                    case 6:
                        voltar = true; // Sai do loop do submenu
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                if (scanf.hasNextLine()) {
                    scanf.nextLine(); // Limpa o buffer
                }
            }
        }
    }
}


