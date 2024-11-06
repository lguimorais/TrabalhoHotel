import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner scanf = new Scanner(System.in);
        quartoStandard quartoStandard = new quartoStandard(150.0, true, false, false, false, false, 1, 1, 0);

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
        if (escolha == 1){
            quartoStandard.salvarCadastroEmArquivo("CadastroQuartos.txt");
        } else {
            System.out.println("saindo...");
        }
    }
}
