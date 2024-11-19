package EstadiaT;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEstadias {
    private List<Estadia> estadias;

    public GerenciadorDeEstadias() {
        this.estadias = new ArrayList<>();
    }

    public void adicionarEstadia(Estadia estadia) {
        estadias.add(estadia);
    }

    public List<Estadia> getEstadias() {
        return estadias;
    }

    public void listarEstadias() {
        for (Estadia estadia : estadias) {
            System.out.println(estadia.formatarEstadia());
        }
    }

    public void salvarEstadiasEmArquivo(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Estadia estadia : estadias) {
                writer.write(estadia.formatarEstadia());
            }
            System.out.println("Estadias salvas no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
