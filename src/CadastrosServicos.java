import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CadastrosServicos {
    String servicoRefeicao;
    String servicoLavanderia;
    String servicoSpa;
    String servicoLimpeza;
    String nome;
    int escolhaServico = -1;
    int preco;

    public CadastrosServicos(String servicoRefeicao, String servicoLavanderia, String servicoSpa, String servicoLimpeza, int escolha) {
        this.nome = nome;
        this.preco = preco;
    }

    public void salvarCadastroServicosEmArquivo(String CadastrosServicos) {
        try (FileWriter escritor = new FileWriter("C:\\Hotel\\Serviços\\" + CadastrosServicos, true); Scanner scanner = new Scanner(System.in)) {
            while (escolhaServico != 0) {
                System.out.println("┌—————————————————————————————————————————————————┐");
                System.out.println("│              CADASTROS DE SERVIÇOS.             │");
                System.out.println("├————————————————————————┬————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│    1- Ser. de Spa.     │ 2- Ser. de Lavanderia. │");
                System.out.println("│                        │                        │");
                System.out.println("├————————————————————————┼————————————————————————┤");
                System.out.println("│                        │                        │");
                System.out.println("│  3- Ser. de Refeição.  │   4- Ser. de Limpeza.  │");
                System.out.println("│                        │                        │");
                System.out.println("├————————————————————————┴————————————————————————┤");
                System.out.println("│                                                 │");
                System.out.println("│                   5- Voltar.                    │");
                System.out.println("│                                                 │");
                System.out.println("└—————————————————————————————————————————————————┘");
                System.out.print("-> ");
                int escolhaServico2 = scanner.nextInt();

                switch (escolhaServico2){
                    case 1:
                        System.out.println("Digite o nome do serviço de 'SPA' que você quer adicionar: ");
                        break;
                    default:
                        break;
                }

            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar cadastro: " + e.getMessage());
        }
    }
}

