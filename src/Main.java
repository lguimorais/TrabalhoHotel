import CadastrosDeQuartos.quartoLuxo;
import CadastrosDeQuartos.quartoStandard;
import CadastrosDeQuartos.quartoSuite;
import java.io.File;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolhaInicial = 1;
        Scanner scanf = new Scanner(System.in);

        quartoStandard quartoStandard = new quartoStandard(0, 150.0, true, false, false, false, false, true, 1, 1, 0);
        quartoSuite quartoSuite = new quartoSuite(0, 250.0, true, true, false, true, false, true, 1, 2, 1);
        quartoLuxo quartoLuxo = new quartoLuxo(0, 350.0, true, true, true, true, true, true, 2, 3, 1);
        CadastrosHospedes hospedes = new CadastrosHospedes("a", "123.456.789-00", "Brasileiro", "HotelBetCuscuz@gmail.com", "00/00/000", "(99) 99999-9999", 18);
        CadastrosServicos servicos = new CadastrosServicos("SPA", 100);

        new File("C:\\Hotel").mkdir();
        new File("C:\\Hotel\\Quartos").mkdir();
        new File("C:\\Hotel\\Hóspedes").mkdir();
        new File("C:\\Hotel\\Serviços").mkdir();

        while (true) {

            try {

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
            catch (InputMismatchException e){
                System.out.println("vai se fuder");
            }
            catch (NoSuchElementException e){
                System.out.println("vai se fuder caralho");
                System.out.println();

            }
        }
    }
}






