package com.crud.projeto.Faculdade.Entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "produto")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Integer produtoId;
    @Column(name = "produto_nome")
    private String produtoName;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(name = "item_pedido", joinColumns = @JoinColumn(name = "produto_id"),
    inverseJoinColumns = @JoinColumn(name = "pedido_id"))
    Set<Pedido> pedidos;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoName() {
        return produtoName;
    }

    public void setProdutoName(String produtoName) {
        this.produtoName = produtoName;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(produtoId, produto.produtoId) && Objects.equals(produtoName, produto.produtoName) && Objects.equals(categoria, produto.categoria) && Objects.equals(pedidos, produto.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtoId, produtoName, categoria, pedidos);
    }
}
