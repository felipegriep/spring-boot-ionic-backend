package com.felipegriep.cursomc.repositories;

import com.felipegriep.cursomc.domain.Categoria;
import com.felipegriep.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
