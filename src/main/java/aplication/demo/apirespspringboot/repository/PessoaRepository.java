package aplication.demo.apirespspringboot.repository;

import org.springframework.stereotype.Repository;
import aplication.demo.apirespspringboot.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{


}
