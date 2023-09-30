package com.crud.projeto.Faculdade.Services;

import com.crud.projeto.Faculdade.Entities.Categoria;
import com.crud.projeto.Faculdade.Entities.Pedido;
import com.crud.projeto.Faculdade.Entities.Produto;
import com.crud.projeto.Faculdade.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> getAll(){
        return pedidoRepository.findAll();
    }

    public Pedido getById(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido updatePedido(Integer id, Pedido pedido) {
        Pedido pedidoAtualizado = pedidoRepository.findById(id).orElse(null);
        if(pedidoAtualizado != null) {
            pedidoAtualizado.setPedidoData(pedido.getPedidoData());
            return pedidoRepository.save(pedidoAtualizado);
        }else {
            return null;
        }
    }


    public Boolean DeletePedido(Integer id) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);
        if(pedido != null) {
            pedidoRepository.delete(pedido);
            return true;
        }
        return false;
    }

}
