package projeto.software.pagamento;

public class PagamentoCredito implements IPagamento {
    @Override
    public String pagar() {
        return "Pagamento no Crédito";
    }

    @Override
    public String estornar() {
        return "Estorno no Crédito";
    }
}
