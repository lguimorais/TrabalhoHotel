package CadastrosDeQuartos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class CadastrosQuartos {
    int numeroQuarto;
    double preco;
    boolean temBanheiro;
    boolean temTelevisao;
    boolean temFrigobar;
    boolean temArCondicionado;
    boolean temWifi;
    boolean estaDisponivel;
    int quantiaBanheiros;
    int quantiaCamasSolteiros;
    int quantiaCamasCasal;

    public CadastrosQuartos(int numeroQuarto, double preco, boolean temBanheiro, boolean temTelevisao, boolean temFrigobar, boolean temArCondicionado, boolean temWifi, boolean estaDisponivel, int quantiaBanheiros, int quantiaCamasSolteiros, int quantiaCamasCasal) {
        this.numeroQuarto = numeroQuarto;
        this.preco = preco;
        this.temBanheiro = temBanheiro;
        this.temTelevisao = temTelevisao;
        this.temFrigobar = temFrigobar;
        this.temArCondicionado = temArCondicionado;
        this.temWifi = temWifi;
        this.estaDisponivel = estaDisponivel;
        this.quantiaBanheiros = quantiaBanheiros;
        this.quantiaCamasSolteiros = quantiaCamasSolteiros;
        this.quantiaCamasCasal = quantiaCamasCasal;
    }

    public void salvarCadastroQuartosEmArquivo(String CadastrosQuartos) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter escritor = new FileWriter("C:\\Hotel\\" + "Quartos\\" + CadastrosQuartos, true)) {
            // Definir número de quarto.
            System.out.println("Informe o número do quarto: ");
            numeroQuarto = scanner.nextInt();
            escritor.write("Número do Quarto: " + numeroQuarto + "\n");

            // Definir preço.
            System.out.println("Informe o preço do quarto: ");
            preco = scanner.nextDouble();
            escritor.write("Preço: " + preco + "\n");

            // Definir se tem banheiro.
            System.out.println("O quarto tem banheiro? (true/false): ");
            temBanheiro = scanner.nextBoolean();
            escritor.write("Tem Banheiro: " + temBanheiro + "\n");

            // Definir se tem televisão.
            System.out.println("O quarto tem televisão? (true/false): ");
            temTelevisao = scanner.nextBoolean();
            escritor.write("Tem Televisão: " + temTelevisao + "\n");

            // Definir se tem frigobar.
            System.out.println("O quarto tem frigobar? (true/false): ");
            temFrigobar = scanner.nextBoolean();
            escritor.write("Tem Frigobar: " + temFrigobar + "\n");

            // Definir se tem ar condicionado.
            System.out.println("O quarto tem ar condicionado? (true/false): ");
            temArCondicionado = scanner.nextBoolean();
            escritor.write("Tem Ar Condicionado: " + temArCondicionado + "\n");

            // Definir se tem wi-fi.
            System.out.println("O quarto tem Wifi próprio? (true/false): ");
            temWifi = scanner.nextBoolean();
            escritor.write("Tem Wifi: " + temWifi + "\n");

            // Definir banheiros.
            System.out.println("Quantos banheiros o quarto possui? ");
            quantiaBanheiros = scanner.nextInt();
            escritor.write("Quantidade de Banheiros: " + quantiaBanheiros + "\n");

            // Definir camas de solteiro.
            System.out.println("Quantas camas de solteiro o quarto possui? ");
            quantiaCamasSolteiros = scanner.nextInt();
            escritor.write("Quantidade de Camas Solteiro: " + quantiaCamasSolteiros + "\n");

            // Definir camas de casal.
            System.out.println("Quantas camas de casal o quarto possui? ");
            quantiaCamasCasal = scanner.nextInt();
            escritor.write("Quantidade de Camas Casal: " + quantiaCamasCasal + "\n");

            escritor.write("———————————————————————————————————————————————\n");
            System.out.println("Cadastro do quarto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar cadastro: " + e.getMessage());
        }
    }
}

