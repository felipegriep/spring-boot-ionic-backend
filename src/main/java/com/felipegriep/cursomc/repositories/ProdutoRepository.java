package com.felipegriep.cursomc.repositories;

import com.felipegriep.cursomc.domain.Categoria;
import com.felipegriep.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
