import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 1;
        Scanner scanf = new Scanner(System.in);
        quartoStandard quartoStandard = new quartoStandard(0,150.0, true, false, false, false, false, 1, 1, 0);
        quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, 1, 2, 1);
        quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, 2, 3, 1);
        CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);

        boolean PastaQuartos = new File("C:\\Hotel\\" + "Quartos").mkdir();
        boolean PastaClientes = new File("C:\\Hotel\\" + "Hóspedes").mkdir();

        while (escolha != 0) {
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
                    System.out.println("│    3- Quarto Luxo.     │      4- Hóspede.       │");
                    System.out.println("│                        │                        │");
                    System.out.println("├————————————————————————┼————————————————————————┤");
                    System.out.println("│                        │                        │");
                    System.out.println("│      1- Cadastros.     │      1- Cadastros.     │");
                    System.out.println("│                        │                        │");
                    System.out.println("└————————————————————————┴————————————————————————┘");
                    escolha = scanf.nextInt();
                    if (escolha == 1) {
                        quartoStandard.salvarCadastroQuartosEmArquivo("Quartos Standard.txt");
                        break;
                    } if (escolha == 2) {
                        quartoSuite.salvarCadastroQuartosEmArquivo("Quartos Suite.txt");
                        break;
                    } if (escolha == 3) {
                        quartoLuxo.salvarCadastroQuartosEmArquivo("Quartos Luxo.txt");
                    break;
                    } if (escolha == 4) {
                        hospedes.salvarCadastroClientesEmArquivo("Hóspedes.txt");
                    break;
                    } if (escolha == 5) {
                    break;
                    } if (escolha == 6) {
                    break;
                    } else {
                    System.out.println("Não reconhecido, voltando à tela inicial.");
                        break;
                }
            }
        }
    }
}
