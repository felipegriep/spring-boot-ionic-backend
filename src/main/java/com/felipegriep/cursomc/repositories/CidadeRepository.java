package com.felipegriep.cursomc.repositories;

import com.felipegriep.cursomc.domain.Cidade;
import com.felipegriep.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
