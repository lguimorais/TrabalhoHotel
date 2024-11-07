import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastrosHospedes {
    String nomeHospede;
    String cpfHospede;
    String nacionalidadeHospede;
    String emailHospede;
    String dataNascimentoHospede;
    String numeroHospede;
    int idadeHospede;

    public CadastrosHospedes(String nomeHospede, String cpfHospede, String nacionalidadeHospede, String emailHospede, String dataNascimentoHospede, String numeroHospede, int idadeHospede) {
        this.nomeHospede = nomeHospede;
        this.cpfHospede = cpfHospede;
        this.nacionalidadeHospede = nacionalidadeHospede;
        this.emailHospede = emailHospede;
        this.numeroHospede = numeroHospede;
        this.idadeHospede = idadeHospede;
        this.dataNascimentoHospede = dataNascimentoHospede;
    }

    // Formatador de CPF.
        public static String formatarCPF(String cpfHospede) {
            if (cpfHospede == null || cpfHospede.length() != 11 || !cpfHospede.matches("\\d+")) {
                return null;  // Retorna nulo caso o CPF seja inválido.
            }
            // Formata o CPF como "000.000.000-00".
            return cpfHospede.substring(0, 3) + "." + cpfHospede.substring(3, 6) + "." + cpfHospede.substring(6, 9) + "-" + cpfHospede.substring(9, 11);
        }

        // Método para validar e capturar o CPF até estar no formato correto.
        public static String capturarCPF(Scanner scanner) {
            String cpfHospede;
            while (true) {
                System.out.println("Digite o CPF (apenas números): ");
                cpfHospede = scanner.nextLine();
                if (cpfHospede.length() == 11 && cpfHospede.matches("\\d+")) {
                    break;  // Se o CPF é válido, sai do loop.
                }
                System.out.println("CPF inválido. Certifique-se de que tem exatamente 11 dígitos numéricos.");
            }
            return formatarCPF(cpfHospede);
        }

    public void salvarCadastroClientesEmArquivo(String CadastrosClientes) {
        try (FileWriter escritor = new FileWriter("C:\\Hotel\\" + "Hóspedes\\" + CadastrosClientes, true); Scanner scanner = new Scanner(System.in)) {
            // Definir nome do hóspede.
            System.out.println("Informe o nome do Hóspede: ");
            nomeHospede = scanner.nextLine();
            escritor.write("Nome do Hóspede: " + nomeHospede + "\n");

            // Definir cpf do hóspede.
            cpfHospede = capturarCPF(scanner);
            escritor.write("CPF do Hóspede: " + cpfHospede + "\n");

            // Definir nacionalidade do hóspede.
            System.out.println("Informe a nacionalidade do Hóspede: ");
            nacionalidadeHospede = scanner.nextLine();
            escritor.write("Nacionalidade do Hóspede: " + nacionalidadeHospede + "\n");

            // Definir email do hóspede.
            System.out.println("Informe o email do Hóspede: ");
            emailHospede = scanner.nextLine();
            escritor.write("Email do Hóspede: " + emailHospede + "\n");

            // Definir número do hóspede.
            System.out.println("Informe o número do Hóspede: ");
            numeroHospede = scanner.nextLine();
            escritor.write("Número do Hóspede: " + numeroHospede + "\n");

            // Definir data de nascimento do hóspede.
            System.out.println("Informe a data de nascimento do Hóspede: ");
            dataNascimentoHospede = scanner.nextLine();
            escritor.write("Data de nascimento do Hóspede: " + dataNascimentoHospede + "\n");

            // Definir idade do hóspede.
            System.out.println("Informe idade do Hóspede: ");
            idadeHospede = scanner.nextInt();
            escritor.write("Idade do Hóspede: " + idadeHospede + "\n");

            escritor.write("———————————————————————————————————————————————\n");
            System.out.println("Cadastro do quarto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar cadastro: " + e.getMessage());
        }
    }
}  // PS: FAZER COM QUE O CPF, NUMERO E DAT. NASC. SE ADEQUE À UMA FORMATAÇÃO. CALCULAR IDADE COM BASE NA DATA DE NASCIMENTO.
