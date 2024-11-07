import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 1;
        Scanner scanf = new Scanner(System.in);
        quartoStandard quartoStandard = new quartoStandard(0,150.0, true, false, false, false, false, 1, 1, 0);
        quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, 1, 2, 1);
        quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, 2, 3, 1);

        boolean teste = new File("C:\\Hotel\\" + "Quartos").mkdir();

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
                    System.out.println("│              CADASTROS DE QUARTOS.              │");
                    System.out.println("├————————————————————————┬————————————————————————┤");
                    System.out.println("│                        │                        │");
                    System.out.println("│  1- Quarto Standard.   │    2- Quarto Suite.     │");
                    System.out.println("│                        │                        │");
                    System.out.println("├————————————————————————┼————————————————————————┤");
                    System.out.println("│                        │                        │");
                    System.out.println("│    3- Quarto Luxo.     │       4- Voltar.       │");
                    System.out.println("│                        │                        │");
                    System.out.println("└————————————————————————┴————————————————————————┘");
                    escolha = scanf.nextInt();
                    if (escolha == 1) {
                        quartoStandard.salvarCadastroEmArquivo("Quartos Standard.txt");
                        break;
                    } if (escolha == 2) {
                        quartoSuite.salvarCadastroEmArquivo("Quartos Suite.txt");
                        break;
                    } if (escolha == 3) {
                        quartoLuxo.salvarCadastroEmArquivo("Quartos Luxo.txt");
                        break;
                    } if (escolha == 4) {
                        break;
                    } else {
                    System.out.println("Não reconhecido, voltando à tela inicial.");
                        break;
                }
            }
        }
    }
}
