public class Cadastros {
    double preco;
    boolean temBanheiro;
    boolean temTelevisao;
    boolean temFrigobar;
    boolean temArCondicionado;
    boolean temWifi;
    int quantiaBanheiros;
    int quantiaCamas;

    public Cadastros(double preco, boolean temBanheiro, boolean temTelevisao, boolean temFrigobar, boolean temArCondicionado, boolean temWifi, int quantiaBanheiros, int quantiaCamas) {
        this.preco = preco;
        this.temBanheiro = temBanheiro;
        this.temTelevisao = temTelevisao;
        this.temFrigobar = temFrigobar;
        this.temArCondicionado = temArCondicionado;
        this.temWifi = temWifi;
        this.quantiaBanheiros = quantiaBanheiros;
        this.quantiaCamas = quantiaCamas;
    }

    public double getPreco() { return preco; }
    public boolean getTemBanhanheiro() { return temBanheiro; }
    public boolean getTemTelevisao() { return temTelevisao; }
    public boolean getTemFrigobar() { return temFrigobar; }
    public boolean getTemArCondicionado() { return temArCondicionado; }
    public boolean getTemWifi() { return temWifi; }
    public int getQuantiaBanheiros() { return quantiaBanheiros; }
    public int getQuantiaCamas() { return quantiaCamas; }
}
