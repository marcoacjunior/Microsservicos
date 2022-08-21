package br.com.alunos.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.alunos.domain.Produto;
import br.com.alunos.domain.Produto.Status;


@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{

	Optional<Produto> findByCodigo(String codigo);

	Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
