package com.shevalucas.cursomc.services;

import com.shevalucas.cursomc.domain.Categoria;
import com.shevalucas.cursomc.domain.Pedido;
import com.shevalucas.cursomc.repositories.PedidoRepository;
import com.shevalucas.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
