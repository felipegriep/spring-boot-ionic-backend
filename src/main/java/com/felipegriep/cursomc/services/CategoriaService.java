package com.felipegriep.cursomc.services;

import com.felipegriep.cursomc.domain.Categoria;
import com.felipegriep.cursomc.repositories.CategoriaRepository;
import com.felipegriep.cursomc.services.exceptions.DataIntegrityException;
import com.felipegriep.cursomc.services.exceptions.ObjectNotFoundException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id) {
        find(id);
        try {
            repo.deleteById(id);
        } catch (DataIntegrityViolationException exception) {
            throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos.");
        }
    }

    public List<Categoria> findAll() {
        return repo.findAll();
    }
}
