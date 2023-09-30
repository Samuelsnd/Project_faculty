package com.crud.projeto.Faculdade.Repository;

import com.crud.projeto.Faculdade.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
