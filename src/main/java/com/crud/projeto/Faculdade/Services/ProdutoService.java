package com.crud.projeto.Faculdade.Services;

import com.crud.projeto.Faculdade.Entities.Categoria;
import com.crud.projeto.Faculdade.Entities.Produto;
import com.crud.projeto.Faculdade.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAll(){
        return produtoRepository.findAll();
    }

    public Produto getById(Integer id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto updateProduto(Integer id, Produto produto){
        Produto produtoAtualizado = produtoRepository.findById(id).orElse(null);
        if(produtoAtualizado != null) {
            produtoAtualizado.setProdutoName(produto.getProdutoName());
            return produtoRepository.save(produtoAtualizado);
        }
        return null;
    }

    public Boolean DeleteProduto(Integer id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if(produto != null) {
            produtoRepository.delete(produto);
            return true;
        }
        return false;
    }
}
