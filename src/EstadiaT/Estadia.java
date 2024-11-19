package EstadiaT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Estadia {
    private String nomeCliente;
    private List<String> servicosConsumidos;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;
    private boolean pago;
    private int quartoSelecionado;

    public Estadia(String nomeCliente, List<String> servicosConsumidos, LocalDateTime horarioEntrada,
                   LocalDateTime horarioSaida) {
        this.nomeCliente = nomeCliente;
        this.servicosConsumidos = new ArrayList<>(servicosConsumidos);
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.pago = false; // Inicialmente, o pagamento não foi feito
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double calcularCusto() {
        double custoQuarto;
        double custoServicos = servicosConsumidos.size() * 30.0; // Exemplo: R$30 por serviço
        // Determina o custo com base no quarto selecionado
        switch (quartoSelecionado) {
            case 1:
                custoQuarto = 200.0; // Valor para o quarto standard
                break;
            case 2:
                custoQuarto = 300.0; // Valor para o quarto luxo
                break;
            case 3:
                custoQuarto = 400.0; // Valor para o quarto 3
                break;
            case 4:
                custoQuarto = 500.0; // Valor para o quarto 4
                break;
            default:
                throw new IllegalArgumentException("Quarto inválido.");
        }

        // Retorna o custo total
        return custoQuarto + custoServicos;
    }

    public String formatarEstadia() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nomeCliente).append("\n");
        sb.append("Serviços Consumidos: ").append(String.join(", ", servicosConsumidos)).append("\n");
        sb.append("Horário de Entrada: ").append(horarioEntrada.format(formatter)).append("\n");
        sb.append("Horário de Saída: ").append(horarioSaida.format(formatter)).append("\n");
        sb.append("Custo Total: R$").append(String.format("%.2f", calcularCusto())).append("\n");
        sb.append("Status de Pagamento: ").append(pago ? "Pago" : "Pendente").append("\n");
        sb.append("--------------------------------------------------\n");
        return sb.toString();
    }
}
