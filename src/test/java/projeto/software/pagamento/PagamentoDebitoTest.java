package projeto.software.pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoDebitoTest {

    @Test
    void devePagar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Debito);
        assertEquals("Pagamento no Débito", pagamento.pagar());
    }

    @Test
    void deveEstornar() {
        IPagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.Debito);
        assertEquals("Estorno no Débito", pagamento.estornar());
    }
}