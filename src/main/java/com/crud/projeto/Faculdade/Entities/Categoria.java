package com.crud.projeto.Faculdade.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Integer categoriaId;
    @Column(name = "categoria_nome")
    private String categoriaName;
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
        return categoriaName;
    }

    public void setCategoriaName(String categoriaName) {
        this.categoriaName = categoriaName;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(categoriaId, categoria.categoriaId) && Objects.equals(categoriaName, categoria.categoriaName) && Objects.equals(produtoList, categoria.produtoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriaId, categoriaName, produtoList);
    }
}
