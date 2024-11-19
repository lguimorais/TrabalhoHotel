import java.util.Scanner;
import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;
import CadastrosDeHospedes.CadastrosHospedes;

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
}
