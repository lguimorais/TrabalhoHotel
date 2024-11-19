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
        long dias = java.time.Duration.between(horarioEntrada, horarioSaida).toDays();

        // Se houver parte de um dia adicional, conta como mais uma diária
        if (java.time.Duration.between(horarioEntrada, horarioSaida).toHours() % 24 != 0) {
            dias++;
        }

        double custoServicos = servicosConsumidos.size() * 30.0; // Exemplo: R$30 por serviço
        return custoServicos;
      
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
