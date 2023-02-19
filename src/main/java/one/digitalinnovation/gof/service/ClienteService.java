package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/*
* Interfac que define o padrão <b>Strategy</b> no domínio do cliente. Com isso,
* se necessário, podemos ter múltiplas implementações dessa mesma interfac.
* */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long Id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
