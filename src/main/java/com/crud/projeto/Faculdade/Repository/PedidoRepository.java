package com.crud.projeto.Faculdade.Repository;

import com.crud.projeto.Faculdade.Entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
