import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = -1;
        Scanner scanf = new Scanner(System.in);

        quartoStandard quartoStandard = new quartoStandard(0, 150.0, true, false, false, false, false, 1, 1, 0);
        quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, 1, 2, 1);
        quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, 2, 3, 1);
        CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);

        new File("C:\\Hotel").mkdir();
        new File("C:\\Hotel\\Quartos").mkdir();
        new File("C:\\Hotel\\Hóspedes").mkdir();

        while (escolha != 0) {
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
                escolha = scanf.nextInt();

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
                        System.out.println("│      1- Cadastros.     │      1- Cadastros.     │");
                        System.out.println("│                        │                        │");
                        System.out.println("└————————————————————————┴————————————————————————┘");
                        System.out.print("-> ");
                        int cadastroEscolha = scanf.nextInt();

                        switch (cadastroEscolha) {
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
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanf.nextLine();
            }
        }
        scanf.close();
    }
}
