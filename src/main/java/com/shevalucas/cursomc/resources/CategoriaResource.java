package com.shevalucas.cursomc.resources;


import com.shevalucas.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria>  listar(){
        Categoria c1 = new Categoria(1, "Informatica");
        Categoria c2 = new Categoria(1, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);

        return lista;
    }
}
