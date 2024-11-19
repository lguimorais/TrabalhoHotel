package Pagamentos;

import java.util.Scanner;
import EstadiaT.Estadia;
import CadastrosDeQuartos.quartoStandard;

public class Pagamentos {
    String hospede;
    int inputPag = 0;

    // Códigos para cores
    // -=-=-=-=--=--=---=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BOLD = "\u001B[1m";
    // -=-=-=-=--=--=---=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-

    public void realizarPagamento(Estadia estadia, Scanner inputP) {
        this.hospede = estadia.getNomeCliente();

        // Calcula o valor base da estadia
        double valorBase = estadia.calcularCusto();
        double valorExtra = 0.0;

        // Solicitar valores adicionais, garantindo que seja um número
        while (true) {
            System.out.print("Digite o valor extra para adicionar ao total (apenas números, ou 0 para nenhum): ");
            if (inputP.hasNextDouble()) {
                valorExtra = inputP.nextDouble();
                inputP.nextLine(); // Limpar o buffer do scanner
                break; // Sai do loop se o valor for válido
            } else {
                System.out.println(RED + "Valor inválido. Por favor, insira apenas números." + RESET);
                inputP.nextLine(); // Limpar o buffer do scanner em caso de erro
            }
        }

        double valorTotal = valorBase + valorExtra;

        while (true) {
            // Exibe o menu de pagamento
            System.out.println(" ");
            System.out.println(BRIGHT_BLACK + "┌—————————————————————————————————————————————————┐");
            System.out.println("│               " + BRIGHT_WHITE + BOLD + "MÉTODO DE PAGAMENTO" + RESET + BRIGHT_BLACK + "               │");
            System.out.println("├————————————————————————┬————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│    " + BRIGHT_WHITE + "1- PIX." + BRIGHT_BLACK + "             │" + RESET + BRIGHT_WHITE + "    2- DÉBITO." + BRIGHT_BLACK + "          │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                        │                        │");
            System.out.println("│    " + BRIGHT_WHITE + "3- CRÉDITO." + BRIGHT_BLACK + "         │" + RESET + BRIGHT_WHITE + "    4- VOLTAR." + BRIGHT_BLACK + "          │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┴————————————————————————┤");
            System.out.println("│                                                 │");
            System.out.println("│                    " + YELLOW + "R$ " + String.format("%.2f", valorTotal) + RESET + BRIGHT_BLACK + "               │");
            System.out.println("│                                                 │");
            System.out.println("└—————————————————————————————————————————————————┘" + RESET);
            System.out.print("-----> ");

            inputPag = inputP.nextInt();
            inputP.nextLine();

            try {
                switch (inputPag) {
                    case 1:
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        System.out.println(GREEN + "Pagamento via PIX de R$ " + String.format("%.2f", valorTotal) + "!" + RESET);
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        estadia.setPago(true); // Atualiza o status de pagamento
                        return;
                    case 2:
                    case 3:
                        solicitarSenha();
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        System.out.println(GREEN + "Pagamento via " + (inputPag == 2 ? "DÉBITO" : "CRÉDITO") + " de R$ " + String.format("%.2f", valorTotal) + "!" + RESET);
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        estadia.setPago(true); // Atualiza o status de pagamento
                        return;
                    case 4:
                        System.out.println(RED + "Voltando ao menu principal" + RESET);
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        return;
                    default:
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        System.out.println(RED + "Método de pagamento inválido. Tente novamente." + RESET);
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        Thread.sleep(1150);
                        System.out.print(".");
                        System.out.println(" ");
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(RED + "Erro no delay: " + e.getMessage() + RESET);
            }
        }
    }

    private void solicitarSenha() {
        try {
            java.io.Console console = System.console();
            if (console != null) {
                Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    System.out.println(" ");
                System.out.println("Por questões de segurança, sua senha não será exibida");
                char[] senhaArray = console.readPassword("Digite sua senha de 6 dígitos: ");
                if (senhaArray.length != 6) {
                    Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    System.out.println(" ");
                    System.out.println(RED + "Senha inválida. Deve conter exatamente 6 dígitos." + RESET);
                    solicitarSenha();
                }
            } else {
                Scanner scanner = new Scanner(System.in);
                Thread.sleep(1150);
                System.out.print(".");
                Thread.sleep(1150);
                System.out.print(".");
                Thread.sleep(1150);
                System.out.print(".");
                System.out.println(" ");
                System.out.print("Digite sua senha de 6 dígitos: ");
                String senha = scanner.nextLine();
                if (senha.length() != 6) {
                    Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    Thread.sleep(1150);
                    System.out.print(".");
                    System.out.println(" ");
                    System.out.println(RED + "Senha inválida. Deve conter exatamente 6 dígitos." + RESET);
                    solicitarSenha();
                }
            }
        } catch (Exception e) {
            System.out.println(RED + "Erro na solicitação de senha: " + e.getMessage() + RESET);
        }
    }
}
