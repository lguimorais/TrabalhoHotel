import EstadiaT.relatorios;

import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

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
            System.out.println("│     1- Cadastros.      │    2- Relatorios.      │");
            System.out.println("│                        │                        │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.println("│                                                 │");
            System.out.println("│              3- Voltar.                         │");
            System.out.println("│                                                 │");
            System.out.println("├————————————————————————┼————————————————————————┤");
            System.out.print("-> ");
            int escolha = 0;
            if (scanf.hasNextInt()) {
                escolha = scanf.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();
                continue;
            }
            scanf.nextLine();

            switch (escolha) {
                case 1:
                    painelCadastro.painelCadastro();
                    break;
                case 2:
                    relatorios.Relatorios();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

            // TRATAMENTO DE ERROS.
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                scanf.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Erro: Entrada inesperada. Por favor, tente novamente.");
                break;
            } catch (IllegalStateException e) {
                System.out.println("Erro: Scanner foi fechado. Não é possível continuar.");
                break;
            }
        }
    }
}

