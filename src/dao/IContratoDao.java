package dao;

import service.Contrato;

public interface IContratoDao {
    Contrato buscarContrato(int id);
    void excluirContrato(int id);
    void atualizarContrato(Contrato contrato);
}