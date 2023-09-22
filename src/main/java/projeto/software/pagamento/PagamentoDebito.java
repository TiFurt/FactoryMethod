package projeto.software.pagamento;

public class PagamentoDebito implements IPagamento {
    @Override
    public String pagar() {
        return "Pagamento no Débito";
    }

    @Override
    public String estornar() {
        return "Estorno no Débito";
    }
}
