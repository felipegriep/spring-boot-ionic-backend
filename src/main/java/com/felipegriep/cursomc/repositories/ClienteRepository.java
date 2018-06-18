package com.felipegriep.cursomc.repositories;

import com.felipegriep.cursomc.domain.Cliente;
import com.felipegriep.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
