import dao.IContratoDao;
import service.Contrato;
import service.IContratoServiceTest;

public class ContratoService extends IContratoServiceTest {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    public Contrato buscarContrato(int id) {
        return contratoDao.buscarContrato(id);
    }

    public void excluirContrato(int id) {
        contratoDao.excluirContrato(id);
    }

    public void atualizarContrato(Contrato contrato) {
        contratoDao.atualizarContrato(contrato);
    }
}