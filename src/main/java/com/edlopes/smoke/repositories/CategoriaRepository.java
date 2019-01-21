package com.edlopes.smoke.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edlopes.smoke.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {

}
