package projeto.software.pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoDinheiroTest {

    @Test
    void devePagar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Dinheiro);
        assertEquals("Pagamento no Dinheiro", pagamento.pagar());
    }

    @Test
    void deveEstornar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Dinheiro);
        assertEquals("Estorno no Dinheiro", pagamento.estornar());
    }
}