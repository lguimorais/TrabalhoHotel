import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Cadastros {
    double preco;
    boolean temBanheiro;
    boolean temTelevisao;
    boolean temFrigobar;
    boolean temArCondicionado;
    boolean temWifi;
    int quantiaBanheiros;
    int quantiaCamasSolteiros;
    int quantiaCamasCasal;

    public Cadastros(double preco, boolean temBanheiro, boolean temTelevisao, boolean temFrigobar, boolean temArCondicionado, boolean temWifi, int quantiaBanheiros, int quantiaCamasSolteiros, int quantiaCamasCasal) {
        this.preco = preco;
        this.temBanheiro = temBanheiro;
        this.temTelevisao = temTelevisao;
        this.temFrigobar = temFrigobar;
        this.temArCondicionado = temArCondicionado;
        this.temWifi = temWifi;
        this.quantiaBanheiros = quantiaBanheiros;
        this.quantiaCamasSolteiros = quantiaCamasSolteiros;
        this.quantiaCamasCasal = quantiaCamasCasal;
    }

    public double getPreco() { return preco; }
    public boolean getTemBanhanheiro() { return temBanheiro; }
    public boolean getTemTelevisao() { return temTelevisao; }
    public boolean getTemFrigobar() { return temFrigobar; }
    public boolean getTemArCondicionado() { return temArCondicionado; }
    public boolean getTemWifi() { return temWifi; }
    public int getQuantiaBanheiros() { return quantiaBanheiros; }
    public int getQuantiaCamasSolteiros() { return quantiaCamasSolteiros; }
    public int getQuantiaCamasCasal() { return quantiaCamasCasal; }

    public void salvarCadastroEmArquivo(String CadastrosQuartos) {
        try (FileWriter escritor = new FileWriter(CadastrosQuartos, true); Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o preço do quarto: ");
            preco = scanner.nextDouble();
            escritor.write("Preço: " + preco + "\n");

            System.out.print("O quarto tem banheiro? (true/false): ");
            temBanheiro = scanner.nextBoolean();
            escritor.write("Tem Banheiro: " + temBanheiro + "\n");

            System.out.print("O quarto tem televisão? (true/false): ");
            temTelevisao = scanner.nextBoolean();
            escritor.write("Tem Televisão: " + temTelevisao + "\n");

            System.out.print("O quarto tem frigobar? (true/false): ");
            temFrigobar = scanner.nextBoolean();
            escritor.write("Tem Frigobar: " + temFrigobar + "\n");

            System.out.print("O quarto tem ar condicionado? (true/false): ");
            temArCondicionado = scanner.nextBoolean();
            escritor.write("Tem Ar Condicionado: " + temArCondicionado + "\n");

            System.out.print("O quarto tem Wifi? (true/false): ");
            temWifi = scanner.nextBoolean();
            escritor.write("Tem Wifi: " + temWifi + "\n");

            System.out.print("Quantos banheiros o quarto possui? ");
            quantiaBanheiros = scanner.nextInt();
            escritor.write("Quantidade de Banheiros: " + quantiaBanheiros + "\n");

            System.out.print("Quantas camas de solteiro o quarto possui? ");
            quantiaCamasSolteiros = scanner.nextInt();
            escritor.write("Quantidade de Camas Solteiro: " + quantiaCamasSolteiros + "\n");

            System.out.print("Quantas camas de casal o quarto possui? ");
            quantiaCamasCasal = scanner.nextInt();
            escritor.write("Quantidade de Camas Casal: " + quantiaCamasCasal + "\n");

            escritor.write("-------------------------\n");
            System.out.println("Cadastro do quarto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar cadastro: " + e.getMessage());
        }
    }
}

