package one.digitalinnovation.gof.model;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Não é necessário a inserção de Repository nessa parte, mas facilita a leitura
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
