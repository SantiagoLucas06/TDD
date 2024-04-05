package service;

import dao.IContratoDao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IContratoServiceTest {
    private ContratoService contratoService;
    private MockContratoDao contratoDaoMock; // Implementação de IContratoDao para fins de teste

    @Before
    public void setUp() {
        contratoDaoMock = new MockContratoDao(); // Criar instância da classe MockContratoDao
        contratoService = new ContratoService();
    }

    @Test
    public void testBuscarContrato() {

        int id = 1;
        Contrato contratoEsperado = new Contrato(id, "Contrato de teste");
        Contrato contratoRetornado = (Contrato) contratoService.buscarContrato(id);
        assertEquals(contratoEsperado, contratoRetornado);
    }

    @Test
    public void testExcluirContrato() {
        int id = 1;
        contratoService.excluirContrato(id);
    }

    @Test
    public void testAtualizarContrato() {

        Contrato contrato = new Contrato(1, "Contrato atualizado");
        contratoService.atualizarContrato(contrato);
    }

    private class MockContratoDao implements IContratoDao {
        @Override
        public Contrato buscarContrato(int id) {
            return new Contrato(id, "Contrato de teste");
        }

        @Override
        public void excluirContrato(int id) {
        }

        @Override
        public void atualizarContrato(Contrato contrato) {
        }
    }
}