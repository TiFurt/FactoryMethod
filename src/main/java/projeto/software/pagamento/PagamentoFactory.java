package projeto.software.pagamento;

public class PagamentoFactory {
    public static IPagamento criarPagamento(String tipoPagamento) {
        if (tipoPagamento == null) {
            throw new IllegalArgumentException("Tipo de pagamento não pode ser nulo");
        }

        Class pagamento;
        Object objeto;
        try {
            pagamento = Class.forName("projeto.software.pagamento.Pagamento" + tipoPagamento);
            objeto = pagamento.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Tipo de pagamento inexiste");
        }

        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Tipo de pagamento inválido");
        }

        return (IPagamento) objeto;
    }
}
