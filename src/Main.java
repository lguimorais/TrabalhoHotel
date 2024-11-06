import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 1;
        Scanner scanf = new Scanner(System.in);
        quartoStandard quartoStandard = new quartoStandard(150.0, true, false, false, false, false, 1, 1, 0);

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
                    System.out.println("│  1- Quarto Standard.   │    2- Quarto Luxo.     │");
                    System.out.println("│                        │                        │");
                    System.out.println("├————————————————————————┼————————————————————————┤");
                    System.out.println("│                        │                        │");
                    System.out.println("│    3- Quarto Suite.    │       4- Voltar.       │");
                    System.out.println("│                        │                        │");
                    System.out.println("└————————————————————————┴————————————————————————┘");
                    escolha = scanf.nextInt();
                    if (escolha == 1) {
                        quartoStandard.salvarCadastroEmArquivo("Quartos Standard.txt");
                        break;
                    } if (escolha == 2) {
                        break;
                    } if (escolha == 3) {
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
