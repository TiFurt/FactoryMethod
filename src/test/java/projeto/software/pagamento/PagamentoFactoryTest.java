package projeto.software.pagamento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {
    private PagamentoFactory pagamentoFactory;

    @BeforeEach
    void setUp() {
        pagamentoFactory = new PagamentoFactory();
    }

    @Test
    void deveRetornarExceptionNaoPodeSerNulo() {
        try {
            pagamentoFactory.criarPagamento(null);
            fail();
        } catch (Exception e) {
            assertEquals("Tipo de pagamento não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarExceptionTipoDePagamentoInexiste() {
        try {
            pagamentoFactory.criarPagamento(TipoPagamento.Invalido);
            fail();
        } catch (Exception e) {
            assertEquals("Tipo de pagamento inexiste", e.getMessage());
        }
    }

    @Test
    void deveRetornarExceptionTipoDePagamentoInvalido() {
        try {
            pagamentoFactory.criarPagamento(TipoPagamento.Inexistente);
            fail();
        } catch (Exception e) {
            assertEquals("Tipo de pagamento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarObjetoValido() {
        try {
            IPagamento pagamento = pagamentoFactory.criarPagamento(TipoPagamento.Dinheiro);
            assertEquals("Pagamento no Dinheiro", pagamento.pagar());
        } catch (Exception e) {
            fail();
        }
    }
}