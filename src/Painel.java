import java.util.Scanner;
import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;

public class Painel {
    private Scanner scanf = new Scanner(System.in);

    public void painel1(){

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
        scanf.nextLine();

        switch (escolha) {

            case 1:
                painel2();
                break;
            case 0:
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;


        }
    }

    public void painel2(){
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

        int escolha = scanf.nextInt();
        scanf.nextLine();

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
            default:
                System.out.println("Opção não reconhecida, voltando ao menu principal.");
                break;
        }


    }
}
