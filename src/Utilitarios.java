public class Utilitarios {
    public static void pausar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
        }
    }

    public static void imprimirLinhasEmBranco(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println();
        }
    }

    public static void exibirMensagemComPausa(String mensagem, long milissegundos, int linhasEmBranco) {
        System.out.println(mensagem);
        pausar(milissegundos);
        imprimirLinhasEmBranco(linhasEmBranco);
    }
}
