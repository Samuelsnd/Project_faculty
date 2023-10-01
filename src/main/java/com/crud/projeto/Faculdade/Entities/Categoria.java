package com.crud.projeto.Faculdade.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "categoria")
public class Categoria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Integer categoriaId;
    @Column(name = "categoria_nome")
    private String categoriaNome;
    @OneToMany(mappedBy = "categoria")
    @JsonManagedReference
    private List<Produto> produtoList;

    public Integer getCategoriaid() {
        return categoriaId;
    }

    public void setCategoriaid(Integer categoriaid) {
        this.categoriaId = categoriaid;
    }

    public String getCategoriaName() {
        return categoriaNome;
    }

    public void setCategoriaName(String categoriaName) {
        this.categoriaNome = categoriaName;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

}
