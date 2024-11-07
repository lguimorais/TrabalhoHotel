import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class quartoStandard extends CadastrosQuartos {

    public quartoStandard(int numeroQuarto, double preco, boolean temBanheiro, boolean temTelevisao, boolean temFrigobar, boolean temArCondicionado, boolean temWifi, int quantiaBanheiros, int quantiaCamasSolteiros, int quantiaCamasCasal) {
        super(0, 150.0, true, false, false, false, false, 1, 1, 0); // Configuração padrão do Quarto Standard
    }

    @Override
    public void salvarCadastroEmArquivo(String QuartosStandard) {
        try (FileWriter escritor = new FileWriter("C:\\Hotel\\" + "Quartos\\" + QuartosStandard, true); Scanner scanner = new Scanner(System.in)) {
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
            System.out.println("Quarto 'Standard' não tem televisão.");
            escritor.write("Tem Televisão:" + temTelevisao + "\n");

            // Definir se tem frigobar.
            System.out.println("Quarto 'Standard' não tem frigobar.");
            escritor.write("Tem Frigobar: " + temFrigobar + "\n");

            // Definir se tem ar condicionado.
            System.out.println("Quarto 'Standard' não tem ar condicionado.");
            escritor.write("Tem Ar Condicionado: " + temArCondicionado + "\n");

            // Definir se tem wi-fi (próprio).
            System.out.println("Quarto 'Standard' não tem wifi.");
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
