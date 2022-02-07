package br.com.sigaBem.projectSigaBem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sigaBem.projectSigaBem.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
