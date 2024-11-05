import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class quartoStandard extends Cadastros {

    public quartoStandard(double preco, boolean temBanheiro, boolean temTelevisao, boolean temFrigobar, boolean temArCondicionado, boolean temWifi, int quantiaBanheiros, int quantiaCamasSolteiros, int quantiaCamasCasal) {
        super(150.0, true, true, false, false, false, 1, 1, 0); // Configuração padrão do Quarto Standard
    }
}
