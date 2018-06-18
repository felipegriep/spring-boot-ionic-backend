package com.felipegriep.cursomc.repositories;

import com.felipegriep.cursomc.domain.Endereco;
import com.felipegriep.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
