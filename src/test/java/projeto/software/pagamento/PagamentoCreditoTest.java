package projeto.software.pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCreditoTest {

    @Test
    void devePagar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Credito);
        assertEquals("Pagamento no Crédito", pagamento.pagar());
    }

    @Test
    void deveEstornar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Credito);
        assertEquals("Estorno no Crédito", pagamento.estornar());
    }
}