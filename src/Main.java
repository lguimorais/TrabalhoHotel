import EstadiaT.relatorios;
import java.io.File;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Criar diretórios necessários
        new File("C:\\Hotel").mkdir();
        new File("C:\\Hotel\\Quartos").mkdir();
        new File("C:\\Hotel\\Hóspedes").mkdir();
        new File("C:\\Hotel\\Serviços").mkdir();

        // Instanciando as classes
        Paineis painelCadastro = new Paineis();
        relatorios relatorios = new relatorios();

        while (true) {
            try {
                System.out.println("┌—————————————————————————————————————————————————┐");
                System.out.println("│           SISTEMA DO MOTEL BET-CUSCUZ.          │");
                System.out.println("├————————————————————————┬————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│     1- Cadastros.      │    2- Relatórios.      │");
                System.out.println("│                        │                        │");
                System.out.println("├————————————————————————┴————————————————————————┤");
                System.out.println("│                                                 │");
                System.out.println("│                    0- Sair.                     │");
                System.out.println("│                                                 │");
                System.out.println("└—————————————————————————————————————————————————┘");
                System.out.print("-> ");
                int escolha = 0;

                if (scanf.hasNextInt()) {
                    escolha = scanf.nextInt();
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanf.nextLine(); // Limpa a entrada
                    continue; // Retorna ao início do loop
                }
                scanf.nextLine(); // Limpa a linha após nextInt()

                switch (escolha) {
                    case 1:
                        painelCadastro.painelCadastro();
                        System.out.println("Voltando ao Menu...");
                        Utilitarios.exibirMensagemComPausa("Voltando ao menu...", 2000, 50);
                        break;
                    case 2:
                        relatorios.Relatorios();
                        Utilitarios.exibirMensagemComPausa("Voltando ao menu...", 2000, 50);
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        return; // Encerra o programa corretamente
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                scanf.nextLine(); // Limpa a entrada após erro
            } catch (NoSuchElementException e) {
                System.out.println("Erro: Entrada inesperada. Por favor, tente novamente.");
            } catch (IllegalStateException e) {
                System.out.println("Erro: Scanner foi fechado. Não é possível continuar.");
            }
        }
    }
}
