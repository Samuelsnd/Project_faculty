package com.crud.projeto.Faculdade.Services;

import com.crud.projeto.Faculdade.Entities.Categoria;
import com.crud.projeto.Faculdade.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {


    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Categoria getById(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria updateCategoria(Integer id, Categoria categoria){
        Categoria categoriaAtualizada = categoriaRepository.findById(id).orElse(null);
        if(categoriaAtualizada != null) {
            categoriaAtualizada.setCategoriaName(categoria.getCategoriaName());
            return categoriaRepository.save(categoriaAtualizada);
        }
            return null;
    }

    public Boolean DeleteCategoria(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if(categoria != null) {
            categoriaRepository.delete(categoria);
            return true;
        }
        return false;
    }

}
