package projeto.software.pagamento;

public class PagamentoDinheiro implements IPagamento {
    @Override
    public String pagar() {
        return "Pagamento no Dinheiro";
    }

    @Override
    public String estornar() {
        return "Estorno no Dinheiro";
    }
}
