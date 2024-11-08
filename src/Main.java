import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolhaInicial = -1;
        Scanner scanf = new Scanner(System.in);

        quartoStandard quartoStandard = new quartoStandard(0, 150.0, true, false, false, false, false, true, 1, 1, 0);
        quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, true, 1, 2, 1);
        quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, true, 2, 3, 1);
        CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);
        CadastrosServicos servicos = new CadastrosServicos("SPA", 100);

        new File("C:\\Hotel").mkdir();
        new File("C:\\Hotel\\Quartos").mkdir();
        new File("C:\\Hotel\\Hóspedes").mkdir();
        new File("C:\\Hotel\\Serviços").mkdir();

        while (escolhaInicial != 0) {
            try {
                System.out.println("┌—————————————————————————————————————————————————┐");
                System.out.println("│       SISTEMA PRIVADO DO HOTEL BET-CUSCUZ       │");
                System.out.println("├————————————————————————┬————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│      1- Cadastros.     │      1- Cadastros.     │");
                System.out.println("│                        │                        │");
                System.out.println("├————————————————————————┼————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│      1- Cadastros.     │      1- Cadastros.     │");
                System.out.println("│                        │                        │");
                System.out.println("├————————————————————————┼————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│      1- Cadastros.     │      1- Cadastros.     │");
                System.out.println("│                        │                        │");
                System.out.println("└————————————————————————┴————————————————————————┘");
                System.out.print("-> ");
                int escolha = scanf.nextInt();

                switch (escolha) {
                    case 1:
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
                        int escolha2 = scanf.nextInt();

                        switch (escolha2) {
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
                            default:
                                System.out.println("Opção não reconhecida, voltando ao menu principal.");
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }
        scanf.close();
    }
}
