package br.com.alura.listavip.repository;

import br.com.alura.listavip.models.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
