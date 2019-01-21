package com.edlopes.smoke.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edlopes.smoke.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>  {

}
