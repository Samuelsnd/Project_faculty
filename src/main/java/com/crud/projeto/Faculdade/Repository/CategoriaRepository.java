package com.crud.projeto.Faculdade.Repository;

import com.crud.projeto.Faculdade.Entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
